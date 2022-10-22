package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiCore.distEsSrcComponentsSignatureInputSignatureInputDotuniDotdriverMod.SignatureInputDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsSignatureInputTestSignatureInputDotprivateDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/signature-input/test/SignatureInput.private.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signatureInputPrivateUniDriverFactory(base: UniDriver[Any]): PrivateSignatureInputDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureInputPrivateUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[PrivateSignatureInputDriver]
  
  trait PrivateSignatureInputDriver
    extends StObject
       with SignatureInputDriver {
    
    def blurA11yInput(): js.Promise[Unit]
    
    def focusA11yInput(): js.Promise[Unit]
  }
  object PrivateSignatureInputDriver {
    
    inline def apply(
      blurA11yInput: CallbackTo[js.Promise[Unit]],
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      focusA11yInput: CallbackTo[js.Promise[Unit]],
      getA11yInput: CallbackTo[UniDriver[Any]],
      getChildDriverByHook: String => UniDriver[Any]
    ): PrivateSignatureInputDriver = {
      val __obj = js.Dynamic.literal(blurA11yInput = blurA11yInput.toJsFn, click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, focusA11yInput = focusA11yInput.toJsFn, getA11yInput = getA11yInput.toJsFn, getChildDriverByHook = js.Any.fromFunction1(getChildDriverByHook))
      __obj.asInstanceOf[PrivateSignatureInputDriver]
    }
    
    extension [Self <: PrivateSignatureInputDriver](x: Self) {
      
      inline def setBlurA11yInput(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "blurA11yInput", value.toJsFn)
      
      inline def setFocusA11yInput(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "focusA11yInput", value.toJsFn)
    }
  }
}
