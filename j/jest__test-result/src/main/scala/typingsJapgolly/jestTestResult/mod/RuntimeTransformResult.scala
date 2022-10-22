package typingsJapgolly.jestTestResult.mod

import typingsJapgolly.jestTypes.mod.TransformResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeTransformResult
  extends StObject
     with TransformResult {
  
  var wrapperLength: Double
}
object RuntimeTransformResult {
  
  inline def apply(code: String, originalCode: String, wrapperLength: Double): RuntimeTransformResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], originalCode = originalCode.asInstanceOf[js.Any], wrapperLength = wrapperLength.asInstanceOf[js.Any], sourceMapPath = null)
    __obj.asInstanceOf[RuntimeTransformResult]
  }
  
  extension [Self <: RuntimeTransformResult](x: Self) {
    
    inline def setWrapperLength(value: Double): Self = StObject.set(x, "wrapperLength", value.asInstanceOf[js.Any])
  }
}
