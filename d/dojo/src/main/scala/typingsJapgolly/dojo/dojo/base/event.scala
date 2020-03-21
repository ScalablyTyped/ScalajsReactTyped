package typingsJapgolly.dojo.dojo.base

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/event.html
  *
  * This module defines dojo DOM event API.   Usually you should use dojo/on, and evt.stopPropagation() +
  * evt.preventDefault(), rather than this module.
  *
  */
trait event extends js.Object {
  /**
    * normalizes properties on the event object including event
    * bubbling methods, keystroke normalization, and x/y positions
    *
    * @param evt native event object
    * @param sender node to treat as "currentTarget"
    */
  def fix(evt: Event_, sender: HTMLElement): Event_
  /**
    * prevents propagation and clobbers the default action of the
    * passed event
    *
    * @param evt The event object. If omitted, window.event is used on IE.
    */
  def stop(evt: Event_): Unit
}

object event {
  @scala.inline
  def apply(fix: (Event_, HTMLElement) => CallbackTo[Event_], stop: Event_ => Callback): event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fix")(js.Any.fromFunction2((t0: typingsJapgolly.std.Event_, t1: org.scalajs.dom.raw.HTMLElement) => fix(t0, t1).runNow()))
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => stop(t0).runNow()))
    __obj.asInstanceOf[event]
  }
}

