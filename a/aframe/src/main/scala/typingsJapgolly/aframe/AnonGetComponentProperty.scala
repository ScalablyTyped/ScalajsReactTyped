package typingsJapgolly.aframe

import typingsJapgolly.aframe.mod.Component
import typingsJapgolly.aframe.mod.Entity
import typingsJapgolly.aframe.mod.ObjectMap
import typingsJapgolly.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetComponentProperty extends js.Object {
  def getComponentProperty(entity: Entity[ObjectMap[Component[_, System[_]]]], componentName: String): js.Any = js.native
  def getComponentProperty(entity: Entity[ObjectMap[Component[_, System[_]]]], componentName: String, delimiter: String): js.Any = js.native
  def setComponentProperty(entity: Entity[ObjectMap[Component[_, System[_]]]], componentName: String, value: js.Any): Unit = js.native
  def setComponentProperty(
    entity: Entity[ObjectMap[Component[_, System[_]]]],
    componentName: String,
    value: js.Any,
    delimiter: String
  ): Unit = js.native
}

