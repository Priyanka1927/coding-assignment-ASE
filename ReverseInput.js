function reverseWords(sent) {
    let result = "";
    let word = "";
    for (let i = 0; i < sent.length; i++) {
        let char = sent[i];
        if (char === " " || i === sent.length - 1) {
            if (i === sent.length - 1 && char !== " ") {
                word += char;
            }
            result += reverseWord(word) + " ";
            word = "";
        } else {
            word += char;
        }
    }
    return result.trim();
}
function reverseWord(word) {
    let reversed = "";
    for (let i = word.length - 1; i >= 0; i--) {
        reversed += word[i];
    }

    return reversed;
}
const input = prompt("Enter a sentence:");
const output = reverseWords(input);
alert("Reversed sentence: " + output);
console.log("Reversed sentence: " + output);
