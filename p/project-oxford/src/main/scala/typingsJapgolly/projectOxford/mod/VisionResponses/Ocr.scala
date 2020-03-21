package typingsJapgolly.projectOxford.mod.VisionResponses

import typingsJapgolly.projectOxford.AnonLines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ocr extends js.Object {
  var language: String
  var orientation: String
  var regions: js.Array[AnonLines]
  var textAngle: Double
}

object Ocr {
  @scala.inline
  def apply(language: String, orientation: String, regions: js.Array[AnonLines], textAngle: Double): Ocr = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any], textAngle = textAngle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Ocr]
  }
}

