package typingsJapgolly.tinajsTina.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentLifecycles extends js.Object {
  def attached(): Unit
  def created(): Unit
  def detached(): Unit
  def moved(): Unit
  def ready(): Unit
}

object ComponentLifecycles {
  @scala.inline
  def apply(attached: Callback, created: Callback, detached: Callback, moved: Callback, ready: Callback): ComponentLifecycles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attached")(attached.toJsFn)
    __obj.updateDynamic("created")(created.toJsFn)
    __obj.updateDynamic("detached")(detached.toJsFn)
    __obj.updateDynamic("moved")(moved.toJsFn)
    __obj.updateDynamic("ready")(ready.toJsFn)
    __obj.asInstanceOf[ComponentLifecycles]
  }
}

