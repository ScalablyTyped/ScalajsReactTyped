package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XConditionalFormats
  extends StObject
     with XInterface {
  
  val ConditionalFormats: SafeArray[XConditionalFormat]
  
  val Length: Double
  
  /** adds a conditional format to the existing list returns the id of the inserted conditional format */
  def createByRange(range: XSheetCellRanges): Double
  
  def getConditionalFormats(): SafeArray[XConditionalFormat]
  
  def getLength(): Double
  
  def removeByID(ID: Double): Unit
}
object XConditionalFormats {
  
  inline def apply(
    ConditionalFormats: SafeArray[XConditionalFormat],
    Length: Double,
    acquire: Callback,
    createByRange: XSheetCellRanges => Double,
    getConditionalFormats: CallbackTo[SafeArray[XConditionalFormat]],
    getLength: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    removeByID: Double => Callback
  ): XConditionalFormats = {
    val __obj = js.Dynamic.literal(ConditionalFormats = ConditionalFormats.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], acquire = acquire.toJsFn, createByRange = js.Any.fromFunction1(createByRange), getConditionalFormats = getConditionalFormats.toJsFn, getLength = getLength.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByID = js.Any.fromFunction1((t0: Double) => removeByID(t0).runNow()))
    __obj.asInstanceOf[XConditionalFormats]
  }
  
  extension [Self <: XConditionalFormats](x: Self) {
    
    inline def setConditionalFormats(value: SafeArray[XConditionalFormat]): Self = StObject.set(x, "ConditionalFormats", value.asInstanceOf[js.Any])
    
    inline def setCreateByRange(value: XSheetCellRanges => Double): Self = StObject.set(x, "createByRange", js.Any.fromFunction1(value))
    
    inline def setGetConditionalFormats(value: CallbackTo[SafeArray[XConditionalFormat]]): Self = StObject.set(x, "getConditionalFormats", value.toJsFn)
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    
    inline def setRemoveByID(value: Double => Callback): Self = StObject.set(x, "removeByID", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
