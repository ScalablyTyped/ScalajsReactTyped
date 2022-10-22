package typingsJapgolly.detox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipeName extends StObject {
  
  var recipeName: String
}
object RecipeName {
  
  inline def apply(recipeName: String): RecipeName = {
    val __obj = js.Dynamic.literal(recipeName = recipeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipeName]
  }
  
  extension [Self <: RecipeName](x: Self) {
    
    inline def setRecipeName(value: String): Self = StObject.set(x, "recipeName", value.asInstanceOf[js.Any])
  }
}
