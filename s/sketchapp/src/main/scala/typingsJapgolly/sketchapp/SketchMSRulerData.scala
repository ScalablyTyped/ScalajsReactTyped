package typingsJapgolly.sketchapp

import typingsJapgolly.sketchapp.sketchappStrings.rulerData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSRulerData extends js.Object {
  var _class: rulerData
  var base: Double
  var guides: js.Array[_]
}

object SketchMSRulerData {
  @scala.inline
  def apply(_class: rulerData, base: Double, guides: js.Array[_]): SketchMSRulerData = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SketchMSRulerData]
  }
}

