package typingsJapgolly.typedGithubApi

import typingsJapgolly.typedGithubApi.apiFetchMod.Options
import typingsJapgolly.typedGithubApi.apiFetchMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/github-ref", JSImport.Namespace)
@js.native
object githubRefMod extends js.Object {
  @js.native
  class GitHubRef protected () extends OptionsOrRef {
    protected def this(options: OptionsOrRef) = this()
    val options: Options = js.native
    def getAllPagesAsync[T](uri: String): js.Promise[js.Array[T] | Null] = js.native
    def getAsync[T](uri: String): js.Promise[Response[T] | Null] = js.native
    def getPreviewAsync[T](uri: String): js.Promise[Response[T] | Null] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typedGithubApi.apiFetchMod.Options
    - typingsJapgolly.typedGithubApi.githubRefMod.GitHubRef
  */
  trait OptionsOrRef extends js.Object
  
}

