package typingsJapgolly.baiduApp.swan.ai

import typingsJapgolly.baiduApp.anon.Score
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait plantClassifyResponse extends StObject {
  
  var log_id: Double
  
  //     唯一的log id，用于问题定位。
  var result: js.Array[Score]
}
object plantClassifyResponse {
  
  inline def apply(log_id: Double, result: js.Array[Score]): plantClassifyResponse = {
    val __obj = js.Dynamic.literal(log_id = log_id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[plantClassifyResponse]
  }
  
  extension [Self <: plantClassifyResponse](x: Self) {
    
    inline def setLog_id(value: Double): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Array[Score]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: Score*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
