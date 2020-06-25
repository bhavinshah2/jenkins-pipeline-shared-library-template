def checkOutFrom(branch,repo) {
  
  git branch: "${branch}", url: "https://github.com/bhavinshah2/${repo}"

}
