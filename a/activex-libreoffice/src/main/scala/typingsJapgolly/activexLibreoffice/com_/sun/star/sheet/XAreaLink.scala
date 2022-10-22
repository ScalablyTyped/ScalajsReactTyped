package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to change the settings of a linked cell range.
  * @see com.sun.star.sheet.CellAreaLink
  */
trait XAreaLink
  extends StObject
     with XInterface {
  
  /** returns the position of the linked range in the destination document. */
  var DestArea: CellRangeAddress
  
  /**
    * returns the source of the range within the source document.
    *
    * This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of a named range or database range.
    */
  var SourceArea: String
  
  /** returns the position of the linked range in the destination document. */
  def getDestArea(): CellRangeAddress
  
  /**
    * returns the source of the range within the source document.
    *
    * This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of a named range or database range.
    */
  def getSourceArea(): String
  
  /** sets the position of the linked range in the destination document. */
  def setDestArea(aDestArea: CellRangeAddress): Unit
  
  /**
    * sets the source of the range within the source document.
    *
    * This can be the address of a cell or range in the form "Sheet1.A1:C5", or the name of a named range or database range.
    */
  def setSourceArea(aSourceArea: String): Unit
}
object XAreaLink {
  
  inline def apply(
    DestArea: CellRangeAddress,
    SourceArea: String,
    acquire: Callback,
    getDestArea: CallbackTo[CellRangeAddress],
    getSourceArea: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setDestArea: CellRangeAddress => Callback,
    setSourceArea: String => Callback
  ): XAreaLink = {
    val __obj = js.Dynamic.literal(DestArea = DestArea.asInstanceOf[js.Any], SourceArea = SourceArea.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDestArea = getDestArea.toJsFn, getSourceArea = getSourceArea.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDestArea = js.Any.fromFunction1((t0: CellRangeAddress) => setDestArea(t0).runNow()), setSourceArea = js.Any.fromFunction1((t0: String) => setSourceArea(t0).runNow()))
    __obj.asInstanceOf[XAreaLink]
  }
  
  extension [Self <: XAreaLink](x: Self) {
    
    inline def setDestArea(value: CellRangeAddress): Self = StObject.set(x, "DestArea", value.asInstanceOf[js.Any])
    
    inline def setGetDestArea(value: CallbackTo[CellRangeAddress]): Self = StObject.set(x, "getDestArea", value.toJsFn)
    
    inline def setGetSourceArea(value: CallbackTo[String]): Self = StObject.set(x, "getSourceArea", value.toJsFn)
    
    inline def setSetDestArea(value: CellRangeAddress => Callback): Self = StObject.set(x, "setDestArea", js.Any.fromFunction1((t0: CellRangeAddress) => value(t0).runNow()))
    
    inline def setSetSourceArea(value: String => Callback): Self = StObject.set(x, "setSourceArea", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSourceArea(value: String): Self = StObject.set(x, "SourceArea", value.asInstanceOf[js.Any])
  }
}
