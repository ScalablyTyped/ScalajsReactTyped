package typingsJapgolly.muiDatatables.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.muiDatatables.mod.MUIDataTableColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mui-datatables.mui-datatables.MUIDataTableTextLabelsBody> */
trait PartialMUIDataTableTextLaColumnHeaderTooltip extends StObject {
  
  var columnHeaderTooltip: js.UndefOr[js.Function1[/* column */ MUIDataTableColumn, String]] = js.undefined
  
  var noMatch: js.UndefOr[String | Node] = js.undefined
  
  var toolTip: js.UndefOr[String] = js.undefined
}
object PartialMUIDataTableTextLaColumnHeaderTooltip {
  
  inline def apply(): PartialMUIDataTableTextLaColumnHeaderTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMUIDataTableTextLaColumnHeaderTooltip]
  }
  
  extension [Self <: PartialMUIDataTableTextLaColumnHeaderTooltip](x: Self) {
    
    inline def setColumnHeaderTooltip(value: /* column */ MUIDataTableColumn => String): Self = StObject.set(x, "columnHeaderTooltip", js.Any.fromFunction1(value))
    
    inline def setColumnHeaderTooltipUndefined: Self = StObject.set(x, "columnHeaderTooltip", js.undefined)
    
    inline def setNoMatch(value: String | Node): Self = StObject.set(x, "noMatch", value.asInstanceOf[js.Any])
    
    inline def setNoMatchNull: Self = StObject.set(x, "noMatch", null)
    
    inline def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
    
    inline def setNoMatchVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "noMatch", js.Array(value*))
    
    inline def setNoMatchVdomElement(value: VdomElement): Self = StObject.set(x, "noMatch", value.rawElement.asInstanceOf[js.Any])
    
    inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
  }
}
