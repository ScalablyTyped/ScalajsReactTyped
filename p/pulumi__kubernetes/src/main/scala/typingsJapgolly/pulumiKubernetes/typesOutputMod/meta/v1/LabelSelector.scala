package typingsJapgolly.pulumiKubernetes.typesOutputMod.meta.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A label selector is a label query over a set of resources. The result of matchLabels and matchExpressions are ANDed. An empty label selector matches all objects. A null label selector matches no objects.
  */
trait LabelSelector extends StObject {
  
  /**
    * matchExpressions is a list of label selector requirements. The requirements are ANDed.
    */
  var matchExpressions: js.Array[LabelSelectorRequirement]
  
  /**
    * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is "key", the operator is "In", and the values array contains only "value". The requirements are ANDed.
    */
  var matchLabels: StringDictionary[String]
}
object LabelSelector {
  
  inline def apply(matchExpressions: js.Array[LabelSelectorRequirement], matchLabels: StringDictionary[String]): LabelSelector = {
    val __obj = js.Dynamic.literal(matchExpressions = matchExpressions.asInstanceOf[js.Any], matchLabels = matchLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSelector]
  }
  
  extension [Self <: LabelSelector](x: Self) {
    
    inline def setMatchExpressions(value: js.Array[LabelSelectorRequirement]): Self = StObject.set(x, "matchExpressions", value.asInstanceOf[js.Any])
    
    inline def setMatchExpressionsVarargs(value: LabelSelectorRequirement*): Self = StObject.set(x, "matchExpressions", js.Array(value*))
    
    inline def setMatchLabels(value: StringDictionary[String]): Self = StObject.set(x, "matchLabels", value.asInstanceOf[js.Any])
  }
}
