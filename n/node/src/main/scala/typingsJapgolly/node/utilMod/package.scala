package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilMod {
  type CustomInspectFunction = js.Function2[
    /* depth */ scala.Double, 
    /* options */ typingsJapgolly.node.utilMod.InspectOptionsStylized, 
    java.lang.String
  ]
  type InspectOptions = typingsJapgolly.node.NodeJS.InspectOptions
}
