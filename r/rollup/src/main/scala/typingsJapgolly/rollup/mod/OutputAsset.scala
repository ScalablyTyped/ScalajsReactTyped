package typingsJapgolly.rollup.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.rollup.rollupBooleans.`true`
import typingsJapgolly.rollup.rollupStrings.asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputAsset extends js.Object {
  var fileName: String
  /** @deprecated Accessing "isAsset" on files in the bundle is deprecated, please use "type === \'asset\'" instead */
  var isAsset: `true`
  var source: String | Buffer
  var `type`: asset
}

object OutputAsset {
  @scala.inline
  def apply(fileName: String, isAsset: `true`, source: String | Buffer, `type`: asset): OutputAsset = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isAsset = isAsset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputAsset]
  }
}

