package typingsJapgolly.antDesignProLayout.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlatMenuKeys extends StObject {
  
  var flatMenuKeys: js.Array[String]
  
  var setFlatMenuKeys: Dispatch[SetStateAction[js.Array[String]]]
}
object FlatMenuKeys {
  
  inline def apply(flatMenuKeys: js.Array[String], setFlatMenuKeys: SetStateAction[js.Array[String]] => Callback): FlatMenuKeys = {
    val __obj = js.Dynamic.literal(flatMenuKeys = flatMenuKeys.asInstanceOf[js.Any], setFlatMenuKeys = js.Any.fromFunction1((t0: SetStateAction[js.Array[String]]) => setFlatMenuKeys(t0).runNow()))
    __obj.asInstanceOf[FlatMenuKeys]
  }
  
  extension [Self <: FlatMenuKeys](x: Self) {
    
    inline def setFlatMenuKeys(value: js.Array[String]): Self = StObject.set(x, "flatMenuKeys", value.asInstanceOf[js.Any])
    
    inline def setFlatMenuKeysVarargs(value: String*): Self = StObject.set(x, "flatMenuKeys", js.Array(value*))
    
    inline def setSetFlatMenuKeys(value: SetStateAction[js.Array[String]] => Callback): Self = StObject.set(x, "setFlatMenuKeys", js.Any.fromFunction1((t0: SetStateAction[js.Array[String]]) => value(t0).runNow()))
  }
}
