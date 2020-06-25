def checkOutfrom(repo,branch) {
  repo = https://github.com/bhavinshah2/insecure-bank
  branch = develop
  git branch: "$branch" url: "$repo"
}
