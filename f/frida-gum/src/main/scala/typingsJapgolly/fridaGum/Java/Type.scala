package typingsJapgolly.fridaGum.Java

import japgolly.scalajs.react.Callback
import typingsJapgolly.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  /**
    * Size in bytes.
    */
  var byteSize: Double
  
  /**
    * Class name, if applicable.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Converts `value` from a JNI value to a JavaScript value.
    */
  var fromJni: js.UndefOr[js.Function1[/* value */ Any, Any]] = js.undefined
  
  /**
    * Checks whether a given JavaScript `value` is compatible.
    */
  def isCompatible(value: Any): Boolean
  
  /**
    * VM type name. For example `I` for `int`.
    */
  var name: String
  
  /**
    * Reads a value from memory.
    */
  var read: js.UndefOr[js.Function1[/* address */ NativePointerValue, Any]] = js.undefined
  
  /**
    * Size in words.
    */
  var size: Double
  
  /**
    * Converts `value` from a JavaScript value to a JNI value.
    */
  var toJni: js.UndefOr[js.Function1[/* value */ Any, Any]] = js.undefined
  
  /**
    * Frida type name. For example `pointer` for a handle.
    */
  var `type`: String
  
  /**
    * Writes a value to memory.
    */
  var write: js.UndefOr[js.Function2[/* address */ NativePointerValue, /* value */ Any, Unit]] = js.undefined
}
object Type {
  
  inline def apply(byteSize: Double, isCompatible: Any => Boolean, name: String, size: Double, `type`: String): Type = {
    val __obj = js.Dynamic.literal(byteSize = byteSize.asInstanceOf[js.Any], isCompatible = js.Any.fromFunction1(isCompatible), name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setByteSize(value: Double): Self = StObject.set(x, "byteSize", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setFromJni(value: /* value */ Any => Any): Self = StObject.set(x, "fromJni", js.Any.fromFunction1(value))
    
    inline def setFromJniUndefined: Self = StObject.set(x, "fromJni", js.undefined)
    
    inline def setIsCompatible(value: Any => Boolean): Self = StObject.set(x, "isCompatible", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRead(value: /* address */ NativePointerValue => Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setToJni(value: /* value */ Any => Any): Self = StObject.set(x, "toJni", js.Any.fromFunction1(value))
    
    inline def setToJniUndefined: Self = StObject.set(x, "toJni", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: (/* address */ NativePointerValue, /* value */ Any) => Callback): Self = StObject.set(x, "write", js.Any.fromFunction2((t0: /* address */ NativePointerValue, t1: /* value */ Any) => (value(t0, t1)).runNow()))
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
