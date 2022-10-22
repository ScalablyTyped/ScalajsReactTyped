package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsButtonNextButtonNextDotuniDotdriverMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/button-next/button-next.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buttonNextDriverFactory(base: UniDriver[Any]): ButtonNextDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonNextDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ButtonNextDriver]
  
  trait ButtonNextDriver
    extends StObject
       with BaseUniDriver {
    
    /** returns button text */
    def getButtonTextContent(): js.Promise[String]
    
    /** returns true if button disabled */
    def isButtonDisabled(): js.Promise[Boolean]
    
    /** returns true if button focused */
    def isFocused(): js.Promise[Boolean]
    
    /** returns true if a prefix icon exists */
    def isPrefixIconExists(): js.Promise[Boolean]
    
    /** returns true if a suffix icon exists */
    def isSuffixIconExists(): js.Promise[Boolean]
  }
  object ButtonNextDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getButtonTextContent: CallbackTo[js.Promise[String]],
      isButtonDisabled: CallbackTo[js.Promise[Boolean]],
      isFocused: CallbackTo[js.Promise[Boolean]],
      isPrefixIconExists: CallbackTo[js.Promise[Boolean]],
      isSuffixIconExists: CallbackTo[js.Promise[Boolean]]
    ): ButtonNextDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getButtonTextContent = getButtonTextContent.toJsFn, isButtonDisabled = isButtonDisabled.toJsFn, isFocused = isFocused.toJsFn, isPrefixIconExists = isPrefixIconExists.toJsFn, isSuffixIconExists = isSuffixIconExists.toJsFn)
      __obj.asInstanceOf[ButtonNextDriver]
    }
    
    extension [Self <: ButtonNextDriver](x: Self) {
      
      inline def setGetButtonTextContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getButtonTextContent", value.toJsFn)
      
      inline def setIsButtonDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isButtonDisabled", value.toJsFn)
      
      inline def setIsFocused(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setIsPrefixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPrefixIconExists", value.toJsFn)
      
      inline def setIsSuffixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuffixIconExists", value.toJsFn)
    }
  }
}
