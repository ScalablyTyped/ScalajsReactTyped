package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperFloatingHelperContentFloatingHelperContentDotdriverMod {
  
  trait FloatingHelperContentDriver
    extends StObject
       with BaseDriver {
    
    def clickActionButton(): Unit
    
    def getActionButtonText(): String
    
    def getBodyContent(): String
    
    def getDirection(): js.Promise[horizontal | vertical]
    
    def getFooter(): HTMLElement
    
    def getImage(): HTMLElement
    
    def getTitleContent(): String
    
    def hasActionButton(): Boolean
    
    def hasBody(): Boolean
    
    def hasFooter(): Boolean
    
    def hasImage(): Boolean
    
    def hasTitle(): Boolean
    
    def matchesActionButtonClassName(className: String): Boolean
  }
  object FloatingHelperContentDriver {
    
    inline def apply(
      clickActionButton: Callback,
      exists: CallbackTo[Boolean],
      getActionButtonText: CallbackTo[String],
      getBodyContent: CallbackTo[String],
      getDirection: CallbackTo[js.Promise[horizontal | vertical]],
      getFooter: CallbackTo[HTMLElement],
      getImage: CallbackTo[HTMLElement],
      getTitleContent: CallbackTo[String],
      hasActionButton: CallbackTo[Boolean],
      hasBody: CallbackTo[Boolean],
      hasFooter: CallbackTo[Boolean],
      hasImage: CallbackTo[Boolean],
      hasTitle: CallbackTo[Boolean],
      matchesActionButtonClassName: String => Boolean
    ): FloatingHelperContentDriver = {
      val __obj = js.Dynamic.literal(clickActionButton = clickActionButton.toJsFn, exists = exists.toJsFn, getActionButtonText = getActionButtonText.toJsFn, getBodyContent = getBodyContent.toJsFn, getDirection = getDirection.toJsFn, getFooter = getFooter.toJsFn, getImage = getImage.toJsFn, getTitleContent = getTitleContent.toJsFn, hasActionButton = hasActionButton.toJsFn, hasBody = hasBody.toJsFn, hasFooter = hasFooter.toJsFn, hasImage = hasImage.toJsFn, hasTitle = hasTitle.toJsFn, matchesActionButtonClassName = js.Any.fromFunction1(matchesActionButtonClassName))
      __obj.asInstanceOf[FloatingHelperContentDriver]
    }
    
    extension [Self <: FloatingHelperContentDriver](x: Self) {
      
      inline def setClickActionButton(value: Callback): Self = StObject.set(x, "clickActionButton", value.toJsFn)
      
      inline def setGetActionButtonText(value: CallbackTo[String]): Self = StObject.set(x, "getActionButtonText", value.toJsFn)
      
      inline def setGetBodyContent(value: CallbackTo[String]): Self = StObject.set(x, "getBodyContent", value.toJsFn)
      
      inline def setGetDirection(value: CallbackTo[js.Promise[horizontal | vertical]]): Self = StObject.set(x, "getDirection", value.toJsFn)
      
      inline def setGetFooter(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getFooter", value.toJsFn)
      
      inline def setGetImage(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getImage", value.toJsFn)
      
      inline def setGetTitleContent(value: CallbackTo[String]): Self = StObject.set(x, "getTitleContent", value.toJsFn)
      
      inline def setHasActionButton(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasActionButton", value.toJsFn)
      
      inline def setHasBody(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasBody", value.toJsFn)
      
      inline def setHasFooter(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasFooter", value.toJsFn)
      
      inline def setHasImage(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasImage", value.toJsFn)
      
      inline def setHasTitle(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasTitle", value.toJsFn)
      
      inline def setMatchesActionButtonClassName(value: String => Boolean): Self = StObject.set(x, "matchesActionButtonClassName", js.Any.fromFunction1(value))
    }
  }
}
