package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.distTypesCheckboxCheckboxDotuniDotdriverMod.CheckboxUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableListHeaderTableListHeaderDotuniDotdriverMod {
  
  trait TableListHeaderUniDriver
    extends StObject
       with BaseUniDriver {
    
    def getCheckbox(): CheckboxUniDriver
    
    def getColumnTextAt(columnIndex: Double): js.Promise[String]
    
    def toggleColumnSortAt(index: Double): js.Promise[Unit]
  }
  object TableListHeaderUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      getCheckbox: CallbackTo[CheckboxUniDriver],
      getColumnTextAt: Double => js.Promise[String],
      toggleColumnSortAt: Double => js.Promise[Unit]
    ): TableListHeaderUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, getCheckbox = getCheckbox.toJsFn, getColumnTextAt = js.Any.fromFunction1(getColumnTextAt), toggleColumnSortAt = js.Any.fromFunction1(toggleColumnSortAt))
      __obj.asInstanceOf[TableListHeaderUniDriver]
    }
    
    extension [Self <: TableListHeaderUniDriver](x: Self) {
      
      inline def setGetCheckbox(value: CallbackTo[CheckboxUniDriver]): Self = StObject.set(x, "getCheckbox", value.toJsFn)
      
      inline def setGetColumnTextAt(value: Double => js.Promise[String]): Self = StObject.set(x, "getColumnTextAt", js.Any.fromFunction1(value))
      
      inline def setToggleColumnSortAt(value: Double => js.Promise[Unit]): Self = StObject.set(x, "toggleColumnSortAt", js.Any.fromFunction1(value))
    }
  }
}
