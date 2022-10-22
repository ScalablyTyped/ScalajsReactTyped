package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFieldAggregatorAvgFieldAggregatorMod {
  
  inline def apply(fieldName: Any, dataSet: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(fieldName.asInstanceOf[js.Any], dataSet.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/field-aggregator/AvgFieldAggregator", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AvgFieldAggregator {
    def this(fieldName: Any, dataSet: Any) = this()
    
    /* CompleteClass */
    var fValue: Any = js.native
    
    /* CompleteClass */
    override def getDescription(): Any = js.native
    
    /* CompleteClass */
    override def getReadOnly(): Any = js.native
    
    /* CompleteClass */
    override def getValue(): Double = js.native
    
    /* CompleteClass */
    override def previewValue(recNo: Any, newValue: Any): Unit = js.native
    
    /* CompleteClass */
    override def setDescription(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def setReadOnly(args: Any*): Unit = js.native
    
    /* CompleteClass */
    var supportsCalculatedFields: Boolean = js.native
  }
  @JSImport("@nginstack/web-framework/lib/field-aggregator/AvgFieldAggregator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AvgFieldAggregator extends StObject {
    
    var fValue: Any
    
    def getDescription(): Any
    
    def getReadOnly(): Any
    
    def getValue(): Double
    
    def previewValue(recNo: Any, newValue: Any): Unit
    
    def setDescription(args: Any*): Unit
    
    def setReadOnly(args: Any*): Unit
    
    var supportsCalculatedFields: Boolean
  }
  object AvgFieldAggregator {
    
    inline def apply(
      fValue: Any,
      getDescription: CallbackTo[Any],
      getReadOnly: CallbackTo[Any],
      getValue: CallbackTo[Double],
      previewValue: (Any, Any) => Callback,
      setDescription: /* repeated */ Any => Callback,
      setReadOnly: /* repeated */ Any => Callback,
      supportsCalculatedFields: Boolean
    ): AvgFieldAggregator = {
      val __obj = js.Dynamic.literal(fValue = fValue.asInstanceOf[js.Any], getDescription = getDescription.toJsFn, getReadOnly = getReadOnly.toJsFn, getValue = getValue.toJsFn, previewValue = js.Any.fromFunction2((t0: Any, t1: Any) => (previewValue(t0, t1)).runNow()), setDescription = js.Any.fromFunction1((t0: /* repeated */ Any) => setDescription(t0).runNow()), setReadOnly = js.Any.fromFunction1((t0: /* repeated */ Any) => setReadOnly(t0).runNow()), supportsCalculatedFields = supportsCalculatedFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvgFieldAggregator]
    }
    
    extension [Self <: AvgFieldAggregator](x: Self) {
      
      inline def setFValue(value: Any): Self = StObject.set(x, "fValue", value.asInstanceOf[js.Any])
      
      inline def setGetDescription(value: CallbackTo[Any]): Self = StObject.set(x, "getDescription", value.toJsFn)
      
      inline def setGetReadOnly(value: CallbackTo[Any]): Self = StObject.set(x, "getReadOnly", value.toJsFn)
      
      inline def setGetValue(value: CallbackTo[Double]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setPreviewValue(value: (Any, Any) => Callback): Self = StObject.set(x, "previewValue", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSetDescription(value: /* repeated */ Any => Callback): Self = StObject.set(x, "setDescription", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setSetReadOnly(value: /* repeated */ Any => Callback): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setSupportsCalculatedFields(value: Boolean): Self = StObject.set(x, "supportsCalculatedFields", value.asInstanceOf[js.Any])
    }
  }
}
