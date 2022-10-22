package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.distGithubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.distGithubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.distInterfacesOwnerRefMod.OwnerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOwnerRefMod {
  
  @JSImport("typed-github-api/dist/owner-ref", "OwnerRefClass")
  @js.native
  open class OwnerRefClass protected ()
    extends GitHubRef
       with OwnerRef {
    def this(login: String, options: OptionsOrRef) = this()
  }
}
