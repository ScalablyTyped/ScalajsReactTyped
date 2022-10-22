package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta2

import typingsJapgolly.pulumiKubernetes.typesInputMod.meta.v1.LabelSelectorPatch
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MetricIdentifier defines the name and optionally selector for a metric
  */
trait MetricIdentifierPatch extends StObject {
  
  /**
    * name is the name of the given metric
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
    */
  var selector: js.UndefOr[Input[LabelSelectorPatch]] = js.undefined
}
object MetricIdentifierPatch {
  
  inline def apply(): MetricIdentifierPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricIdentifierPatch]
  }
  
  extension [Self <: MetricIdentifierPatch](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelector(value: Input[LabelSelectorPatch]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
