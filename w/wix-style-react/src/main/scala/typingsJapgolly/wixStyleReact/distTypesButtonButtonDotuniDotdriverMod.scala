package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonSkin
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonButtonDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Button/Button.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buttonDriverFactory(base: BaseUniDriver): ButtonUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ButtonUniDriver]
  
  trait ButtonUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getButtonTextContent(): js.Promise[String]
    
    def hasSkin(skinName: ButtonSkin): js.Promise[Boolean]
    
    def isButtonDisabled(): js.Promise[Boolean]
    
    def isFocused(): js.Promise[Boolean]
    
    def isPrefixIconExists(): js.Promise[Boolean]
    
    def isSuffixIconExists(): js.Promise[Boolean]
  }
  object ButtonUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getButtonTextContent: CallbackTo[js.Promise[String]],
      hasSkin: ButtonSkin => js.Promise[Boolean],
      isButtonDisabled: CallbackTo[js.Promise[Boolean]],
      isFocused: CallbackTo[js.Promise[Boolean]],
      isPrefixIconExists: CallbackTo[js.Promise[Boolean]],
      isSuffixIconExists: CallbackTo[js.Promise[Boolean]]
    ): ButtonUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getButtonTextContent = getButtonTextContent.toJsFn, hasSkin = js.Any.fromFunction1(hasSkin), isButtonDisabled = isButtonDisabled.toJsFn, isFocused = isFocused.toJsFn, isPrefixIconExists = isPrefixIconExists.toJsFn, isSuffixIconExists = isSuffixIconExists.toJsFn)
      __obj.asInstanceOf[ButtonUniDriver]
    }
    
    extension [Self <: ButtonUniDriver](x: Self) {
      
      inline def setGetButtonTextContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getButtonTextContent", value.toJsFn)
      
      inline def setHasSkin(value: ButtonSkin => js.Promise[Boolean]): Self = StObject.set(x, "hasSkin", js.Any.fromFunction1(value))
      
      inline def setIsButtonDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isButtonDisabled", value.toJsFn)
      
      inline def setIsFocused(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setIsPrefixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPrefixIconExists", value.toJsFn)
      
      inline def setIsSuffixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuffixIconExists", value.toJsFn)
    }
  }
}
