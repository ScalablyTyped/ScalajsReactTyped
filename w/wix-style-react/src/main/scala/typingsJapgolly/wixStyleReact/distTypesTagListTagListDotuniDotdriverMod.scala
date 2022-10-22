package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTagListTagListDotuniDotdriverMod {
  
  trait TagListUniDriver
    extends StObject
       with BaseUniDriver {
    
    def actionButtonExists(): js.Promise[Boolean]
    
    def actionButtonLabel(): js.Promise[String]
    
    def clickActionButton(): js.Promise[Unit]
    
    def clickToggleMoreButton(): js.Promise[Unit]
    
    def removeTag(id: String): js.Promise[Unit]
    
    def toggleMoreButtonExists(): js.Promise[Boolean]
    
    def toggleMoreButtonLabel(): js.Promise[String]
  }
  object TagListUniDriver {
    
    inline def apply(
      actionButtonExists: CallbackTo[js.Promise[Boolean]],
      actionButtonLabel: CallbackTo[js.Promise[String]],
      click: CallbackTo[js.Promise[Unit]],
      clickActionButton: CallbackTo[js.Promise[Unit]],
      clickToggleMoreButton: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      removeTag: String => js.Promise[Unit],
      toggleMoreButtonExists: CallbackTo[js.Promise[Boolean]],
      toggleMoreButtonLabel: CallbackTo[js.Promise[String]]
    ): TagListUniDriver = {
      val __obj = js.Dynamic.literal(actionButtonExists = actionButtonExists.toJsFn, actionButtonLabel = actionButtonLabel.toJsFn, click = click.toJsFn, clickActionButton = clickActionButton.toJsFn, clickToggleMoreButton = clickToggleMoreButton.toJsFn, element = element.toJsFn, exists = exists.toJsFn, removeTag = js.Any.fromFunction1(removeTag), toggleMoreButtonExists = toggleMoreButtonExists.toJsFn, toggleMoreButtonLabel = toggleMoreButtonLabel.toJsFn)
      __obj.asInstanceOf[TagListUniDriver]
    }
    
    extension [Self <: TagListUniDriver](x: Self) {
      
      inline def setActionButtonExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "actionButtonExists", value.toJsFn)
      
      inline def setActionButtonLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "actionButtonLabel", value.toJsFn)
      
      inline def setClickActionButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickActionButton", value.toJsFn)
      
      inline def setClickToggleMoreButton(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clickToggleMoreButton", value.toJsFn)
      
      inline def setRemoveTag(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeTag", js.Any.fromFunction1(value))
      
      inline def setToggleMoreButtonExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "toggleMoreButtonExists", value.toJsFn)
      
      inline def setToggleMoreButtonLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "toggleMoreButtonLabel", value.toJsFn)
    }
  }
}
