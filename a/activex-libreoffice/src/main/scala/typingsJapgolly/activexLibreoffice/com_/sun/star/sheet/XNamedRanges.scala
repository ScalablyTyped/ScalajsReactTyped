package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the members in a collection of named ranges and to insert and remove them.
  * @see com.sun.star.sheet.NamedRanges
  * @see com.sun.star.sheet.NamedRange
  */
trait XNamedRanges
  extends StObject
     with XNameAccess {
  
  /**
    * adds a new named range to the collection.
    * @param aName the new name of the named range.
    * @param aContent the formula expression.  A cell range address is one possible content of a named range.
    * @param aPosition specifies the base address for relative cell references.
    * @param nType a combination of flags that specify the type of a named range, as defined in {@link NamedRangeFlag} .  This parameter will be zero for any
    */
  def addNewByName(aName: String, aContent: String, aPosition: CellAddress, nType: Double): Unit
  
  /**
    * creates named cell ranges from titles in a cell range.
    *
    * The names for the named ranges are taken from title cells in the top or bottom row, or from the cells of the left or right column of the range
    * (depending on the parameter aBorder. The named ranges refer to single columns or rows in the inner part of the original range, excluding the labels.
    *
    * Example: The source range is A1:B3. The named ranges shall be created using row titles. This requires Border::TOP for the second parameter. The method
    * creates two named ranges. The name of the first is equal to the content of cell A1 and contains the range $Sheet.$A$2:$A$3 (excluding the title cell).
    * The latter named range is named using cell B1 and contains the cell range address $Sheet.$B$2:$B$3.
    * @param aSource the cell range used to create the named ranges.
    * @param aBorder specifies the location of the title cells.
    */
  def addNewFromTitles(aSource: CellRangeAddress, aBorder: Border): Unit
  
  /**
    * writes a list of all named ranges into the document.
    *
    * The first column of the list contains the names. The second column contains the contents of the named ranges.
    * @param aOutputPosition specifies the top left cell of the output range.
    */
  def outputList(aOutputPosition: CellAddress): Unit
  
  /** removes a named range from the collection. */
  def removeByName(aName: String): Unit
}
object XNamedRanges {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    addNewByName: (String, String, CellAddress, Double) => Callback,
    addNewFromTitles: (CellRangeAddress, Border) => Callback,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    outputList: CellAddress => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback
  ): XNamedRanges = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addNewByName = js.Any.fromFunction4((t0: String, t1: String, t2: CellAddress, t3: Double) => (addNewByName(t0, t1, t2, t3)).runNow()), addNewFromTitles = js.Any.fromFunction2((t0: CellRangeAddress, t1: Border) => (addNewFromTitles(t0, t1)).runNow()), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, outputList = js.Any.fromFunction1((t0: CellAddress) => outputList(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()))
    __obj.asInstanceOf[XNamedRanges]
  }
  
  extension [Self <: XNamedRanges](x: Self) {
    
    inline def setAddNewByName(value: (String, String, CellAddress, Double) => Callback): Self = StObject.set(x, "addNewByName", js.Any.fromFunction4((t0: String, t1: String, t2: CellAddress, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setAddNewFromTitles(value: (CellRangeAddress, Border) => Callback): Self = StObject.set(x, "addNewFromTitles", js.Any.fromFunction2((t0: CellRangeAddress, t1: Border) => (value(t0, t1)).runNow()))
    
    inline def setOutputList(value: CellAddress => Callback): Self = StObject.set(x, "outputList", js.Any.fromFunction1((t0: CellAddress) => value(t0).runNow()))
    
    inline def setRemoveByName(value: String => Callback): Self = StObject.set(x, "removeByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
