package typingsJapgolly.ftps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FTPCallbackFunction = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* results */ typingsJapgolly.ftps.mod.FTPResults, 
    js.Any
  ]
}
