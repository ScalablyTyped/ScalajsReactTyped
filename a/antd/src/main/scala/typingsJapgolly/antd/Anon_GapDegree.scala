package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GapDegree extends js.Object {
  var gapDegree: Double
  var percent: Double
  var showInfo: Boolean
  var size: String
  var strokeLinecap: String
  var trailColor: String
  var `type`: String
}

object Anon_GapDegree {
  @scala.inline
  def apply(
    gapDegree: Double,
    percent: Double,
    showInfo: Boolean,
    size: String,
    strokeLinecap: String,
    trailColor: String,
    `type`: String
  ): Anon_GapDegree = {
    val __obj = js.Dynamic.literal(gapDegree = gapDegree.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], showInfo = showInfo.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strokeLinecap = strokeLinecap.asInstanceOf[js.Any], trailColor = trailColor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GapDegree]
  }
}

