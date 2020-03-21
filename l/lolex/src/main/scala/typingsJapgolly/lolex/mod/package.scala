package typingsJapgolly.lolex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Clock object created by calling `install();`.
    *
    * @type TClock   type of base clock (e.g BrowserClock).
    */
  type InstalledClock[TClock /* <: typingsJapgolly.lolex.mod.Clock */] = TClock with typingsJapgolly.lolex.mod.InstalledMethods
  type TimerId = scala.Double | typingsJapgolly.lolex.mod.NodeTimer
}
