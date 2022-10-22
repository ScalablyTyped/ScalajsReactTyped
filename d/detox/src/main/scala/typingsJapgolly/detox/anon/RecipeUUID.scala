package typingsJapgolly.detox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipeUUID extends StObject {
  
  var recipeUUID: String
}
object RecipeUUID {
  
  inline def apply(recipeUUID: String): RecipeUUID = {
    val __obj = js.Dynamic.literal(recipeUUID = recipeUUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipeUUID]
  }
  
  extension [Self <: RecipeUUID](x: Self) {
    
    inline def setRecipeUUID(value: String): Self = StObject.set(x, "recipeUUID", value.asInstanceOf[js.Any])
  }
}
