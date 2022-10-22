package typingsJapgolly.expoDevcert

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUserInterfaceMod extends Shortcut {
  
  @JSImport("@expo/devcert/dist/user-interface", JSImport.Default)
  @js.native
  val default: UserInterface = js.native
  
  trait UserInterface extends StObject {
    
    def closeFirefoxBeforeContinuing(): js.Promise[Unit]
    
    def firefoxWizardPromptPage(certificateURL: String): js.Promise[String]
    
    def getWindowsEncryptionPassword(): js.Promise[String]
    
    def startFirefoxWizard(certificateHost: String): js.Promise[Unit]
    
    def waitForFirefoxWizard(): js.Promise[Unit]
    
    def warnChromeOnLinuxWithoutCertutil(): js.Promise[Unit]
  }
  object UserInterface {
    
    inline def apply(
      closeFirefoxBeforeContinuing: CallbackTo[js.Promise[Unit]],
      firefoxWizardPromptPage: String => js.Promise[String],
      getWindowsEncryptionPassword: CallbackTo[js.Promise[String]],
      startFirefoxWizard: String => js.Promise[Unit],
      waitForFirefoxWizard: CallbackTo[js.Promise[Unit]],
      warnChromeOnLinuxWithoutCertutil: CallbackTo[js.Promise[Unit]]
    ): UserInterface = {
      val __obj = js.Dynamic.literal(closeFirefoxBeforeContinuing = closeFirefoxBeforeContinuing.toJsFn, firefoxWizardPromptPage = js.Any.fromFunction1(firefoxWizardPromptPage), getWindowsEncryptionPassword = getWindowsEncryptionPassword.toJsFn, startFirefoxWizard = js.Any.fromFunction1(startFirefoxWizard), waitForFirefoxWizard = waitForFirefoxWizard.toJsFn, warnChromeOnLinuxWithoutCertutil = warnChromeOnLinuxWithoutCertutil.toJsFn)
      __obj.asInstanceOf[UserInterface]
    }
    
    extension [Self <: UserInterface](x: Self) {
      
      inline def setCloseFirefoxBeforeContinuing(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "closeFirefoxBeforeContinuing", value.toJsFn)
      
      inline def setFirefoxWizardPromptPage(value: String => js.Promise[String]): Self = StObject.set(x, "firefoxWizardPromptPage", js.Any.fromFunction1(value))
      
      inline def setGetWindowsEncryptionPassword(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getWindowsEncryptionPassword", value.toJsFn)
      
      inline def setStartFirefoxWizard(value: String => js.Promise[Unit]): Self = StObject.set(x, "startFirefoxWizard", js.Any.fromFunction1(value))
      
      inline def setWaitForFirefoxWizard(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "waitForFirefoxWizard", value.toJsFn)
      
      inline def setWarnChromeOnLinuxWithoutCertutil(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "warnChromeOnLinuxWithoutCertutil", value.toJsFn)
    }
  }
  
  type _To = UserInterface
  
  /* This means you don't have to write `default`, but can instead just say `distUserInterfaceMod.foo` */
  override def _to: UserInterface = default
}
