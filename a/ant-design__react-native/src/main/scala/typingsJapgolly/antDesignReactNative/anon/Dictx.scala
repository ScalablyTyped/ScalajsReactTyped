package typingsJapgolly.antDesignReactNative.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictx
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  def ref(picker: Any): Unit
}
object Dictx {
  
  inline def apply(ref: Any => Callback): Dictx = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1((t0: Any) => ref(t0).runNow()))
    __obj.asInstanceOf[Dictx]
  }
  
  extension [Self <: Dictx](x: Self) {
    
    inline def setRef(value: Any => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
