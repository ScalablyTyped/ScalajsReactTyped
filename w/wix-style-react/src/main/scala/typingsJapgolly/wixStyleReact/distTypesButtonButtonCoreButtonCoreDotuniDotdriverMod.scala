package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.unidriverCore.mod.UniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonButtonCoreButtonCoreDotuniDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Button/ButtonCore/ButtonCore.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buttonCoreDriverFactory(base: UniDriver[Any]): ButtonCoreDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("buttonCoreDriverFactory")(base.asInstanceOf[js.Any]).asInstanceOf[ButtonCoreDriver]
  
  trait ButtonCoreDriver
    extends StObject
       with BaseUniDriver {
    
    def focus(): js.Promise[Unit]
    
    def getButtonTextContent(): js.Promise[String]
    
    def getHref(): js.Promise[String | Null]
    
    def getTabIndex(): js.Promise[String | Null]
    
    def getTagName(): js.Promise[String | Null]
    
    def getType(): js.Promise[String | Null]
    
    def hasPrefixClass(className: String): js.Promise[Boolean]
    
    def hasSuffixClass(className: String): js.Promise[Boolean]
    
    def isButtonDisabled(): js.Promise[Boolean]
    
    def isDisabled(): js.Promise[Boolean]
    
    def isFocused(): js.Promise[Boolean]
    
    def isPrefixIconExists(): js.Promise[Boolean]
    
    def isSuffixIconExists(): js.Promise[Boolean]
  }
  object ButtonCoreDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      focus: CallbackTo[js.Promise[Unit]],
      getButtonTextContent: CallbackTo[js.Promise[String]],
      getHref: CallbackTo[js.Promise[String | Null]],
      getTabIndex: CallbackTo[js.Promise[String | Null]],
      getTagName: CallbackTo[js.Promise[String | Null]],
      getType: CallbackTo[js.Promise[String | Null]],
      hasPrefixClass: String => js.Promise[Boolean],
      hasSuffixClass: String => js.Promise[Boolean],
      isButtonDisabled: CallbackTo[js.Promise[Boolean]],
      isDisabled: CallbackTo[js.Promise[Boolean]],
      isFocused: CallbackTo[js.Promise[Boolean]],
      isPrefixIconExists: CallbackTo[js.Promise[Boolean]],
      isSuffixIconExists: CallbackTo[js.Promise[Boolean]]
    ): ButtonCoreDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, focus = focus.toJsFn, getButtonTextContent = getButtonTextContent.toJsFn, getHref = getHref.toJsFn, getTabIndex = getTabIndex.toJsFn, getTagName = getTagName.toJsFn, getType = getType.toJsFn, hasPrefixClass = js.Any.fromFunction1(hasPrefixClass), hasSuffixClass = js.Any.fromFunction1(hasSuffixClass), isButtonDisabled = isButtonDisabled.toJsFn, isDisabled = isDisabled.toJsFn, isFocused = isFocused.toJsFn, isPrefixIconExists = isPrefixIconExists.toJsFn, isSuffixIconExists = isSuffixIconExists.toJsFn)
      __obj.asInstanceOf[ButtonCoreDriver]
    }
    
    extension [Self <: ButtonCoreDriver](x: Self) {
      
      inline def setFocus(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "focus", value.toJsFn)
      
      inline def setGetButtonTextContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getButtonTextContent", value.toJsFn)
      
      inline def setGetHref(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getHref", value.toJsFn)
      
      inline def setGetTabIndex(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getTabIndex", value.toJsFn)
      
      inline def setGetTagName(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getTagName", value.toJsFn)
      
      inline def setGetType(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getType", value.toJsFn)
      
      inline def setHasPrefixClass(value: String => js.Promise[Boolean]): Self = StObject.set(x, "hasPrefixClass", js.Any.fromFunction1(value))
      
      inline def setHasSuffixClass(value: String => js.Promise[Boolean]): Self = StObject.set(x, "hasSuffixClass", js.Any.fromFunction1(value))
      
      inline def setIsButtonDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isButtonDisabled", value.toJsFn)
      
      inline def setIsDisabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isDisabled", value.toJsFn)
      
      inline def setIsFocused(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isFocused", value.toJsFn)
      
      inline def setIsPrefixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isPrefixIconExists", value.toJsFn)
      
      inline def setIsSuffixIconExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isSuffixIconExists", value.toJsFn)
    }
  }
}
