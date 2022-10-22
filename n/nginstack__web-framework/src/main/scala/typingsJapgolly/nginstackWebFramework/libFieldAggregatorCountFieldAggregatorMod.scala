package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFieldAggregatorCountFieldAggregatorMod {
  
  inline def apply(fieldName: Any, dataSet: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(fieldName.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/field-aggregator/CountFieldAggregator", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CountFieldAggregator {
    def this(fieldName: Any, dataSet: Any) = this()
    
    /* CompleteClass */
    var decimalPrecision: Double = js.native
    
    /* CompleteClass */
    override def getDescription(): Any = js.native
    
    /* CompleteClass */
    override def getReadOnly(): Any = js.native
    
    /* CompleteClass */
    override def getValue(): Any = js.native
    
    /* CompleteClass */
    override def previewValue(): Unit = js.native
    
    /* CompleteClass */
    override def setDescription(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def setReadOnly(args: Any*): Unit = js.native
    
    /* CompleteClass */
    var supportsCalculatedFields: Boolean = js.native
  }
  @JSImport("@nginstack/web-framework/lib/field-aggregator/CountFieldAggregator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CountFieldAggregator extends StObject {
    
    var decimalPrecision: Double
    
    def getDescription(): Any
    
    def getReadOnly(): Any
    
    def getValue(): Any
    
    def previewValue(): Unit
    
    def setDescription(args: Any*): Unit
    
    def setReadOnly(args: Any*): Unit
    
    var supportsCalculatedFields: Boolean
  }
  object CountFieldAggregator {
    
    inline def apply(
      decimalPrecision: Double,
      getDescription: CallbackTo[Any],
      getReadOnly: CallbackTo[Any],
      getValue: CallbackTo[Any],
      previewValue: Callback,
      setDescription: /* repeated */ Any => Callback,
      setReadOnly: /* repeated */ Any => Callback,
      supportsCalculatedFields: Boolean
    ): CountFieldAggregator = {
      val __obj = js.Dynamic.literal(decimalPrecision = decimalPrecision.asInstanceOf[js.Any], getDescription = getDescription.toJsFn, getReadOnly = getReadOnly.toJsFn, getValue = getValue.toJsFn, previewValue = previewValue.toJsFn, setDescription = js.Any.fromFunction1((t0: /* repeated */ Any) => setDescription(t0).runNow()), setReadOnly = js.Any.fromFunction1((t0: /* repeated */ Any) => setReadOnly(t0).runNow()), supportsCalculatedFields = supportsCalculatedFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[CountFieldAggregator]
    }
    
    extension [Self <: CountFieldAggregator](x: Self) {
      
      inline def setDecimalPrecision(value: Double): Self = StObject.set(x, "decimalPrecision", value.asInstanceOf[js.Any])
      
      inline def setGetDescription(value: CallbackTo[Any]): Self = StObject.set(x, "getDescription", value.toJsFn)
      
      inline def setGetReadOnly(value: CallbackTo[Any]): Self = StObject.set(x, "getReadOnly", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setPreviewValue(value: Callback): Self = StObject.set(x, "previewValue", value.toJsFn)
      
      inline def setSetDescription(value: /* repeated */ Any => Callback): Self = StObject.set(x, "setDescription", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setSetReadOnly(value: /* repeated */ Any => Callback): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setSupportsCalculatedFields(value: Boolean): Self = StObject.set(x, "supportsCalculatedFields", value.asInstanceOf[js.Any])
    }
  }
}
