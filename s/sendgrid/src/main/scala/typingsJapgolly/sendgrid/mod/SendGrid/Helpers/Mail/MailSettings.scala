package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MailSettings extends StObject {
  
  def getBcc(): Bcc
  
  def getBypassListManagement(): BypassListManagement
  
  def getFooter(): Footer
  
  def getSandBoxMode(): SandBoxMode
  
  def getSpamCheck(): SpamCheck
  
  def setBcc(bcc: Bcc): Unit
  
  def setBypassListManagement(bypassListManagement: BypassListManagement): Unit
  
  def setFooter(footer: Footer): Unit
  
  def setSandBoxMode(sandBoxMode: SandBoxMode): Unit
  
  def setSpamCheck(spamCheck: SpamCheck): Unit
  
  def toJSON(): typingsJapgolly.sendgrid.anon.Bcc
}
object MailSettings {
  
  inline def apply(
    getBcc: CallbackTo[Bcc],
    getBypassListManagement: CallbackTo[BypassListManagement],
    getFooter: CallbackTo[Footer],
    getSandBoxMode: CallbackTo[SandBoxMode],
    getSpamCheck: CallbackTo[SpamCheck],
    setBcc: Bcc => Callback,
    setBypassListManagement: BypassListManagement => Callback,
    setFooter: Footer => Callback,
    setSandBoxMode: SandBoxMode => Callback,
    setSpamCheck: SpamCheck => Callback,
    toJSON: CallbackTo[typingsJapgolly.sendgrid.anon.Bcc]
  ): MailSettings = {
    val __obj = js.Dynamic.literal(getBcc = getBcc.toJsFn, getBypassListManagement = getBypassListManagement.toJsFn, getFooter = getFooter.toJsFn, getSandBoxMode = getSandBoxMode.toJsFn, getSpamCheck = getSpamCheck.toJsFn, setBcc = js.Any.fromFunction1((t0: Bcc) => setBcc(t0).runNow()), setBypassListManagement = js.Any.fromFunction1((t0: BypassListManagement) => setBypassListManagement(t0).runNow()), setFooter = js.Any.fromFunction1((t0: Footer) => setFooter(t0).runNow()), setSandBoxMode = js.Any.fromFunction1((t0: SandBoxMode) => setSandBoxMode(t0).runNow()), setSpamCheck = js.Any.fromFunction1((t0: SpamCheck) => setSpamCheck(t0).runNow()), toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[MailSettings]
  }
  
  extension [Self <: MailSettings](x: Self) {
    
    inline def setGetBcc(value: CallbackTo[Bcc]): Self = StObject.set(x, "getBcc", value.toJsFn)
    
    inline def setGetBypassListManagement(value: CallbackTo[BypassListManagement]): Self = StObject.set(x, "getBypassListManagement", value.toJsFn)
    
    inline def setGetFooter(value: CallbackTo[Footer]): Self = StObject.set(x, "getFooter", value.toJsFn)
    
    inline def setGetSandBoxMode(value: CallbackTo[SandBoxMode]): Self = StObject.set(x, "getSandBoxMode", value.toJsFn)
    
    inline def setGetSpamCheck(value: CallbackTo[SpamCheck]): Self = StObject.set(x, "getSpamCheck", value.toJsFn)
    
    inline def setSetBcc(value: Bcc => Callback): Self = StObject.set(x, "setBcc", js.Any.fromFunction1((t0: Bcc) => value(t0).runNow()))
    
    inline def setSetBypassListManagement(value: BypassListManagement => Callback): Self = StObject.set(x, "setBypassListManagement", js.Any.fromFunction1((t0: BypassListManagement) => value(t0).runNow()))
    
    inline def setSetFooter(value: Footer => Callback): Self = StObject.set(x, "setFooter", js.Any.fromFunction1((t0: Footer) => value(t0).runNow()))
    
    inline def setSetSandBoxMode(value: SandBoxMode => Callback): Self = StObject.set(x, "setSandBoxMode", js.Any.fromFunction1((t0: SandBoxMode) => value(t0).runNow()))
    
    inline def setSetSpamCheck(value: SpamCheck => Callback): Self = StObject.set(x, "setSpamCheck", js.Any.fromFunction1((t0: SpamCheck) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[typingsJapgolly.sendgrid.anon.Bcc]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
