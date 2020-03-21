package typingsJapgolly.vegaTypings.encodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ColorValueRef extends js.Object

object _ColorValueRef {
  @scala.inline
  def Anon0(value: LinearGradient | RadialGradient): _ColorValueRef = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_ColorValueRef]
  }
  @scala.inline
  def AnonCount(
    gradient: Field,
    count: Int | Double = null,
    start: js.Array[Double] = null,
    stop: js.Array[Double] = null
  ): _ColorValueRef = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ColorValueRef]
  }
  @scala.inline
  def AnonColor(color: ColorRGB | ColorHSL | ColorLAB | ColorHCL): _ColorValueRef = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_ColorValueRef]
  }
}

