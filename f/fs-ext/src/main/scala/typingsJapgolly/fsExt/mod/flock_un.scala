package typingsJapgolly.fsExt.mod

import typingsJapgolly.fsExt.fsExtStrings.un
import typingsJapgolly.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-ext", "flock")
@js.native
object flock_un extends js.Object {
  def apply(fd: Double, flags: un, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
}

