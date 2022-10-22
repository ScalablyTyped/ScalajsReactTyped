package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiCore.distEsSrcComponentsButtonNextButtonNextDotuniDotdriverMod.ButtonNextDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsButtonNextButtonNextDotdriverDotprivateMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/button-next/button-next.driver.private", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buttonNextPrivateDriverFactory(base: UniDriver[Any]): ButtonNextPrivateDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonNextPrivateDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ButtonNextPrivateDriver]
  
  trait ButtonNextPrivateDriver
    extends StObject
       with ButtonNextDriver {
    
    def hasPrefixClass(string: Any): js.Promise[Boolean]
    
    def hasSuffixClass(string: Any): js.Promise[Boolean]
    
    def prefixExists(): js.Promise[Boolean]
    
    def suffixExists(): js.Promise[Boolean]
  }
  object ButtonNextPrivateDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getButtonTextContent: CallbackTo[js.Promise[String]],
      hasPrefixClass: Any => js.Promise[Boolean],
      hasSuffixClass: Any => js.Promise[Boolean],
      isButtonDisabled: CallbackTo[js.Promise[Boolean]],
      isFocused: CallbackTo[js.Promise[Boolean]],
      isPrefixIconExists: CallbackTo[js.Promise[Boolean]],
      isSuffixIconExists: CallbackTo[js.Promise[Boolean]],
      prefixExists: CallbackTo[js.Promise[Boolean]],
      suffixExists: CallbackTo[js.Promise[Boolean]]
    ): ButtonNextPrivateDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getButtonTextContent = getButtonTextContent.toJsFn, hasPrefixClass = js.Any.fromFunction1(hasPrefixClass), hasSuffixClass = js.Any.fromFunction1(hasSuffixClass), isButtonDisabled = isButtonDisabled.toJsFn, isFocused = isFocused.toJsFn, isPrefixIconExists = isPrefixIconExists.toJsFn, isSuffixIconExists = isSuffixIconExists.toJsFn, prefixExists = prefixExists.toJsFn, suffixExists = suffixExists.toJsFn)
      __obj.asInstanceOf[ButtonNextPrivateDriver]
    }
    
    extension [Self <: ButtonNextPrivateDriver](x: Self) {
      
      inline def setHasPrefixClass(value: Any => js.Promise[Boolean]): Self = StObject.set(x, "hasPrefixClass", js.Any.fromFunction1(value))
      
      inline def setHasSuffixClass(value: Any => js.Promise[Boolean]): Self = StObject.set(x, "hasSuffixClass", js.Any.fromFunction1(value))
      
      inline def setPrefixExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "prefixExists", value.toJsFn)
      
      inline def setSuffixExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "suffixExists", value.toJsFn)
    }
  }
}
