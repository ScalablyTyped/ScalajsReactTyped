package typingsJapgolly.qlik.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.qlik.qlikStrings.StringExpr
import typingsJapgolly.qlik.qlikStrings.StringExpression
import typingsJapgolly.qlik.qlikStrings.ValueExpression
import typingsJapgolly.qlik.qlikStrings._empty
import typingsJapgolly.qlik.qlikStrings.`color-picker`
import typingsJapgolly.qlik.qlikStrings.always
import typingsJapgolly.qlik.qlikStrings.array
import typingsJapgolly.qlik.qlikStrings.boolean
import typingsJapgolly.qlik.qlikStrings.button
import typingsJapgolly.qlik.qlikStrings.buttongroup
import typingsJapgolly.qlik.qlikStrings.dimension
import typingsJapgolly.qlik.qlikStrings.dropdown
import typingsJapgolly.qlik.qlikStrings.expression
import typingsJapgolly.qlik.qlikStrings.integer
import typingsJapgolly.qlik.qlikStrings.items
import typingsJapgolly.qlik.qlikStrings.link
import typingsJapgolly.qlik.qlikStrings.measure
import typingsJapgolly.qlik.qlikStrings.media
import typingsJapgolly.qlik.qlikStrings.number
import typingsJapgolly.qlik.qlikStrings.optional
import typingsJapgolly.qlik.qlikStrings.radiobuttons
import typingsJapgolly.qlik.qlikStrings.slider
import typingsJapgolly.qlik.qlikStrings.string
import typingsJapgolly.qlik.qlikStrings.switch
import typingsJapgolly.qlik.qlikStrings.text
import typingsJapgolly.qlik.qlikStrings.textarea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlik.mod.CustomPropertyString
  - typingsJapgolly.qlik.mod.CustomPropertyInteger
  - typingsJapgolly.qlik.mod.CustomPropertyNumber
  - typingsJapgolly.qlik.mod.CustomPropertyArray
  - typingsJapgolly.qlik.mod.CustomPropertyButton
  - typingsJapgolly.qlik.mod.CustomPropertyButtonGroup
  - typingsJapgolly.qlik.mod.CustomPropertyCheckbox
  - typingsJapgolly.qlik.mod.CustomPropertyColorPicker
  - typingsJapgolly.qlik.mod.CustomPropertyDropdown
  - typingsJapgolly.qlik.mod.CustomPropertyLink
  - typingsJapgolly.qlik.mod.CustomProperyMedia
  - typingsJapgolly.qlik.mod.CustomPropertyRadio
  - typingsJapgolly.qlik.mod.CustomPropertySlider
  - typingsJapgolly.qlik.mod.CustomPropertyRangeSlider
  - typingsJapgolly.qlik.mod.CustomPropertySwitch
  - typingsJapgolly.qlik.mod.CustomPropertyText
  - typingsJapgolly.qlik.mod.CustomPropertyTextArea
  - typingsJapgolly.qlik.mod.CustomPropertyExpression
  - typingsJapgolly.qlik.mod.CustomPropertyItems
*/
trait CustomProperty extends js.Object

object CustomProperty {
  @scala.inline
  def CustomPropertyNumber(
    `type`: number,
    component: String = null,
    defaultValue: Int | Double = null,
    label: String = null,
    max: String = null,
    min: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyColorPicker(
    component: `color-picker`,
    `type`: integer,
    defaultValue: Int | Double = null,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyCheckbox(
    `type`: boolean,
    defaultValue: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyLink(
    component: link,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null,
    url: String = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyRangeSlider(
    component: slider,
    `type`: array,
    defaultValue: Int | Double = null,
    label: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    step: Int | Double = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertySwitch(
    component: switch,
    `type`: boolean,
    defaultValue: String = null,
    label: String = null,
    options: CustomPropertyOptions = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyButtonGroup(
    component: buttongroup,
    `type`: string,
    defaultValue: String = null,
    label: String = null,
    options: js.Array[ButtonGroupOption] | js.Function0[js.Array[ButtonGroupOption]] = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyExpression(
    component: expression,
    expressionType: dimension | measure | StringExpr | typingsJapgolly.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression,
    defaultValue: String = null,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: js.UndefOr[scala.Nothing] = js.undefined
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], expressionType = expressionType.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertySlider(
    component: slider,
    `type`: number,
    defaultValue: Int | Double = null,
    label: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    step: Int | Double = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyText(
    component: text,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyButton(
    action: VisualizationOptions => Callback,
    component: button,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null,
    `type`: string | integer | number | array | boolean | items = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("action")(js.Any.fromFunction1((t0: typingsJapgolly.qlik.mod.VisualizationOptions) => action(t0).runNow()))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyDropdown(
    component: dropdown,
    ref: String,
    `type`: string,
    defaultValue: String = null,
    label: String = null,
    options: CustomPropertyOptions = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyRadio(
    component: radiobuttons,
    `type`: string,
    defaultValue: String = null,
    label: String = null,
    options: CustomPropertyOptions = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomProperyMedia(
    component: media,
    `type`: string,
    label: String = null,
    layoutRef: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layoutRef != null) __obj.updateDynamic("layoutRef")(layoutRef.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyArray(
    `type`: array,
    addTranslation: String = null,
    allowAdd: js.UndefOr[Boolean] = js.undefined,
    allowMove: js.UndefOr[Boolean] = js.undefined,
    allowRemove: js.UndefOr[Boolean] = js.undefined,
    component: js.UndefOr[scala.Nothing] = js.undefined,
    itemTitleRef: String = null,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (addTranslation != null) __obj.updateDynamic("addTranslation")(addTranslation.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAdd)) __obj.updateDynamic("allowAdd")(allowAdd.asInstanceOf[js.Any])
    if (!js.isUndefined(allowMove)) __obj.updateDynamic("allowMove")(allowMove.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRemove)) __obj.updateDynamic("allowRemove")(allowRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(component)) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (itemTitleRef != null) __obj.updateDynamic("itemTitleRef")(itemTitleRef.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyItems(
    items: StringDictionary[CustomProperty],
    `type`: items,
    label: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyString(
    `type`: string,
    defaultValue: String = null,
    expression: always | optional | _empty = null,
    label: String = null,
    maxLength: Int | Double = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyInteger(
    `type`: integer,
    component: String = null,
    defaultValue: Int | Double = null,
    label: String = null,
    max: String = null,
    min: String = null,
    ref: String = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
  @scala.inline
  def CustomPropertyTextArea(
    component: textarea,
    `type`: string,
    defaultValue: String = null,
    label: String = null,
    maxlength: Int | Double = null,
    ref: String = null,
    rows: Int | Double = null,
    show: Boolean | ShowFunction = null
  ): CustomProperty = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomProperty]
  }
}

