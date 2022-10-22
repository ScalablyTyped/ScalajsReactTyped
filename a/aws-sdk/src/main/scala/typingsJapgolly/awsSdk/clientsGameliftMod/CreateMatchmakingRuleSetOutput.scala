package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMatchmakingRuleSetOutput extends StObject {
  
  /**
    * The newly created matchmaking rule set.
    */
  var RuleSet: MatchmakingRuleSet
}
object CreateMatchmakingRuleSetOutput {
  
  inline def apply(RuleSet: MatchmakingRuleSet): CreateMatchmakingRuleSetOutput = {
    val __obj = js.Dynamic.literal(RuleSet = RuleSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMatchmakingRuleSetOutput]
  }
  
  extension [Self <: CreateMatchmakingRuleSetOutput](x: Self) {
    
    inline def setRuleSet(value: MatchmakingRuleSet): Self = StObject.set(x, "RuleSet", value.asInstanceOf[js.Any])
  }
}
