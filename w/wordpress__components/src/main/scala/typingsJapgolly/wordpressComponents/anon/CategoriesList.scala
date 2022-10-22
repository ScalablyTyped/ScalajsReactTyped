package typingsJapgolly.wordpressComponents.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoriesList extends StObject {
  
  var categoriesList: js.Array[Id]
  
  def onCategoryChange(categoryId: Double): Unit
  
  var selectedCategoryId: Double
}
object CategoriesList {
  
  inline def apply(categoriesList: js.Array[Id], onCategoryChange: Double => Callback, selectedCategoryId: Double): CategoriesList = {
    val __obj = js.Dynamic.literal(categoriesList = categoriesList.asInstanceOf[js.Any], onCategoryChange = js.Any.fromFunction1((t0: Double) => onCategoryChange(t0).runNow()), selectedCategoryId = selectedCategoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoriesList]
  }
  
  extension [Self <: CategoriesList](x: Self) {
    
    inline def setCategoriesList(value: js.Array[Id]): Self = StObject.set(x, "categoriesList", value.asInstanceOf[js.Any])
    
    inline def setCategoriesListVarargs(value: Id*): Self = StObject.set(x, "categoriesList", js.Array(value*))
    
    inline def setOnCategoryChange(value: Double => Callback): Self = StObject.set(x, "onCategoryChange", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSelectedCategoryId(value: Double): Self = StObject.set(x, "selectedCategoryId", value.asInstanceOf[js.Any])
  }
}
