package typingsJapgolly.nginstackOrm

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEntityKeySetMod {
  
  inline def apply(classKey: Double): Unit = ^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(classKey: Double, opt_values: String): Unit = (^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any], opt_values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(classKey: Double, opt_values: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].apply(classKey.asInstanceOf[js.Any], opt_values.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/orm/lib/EntityKeySet", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with EntityKeySet {
    def this(classKey: Double) = this()
    def this(classKey: Double, opt_values: String) = this()
    def this(classKey: Double, opt_values: js.Array[Double]) = this()
    
    /* CompleteClass */
    var classKey: Double = js.native
    
    /* private */ /* CompleteClass */
    var classKey_ : Any = js.native
    
    /* CompleteClass */
    override def toJSONSchema(): Any = js.native
    
    /* CompleteClass */
    override def toJSONString(): String = js.native
    
    /* CompleteClass */
    var values: js.Array[Double] = js.native
    
    /* private */ /* CompleteClass */
    var values_ : Any = js.native
  }
  @JSImport("@nginstack/orm/lib/EntityKeySet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait EntityKeySet extends StObject {
    
    var classKey: Double
    
    /* private */ var classKey_ : Any
    
    def toJSONSchema(): Any
    
    def toJSONString(): String
    
    var values: js.Array[Double]
    
    /* private */ var values_ : Any
  }
  object EntityKeySet {
    
    inline def apply(
      classKey: Double,
      classKey_ : Any,
      toJSONSchema: CallbackTo[Any],
      toJSONString: CallbackTo[String],
      values: js.Array[Double],
      values_ : Any
    ): EntityKeySet = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], classKey_ = classKey_.asInstanceOf[js.Any], toJSONSchema = toJSONSchema.toJsFn, toJSONString = toJSONString.toJsFn, values = values.asInstanceOf[js.Any], values_ = values_.asInstanceOf[js.Any])
      __obj.asInstanceOf[EntityKeySet]
    }
    
    extension [Self <: EntityKeySet](x: Self) {
      
      inline def setClassKey(value: Double): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setClassKey_(value: Any): Self = StObject.set(x, "classKey_", value.asInstanceOf[js.Any])
      
      inline def setToJSONSchema(value: CallbackTo[Any]): Self = StObject.set(x, "toJSONSchema", value.toJsFn)
      
      inline def setToJSONString(value: CallbackTo[String]): Self = StObject.set(x, "toJSONString", value.toJsFn)
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setValues_(value: Any): Self = StObject.set(x, "values_", value.asInstanceOf[js.Any])
    }
  }
}
