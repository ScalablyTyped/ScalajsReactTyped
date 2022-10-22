package typingsJapgolly.tarn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPromiseInspectionMod {
  
  @JSImport("tarn/dist/PromiseInspection", "PromiseInspection")
  @js.native
  open class PromiseInspection[T] protected () extends StObject {
    def this(args: PromiseInspectionArgs[T]) = this()
    
    var _error: js.Error | Unit = js.native
    
    var _value: T | Unit = js.native
    
    def isFulfilled(): Boolean = js.native
    
    def isRejected(): Boolean = js.native
    
    def reason(): Unit | js.Error = js.native
    
    def value(): Unit | T = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tarn.anon.Error[T]
    - typingsJapgolly.tarn.anon.Value[T]
  */
  trait PromiseInspectionArgs[T] extends StObject
  object PromiseInspectionArgs {
    
    inline def Error[T](value: T): typingsJapgolly.tarn.anon.Error[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.tarn.anon.Error[T]]
    }
    
    inline def Value[T](error: js.Error): typingsJapgolly.tarn.anon.Value[T] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.tarn.anon.Value[T]]
    }
  }
}
