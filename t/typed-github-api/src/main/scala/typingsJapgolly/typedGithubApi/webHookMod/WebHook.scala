package typingsJapgolly.typedGithubApi.webHookMod

import typingsJapgolly.express.mod.Router
import typingsJapgolly.typedGithubApi.githubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.githubRefMod.OptionsOrRef
import typingsJapgolly.typescriptEventHandler.funcMod.Action
import typingsJapgolly.typescriptEventHandler.funcMod.AsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typed-github-api/dist/web-hook", "WebHook")
@js.native
abstract class WebHook[TData /* <: WebHookData */, TApiData /* <: typingsJapgolly.typedGithubApi.webHooksMod.WebHookData */] protected () extends GitHubRef {
  def this(options: OptionsOrRef) = this()
  def this(secret: js.UndefOr[scala.Nothing], options: OptionsOrRef) = this()
  def this(secret: String, options: OptionsOrRef) = this()
  val handlers: js.Any = js.native
  val router: Router = js.native
  var secret: js.UndefOr[js.Any] = js.native
  /* protected */ def convertData(request: WebHookData, data: TApiData): TData = js.native
  def registerAsyncHandler(handler: AsyncAction[TData]): Unit = js.native
  def registerHandler(handler: Action[TData]): Unit = js.native
  /* private */ def requestHandler(req: js.Any, res: js.Any): js.Any = js.native
}

