package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create, access and modify named ranges in a spreadsheet. Named ranges are ranges that have
  * associated string aliases. They can be viewed and edited via the Sheets UI under the Data >
  * Named ranges... menu.
  */
trait NamedRange extends StObject {
  
  def getName(): String
  
  def getRange(): Range
  
  def remove(): Unit
  
  def setName(name: String): NamedRange
  
  def setRange(range: Range): NamedRange
}
object NamedRange {
  
  inline def apply(
    getName: CallbackTo[String],
    getRange: CallbackTo[Range],
    remove: Callback,
    setName: String => NamedRange,
    setRange: Range => NamedRange
  ): NamedRange = {
    val __obj = js.Dynamic.literal(getName = getName.toJsFn, getRange = getRange.toJsFn, remove = remove.toJsFn, setName = js.Any.fromFunction1(setName), setRange = js.Any.fromFunction1(setRange))
    __obj.asInstanceOf[NamedRange]
  }
  
  extension [Self <: NamedRange](x: Self) {
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetRange(value: CallbackTo[Range]): Self = StObject.set(x, "getRange", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
    
    inline def setSetName(value: String => NamedRange): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setSetRange(value: Range => NamedRange): Self = StObject.set(x, "setRange", js.Any.fromFunction1(value))
  }
}
