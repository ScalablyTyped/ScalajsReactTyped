package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.distOwnerRefMod.OwnerRefClass
import typingsJapgolly.typedGithubApi.githubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/repository-ref", JSImport.Namespace)
@js.native
object repositoryRefMod extends js.Object {
  @js.native
  class RepositoryRefClass protected ()
    extends GitHubRef
       with RepositoryRef {
    def this(owner: OwnerRefClass, name: String) = this()
  }
  
}

