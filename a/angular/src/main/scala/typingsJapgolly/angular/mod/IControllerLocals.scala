package typingsJapgolly.angular.mod

import typingsJapgolly.angular.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// ControllerService
// see http://docs.angularjs.org/api/ng/service/$controller
// see http://docs.angularjs.org/api/ng/provider/$controllerProvider
///////////////////////////////////////////////////////////////////////////
/**
  * The minimal local definitions required by $controller(ctrl, locals) calls.
  */
trait IControllerLocals extends StObject {
  
  @JSName("$element")
  var $element: JQuery
  
  @JSName("$scope")
  var $scope: IScope
}
object IControllerLocals {
  
  inline def apply($element: JQuery, $scope: IScope): IControllerLocals = {
    val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $scope = $scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControllerLocals]
  }
  
  extension [Self <: IControllerLocals](x: Self) {
    
    inline def set$element(value: JQuery): Self = StObject.set(x, "$element", value.asInstanceOf[js.Any])
    
    inline def set$scope(value: IScope): Self = StObject.set(x, "$scope", value.asInstanceOf[js.Any])
  }
}
