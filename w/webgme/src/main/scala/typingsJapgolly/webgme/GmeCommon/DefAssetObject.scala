package typingsJapgolly.webgme.GmeCommon

import typingsJapgolly.webgme.webgmeStrings.asset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefAssetObject extends DefObject {
  var `type`: asset
}

object DefAssetObject {
  @scala.inline
  def apply(`type`: asset): DefAssetObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefAssetObject]
  }
}

