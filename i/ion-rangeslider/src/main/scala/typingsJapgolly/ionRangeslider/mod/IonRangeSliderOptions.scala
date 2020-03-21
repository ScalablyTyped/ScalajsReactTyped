package typingsJapgolly.ionRangeslider.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionRangeslider.ionRangesliderStrings.big
import typingsJapgolly.ionRangeslider.ionRangesliderStrings.flat
import typingsJapgolly.ionRangeslider.ionRangesliderStrings.modern
import typingsJapgolly.ionRangeslider.ionRangesliderStrings.round
import typingsJapgolly.ionRangeslider.ionRangesliderStrings.sharp
import typingsJapgolly.ionRangeslider.ionRangesliderStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRangeSliderOptions extends js.Object {
     // Locks slider and makes it inactive. Input is disabled too. Invisible to forms [Default: false]
  var block: js.UndefOr[Boolean] = js.undefined
      // Special postfix, used only for maximum value. Will be showed after handle will reach maximum right position. For example **0 — 100+** [Default: ]
  var decorate_both: js.UndefOr[Boolean] = js.undefined
      // Separator for **double** values in input value property. `<input value="25;42"> [Default:  ; ]
  var disable: js.UndefOr[Boolean] = js.undefined
      // Set minimum maximum between sliders. Only for **double** type [Default: -]
  var drag_interval: js.UndefOr[Boolean] = js.undefined
     // Locks slider and makes it inactive. Input is NOT disabled. Can be send with forms [Default: false]
  var extra_classes: js.UndefOr[String] = js.undefined
   // Set up your own prettify function. Can be anything. For example, you can set up unix time as slider values and than transform them to cool looking dates [Default: null]
  var force_edges: js.UndefOr[Boolean] = js.undefined
      // Set slider maximum value [Default: 100]
  var from: js.UndefOr[Double] = js.undefined
       // Set up your own array of possible slider values. They could be numbers or strings. If the values array is set up, min, max and step param, can no longer be changed [Default: []]
  var from_fixed: js.UndefOr[Boolean] = js.undefined
      // Set minimum limit for left (or single) handle [Default: min]
  var from_max: js.UndefOr[Double] = js.undefined
     // Fix position of left (or single) handle [Default: false]
  var from_min: js.UndefOr[Double] = js.undefined
      // Set maximum limit for left (or single) handle [Default: max]
  var from_shadow: js.UndefOr[Boolean] = js.undefined
     // Activates keyboard controls. Move left: &larr;, &darr;, A, S. Move right: &rarr;, &uarr;, W, D. [Default: true]
  var grid: js.UndefOr[Boolean] = js.undefined
     // Enables grid of values above the slider [Default: true]
  var grid_margin: js.UndefOr[Boolean] = js.undefined
     // Set left and right grid gaps [Default: true]
  var grid_num: js.UndefOr[Double] = js.undefined
      // Number of grid units [Default: 4]
  var grid_snap: js.UndefOr[Boolean] = js.undefined
     // Hides **min** and **max** labels [Default: false]
  var hide_from_to: js.UndefOr[Boolean] = js.undefined
     // Snap grid to sliders step (step param). If activated, grid_num will not be used. Max steps = 50 [Default: false]
  var hide_min_max: js.UndefOr[Boolean] = js.undefined
      // Set your own separator for close values. Used for **double** type. Default: **10 — 100**. Or you may set: **10 to 100, 10 + 100, 10 &rarr; 100** etc. [Default:  - ]
  var input_values_separator: js.UndefOr[String] = js.undefined
     // Sliders handles and tooltips will be always inside it's container [Default: false]
  var keyboard: js.UndefOr[Boolean] = js.undefined
      // Set slider minimum value [Default: 10]
  var max: js.UndefOr[Double] = js.undefined
      // Set minimum diapason between sliders. Only for **double** type [Default: -]
  var max_interval: js.UndefOr[Double] = js.undefined
      // Set postfix for values. Will be set up right after the number: 100**k** [Default: ]
  var max_postfix: js.UndefOr[String] = js.undefined
      // Choose slider type, could be `single` - for one handle, or `double` for two handles [Default: single]
  var min: js.UndefOr[Double] = js.undefined
      // Set sliders step. Always > 0. Could be fractional [Default: 1]
  var min_interval: js.UndefOr[Double] = js.undefined
   // Callback. Is called on slider start. Gets all slider data as a 1st attribute [Default: null]
  var onChange: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.undefined
   // Callback. IS called on each values change. Gets all slider data as a 1st attribute [Default: null]
  var onFinish: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.undefined
         // Scope for callbacks. Pass any object [Default: null]
  var onStart: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.undefined
   // Callback. Is called when user releases handle. Gets all slider data as a 1st attribute [Default: null]
  var onUpdate: js.UndefOr[js.Function1[/* obj */ IonRangeSliderEvent, Unit]] = js.undefined
      // Set prefix for values. Will be set up right before the number: **$**100 [Default: ]
  var postfix: js.UndefOr[String] = js.undefined
     // Hides **from** and **to** labels [Default: false]
  var prefix: js.UndefOr[String] = js.undefined
      // Set up your own separator for long numbers: 10000000 &rarr; 10,000,000 etc. [Default:  ]
  var prettify: js.UndefOr[js.Function1[/* num */ Double, String]] = js.undefined
     // Highlight the right handle [Default: false]
  var prettify_enabled: js.UndefOr[Boolean] = js.undefined
     // Improve readability of long numbers: 10000000 &rarr; 10 000 000 [Default: true]
  var prettify_separator: js.UndefOr[String] = js.undefined
      // Traverse extra CSS-classes to sliders container [Default: —]
  var scope: js.UndefOr[js.Any] = js.undefined
  var skin: js.UndefOr[flat | big | modern | round | sharp | square] = js.undefined
      // Set start position for right handle [Default: max]
  var step: js.UndefOr[Double] = js.undefined
      // Set start position for left handle (or for single handle) [Default: min]
  var to: js.UndefOr[Double] = js.undefined
     // Highlight the limits for left handle [Default: false]
  var to_fixed: js.UndefOr[Boolean] = js.undefined
      // Set minimum limit for right handle [Default: min]
  var to_max: js.UndefOr[Double] = js.undefined
     // Fix position of right handle [Default: false]
  var to_min: js.UndefOr[Double] = js.undefined
      // Set maximum limit for right handle [Default: max]
  var to_shadow: js.UndefOr[Boolean] = js.undefined
   // Set slider theme [Default: flat]
  var `type`: js.UndefOr[String] = js.undefined
     // Allow user to drag whole range. Only for **double** type [Default: false]
  var values: js.UndefOr[js.Array[_]] = js.undefined
     // Used for **double** type and only if prefix or postfix was set up. Determine how to decorate close values. For example: **$10k — $100k** or **$10 — 100k** [Default: true]
  var values_separator: js.UndefOr[String] = js.undefined
}

object IonRangeSliderOptions {
  @scala.inline
  def apply(
    block: js.UndefOr[Boolean] = js.undefined,
    decorate_both: js.UndefOr[Boolean] = js.undefined,
    disable: js.UndefOr[Boolean] = js.undefined,
    drag_interval: js.UndefOr[Boolean] = js.undefined,
    extra_classes: String = null,
    force_edges: js.UndefOr[Boolean] = js.undefined,
    from: Int | Double = null,
    from_fixed: js.UndefOr[Boolean] = js.undefined,
    from_max: Int | Double = null,
    from_min: Int | Double = null,
    from_shadow: js.UndefOr[Boolean] = js.undefined,
    grid: js.UndefOr[Boolean] = js.undefined,
    grid_margin: js.UndefOr[Boolean] = js.undefined,
    grid_num: Int | Double = null,
    grid_snap: js.UndefOr[Boolean] = js.undefined,
    hide_from_to: js.UndefOr[Boolean] = js.undefined,
    hide_min_max: js.UndefOr[Boolean] = js.undefined,
    input_values_separator: String = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    max: Int | Double = null,
    max_interval: Int | Double = null,
    max_postfix: String = null,
    min: Int | Double = null,
    min_interval: Int | Double = null,
    onChange: /* obj */ IonRangeSliderEvent => Callback = null,
    onFinish: /* obj */ IonRangeSliderEvent => Callback = null,
    onStart: /* obj */ IonRangeSliderEvent => Callback = null,
    onUpdate: /* obj */ IonRangeSliderEvent => Callback = null,
    postfix: String = null,
    prefix: String = null,
    prettify: /* num */ Double => CallbackTo[String] = null,
    prettify_enabled: js.UndefOr[Boolean] = js.undefined,
    prettify_separator: String = null,
    scope: js.Any = null,
    skin: flat | big | modern | round | sharp | square = null,
    step: Int | Double = null,
    to: Int | Double = null,
    to_fixed: js.UndefOr[Boolean] = js.undefined,
    to_max: Int | Double = null,
    to_min: Int | Double = null,
    to_shadow: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    values: js.Array[_] = null,
    values_separator: String = null
  ): IonRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (!js.isUndefined(decorate_both)) __obj.updateDynamic("decorate_both")(decorate_both.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.asInstanceOf[js.Any])
    if (!js.isUndefined(drag_interval)) __obj.updateDynamic("drag_interval")(drag_interval.asInstanceOf[js.Any])
    if (extra_classes != null) __obj.updateDynamic("extra_classes")(extra_classes.asInstanceOf[js.Any])
    if (!js.isUndefined(force_edges)) __obj.updateDynamic("force_edges")(force_edges.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(from_fixed)) __obj.updateDynamic("from_fixed")(from_fixed.asInstanceOf[js.Any])
    if (from_max != null) __obj.updateDynamic("from_max")(from_max.asInstanceOf[js.Any])
    if (from_min != null) __obj.updateDynamic("from_min")(from_min.asInstanceOf[js.Any])
    if (!js.isUndefined(from_shadow)) __obj.updateDynamic("from_shadow")(from_shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(grid_margin)) __obj.updateDynamic("grid_margin")(grid_margin.asInstanceOf[js.Any])
    if (grid_num != null) __obj.updateDynamic("grid_num")(grid_num.asInstanceOf[js.Any])
    if (!js.isUndefined(grid_snap)) __obj.updateDynamic("grid_snap")(grid_snap.asInstanceOf[js.Any])
    if (!js.isUndefined(hide_from_to)) __obj.updateDynamic("hide_from_to")(hide_from_to.asInstanceOf[js.Any])
    if (!js.isUndefined(hide_min_max)) __obj.updateDynamic("hide_min_max")(hide_min_max.asInstanceOf[js.Any])
    if (input_values_separator != null) __obj.updateDynamic("input_values_separator")(input_values_separator.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (max_interval != null) __obj.updateDynamic("max_interval")(max_interval.asInstanceOf[js.Any])
    if (max_postfix != null) __obj.updateDynamic("max_postfix")(max_postfix.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (min_interval != null) __obj.updateDynamic("min_interval")(min_interval.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* obj */ typingsJapgolly.ionRangeslider.mod.IonRangeSliderEvent) => onChange(t0).runNow()))
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction1((t0: /* obj */ typingsJapgolly.ionRangeslider.mod.IonRangeSliderEvent) => onFinish(t0).runNow()))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1((t0: /* obj */ typingsJapgolly.ionRangeslider.mod.IonRangeSliderEvent) => onStart(t0).runNow()))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* obj */ typingsJapgolly.ionRangeslider.mod.IonRangeSliderEvent) => onUpdate(t0).runNow()))
    if (postfix != null) __obj.updateDynamic("postfix")(postfix.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prettify != null) __obj.updateDynamic("prettify")(js.Any.fromFunction1((t0: /* num */ scala.Double) => prettify(t0).runNow()))
    if (!js.isUndefined(prettify_enabled)) __obj.updateDynamic("prettify_enabled")(prettify_enabled.asInstanceOf[js.Any])
    if (prettify_separator != null) __obj.updateDynamic("prettify_separator")(prettify_separator.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (!js.isUndefined(to_fixed)) __obj.updateDynamic("to_fixed")(to_fixed.asInstanceOf[js.Any])
    if (to_max != null) __obj.updateDynamic("to_max")(to_max.asInstanceOf[js.Any])
    if (to_min != null) __obj.updateDynamic("to_min")(to_min.asInstanceOf[js.Any])
    if (!js.isUndefined(to_shadow)) __obj.updateDynamic("to_shadow")(to_shadow.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (values_separator != null) __obj.updateDynamic("values_separator")(values_separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRangeSliderOptions]
  }
}

