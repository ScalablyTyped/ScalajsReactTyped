package typingsJapgolly.chromaJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cubehelix extends js.Object {
  /**
    * gamma factor can be used to emphasise low or high intensity values, default=1
    */
  def gamma(g: Double): Cubehelix
  /**
    * lightness range: default: [0,1] (black -> white)
    */
  def lightness(l: js.Array[Double]): Cubehelix
  /**
    * number (and direction) of hue rotations (e.g. 1=360°, 1.5=`540°``), default=-1.5
    */
  def rotations(r: Double): Cubehelix
  /**
    * You can call cubehelix.scale() to use the cube-helix through the chroma.scale interface.
    */
  def scale(): Scale[Color]
  /**
    * Set start color for hue rotation, default=300
    */
  def start(s: Double): Cubehelix
}

object Cubehelix {
  @scala.inline
  def apply(
    gamma: Double => CallbackTo[Cubehelix],
    lightness: js.Array[Double] => CallbackTo[Cubehelix],
    rotations: Double => CallbackTo[Cubehelix],
    scale: CallbackTo[Scale[Color]],
    start: Double => CallbackTo[Cubehelix]
  ): Cubehelix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gamma")(js.Any.fromFunction1((t0: scala.Double) => gamma(t0).runNow()))
    __obj.updateDynamic("lightness")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => lightness(t0).runNow()))
    __obj.updateDynamic("rotations")(js.Any.fromFunction1((t0: scala.Double) => rotations(t0).runNow()))
    __obj.updateDynamic("scale")(scale.toJsFn)
    __obj.updateDynamic("start")(js.Any.fromFunction1((t0: scala.Double) => start(t0).runNow()))
    __obj.asInstanceOf[Cubehelix]
  }
}

