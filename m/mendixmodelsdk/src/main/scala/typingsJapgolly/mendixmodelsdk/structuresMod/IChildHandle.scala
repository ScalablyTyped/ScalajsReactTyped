package typingsJapgolly.mendixmodelsdk.structuresMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChildHandle extends js.Object {
  var containingProperty: AbstractStructureProperty
  def delete(): Unit
  def detach(): Unit
}

object IChildHandle {
  @scala.inline
  def apply(containingProperty: AbstractStructureProperty, delete: Callback, detach: Callback): IChildHandle = {
    val __obj = js.Dynamic.literal(containingProperty = containingProperty.asInstanceOf[js.Any])
    __obj.updateDynamic("delete")(delete.toJsFn)
    __obj.updateDynamic("detach")(detach.toJsFn)
    __obj.asInstanceOf[IChildHandle]
  }
}

