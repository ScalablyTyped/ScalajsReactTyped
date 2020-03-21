package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.githubApiMod.GitHubApi
import typingsJapgolly.typedGithubApi.githubRefMod.OptionsOrRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class IssueWebHook ()
    extends typingsJapgolly.typedGithubApi.webHookMod.IssueWebHook
  
  @js.native
  class default protected () extends GitHubApi {
    def this(options: OptionsOrRef) = this()
  }
  
}

