package typingsJapgolly.ionic.libProjectMod

import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.ionic.definitionsMod.IConfig
import typingsJapgolly.ionic.definitionsMod.ILogger
import typingsJapgolly.ionic.definitionsMod.ISession
import typingsJapgolly.ionic.definitionsMod.IShell
import typingsJapgolly.ionic.definitionsMod.IonicContext
import typingsJapgolly.ionic.definitionsMod.IonicEnvironmentFlags
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptModule
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptQuestionOther
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueConfirm
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueOther
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectDeps extends js.Object {
  val client: IClient = js.native
  val config: IConfig = js.native
  val ctx: IonicContext = js.native
  val flags: IonicEnvironmentFlags = js.native
  val log: ILogger = js.native
  @JSName("prompt")
  val prompt_Original: PromptModule = js.native
  val session: ISession = js.native
  val shell: IShell = js.native
  def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
  def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
  def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
}

