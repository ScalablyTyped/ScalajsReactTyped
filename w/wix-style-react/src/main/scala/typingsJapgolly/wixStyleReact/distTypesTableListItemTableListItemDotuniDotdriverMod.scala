package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableListItemTableListItemDotuniDotdriverMod {
  
  trait TableListItemUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getColumnTextAt(columnIndex: Double): js.Promise[String]
    
    def isCheckboxChecked(): js.Promise[Boolean]
    
    def isCheckboxExists(): js.Promise[Boolean]
    
    def toggleCheckbox(): js.Promise[Unit]
  }
  object TableListItemUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getColumnTextAt: Double => js.Promise[String],
      isCheckboxChecked: CallbackTo[js.Promise[Boolean]],
      isCheckboxExists: CallbackTo[js.Promise[Boolean]],
      toggleCheckbox: CallbackTo[js.Promise[Unit]]
    ): TableListItemUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getColumnTextAt = js.Any.fromFunction1(getColumnTextAt), isCheckboxChecked = isCheckboxChecked.toJsFn, isCheckboxExists = isCheckboxExists.toJsFn, toggleCheckbox = toggleCheckbox.toJsFn)
      __obj.asInstanceOf[TableListItemUniDriver]
    }
    
    extension [Self <: TableListItemUniDriver](x: Self) {
      
      inline def setGetColumnTextAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getColumnTextAt", js.Any.fromFunction1(value))
      
      inline def setIsCheckboxChecked(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCheckboxChecked", value.toJsFn)
      
      inline def setIsCheckboxExists(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCheckboxExists", value.toJsFn)
      
      inline def setToggleCheckbox(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "toggleCheckbox", value.toJsFn)
    }
  }
}
