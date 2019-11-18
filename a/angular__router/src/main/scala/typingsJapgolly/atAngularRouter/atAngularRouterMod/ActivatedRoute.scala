package typingsJapgolly.atAngularRouter.atAngularRouterMod

import typingsJapgolly.atAngularCore.atAngularCoreMod.Type
import typingsJapgolly.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "ActivatedRoute")
@js.native
class ActivatedRoute () extends js.Object {
  /** The children of this route in the router state tree. */
  val children: js.Array[ActivatedRoute] = js.native
  /** The component of the route, a constant. */
  var component: Type[_] | String | Null = js.native
  /** An observable of the static and resolved data of this route. */
  var data: Observable[Data] = js.native
  /** The first child of this route in the router state tree. */
  val firstChild: ActivatedRoute | Null = js.native
  /** An observable of the URL fragment shared by all the routes. */
  var fragment: Observable[String] = js.native
  /** The outlet name of the route, a constant. */
  var outlet: String = js.native
  /** An Observable that contains a map of the required and optional parameters
    * specific to the route.
    * The map supports retrieving single and multiple values from the same parameter. */
  val paramMap: Observable[ParamMap] = js.native
  /** An observable of the matrix parameters scoped to this route. */
  var params: Observable[Params] = js.native
  /** The parent of this route in the router state tree. */
  val parent: ActivatedRoute | Null = js.native
  /** The path from the root of the router state tree to this route. */
  val pathFromRoot: js.Array[ActivatedRoute] = js.native
  /**
    * An Observable that contains a map of the query parameters available to all routes.
    * The map supports retrieving single and multiple values from the query parameter.
    */
  val queryParamMap: Observable[ParamMap] = js.native
  /** An observable of the query parameters shared by all the routes. */
  var queryParams: Observable[Params] = js.native
  /** The root of the router state. */
  val root: ActivatedRoute = js.native
  /** The configuration used to match this route. */
  val routeConfig: Route | Null = js.native
  /** The current snapshot of this route */
  var snapshot: ActivatedRouteSnapshot = js.native
  /** An observable of the URL segments matched by this route. */
  var url: Observable[js.Array[UrlSegment]] = js.native
}

