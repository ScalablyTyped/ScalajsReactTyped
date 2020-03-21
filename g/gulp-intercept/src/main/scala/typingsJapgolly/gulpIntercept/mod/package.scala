package typingsJapgolly.gulpIntercept

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Intercept = js.Function1[
    /* interceptFunction */ typingsJapgolly.gulpIntercept.mod.InterceptFunction, 
    typingsJapgolly.node.NodeJS.ReadWriteStream
  ]
  type InterceptFunction = js.Function1[/* file */ typingsJapgolly.vinyl.mod.File, typingsJapgolly.vinyl.mod.File]
}
