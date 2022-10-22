package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberNameArray
  extends StObject
     with MemberName {
  
  def add(entry: MemberName): Unit
  
  def addAll(entries: js.Array[MemberName]): Unit
  
  var delim: String
  
  var entries: js.Array[MemberName]
}
object MemberNameArray {
  
  inline def apply(
    add: MemberName => Callback,
    addAll: js.Array[MemberName] => Callback,
    delim: String,
    entries: js.Array[MemberName],
    isArray: CallbackTo[Boolean],
    isMarker: CallbackTo[Boolean],
    isString: CallbackTo[Boolean],
    prefix: String,
    suffix: String
  ): MemberNameArray = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: MemberName) => add(t0).runNow()), addAll = js.Any.fromFunction1((t0: js.Array[MemberName]) => addAll(t0).runNow()), delim = delim.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], isArray = isArray.toJsFn, isMarker = isMarker.toJsFn, isString = isString.toJsFn, prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberNameArray]
  }
  
  extension [Self <: MemberNameArray](x: Self) {
    
    inline def setAdd(value: MemberName => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: MemberName) => value(t0).runNow()))
    
    inline def setAddAll(value: js.Array[MemberName] => Callback): Self = StObject.set(x, "addAll", js.Any.fromFunction1((t0: js.Array[MemberName]) => value(t0).runNow()))
    
    inline def setDelim(value: String): Self = StObject.set(x, "delim", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: js.Array[MemberName]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: MemberName*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
