package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to columns in text (e.g., in {@link TextFrames} ). */
trait TextColumns
  extends StObject
     with XTextColumns {
  
  /**
    * contains the distance between the columns. It is valid if the property IsAutomatic is set. Half of this distance is set to the left and right margins
    * of all columns, except for the left margin of the first column, and the right margin of the last column.
    */
  var AutomaticDistance: Double
  
  /**
    * determines whether the columns all have equal width. This flag is set if {@link XTextColumns.setColumnCount()} is called and it is reset if {@link
    * XTextColumns.setColumns()} is called.
    */
  var IsAutomatic: Boolean
  
  /** determines the color of the separator lines between the columns. */
  var SeparatorLineColor: Color
  
  /** determines whether separator lines are on. */
  var SeparatorLineIsOn: Boolean
  
  /** determines the relative height of the separator lines between the columns. */
  var SeparatorLineRelativeHeight: Double
  
  /**
    * determines the style of the separator lines between the columns.
    * @see com.sun.star.text:ColumnSeparatorStyle for the possible values.
    */
  var SeparatorLineStyle: Double
  
  /** determines the vertical alignment of the separator lines between the columns. */
  var SeparatorLineVerticalAlignment: VerticalAlignment
  
  /** determines the width of the separator lines between the columns. */
  var SeparatorLineWidth: Double
}
object TextColumns {
  
  inline def apply(
    AutomaticDistance: Double,
    ColumnCount: Double,
    Columns: SafeArray[TextColumn],
    IsAutomatic: Boolean,
    ReferenceValue: Double,
    SeparatorLineColor: Color,
    SeparatorLineIsOn: Boolean,
    SeparatorLineRelativeHeight: Double,
    SeparatorLineStyle: Double,
    SeparatorLineVerticalAlignment: VerticalAlignment,
    SeparatorLineWidth: Double,
    acquire: Callback,
    getColumnCount: CallbackTo[Double],
    getColumns: CallbackTo[SafeArray[TextColumn]],
    getReferenceValue: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setColumnCount: Double => Callback,
    setColumns: SeqEquiv[TextColumn] => Callback
  ): TextColumns = {
    val __obj = js.Dynamic.literal(AutomaticDistance = AutomaticDistance.asInstanceOf[js.Any], ColumnCount = ColumnCount.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], IsAutomatic = IsAutomatic.asInstanceOf[js.Any], ReferenceValue = ReferenceValue.asInstanceOf[js.Any], SeparatorLineColor = SeparatorLineColor.asInstanceOf[js.Any], SeparatorLineIsOn = SeparatorLineIsOn.asInstanceOf[js.Any], SeparatorLineRelativeHeight = SeparatorLineRelativeHeight.asInstanceOf[js.Any], SeparatorLineStyle = SeparatorLineStyle.asInstanceOf[js.Any], SeparatorLineVerticalAlignment = SeparatorLineVerticalAlignment.asInstanceOf[js.Any], SeparatorLineWidth = SeparatorLineWidth.asInstanceOf[js.Any], acquire = acquire.toJsFn, getColumnCount = getColumnCount.toJsFn, getColumns = getColumns.toJsFn, getReferenceValue = getReferenceValue.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setColumnCount = js.Any.fromFunction1((t0: Double) => setColumnCount(t0).runNow()), setColumns = js.Any.fromFunction1((t0: SeqEquiv[TextColumn]) => setColumns(t0).runNow()))
    __obj.asInstanceOf[TextColumns]
  }
  
  extension [Self <: TextColumns](x: Self) {
    
    inline def setAutomaticDistance(value: Double): Self = StObject.set(x, "AutomaticDistance", value.asInstanceOf[js.Any])
    
    inline def setIsAutomatic(value: Boolean): Self = StObject.set(x, "IsAutomatic", value.asInstanceOf[js.Any])
    
    inline def setSeparatorLineColor(value: Color): Self = StObject.set(x, "SeparatorLineColor", value.asInstanceOf[js.Any])
    
    inline def setSeparatorLineIsOn(value: Boolean): Self = StObject.set(x, "SeparatorLineIsOn", value.asInstanceOf[js.Any])
    
    inline def setSeparatorLineRelativeHeight(value: Double): Self = StObject.set(x, "SeparatorLineRelativeHeight", value.asInstanceOf[js.Any])
    
    inline def setSeparatorLineStyle(value: Double): Self = StObject.set(x, "SeparatorLineStyle", value.asInstanceOf[js.Any])
    
    inline def setSeparatorLineVerticalAlignment(value: VerticalAlignment): Self = StObject.set(x, "SeparatorLineVerticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setSeparatorLineWidth(value: Double): Self = StObject.set(x, "SeparatorLineWidth", value.asInstanceOf[js.Any])
  }
}
