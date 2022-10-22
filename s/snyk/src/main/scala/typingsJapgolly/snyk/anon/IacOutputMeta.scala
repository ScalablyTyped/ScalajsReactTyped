package typingsJapgolly.snyk.anon

import typingsJapgolly.snyk.distLibTypesMod.IacFileInDirectory
import typingsJapgolly.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IacOutputMeta extends StObject {
  
  var iacIgnoredIssuesCount: Double
  
  var iacOutputMeta: typingsJapgolly.snyk.distLibTypesMod.IacOutputMeta
  
  var iacScanFailures: js.Array[IacFileInDirectory]
  
  var resultOptions: js.Array[typingsJapgolly.snyk.distLibTypesMod.Options & TestOptions]
  
  var results: js.Array[Any]
}
object IacOutputMeta {
  
  inline def apply(
    iacIgnoredIssuesCount: Double,
    iacOutputMeta: typingsJapgolly.snyk.distLibTypesMod.IacOutputMeta,
    iacScanFailures: js.Array[IacFileInDirectory],
    resultOptions: js.Array[typingsJapgolly.snyk.distLibTypesMod.Options & TestOptions],
    results: js.Array[Any]
  ): IacOutputMeta = {
    val __obj = js.Dynamic.literal(iacIgnoredIssuesCount = iacIgnoredIssuesCount.asInstanceOf[js.Any], iacOutputMeta = iacOutputMeta.asInstanceOf[js.Any], iacScanFailures = iacScanFailures.asInstanceOf[js.Any], resultOptions = resultOptions.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[IacOutputMeta]
  }
  
  extension [Self <: IacOutputMeta](x: Self) {
    
    inline def setIacIgnoredIssuesCount(value: Double): Self = StObject.set(x, "iacIgnoredIssuesCount", value.asInstanceOf[js.Any])
    
    inline def setIacOutputMeta(value: typingsJapgolly.snyk.distLibTypesMod.IacOutputMeta): Self = StObject.set(x, "iacOutputMeta", value.asInstanceOf[js.Any])
    
    inline def setIacScanFailures(value: js.Array[IacFileInDirectory]): Self = StObject.set(x, "iacScanFailures", value.asInstanceOf[js.Any])
    
    inline def setIacScanFailuresVarargs(value: IacFileInDirectory*): Self = StObject.set(x, "iacScanFailures", js.Array(value*))
    
    inline def setResultOptions(value: js.Array[typingsJapgolly.snyk.distLibTypesMod.Options & TestOptions]): Self = StObject.set(x, "resultOptions", value.asInstanceOf[js.Any])
    
    inline def setResultOptionsVarargs(value: (typingsJapgolly.snyk.distLibTypesMod.Options & TestOptions)*): Self = StObject.set(x, "resultOptions", js.Array(value*))
    
    inline def setResults(value: js.Array[Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: Any*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
