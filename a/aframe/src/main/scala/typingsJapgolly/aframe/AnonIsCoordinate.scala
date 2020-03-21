package typingsJapgolly.aframe

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.aframe.mod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsCoordinate extends js.Object {
  def isCoordinate(value: String): Boolean
  def parse(value: String): Coordinate
  def stringify(coord: Coordinate): String
}

object AnonIsCoordinate {
  @scala.inline
  def apply(
    isCoordinate: String => CallbackTo[Boolean],
    parse: String => CallbackTo[Coordinate],
    stringify: Coordinate => CallbackTo[String]
  ): AnonIsCoordinate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isCoordinate")(js.Any.fromFunction1((t0: java.lang.String) => isCoordinate(t0).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("stringify")(js.Any.fromFunction1((t0: typingsJapgolly.aframe.mod.Coordinate) => stringify(t0).runNow()))
    __obj.asInstanceOf[AnonIsCoordinate]
  }
}

