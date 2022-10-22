package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptModule
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptQuestionOther
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueConfirm
import typingsJapgolly.ionicCliFrameworkPrompts.mod.PromptValueOther
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonicEnvironment extends StObject {
  
  val client: IClient
  
  val config: IConfig
  
  val ctx: IonicContext
  
  val flags: IonicEnvironmentFlags
  
  def getInfo(): js.Promise[js.Array[InfoItem]]
  
  val log: ILogger
  
  def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox]
  def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm]
  def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther]
  @JSName("prompt")
  val prompt_Original: PromptModule
  
  val session: ISession
  
  val shell: IShell
}
object IonicEnvironment {
  
  inline def apply(
    client: IClient,
    config: IConfig,
    ctx: IonicContext,
    flags: IonicEnvironmentFlags,
    getInfo: CallbackTo[js.Promise[js.Array[InfoItem]]],
    log: ILogger,
    prompt: PromptModule,
    session: ISession,
    shell: IShell
  ): IonicEnvironment = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getInfo = getInfo.toJsFn, log = log.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicEnvironment]
  }
  
  extension [Self <: IonicEnvironment](x: Self) {
    
    inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: IConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: IonicContext): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: IonicEnvironmentFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setGetInfo(value: CallbackTo[js.Promise[js.Array[InfoItem]]]): Self = StObject.set(x, "getInfo", value.toJsFn)
    
    inline def setLog(value: ILogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setPrompt(value: PromptModule): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    
    inline def setSession(value: ISession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setShell(value: IShell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
  }
}
