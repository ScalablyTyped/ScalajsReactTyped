package typingsJapgolly.esm.mod.Options

import typingsJapgolly.esm.PartialEsm
import typingsJapgolly.esm.esmStrings.all
import typingsJapgolly.esm.esmStrings.auto
import typingsJapgolly.esm.esmStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var await: Boolean
  var cjs: Boolean | PartialEsm
  var force: Boolean
  var mainFields: js.Array[String]
  var mode: auto | all | strict
  var wasm: Boolean
}

object Options {
  @scala.inline
  def apply(
    await: Boolean,
    cjs: Boolean | PartialEsm,
    force: Boolean,
    mainFields: js.Array[String],
    mode: auto | all | strict,
    wasm: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], cjs = cjs.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], mainFields = mainFields.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], wasm = wasm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

