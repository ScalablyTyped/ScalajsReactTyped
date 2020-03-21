package typingsJapgolly.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type BeforePopStateCallback = js.Function1[/* state */ js.Any, scala.Boolean]
  type ComponentLoadCancel = js.Function0[scala.Unit] | scala.Null
  type Subscription = js.Function2[
    /* data */ typingsJapgolly.nextServer.routerMod.RouteInfo, 
    /* App */ js.UndefOr[typingsJapgolly.react.mod.ComponentType[js.Object]], 
    scala.Unit
  ]
  type Url = typingsJapgolly.node.urlMod.UrlObject | java.lang.String
}
