package typingsJapgolly.unsplashJs

import typingsJapgolly.unsplashJs.distMethodsCollectionsTypesMod.Basic
import typingsJapgolly.unsplashJs.distMethodsUsersTypesMod.Medium
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMethodsSearchTypesResponseMod {
  
  type Collections = Response[Basic]
  
  type Photos = Response[typingsJapgolly.unsplashJs.distMethodsPhotosTypesMod.Basic]
  
  trait Response[A] extends StObject {
    
    var results: js.Array[A]
    
    var total: Double
    
    var total_pages: Double
  }
  object Response {
    
    inline def apply[A](results: js.Array[A], total: Double, total_pages: Double): Response[A] = {
      val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], total_pages = total_pages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response[A]]
    }
    
    extension [Self <: Response[?], A](x: Self & Response[A]) {
      
      inline def setResults(value: js.Array[A]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: A*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotal_pages(value: Double): Self = StObject.set(x, "total_pages", value.asInstanceOf[js.Any])
    }
  }
  
  type Users = Response[Medium]
}
