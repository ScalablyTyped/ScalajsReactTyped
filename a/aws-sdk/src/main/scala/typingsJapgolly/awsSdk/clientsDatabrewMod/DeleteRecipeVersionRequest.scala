package typingsJapgolly.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecipeVersionRequest extends StObject {
  
  /**
    * The name of the recipe.
    */
  var Name: RecipeName
  
  /**
    * The version of the recipe to be deleted. You can specify a numeric versions (X.Y) or LATEST_WORKING. LATEST_PUBLISHED is not supported.
    */
  var RecipeVersion: typingsJapgolly.awsSdk.clientsDatabrewMod.RecipeVersion
}
object DeleteRecipeVersionRequest {
  
  inline def apply(Name: RecipeName, RecipeVersion: RecipeVersion): DeleteRecipeVersionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RecipeVersion = RecipeVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecipeVersionRequest]
  }
  
  extension [Self <: DeleteRecipeVersionRequest](x: Self) {
    
    inline def setName(value: RecipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRecipeVersion(value: RecipeVersion): Self = StObject.set(x, "RecipeVersion", value.asInstanceOf[js.Any])
  }
}
