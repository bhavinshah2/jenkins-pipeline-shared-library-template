def checkOutFrom(branch,repo) {
  //repo = https://github.com/bhavinshah2/insecure-bank
  //branch = develop
  git branch: "$branch", url: "https://github.com/bhavinshah2/$repo"
}
