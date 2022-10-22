package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.distGithubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.distInterfacesRepositoryMod.RepositoryRef
import typingsJapgolly.typedGithubApi.distOwnerRefMod.OwnerRefClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRepositoryRefMod {
  
  @JSImport("typed-github-api/dist/repository-ref", "RepositoryRefClass")
  @js.native
  open class RepositoryRefClass protected ()
    extends GitHubRef
       with RepositoryRef {
    def this(owner: OwnerRefClass, name: String) = this()
  }
}
