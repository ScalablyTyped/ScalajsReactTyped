package typingsJapgolly.routeParser.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.routeParser.routeParserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route[TParams /* <: js.Object */] extends js.Object {
  /**
    * Match a path against this route, returning the matched parameters if
    * it matches, false if not.
    * @example
    * var route = new Route('/this/is/my/route')
    * route.match('/this/is/my/route') // -> {}
    * @example
    * var route = new Route('/:one/:two')
    * route.match('/foo/bar/') // -> {one: 'foo', two: 'bar'}
    */
  def `match`(pathname: String): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof TParams ]: string}
    */ typingsJapgolly.routeParser.routeParserStrings.Route with js.Any) | `false`
  /**
    * Reverse a route specification to a path, returning false if it can't be
    * fulfilled
    * @example
    * var route = new Route('/:one/:two')
    * route.reverse({one: 'foo', two: 'bar'}) -> '/foo/bar'
    */
  def reverse(params: TParams): String | `false`
}

object Route {
  @scala.inline
  def apply[TParams /* <: js.Object */](
    `match`: String => CallbackTo[
      (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof TParams ]: string}
    */ typingsJapgolly.routeParser.routeParserStrings.Route with js.Any) | `false`
    ],
    reverse: TParams => CallbackTo[String | `false`]
  ): Route[TParams] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction1((t0: java.lang.String) => `match`(t0).runNow()))
    __obj.updateDynamic("reverse")(js.Any.fromFunction1((t0: TParams) => reverse(t0).runNow()))
    __obj.asInstanceOf[Route[TParams]]
  }
}

