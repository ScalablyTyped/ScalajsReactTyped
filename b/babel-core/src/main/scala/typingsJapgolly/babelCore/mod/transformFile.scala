package typingsJapgolly.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-core", "transformFile")
@js.native
object transformFile extends js.Object {
  def apply(
    filename: String,
    opts: TransformOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ BabelFileResult, Unit]
  ): Unit = js.native
}

