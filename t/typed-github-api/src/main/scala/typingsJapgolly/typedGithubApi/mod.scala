package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.distGithubApiMod.GitHubApi
import typingsJapgolly.typedGithubApi.distGithubRefMod.OptionsOrRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typed-github-api", JSImport.Default)
  @js.native
  open class default protected () extends GitHubApi {
    def this(options: OptionsOrRef) = this()
  }
  
  @JSImport("typed-github-api", "IssueWebHook")
  @js.native
  open class IssueWebHook protected ()
    extends typingsJapgolly.typedGithubApi.distWebHookMod.IssueWebHook {
    def this(options: OptionsOrRef) = this()
    def this(secret: String, options: OptionsOrRef) = this()
    def this(secret: Unit, options: OptionsOrRef) = this()
  }
}
