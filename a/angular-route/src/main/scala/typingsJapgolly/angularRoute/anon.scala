package typingsJapgolly.angularRoute

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictindex
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    @JSName("$scope")
    var $scope: IScope
    
    @JSName("$template")
    var $template: String
  }
  object Dictindex {
    
    inline def apply($scope: IScope, $template: String): Dictindex = {
      val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], $template = $template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictindex]
    }
    
    extension [Self <: Dictindex](x: Self) {
      
      inline def set$scope(value: IScope): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
      
      inline def set$template(value: String): Self = StObject.set(x, "$template", value.asInstanceOf[js.Any])
    }
  }
}
