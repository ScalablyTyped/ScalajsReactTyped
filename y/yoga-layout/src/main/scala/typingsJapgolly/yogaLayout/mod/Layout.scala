package typingsJapgolly.yogaLayout.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  val bottom: Double
  val height: Double
  val left: Double
  val right: Double
  val top: Double
  val width: Double
  def fromJs(
    expose: js.Function6[
      /* left */ Double, 
      /* right */ Double, 
      /* top */ Double, 
      /* bottom */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      _
    ]
  ): Unit
}

object Layout {
  @scala.inline
  def apply(
    bottom: Double,
    fromJs: js.Function6[
      /* left */ Double, 
      /* right */ Double, 
      /* top */ Double, 
      /* bottom */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      js.Any
    ] => Callback,
    height: Double,
    left: Double,
    right: Double,
    top: Double,
    width: Double
  ): Layout = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("fromJs")(js.Any.fromFunction1((t0: js.Function6[
  /* left */ scala.Double, 
  /* right */ scala.Double, 
  /* top */ scala.Double, 
  /* bottom */ scala.Double, 
  /* width */ scala.Double, 
  /* height */ scala.Double, 
  js.Any]) => fromJs(t0).runNow()))
    __obj.asInstanceOf[Layout]
  }
}

