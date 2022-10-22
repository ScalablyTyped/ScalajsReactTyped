package typingsJapgolly.tsJest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsJsonableValueMod {
  
  @JSImport("ts-jest/dist/utils/jsonable-value", "JsonableValue")
  @js.native
  open class JsonableValue[V] protected () extends StObject {
    def this(value: V) = this()
    
    /* private */ var _serialized: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    def serialized: String = js.native
    
    def value: V = js.native
    def value_=(value: V): Unit = js.native
  }
}
