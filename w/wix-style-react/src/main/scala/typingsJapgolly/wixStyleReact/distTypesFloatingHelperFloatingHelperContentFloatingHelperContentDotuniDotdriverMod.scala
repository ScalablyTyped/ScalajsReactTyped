package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.horizontal
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.vertical
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFloatingHelperFloatingHelperContentFloatingHelperContentDotuniDotdriverMod {
  
  trait FloatingHelperContentUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickActionButton(): js.Promise[Unit]
    
    def getActionButtonText(): js.Promise[String]
    
    def getBodyContent(): js.Promise[String]
    
    def getDirection(): js.Promise[horizontal | vertical]
    
    def getFooter(): js.Promise[HTMLElement]
    
    def getImage(): js.Promise[HTMLElement]
    
    def getTitleContent(): js.Promise[String]
    
    def hasActionButton(): js.Promise[Boolean]
    
    def hasBody(): js.Promise[Boolean]
    
    def hasFooter(): js.Promise[Boolean]
    
    def hasImage(): js.Promise[Boolean]
    
    def hasTitle(): js.Promise[Boolean]
  }
  object FloatingHelperContentUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      clickActionButton: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getActionButtonText: CallbackTo[js.Promise[String]],
      getBodyContent: CallbackTo[js.Promise[String]],
      getDirection: CallbackTo[js.Promise[horizontal | vertical]],
      getFooter: CallbackTo[js.Promise[HTMLElement]],
      getImage: CallbackTo[js.Promise[HTMLElement]],
      getTitleContent: CallbackTo[js.Promise[String]],
      hasActionButton: CallbackTo[js.Promise[Boolean]],
      hasBody: CallbackTo[js.Promise[Boolean]],
      hasFooter: CallbackTo[js.Promise[Boolean]],
      hasImage: CallbackTo[js.Promise[Boolean]],
      hasTitle: CallbackTo[js.Promise[Boolean]]
    ): FloatingHelperContentUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, clickActionButton = clickActionButton.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getActionButtonText = getActionButtonText.toJsFn, getBodyContent = getBodyContent.toJsFn, getDirection = getDirection.toJsFn, getFooter = getFooter.toJsFn, getImage = getImage.toJsFn, getTitleContent = getTitleContent.toJsFn, hasActionButton = hasActionButton.toJsFn, hasBody = hasBody.toJsFn, hasFooter = hasFooter.toJsFn, hasImage = hasImage.toJsFn, hasTitle = hasTitle.toJsFn)
      __obj.asInstanceOf[FloatingHelperContentUniDriver]
    }
    
    extension [Self <: FloatingHelperContentUniDriver](x: Self) {
      
      inline def setClickActionButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickActionButton", value.toJsFn)
      
      inline def setGetActionButtonText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getActionButtonText", value.toJsFn)
      
      inline def setGetBodyContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getBodyContent", value.toJsFn)
      
      inline def setGetDirection(value: CallbackTo[js.Promise[horizontal | vertical]]): Self = StObject.set(x, "getDirection", value.toJsFn)
      
      inline def setGetFooter(value: CallbackTo[js.Promise[HTMLElement]]): Self = StObject.set(x, "getFooter", value.toJsFn)
      
      inline def setGetImage(value: CallbackTo[js.Promise[HTMLElement]]): Self = StObject.set(x, "getImage", value.toJsFn)
      
      inline def setGetTitleContent(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getTitleContent", value.toJsFn)
      
      inline def setHasActionButton(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasActionButton", value.toJsFn)
      
      inline def setHasBody(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasBody", value.toJsFn)
      
      inline def setHasFooter(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasFooter", value.toJsFn)
      
      inline def setHasImage(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasImage", value.toJsFn)
      
      inline def setHasTitle(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasTitle", value.toJsFn)
    }
  }
}
