package typingsJapgolly.aframe

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.aframe.mod.Component
import typingsJapgolly.aframe.mod.Entity
import typingsJapgolly.aframe.mod.ObjectMap
import typingsJapgolly.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetMeshMixin extends js.Object {
  var primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]
  def getMeshMixin(): AnonDefaultComponents
}

object AnonGetMeshMixin {
  @scala.inline
  def apply(
    getMeshMixin: CallbackTo[AnonDefaultComponents],
    primitives: ObjectMap[Entity[ObjectMap[Component[_, System[_]]]]]
  ): AnonGetMeshMixin = {
    val __obj = js.Dynamic.literal(primitives = primitives.asInstanceOf[js.Any])
    __obj.updateDynamic("getMeshMixin")(getMeshMixin.toJsFn)
    __obj.asInstanceOf[AnonGetMeshMixin]
  }
}

