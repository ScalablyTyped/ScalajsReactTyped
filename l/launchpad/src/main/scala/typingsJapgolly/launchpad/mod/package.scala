package typingsJapgolly.launchpad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BrowserFunction = js.Function2[
    /* url */ java.lang.String, 
    /* callback */ js.Function2[/* err */ js.Any, /* instance */ typingsJapgolly.launchpad.mod.Instance, scala.Unit], 
    scala.Unit
  ]
}
