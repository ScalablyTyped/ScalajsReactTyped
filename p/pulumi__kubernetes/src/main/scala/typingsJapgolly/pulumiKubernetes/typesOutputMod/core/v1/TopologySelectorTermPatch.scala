package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A topology selector term represents the result of label queries. A null or empty topology selector term matches no objects. The requirements of them are ANDed. It provides a subset of functionality as NodeSelectorTerm. This is an alpha feature and may change in the future.
  */
trait TopologySelectorTermPatch extends StObject {
  
  /**
    * A list of topology selector requirements by labels.
    */
  var matchLabelExpressions: js.Array[TopologySelectorLabelRequirementPatch]
}
object TopologySelectorTermPatch {
  
  inline def apply(matchLabelExpressions: js.Array[TopologySelectorLabelRequirementPatch]): TopologySelectorTermPatch = {
    val __obj = js.Dynamic.literal(matchLabelExpressions = matchLabelExpressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologySelectorTermPatch]
  }
  
  extension [Self <: TopologySelectorTermPatch](x: Self) {
    
    inline def setMatchLabelExpressions(value: js.Array[TopologySelectorLabelRequirementPatch]): Self = StObject.set(x, "matchLabelExpressions", value.asInstanceOf[js.Any])
    
    inline def setMatchLabelExpressionsVarargs(value: TopologySelectorLabelRequirementPatch*): Self = StObject.set(x, "matchLabelExpressions", js.Array(value*))
  }
}
