package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a field in a subtotal descriptor.
  * @see com.sun.star.sheet.SubTotalField
  * @see com.sun.star.sheet.SubTotalDescriptor
  */
trait XSubTotalField
  extends StObject
     with XInterface {
  
  /** returns the column by which entries are grouped. */
  var GroupColumn: Double
  
  /** returns the definitions of which columns should have subtotals added to them. */
  var SubTotalColumns: SafeArray[SubTotalColumn]
  
  /** returns the column by which entries are grouped. */
  def getGroupColumn(): Double
  
  /** returns the definitions of which columns should have subtotals added to them. */
  def getSubTotalColumns(): SafeArray[SubTotalColumn]
  
  /** sets the column by which entries are grouped. */
  def setGroupColumn(nGroupColumn: Double): Unit
  
  /** sets the definitions of which columns should have subtotals added to them. */
  def setSubTotalColumns(aSubTotalColumns: SeqEquiv[SubTotalColumn]): Unit
}
object XSubTotalField {
  
  inline def apply(
    GroupColumn: Double,
    SubTotalColumns: SafeArray[SubTotalColumn],
    acquire: Callback,
    getGroupColumn: CallbackTo[Double],
    getSubTotalColumns: CallbackTo[SafeArray[SubTotalColumn]],
    queryInterface: `type` => Any,
    release: Callback,
    setGroupColumn: Double => Callback,
    setSubTotalColumns: SeqEquiv[SubTotalColumn] => Callback
  ): XSubTotalField = {
    val __obj = js.Dynamic.literal(GroupColumn = GroupColumn.asInstanceOf[js.Any], SubTotalColumns = SubTotalColumns.asInstanceOf[js.Any], acquire = acquire.toJsFn, getGroupColumn = getGroupColumn.toJsFn, getSubTotalColumns = getSubTotalColumns.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setGroupColumn = js.Any.fromFunction1((t0: Double) => setGroupColumn(t0).runNow()), setSubTotalColumns = js.Any.fromFunction1((t0: SeqEquiv[SubTotalColumn]) => setSubTotalColumns(t0).runNow()))
    __obj.asInstanceOf[XSubTotalField]
  }
  
  extension [Self <: XSubTotalField](x: Self) {
    
    inline def setGetGroupColumn(value: CallbackTo[Double]): Self = StObject.set(x, "getGroupColumn", value.toJsFn)
    
    inline def setGetSubTotalColumns(value: CallbackTo[SafeArray[SubTotalColumn]]): Self = StObject.set(x, "getSubTotalColumns", value.toJsFn)
    
    inline def setGroupColumn(value: Double): Self = StObject.set(x, "GroupColumn", value.asInstanceOf[js.Any])
    
    inline def setSetGroupColumn(value: Double => Callback): Self = StObject.set(x, "setGroupColumn", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSubTotalColumns(value: SeqEquiv[SubTotalColumn] => Callback): Self = StObject.set(x, "setSubTotalColumns", js.Any.fromFunction1((t0: SeqEquiv[SubTotalColumn]) => value(t0).runNow()))
    
    inline def setSubTotalColumns(value: SafeArray[SubTotalColumn]): Self = StObject.set(x, "SubTotalColumns", value.asInstanceOf[js.Any])
  }
}
