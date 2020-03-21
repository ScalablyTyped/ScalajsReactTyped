package typingsJapgolly.easyXHeaders.fsMod

import typingsJapgolly.easyXHeaders.AnonEncodingFlag
import typingsJapgolly.easyXHeaders.AnonMode
import typingsJapgolly.easyXHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "writeFile")
@js.native
object writeFile extends js.Object {
  def apply(filename: String, data: js.Any): Unit = js.native
  def apply(filename: String, data: js.Any, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit = js.native
  def apply(filename: String, data: js.Any, options: AnonEncodingFlag): Unit = js.native
  def apply(
    filename: String,
    data: js.Any,
    options: AnonEncodingFlag,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
  def apply(filename: String, data: js.Any, options: AnonMode): Unit = js.native
  def apply(
    filename: String,
    data: js.Any,
    options: AnonMode,
    callback: js.Function1[/* err */ ErrnoException, Unit]
  ): Unit = js.native
}

