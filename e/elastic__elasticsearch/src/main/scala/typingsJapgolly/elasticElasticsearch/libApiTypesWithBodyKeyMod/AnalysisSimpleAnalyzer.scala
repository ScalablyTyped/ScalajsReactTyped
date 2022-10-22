package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalysisSimpleAnalyzer
  extends StObject
     with AnalysisAnalyzer {
  
  var `type`: simple
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object AnalysisSimpleAnalyzer {
  
  inline def apply(): AnalysisSimpleAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("simple")
    __obj.asInstanceOf[AnalysisSimpleAnalyzer]
  }
  
  extension [Self <: AnalysisSimpleAnalyzer](x: Self) {
    
    inline def setType(value: simple): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
