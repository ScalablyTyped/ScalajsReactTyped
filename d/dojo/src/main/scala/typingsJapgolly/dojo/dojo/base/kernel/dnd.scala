package typingsJapgolly.dojo.dojo.base.kernel

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.dnd.html
  *
  *
  */
trait dnd extends js.Object {
  /**
    * Used by dojo/dnd/Manager to scroll document or internal node when the user
    * drags near the edge of the viewport or a scrollable node
    *
    */
  var autoscroll: js.Object
  /**
    *
    */
  var move: js.Object
  /**
    *
    */
  def AutoSource(): Unit
  /**
    *
    */
  def Avatar(): Unit
  /**
    *
    */
  def Container(): Unit
  /**
    *
    */
  def Manager(): Unit
  /**
    *
    */
  def Moveable(): Unit
  /**
    *
    */
  def Mover(): Unit
  /**
    *
    */
  def Selector(): Unit
  /**
    *
    */
  def Source(): Unit
  /**
    *
    */
  def Target(): Unit
  /**
    *
    */
  def TimedMoveable(): Unit
}

object dnd {
  @scala.inline
  def apply(
    AutoSource: Callback,
    Avatar: Callback,
    Container: Callback,
    Manager: Callback,
    Moveable: Callback,
    Mover: Callback,
    Selector: Callback,
    Source: Callback,
    Target: Callback,
    TimedMoveable: Callback,
    autoscroll: js.Object,
    move: js.Object
  ): dnd = {
    val __obj = js.Dynamic.literal(autoscroll = autoscroll.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any])
    __obj.updateDynamic("AutoSource")(AutoSource.toJsFn)
    __obj.updateDynamic("Avatar")(Avatar.toJsFn)
    __obj.updateDynamic("Container")(Container.toJsFn)
    __obj.updateDynamic("Manager")(Manager.toJsFn)
    __obj.updateDynamic("Moveable")(Moveable.toJsFn)
    __obj.updateDynamic("Mover")(Mover.toJsFn)
    __obj.updateDynamic("Selector")(Selector.toJsFn)
    __obj.updateDynamic("Source")(Source.toJsFn)
    __obj.updateDynamic("Target")(Target.toJsFn)
    __obj.updateDynamic("TimedMoveable")(TimedMoveable.toJsFn)
    __obj.asInstanceOf[dnd]
  }
}

