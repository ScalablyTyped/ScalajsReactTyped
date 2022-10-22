package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingNotificationFloatingNotificationDotuniDotdriverMod {
  
  trait FloatingNotificationUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickButton(): js.Promise[Unit]
    
    def clickCloseButton(): js.Promise[Unit]
    
    def clickTextButton(): js.Promise[Unit]
    
    def getButtonAttr(attrName: String): js.Promise[String | Null]
    
    def getButtonHref(): js.Promise[String | Null]
    
    def getButtonLabel(): js.Promise[String]
    
    def getText(): js.Promise[String]
    
    def getTextButtonAttr(attrName: String): js.Promise[String | Null]
    
    def getTextButtonHref(): js.Promise[String | Null]
    
    def getTextButtonLabel(): js.Promise[String]
    
    def isButtonAs(
      as: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any
    ): js.Promise[Boolean]
    
    def isTextButtonAs(
      as: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any
    ): js.Promise[Boolean]
  }
  object FloatingNotificationUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickButton: CallbackTo[js.Promise[Unit]],
      clickCloseButton: CallbackTo[js.Promise[Unit]],
      clickTextButton: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getButtonAttr: String => js.Promise[String | Null],
      getButtonHref: CallbackTo[js.Promise[String | Null]],
      getButtonLabel: CallbackTo[js.Promise[String]],
      getText: CallbackTo[js.Promise[String]],
      getTextButtonAttr: String => js.Promise[String | Null],
      getTextButtonHref: CallbackTo[js.Promise[String | Null]],
      getTextButtonLabel: CallbackTo[js.Promise[String]],
      isButtonAs: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any => js.Promise[Boolean],
      isTextButtonAs: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any => js.Promise[Boolean]
    ): FloatingNotificationUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickButton = clickButton.toJsFn, clickCloseButton = clickCloseButton.toJsFn, clickTextButton = clickTextButton.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getButtonAttr = js.Any.fromFunction1(getButtonAttr), getButtonHref = getButtonHref.toJsFn, getButtonLabel = getButtonLabel.toJsFn, getText = getText.toJsFn, getTextButtonAttr = js.Any.fromFunction1(getTextButtonAttr), getTextButtonHref = getTextButtonHref.toJsFn, getTextButtonLabel = getTextButtonLabel.toJsFn, isButtonAs = js.Any.fromFunction1(isButtonAs), isTextButtonAs = js.Any.fromFunction1(isTextButtonAs))
      __obj.asInstanceOf[FloatingNotificationUniDriver]
    }
    
    extension [Self <: FloatingNotificationUniDriver](x: Self) {
      
      inline def setClickButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickButton", value.toJsFn)
      
      inline def setClickCloseButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickCloseButton", value.toJsFn)
      
      inline def setClickTextButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickTextButton", value.toJsFn)
      
      inline def setGetButtonAttr(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getButtonAttr", js.Any.fromFunction1(value))
      
      inline def setGetButtonHref(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getButtonHref", value.toJsFn)
      
      inline def setGetButtonLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getButtonLabel", value.toJsFn)
      
      inline def setGetText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getText", value.toJsFn)
      
      inline def setGetTextButtonAttr(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getTextButtonAttr", js.Any.fromFunction1(value))
      
      inline def setGetTextButtonHref(value: CallbackTo[js.Promise[String | Null]]): Self = StObject.set(x, "getTextButtonHref", value.toJsFn)
      
      inline def setGetTextButtonLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTextButtonLabel", value.toJsFn)
      
      inline def setIsButtonAs(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any => js.Promise[Boolean]
      ): Self = StObject.set(x, "isButtonAs", js.Any.fromFunction1(value))
      
      inline def setIsTextButtonAs(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any => js.Promise[Boolean]
      ): Self = StObject.set(x, "isTextButtonAs", js.Any.fromFunction1(value))
    }
  }
}
