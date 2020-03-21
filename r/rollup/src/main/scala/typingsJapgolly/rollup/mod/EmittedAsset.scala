package typingsJapgolly.rollup.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.rollup.rollupStrings.asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmittedAsset extends EmittedFile {
  var fileName: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String | Buffer] = js.undefined
  var `type`: asset
}

object EmittedAsset {
  @scala.inline
  def apply(`type`: asset, fileName: String = null, name: String = null, source: String | Buffer = null): EmittedAsset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmittedAsset]
  }
}

