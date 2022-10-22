package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the data pilot tables via name and inserting and removing data pilot tables.
  *
  * This interface extends the interface {@link com.sun.star.container.XNameAccess} which provides access to existing data pilot tables in the collection.
  * @see com.sun.star.sheet.DataPilotTables
  * @see com.sun.star.sheet.DataPilotTable
  */
trait XDataPilotTables
  extends StObject
     with XNameAccess {
  
  /**
    * creates a data pilot descriptor.
    *
    * This descriptor can be used with XDataPilotTables::addTable().
    * @see com.sun.star.sheet.DataPilotDescriptor
    */
  def createDataPilotDescriptor(): XDataPilotDescriptor
  
  /**
    * creates a new data pilot table and adds it to the collection.
    * @param aName the name of the data pilot table used in the collection.
    * @param OutputAddress the top left cell of the location of the data pilot table in the spreadsheet document.
    * @param xDescriptor the descriptor containing the settings of the data pilot table.
    * @see com.sun.star.sheet.DataPilotDescriptor
    */
  def insertNewByName(aName: String, OutputAddress: CellAddress, xDescriptor: XDataPilotDescriptor): Unit
  
  /** deletes a data pilot table from the collection. */
  def removeByName(aName: String): Unit
}
object XDataPilotTables {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    createDataPilotDescriptor: CallbackTo[XDataPilotDescriptor],
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    insertNewByName: (String, CellAddress, XDataPilotDescriptor) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback
  ): XDataPilotTables = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, createDataPilotDescriptor = createDataPilotDescriptor.toJsFn, getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, insertNewByName = js.Any.fromFunction3((t0: String, t1: CellAddress, t2: XDataPilotDescriptor) => (insertNewByName(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()))
    __obj.asInstanceOf[XDataPilotTables]
  }
  
  extension [Self <: XDataPilotTables](x: Self) {
    
    inline def setCreateDataPilotDescriptor(value: CallbackTo[XDataPilotDescriptor]): Self = StObject.set(x, "createDataPilotDescriptor", value.toJsFn)
    
    inline def setInsertNewByName(value: (String, CellAddress, XDataPilotDescriptor) => Callback): Self = StObject.set(x, "insertNewByName", js.Any.fromFunction3((t0: String, t1: CellAddress, t2: XDataPilotDescriptor) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveByName(value: String => Callback): Self = StObject.set(x, "removeByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
