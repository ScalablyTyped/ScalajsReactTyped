package typingsJapgolly.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environments extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[EnvironmentList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsAppconfigMod.NextToken] = js.undefined
}
object Environments {
  
  inline def apply(): Environments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environments]
  }
  
  extension [Self <: Environments](x: Self) {
    
    inline def setItems(value: EnvironmentList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: Environment*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
