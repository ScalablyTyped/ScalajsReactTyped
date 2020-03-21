package typingsJapgolly.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object authorizedRouteMod {
  type AuthorizedRoute = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.antDesignPro.authorizedRouteMod.IAuthorizedRouteProps with js.Object, 
    js.Object
  ]
  type authority = java.lang.String | js.Array[java.lang.String] | typingsJapgolly.antDesignPro.authorizedRouteMod.authorityFN | js.Promise[js.Any]
  type authorityFN = js.Function1[/* currentAuthority */ js.UndefOr[java.lang.String], scala.Boolean]
}
