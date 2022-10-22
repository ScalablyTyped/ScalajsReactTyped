package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functions to manage the sheet local databases
  * @since LibreOffice 3.5
  */
trait XUnnamedDatabaseRanges
  extends StObject
     with XInterface {
  
  def getByTable(nTab: Double): Any
  
  def hasByTable(nTab: Double): Boolean
  
  def setByTable(aRange: CellRangeAddress): Unit
}
object XUnnamedDatabaseRanges {
  
  inline def apply(
    acquire: Callback,
    getByTable: Double => Any,
    hasByTable: Double => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    setByTable: CellRangeAddress => Callback
  ): XUnnamedDatabaseRanges = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getByTable = js.Any.fromFunction1(getByTable), hasByTable = js.Any.fromFunction1(hasByTable), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setByTable = js.Any.fromFunction1((t0: CellRangeAddress) => setByTable(t0).runNow()))
    __obj.asInstanceOf[XUnnamedDatabaseRanges]
  }
  
  extension [Self <: XUnnamedDatabaseRanges](x: Self) {
    
    inline def setGetByTable(value: Double => Any): Self = StObject.set(x, "getByTable", js.Any.fromFunction1(value))
    
    inline def setHasByTable(value: Double => Boolean): Self = StObject.set(x, "hasByTable", js.Any.fromFunction1(value))
    
    inline def setSetByTable(value: CellRangeAddress => Callback): Self = StObject.set(x, "setByTable", js.Any.fromFunction1((t0: CellRangeAddress) => value(t0).runNow()))
  }
}
