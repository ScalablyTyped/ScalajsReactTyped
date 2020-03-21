package typingsJapgolly.dojo.dojox.drawing.manager

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/manager/keys.html
  *
  * A singleton, master object that detects
  * keyboard keys and events
  * Connect to it like:
  *
  * dojo.connect(this.keys, "onEnter", ....);
  *
  */
trait keys extends js.Object {
  /**
    * Indicates whether the Alt or Option key is currently pressed
    *
    */
  var alt: Boolean
  /**
    * The amount, in pixels, a selected Stencil will
    * move on an arrow key event
    *
    */
  var arrowIncrement: Double
  /**
    * The amount, in pixels, a selected Stencil will
    * move on an arrow key + SHIFT event
    *
    */
  var arrowShiftIncrement: Double
  /**
    * Indicates whether the Apple Command key is currently pressed
    *
    */
  var cmmd: Boolean
  /**
    * Indicates whether the Control key is currently pressed
    *
    */
  var ctrl: Boolean
  /**
    *
    */
  var listeners: js.Array[_]
  /**
    * Indicates whether any 'meta' key is currently pressed:
    * shift || ctrl || cmd || alt
    *
    */
  var meta: Boolean
  /**
    * Indicates whether the Shift key is currently pressed
    *
    */
  var shift: Boolean
  /**
    * Relinquishes control of events to another portion
    * of Drawing; namely the TextBlock.
    *
    * @param _isedit
    */
  def editMode(_isedit: js.Any): Unit
  /**
    * Enables or disables key events, to relinquish
    * control to something outside of Drawing; input
    * fields for example.
    * You may need to call this directly if you are
    * using textareas or contenteditables.
    * NOTE: See scanForFields
    *
    * @param _enabled
    */
  def enable(_enabled: js.Any): Unit
  /**
    * Initialize the keys object
    *
    */
  def init(): Unit
  /**
    * Register an object and callback to be notified
    * of events.
    * NOTE: Not really used in code, but should work.
    * See manager.mouse for similar usage
    *
    * @param options
    */
  def register(options: js.Any): Unit
  /**
    * Scans the document for inputs
    * and calls this automatically. However you may need
    * to call this if you create inputs after the fact.
    *
    */
  def scanForFields(): Unit
}

object keys {
  @scala.inline
  def apply(
    alt: Boolean,
    arrowIncrement: Double,
    arrowShiftIncrement: Double,
    cmmd: Boolean,
    ctrl: Boolean,
    editMode: js.Any => Callback,
    enable: js.Any => Callback,
    init: Callback,
    listeners: js.Array[_],
    meta: Boolean,
    register: js.Any => Callback,
    scanForFields: Callback,
    shift: Boolean
  ): keys = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], arrowIncrement = arrowIncrement.asInstanceOf[js.Any], arrowShiftIncrement = arrowShiftIncrement.asInstanceOf[js.Any], cmmd = cmmd.asInstanceOf[js.Any], ctrl = ctrl.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.updateDynamic("editMode")(js.Any.fromFunction1((t0: js.Any) => editMode(t0).runNow()))
    __obj.updateDynamic("enable")(js.Any.fromFunction1((t0: js.Any) => enable(t0).runNow()))
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: js.Any) => register(t0).runNow()))
    __obj.updateDynamic("scanForFields")(scanForFields.toJsFn)
    __obj.asInstanceOf[keys]
  }
}

