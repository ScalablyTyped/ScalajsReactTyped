package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsSignatureInputSignatureInputDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/signature-input/SignatureInput.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signatureInputUniDriverFactory(base: UniDriver[Any]): SignatureInputDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureInputUniDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[SignatureInputDriver]
  
  trait SignatureInputDriver
    extends StObject
       with BaseUniDriver {
    
    def getA11yInput(): UniDriver[Any]
    
    def getChildDriverByHook(dataHook: String): UniDriver[Any]
  }
  object SignatureInputDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getA11yInput: CallbackTo[UniDriver[Any]],
      getChildDriverByHook: String => UniDriver[Any]
    ): SignatureInputDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getA11yInput = getA11yInput.toJsFn, getChildDriverByHook = js.Any.fromFunction1(getChildDriverByHook))
      __obj.asInstanceOf[SignatureInputDriver]
    }
    
    extension [Self <: SignatureInputDriver](x: Self) {
      
      inline def setGetA11yInput(value: CallbackTo[UniDriver[Any]]): Self = StObject.set(x, "getA11yInput", value.toJsFn)
      
      inline def setGetChildDriverByHook(value: String => UniDriver[Any]): Self = StObject.set(x, "getChildDriverByHook", js.Any.fromFunction1(value))
    }
  }
}
