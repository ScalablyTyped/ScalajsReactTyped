package typingsJapgolly.dojo.dojox.dtl.contrib

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/contrib/dijit.html
  *
  *
  */
trait dijit extends js.Object {
  /**
    *
    */
  var widgetsInTemplate: Boolean
  /**
    *
    * @param keys
    * @param object
    */
  def AttachNode(keys: js.Any, `object`: js.Any): Unit
  /**
    *
    * @param node
    * @param parsed
    */
  def DojoTypeNode(node: js.Any, parsed: js.Any): Unit
  /**
    *
    * @param command
    * @param obj
    */
  def EventNode(command: js.Any, obj: js.Any): Unit
  /**
    *
    * @param parser
    * @param token
    */
  def data_dojo_attach_event(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def data_dojo_attach_point(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def data_dojo_type(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def dojoAttachEvent(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def dojoAttachPoint(parser: js.Any, token: js.Any): js.Any
  /**
    *
    * @param parser
    * @param token
    */
  def dojoType(parser: js.Any, token: js.Any): js.Any
  /**
    * Associates an event type to a function (on the current widget) by name
    *
    * @param parser
    * @param token
    */
  def on(parser: js.Any, token: js.Any): js.Any
}

object dijit {
  @scala.inline
  def apply(
    AttachNode: (js.Any, js.Any) => Callback,
    DojoTypeNode: (js.Any, js.Any) => Callback,
    EventNode: (js.Any, js.Any) => Callback,
    data_dojo_attach_event: (js.Any, js.Any) => CallbackTo[js.Any],
    data_dojo_attach_point: (js.Any, js.Any) => CallbackTo[js.Any],
    data_dojo_type: (js.Any, js.Any) => CallbackTo[js.Any],
    dojoAttachEvent: (js.Any, js.Any) => CallbackTo[js.Any],
    dojoAttachPoint: (js.Any, js.Any) => CallbackTo[js.Any],
    dojoType: (js.Any, js.Any) => CallbackTo[js.Any],
    on: (js.Any, js.Any) => CallbackTo[js.Any],
    widgetsInTemplate: Boolean
  ): dijit = {
    val __obj = js.Dynamic.literal(widgetsInTemplate = widgetsInTemplate.asInstanceOf[js.Any])
    __obj.updateDynamic("AttachNode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => AttachNode(t0, t1).runNow()))
    __obj.updateDynamic("DojoTypeNode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => DojoTypeNode(t0, t1).runNow()))
    __obj.updateDynamic("EventNode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => EventNode(t0, t1).runNow()))
    __obj.updateDynamic("data_dojo_attach_event")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => data_dojo_attach_event(t0, t1).runNow()))
    __obj.updateDynamic("data_dojo_attach_point")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => data_dojo_attach_point(t0, t1).runNow()))
    __obj.updateDynamic("data_dojo_type")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => data_dojo_type(t0, t1).runNow()))
    __obj.updateDynamic("dojoAttachEvent")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => dojoAttachEvent(t0, t1).runNow()))
    __obj.updateDynamic("dojoAttachPoint")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => dojoAttachPoint(t0, t1).runNow()))
    __obj.updateDynamic("dojoType")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => dojoType(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => on(t0, t1).runNow()))
    __obj.asInstanceOf[dijit]
  }
}

