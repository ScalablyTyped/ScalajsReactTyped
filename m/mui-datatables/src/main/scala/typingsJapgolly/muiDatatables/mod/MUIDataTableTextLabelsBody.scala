package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableTextLabelsBody extends StObject {
  
  def columnHeaderTooltip(column: MUIDataTableColumn): String
  
  var noMatch: String | Node
  
  var toolTip: String
}
object MUIDataTableTextLabelsBody {
  
  inline def apply(columnHeaderTooltip: MUIDataTableColumn => String, toolTip: String): MUIDataTableTextLabelsBody = {
    val __obj = js.Dynamic.literal(columnHeaderTooltip = js.Any.fromFunction1(columnHeaderTooltip), toolTip = toolTip.asInstanceOf[js.Any], noMatch = null)
    __obj.asInstanceOf[MUIDataTableTextLabelsBody]
  }
  
  extension [Self <: MUIDataTableTextLabelsBody](x: Self) {
    
    inline def setColumnHeaderTooltip(value: MUIDataTableColumn => String): Self = StObject.set(x, "columnHeaderTooltip", js.Any.fromFunction1(value))
    
    inline def setNoMatch(value: String | Node): Self = StObject.set(x, "noMatch", value.asInstanceOf[js.Any])
    
    inline def setNoMatchNull: Self = StObject.set(x, "noMatch", null)
    
    inline def setNoMatchVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "noMatch", js.Array(value*))
    
    inline def setNoMatchVdomElement(value: VdomElement): Self = StObject.set(x, "noMatch", value.rawElement.asInstanceOf[js.Any])
    
    inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
  }
}
