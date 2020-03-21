package typingsJapgolly.reactTextareaAutosize.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaAutosizeProps
  extends AllHTMLAttributes[HTMLTextAreaElement]
     with ClassAttributes[HTMLTextAreaElement] {
  /**
    * Allows an owner to retrieve the DOM node.
    */
  var inputRef: js.UndefOr[
    (js.Function1[/* node */ org.scalajs.dom.raw.HTMLTextAreaElement, Unit]) | RefHandle[org.scalajs.dom.raw.HTMLTextAreaElement]
  ] = js.undefined
  /**
    * Maximum number of rows to show.
    */
  var maxRows: js.UndefOr[Double] = js.undefined
  /**
    * Alias for `rows`.
    */
  var minRows: js.UndefOr[Double] = js.undefined
  /**
    * Callback on value change
    * @param event
    */
  @JSName("onChange")
  var onChange_TextareaAutosizeProps: js.UndefOr[
    js.Function1[/* event */ ReactEventFrom[org.scalajs.dom.raw.HTMLTextAreaElement], Unit]
  ] = js.undefined
  /**
    * Callback on height change
    * @param height
    */
  var onHeightChange: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.undefined
  /**
    * Try to cache DOM measurements performed by component so that we don't
    * touch DOM when it's not needed.
    *
    * This optimization doesn't work if we dynamically style `<textarea />`
    * component.
    * @default false
    */
  var useCacheForDOMMeasurements: js.UndefOr[Boolean] = js.undefined
  /**
    * Current textarea value
    */
  @JSName("value")
  var value_TextareaAutosizeProps: js.UndefOr[String] = js.undefined
}

object TextareaAutosizeProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLTextAreaElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLTextAreaElement] = null,
    inputRef: (js.Function1[/* node */ org.scalajs.dom.raw.HTMLTextAreaElement, Unit]) | RefHandle[org.scalajs.dom.raw.HTMLTextAreaElement] = null,
    maxRows: Int | Double = null,
    minRows: Int | Double = null,
    onChange: /* event */ ReactEventFrom[org.scalajs.dom.raw.HTMLTextAreaElement] => Callback = null,
    onHeightChange: /* height */ Double => Callback = null,
    useCacheForDOMMeasurements: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): TextareaAutosizeProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLTextAreaElement]) => onChange(t0).runNow()))
    if (onHeightChange != null) __obj.updateDynamic("onHeightChange")(js.Any.fromFunction1((t0: /* height */ scala.Double) => onHeightChange(t0).runNow()))
    if (!js.isUndefined(useCacheForDOMMeasurements)) __obj.updateDynamic("useCacheForDOMMeasurements")(useCacheForDOMMeasurements.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextareaAutosizeProps]
  }
}

