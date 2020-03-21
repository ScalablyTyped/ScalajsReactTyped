package typingsJapgolly.angular.mod

import typingsJapgolly.angular.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// ControllerService
// see http://docs.angularjs.org/api/ng.$controller
// see http://docs.angularjs.org/api/ng.$controllerProvider
///////////////////////////////////////////////////////////////////////////
/**
  * The minimal local definitions required by $controller(ctrl, locals) calls.
  */
@js.native
trait IControllerLocals extends js.Object {
  @JSName("$element")
  var $element: JQuery = js.native
  @JSName("$scope")
  var $scope: IScope = js.native
}

