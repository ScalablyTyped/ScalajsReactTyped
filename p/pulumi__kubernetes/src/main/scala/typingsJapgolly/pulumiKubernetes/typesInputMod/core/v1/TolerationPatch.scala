package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The pod this Toleration is attached to tolerates any taint that matches the triple <key,value,effect> using the matching operator <operator>.
  */
trait TolerationPatch extends StObject {
  
  /**
    * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
    */
  var effect: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
    */
  var key: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
    */
  var operator: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
    */
  var tolerationSeconds: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
    */
  var value: js.UndefOr[Input[String]] = js.undefined
}
object TolerationPatch {
  
  inline def apply(): TolerationPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TolerationPatch]
  }
  
  extension [Self <: TolerationPatch](x: Self) {
    
    inline def setEffect(value: Input[String]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOperator(value: Input[String]): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setTolerationSeconds(value: Input[Double]): Self = StObject.set(x, "tolerationSeconds", value.asInstanceOf[js.Any])
    
    inline def setTolerationSecondsUndefined: Self = StObject.set(x, "tolerationSeconds", js.undefined)
    
    inline def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
