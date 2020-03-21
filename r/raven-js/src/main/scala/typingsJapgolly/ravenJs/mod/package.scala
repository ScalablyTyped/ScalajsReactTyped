package typingsJapgolly.ravenJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RavenCallback = js.Function2[
    /* data */ js.Any, 
    /* orig */ js.UndefOr[js.Function1[/* data */ js.Any, js.Any]], 
    js.Any | scala.Unit
  ]
  type RavenPlugin = js.Function2[
    /* raven */ typingsJapgolly.ravenJs.mod.RavenStatic, 
    /* repeated */ js.Any, 
    typingsJapgolly.ravenJs.mod.RavenStatic
  ]
}
