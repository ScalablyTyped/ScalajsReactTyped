package typingsJapgolly.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogPattern extends StObject {
  
  /**
    * A regular expression that defines the log pattern. A log pattern can contain as many as 50 characters, and it cannot be empty. The pattern must be DFA compatible. Patterns that utilize forward lookahead or backreference constructions are not supported.
    */
  var Pattern: js.UndefOr[LogPatternRegex] = js.undefined
  
  /**
    * The name of the log pattern. A log pattern name can contain as many as 50 characters, and it cannot be empty. The characters can be Unicode letters, digits, or one of the following symbols: period, dash, underscore.
    */
  var PatternName: js.UndefOr[LogPatternName] = js.undefined
  
  /**
    * The name of the log pattern. A log pattern name can contain as many as 30 characters, and it cannot be empty. The characters can be Unicode letters, digits, or one of the following symbols: period, dash, underscore.
    */
  var PatternSetName: js.UndefOr[LogPatternSetName] = js.undefined
  
  /**
    * Rank of the log pattern. Must be a value between 1 and 1,000,000. The patterns are sorted by rank, so we recommend that you set your highest priority patterns with the lowest rank. A pattern of rank 1 will be the first to get matched to a log line. A pattern of rank 1,000,000 will be last to get matched. When you configure custom log patterns from the console, a Low severity pattern translates to a 750,000 rank. A Medium severity pattern translates to a 500,000 rank. And a High severity pattern translates to a 250,000 rank. Rank values less than 1 or greater than 1,000,000 are reserved for AWS-provided patterns. 
    */
  var Rank: js.UndefOr[LogPatternRank] = js.undefined
}
object LogPattern {
  
  inline def apply(): LogPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPattern]
  }
  
  extension [Self <: LogPattern](x: Self) {
    
    inline def setPattern(value: LogPatternRegex): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternName(value: LogPatternName): Self = StObject.set(x, "PatternName", value.asInstanceOf[js.Any])
    
    inline def setPatternNameUndefined: Self = StObject.set(x, "PatternName", js.undefined)
    
    inline def setPatternSetName(value: LogPatternSetName): Self = StObject.set(x, "PatternSetName", value.asInstanceOf[js.Any])
    
    inline def setPatternSetNameUndefined: Self = StObject.set(x, "PatternSetName", js.undefined)
    
    inline def setPatternUndefined: Self = StObject.set(x, "Pattern", js.undefined)
    
    inline def setRank(value: LogPatternRank): Self = StObject.set(x, "Rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "Rank", js.undefined)
  }
}
