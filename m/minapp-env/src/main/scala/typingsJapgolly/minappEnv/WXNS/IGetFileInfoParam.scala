package typingsJapgolly.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGetFileInfoParam
  extends StObject
     with IAPIParam[IGetFileInfoSuccessResult] {
  
  var digestAlgorithm: js.UndefOr[String] = js.undefined
  
  var filePath: String
}
object IGetFileInfoParam {
  
  inline def apply(filePath: String): IGetFileInfoParam = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetFileInfoParam]
  }
  
  extension [Self <: IGetFileInfoParam](x: Self) {
    
    inline def setDigestAlgorithm(value: String): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
