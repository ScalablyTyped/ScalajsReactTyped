package typingsJapgolly.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishRecipeResponse extends StObject {
  
  /**
    * The name of the recipe that you published.
    */
  var Name: RecipeName
}
object PublishRecipeResponse {
  
  inline def apply(Name: RecipeName): PublishRecipeResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishRecipeResponse]
  }
  
  extension [Self <: PublishRecipeResponse](x: Self) {
    
    inline def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
