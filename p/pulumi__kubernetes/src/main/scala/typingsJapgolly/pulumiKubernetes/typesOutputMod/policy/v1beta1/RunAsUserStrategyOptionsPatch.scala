package typingsJapgolly.pulumiKubernetes.typesOutputMod.policy.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RunAsUserStrategyOptions defines the strategy type and any options used to create the strategy.
  */
trait RunAsUserStrategyOptionsPatch extends StObject {
  
  /**
    * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.Array[IDRangePatch]
  
  /**
    * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
    */
  var rule: String
}
object RunAsUserStrategyOptionsPatch {
  
  inline def apply(ranges: js.Array[IDRangePatch], rule: String): RunAsUserStrategyOptionsPatch = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunAsUserStrategyOptionsPatch]
  }
  
  extension [Self <: RunAsUserStrategyOptionsPatch](x: Self) {
    
    inline def setRanges(value: js.Array[IDRangePatch]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: IDRangePatch*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
