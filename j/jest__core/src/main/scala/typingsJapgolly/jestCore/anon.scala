package typingsJapgolly.jestCore

import typingsJapgolly.jestCore.mod.FilterResult
import typingsJapgolly.jestTestResult.mod.AggregatedResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Filtered extends StObject {
    
    var filtered: js.Array[FilterResult]
  }
  object Filtered {
    
    inline def apply(filtered: js.Array[FilterResult]): Filtered = {
      val __obj = js.Dynamic.literal(filtered = filtered.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filtered]
    }
    
    extension [Self <: Filtered](x: Self) {
      
      inline def setFiltered(value: js.Array[FilterResult]): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
      
      inline def setFilteredVarargs(value: FilterResult*): Self = StObject.set(x, "filtered", js.Array(value*))
    }
  }
  
  trait GlobalConfig extends StObject {
    
    var globalConfig: typingsJapgolly.jestTypes.mod.GlobalConfig
    
    var results: AggregatedResult
  }
  object GlobalConfig {
    
    inline def apply(globalConfig: typingsJapgolly.jestTypes.mod.GlobalConfig, results: AggregatedResult): GlobalConfig = {
      val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalConfig]
    }
    
    extension [Self <: GlobalConfig](x: Self) {
      
      inline def setGlobalConfig(value: typingsJapgolly.jestTypes.mod.GlobalConfig): Self = StObject.set(x, "globalConfig", value.asInstanceOf[js.Any])
      
      inline def setResults(value: AggregatedResult): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    }
  }
}
