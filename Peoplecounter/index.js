//document.getElementById("count-el").innerText = 5
// intialize the count as 0
// listen for clicks on the increment button / increment the count variable when the button is clicked
// change the count-el in the HTML to reflect the new count

let countEl = document.getElementById("count-el")
let count = 0

console.log(count)

function incriment() {
    // console.log("clicked")
    count = count + 1
    countEl.innerText = count
    console.log(count)
}

function decriment() {
    count = count - 1
    countEl.innerText = count
    console.log(count)
}