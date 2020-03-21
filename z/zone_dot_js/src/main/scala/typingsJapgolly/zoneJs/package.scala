package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zoneJs {
  /**
    * Patch Function to allow user define their own monkey patch module.
    */
  type PatchFn = js.Function3[
    /* global */ typingsJapgolly.std.Window_, 
    /* Zone */ typingsJapgolly.zoneJs.ZoneType, 
    /* api */ typingsJapgolly.zoneJs.ZonePrivate, 
    scala.Unit
  ]
}
