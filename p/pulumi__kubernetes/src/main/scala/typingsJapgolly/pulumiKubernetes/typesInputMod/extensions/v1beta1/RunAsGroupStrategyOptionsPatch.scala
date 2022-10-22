package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RunAsGroupStrategyOptions defines the strategy type and any options used to create the strategy. Deprecated: use RunAsGroupStrategyOptions from policy API Group instead.
  */
trait RunAsGroupStrategyOptionsPatch extends StObject {
  
  /**
    * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.UndefOr[Input[js.Array[Input[IDRangePatch]]]] = js.undefined
  
  /**
    * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
    */
  var rule: js.UndefOr[Input[String]] = js.undefined
}
object RunAsGroupStrategyOptionsPatch {
  
  inline def apply(): RunAsGroupStrategyOptionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunAsGroupStrategyOptionsPatch]
  }
  
  extension [Self <: RunAsGroupStrategyOptionsPatch](x: Self) {
    
    inline def setRanges(value: Input[js.Array[Input[IDRangePatch]]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: Input[IDRangePatch]*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
