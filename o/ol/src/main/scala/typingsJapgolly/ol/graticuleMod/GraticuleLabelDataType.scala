package typingsJapgolly.ol.graticuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraticuleLabelDataType extends js.Object {
  var geom: typingsJapgolly.ol.pointMod.default
  var text: String
}

object GraticuleLabelDataType {
  @scala.inline
  def apply(geom: typingsJapgolly.ol.pointMod.default, text: String): GraticuleLabelDataType = {
    val __obj = js.Dynamic.literal(geom = geom.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraticuleLabelDataType]
  }
}

