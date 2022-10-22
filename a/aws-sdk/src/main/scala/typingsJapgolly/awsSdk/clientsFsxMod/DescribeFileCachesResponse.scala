package typingsJapgolly.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFileCachesResponse extends StObject {
  
  /**
    * The response object for the DescribeFileCaches operation.
    */
  var FileCaches: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.FileCaches] = js.undefined
  
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.NextToken] = js.undefined
}
object DescribeFileCachesResponse {
  
  inline def apply(): DescribeFileCachesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileCachesResponse]
  }
  
  extension [Self <: DescribeFileCachesResponse](x: Self) {
    
    inline def setFileCaches(value: FileCaches): Self = StObject.set(x, "FileCaches", value.asInstanceOf[js.Any])
    
    inline def setFileCachesUndefined: Self = StObject.set(x, "FileCaches", js.undefined)
    
    inline def setFileCachesVarargs(value: FileCache*): Self = StObject.set(x, "FileCaches", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
