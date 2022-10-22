package typingsJapgolly.flatpickr

import typingsJapgolly.flatpickr.flatpickrInts.`0`
import typingsJapgolly.flatpickr.flatpickrInts.`1`
import typingsJapgolly.flatpickr.flatpickrStrings.increment
import typingsJapgolly.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("flatpickr/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayify[T](obj: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def arrayify[T](obj: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayify")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def debounce[F /* <: js.Function */](fn: F, wait: Double): js.ThisFunction0[/* this */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[js.ThisFunction0[/* this */ Any, Unit]]
  
  inline def int(bool: Boolean): `1` | `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("int")(bool.asInstanceOf[js.Any]).asInstanceOf[`1` | `0`]
  
  inline def pad(number: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def pad(number: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad(number: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def pad(number: Double, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(number.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @js.native
  trait IncrementEvent
    extends StObject
       with MouseEvent {
    
    var delta: Double = js.native
    
    @JSName("type")
    var type_IncrementEvent: increment = js.native
  }
}
