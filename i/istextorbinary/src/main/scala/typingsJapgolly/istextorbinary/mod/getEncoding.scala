package typingsJapgolly.istextorbinary.mod

import typingsJapgolly.istextorbinary.istextorbinaryStrings.binary
import typingsJapgolly.istextorbinary.istextorbinaryStrings.utf8
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istextorbinary", "getEncoding")
@js.native
object getEncoding extends js.Object {
  def apply(
    buffer: Buffer,
    opts: js.UndefOr[scala.Nothing],
    next: js.Function2[/* err */ Null, /* result */ utf8 | binary, Unit]
  ): Unit = js.native
  def apply(
    buffer: Buffer,
    opts: Options,
    next: js.Function2[/* err */ Null, /* result */ utf8 | binary, Unit]
  ): Unit = js.native
}

