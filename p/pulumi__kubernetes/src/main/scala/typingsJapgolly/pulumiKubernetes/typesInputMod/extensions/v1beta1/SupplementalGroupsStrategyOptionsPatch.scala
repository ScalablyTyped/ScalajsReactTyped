package typingsJapgolly.pulumiKubernetes.typesInputMod.extensions.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy. Deprecated: use SupplementalGroupsStrategyOptions from policy API Group instead.
  */
trait SupplementalGroupsStrategyOptionsPatch extends StObject {
  
  /**
    * ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.UndefOr[Input[js.Array[Input[IDRangePatch]]]] = js.undefined
  
  /**
    * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
    */
  var rule: js.UndefOr[Input[String]] = js.undefined
}
object SupplementalGroupsStrategyOptionsPatch {
  
  inline def apply(): SupplementalGroupsStrategyOptionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupplementalGroupsStrategyOptionsPatch]
  }
  
  extension [Self <: SupplementalGroupsStrategyOptionsPatch](x: Self) {
    
    inline def setRanges(value: Input[js.Array[Input[IDRangePatch]]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: Input[IDRangePatch]*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
