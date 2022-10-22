package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsOutput extends StObject {
  
  /**
    * The output for the ListExports action.
    */
  var Exports: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Exports] = js.undefined
  
  /**
    * If the output exceeds 100 exported output values, a string that identifies the next page of exports. If there is no additional page, this value is null.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.NextToken] = js.undefined
}
object ListExportsOutput {
  
  inline def apply(): ListExportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsOutput]
  }
  
  extension [Self <: ListExportsOutput](x: Self) {
    
    inline def setExports(value: Exports): Self = StObject.set(x, "Exports", value.asInstanceOf[js.Any])
    
    inline def setExportsUndefined: Self = StObject.set(x, "Exports", js.undefined)
    
    inline def setExportsVarargs(value: Export*): Self = StObject.set(x, "Exports", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
