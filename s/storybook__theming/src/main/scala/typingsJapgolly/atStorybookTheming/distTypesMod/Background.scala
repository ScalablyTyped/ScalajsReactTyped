package typingsJapgolly.atStorybookTheming.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var app: String
  var bar: String
  var content: String
  var critical: String
  var gridCellSize: Double
  var hoverable: String
  var negative: String
  var positive: String
  var warning: String
}

object Background {
  @scala.inline
  def apply(
    app: String,
    bar: String,
    content: String,
    critical: String,
    gridCellSize: Double,
    hoverable: String,
    negative: String,
    positive: String,
    warning: String
  ): Background = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any], gridCellSize = gridCellSize.asInstanceOf[js.Any], hoverable = hoverable.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Background]
  }
}

