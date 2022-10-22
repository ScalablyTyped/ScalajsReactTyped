package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FooterData extends StObject {
  
  /**
    * Text alignment for the data in this footer.
    */
  var align: js.UndefOr[DataAlignType] = js.undefined
  
  /**
    * Index for the column that this footer belongs to
    */
  var columnIndex: Double
  
  /**
    * Formatting function for the data in this footer. Used to be able to do things like sum the contents of this
    * column in the table so that the footer can be used for totals, etc.
    *
    * The output value from the formatter function will be used instead of the label if the formatter function is
    * defined.
    */
  var formatter: js.UndefOr[js.Function1[/* tableData */ js.Array[Any], String | Double | Element]] = js.undefined
  
  /**
    * Title to display for the column footer
    */
  var label: String
}
object FooterData {
  
  inline def apply(columnIndex: Double, label: String): FooterData = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterData]
  }
  
  extension [Self <: FooterData](x: Self) {
    
    inline def setAlign(value: DataAlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setFormatter(value: /* tableData */ js.Array[Any] => String | Double | Element): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
