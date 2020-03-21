package typingsJapgolly.jestWatcher.promptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestWatcher.typesMod.ScrollOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prompt extends js.Object {
  var _entering: js.Any
  var _offset: js.Any
  var _onCancel: js.Any
  var _onChange: js.Any
  var _onResize: js.Any
  var _onSuccess: js.Any
  var _promptLength: js.Any
  var _selection: js.Any
  var _value: js.Any
  def abort(): Unit
  def enter(
    onChange: js.Function2[/* pattern */ String, /* options */ ScrollOptions, Unit],
    onSuccess: js.Function1[/* pattern */ String, Unit],
    onCancel: js.Function0[Unit]
  ): Unit
  def isEntering(): Boolean
  def put(key: String): Unit
  def setPromptLength(length: Double): Unit
  def setPromptSelection(selected: String): Unit
}

object Prompt {
  @scala.inline
  def apply(
    _entering: js.Any,
    _offset: js.Any,
    _onCancel: js.Any,
    _onChange: js.Any,
    _onResize: js.Any,
    _onSuccess: js.Any,
    _promptLength: js.Any,
    _selection: js.Any,
    _value: js.Any,
    abort: Callback,
    enter: (js.Function2[/* pattern */ String, /* options */ ScrollOptions, Unit], js.Function1[/* pattern */ String, Unit], js.Function0[Unit]) => Callback,
    isEntering: CallbackTo[Boolean],
    put: String => Callback,
    setPromptLength: Double => Callback,
    setPromptSelection: String => Callback
  ): Prompt = {
    val __obj = js.Dynamic.literal(_entering = _entering.asInstanceOf[js.Any], _offset = _offset.asInstanceOf[js.Any], _onCancel = _onCancel.asInstanceOf[js.Any], _onChange = _onChange.asInstanceOf[js.Any], _onResize = _onResize.asInstanceOf[js.Any], _onSuccess = _onSuccess.asInstanceOf[js.Any], _promptLength = _promptLength.asInstanceOf[js.Any], _selection = _selection.asInstanceOf[js.Any], _value = _value.asInstanceOf[js.Any])
    __obj.updateDynamic("abort")(abort.toJsFn)
    __obj.updateDynamic("enter")(js.Any.fromFunction3((t0: js.Function2[
  /* pattern */ java.lang.String, 
  /* options */ typingsJapgolly.jestWatcher.typesMod.ScrollOptions, 
  scala.Unit], t1: js.Function1[/* pattern */ java.lang.String, scala.Unit], t2: js.Function0[scala.Unit]) => enter(t0, t1, t2).runNow()))
    __obj.updateDynamic("isEntering")(isEntering.toJsFn)
    __obj.updateDynamic("put")(js.Any.fromFunction1((t0: java.lang.String) => put(t0).runNow()))
    __obj.updateDynamic("setPromptLength")(js.Any.fromFunction1((t0: scala.Double) => setPromptLength(t0).runNow()))
    __obj.updateDynamic("setPromptSelection")(js.Any.fromFunction1((t0: java.lang.String) => setPromptSelection(t0).runNow()))
    __obj.asInstanceOf[Prompt]
  }
}

