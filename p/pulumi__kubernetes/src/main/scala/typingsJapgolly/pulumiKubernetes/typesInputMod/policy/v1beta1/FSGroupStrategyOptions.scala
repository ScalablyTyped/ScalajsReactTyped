package typingsJapgolly.pulumiKubernetes.typesInputMod.policy.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
  */
trait FSGroupStrategyOptions extends StObject {
  
  /**
    * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
    */
  var ranges: js.UndefOr[Input[js.Array[Input[IDRange]]]] = js.undefined
  
  /**
    * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
    */
  var rule: js.UndefOr[Input[String]] = js.undefined
}
object FSGroupStrategyOptions {
  
  inline def apply(): FSGroupStrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FSGroupStrategyOptions]
  }
  
  extension [Self <: FSGroupStrategyOptions](x: Self) {
    
    inline def setRanges(value: Input[js.Array[Input[IDRange]]]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    inline def setRangesVarargs(value: Input[IDRange]*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setRule(value: Input[String]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
