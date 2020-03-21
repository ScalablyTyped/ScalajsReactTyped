package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.PartialAutocompleteOptionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipsOptions extends js.Object {
  /**
    * Set autocomplete options
    * @default {}
    */
  var autocompleteOptions: PartialAutocompleteOptionData
  /**
    * Set the chip data
    * @default []
    */
  var data: js.Array[ChipData]
  /**
    * Set chips limit
    * @default Infinity
    */
  var limit: Double
  /**
    * Set first placeholder when there are no tags
    * @default ''
    */
  var placeholder: String
  /**
    * Set second placeholder when adding additional tags
    * @default ''
    */
  var secondaryPlaceholder: String
  /**
    * Callback for chip add
    * @default null
    */
  def onChipAdd(element: Element, chip: Element): Unit
  /**
    * Callback for chip delete
    * @default null
    */
  def onChipDelete(element: Element, chip: Element): Unit
  /**
    * Callback for chip select
    * @default null
    */
  def onChipSelect(element: Element, chip: Element): Unit
}

object ChipsOptions {
  @scala.inline
  def apply(
    autocompleteOptions: PartialAutocompleteOptionData,
    data: js.Array[ChipData],
    limit: Double,
    onChipAdd: (Element, Element) => Callback,
    onChipDelete: (Element, Element) => Callback,
    onChipSelect: (Element, Element) => Callback,
    placeholder: String,
    secondaryPlaceholder: String
  ): ChipsOptions = {
    val __obj = js.Dynamic.literal(autocompleteOptions = autocompleteOptions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], secondaryPlaceholder = secondaryPlaceholder.asInstanceOf[js.Any])
    __obj.updateDynamic("onChipAdd")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: org.scalajs.dom.raw.Element) => onChipAdd(t0, t1).runNow()))
    __obj.updateDynamic("onChipDelete")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: org.scalajs.dom.raw.Element) => onChipDelete(t0, t1).runNow()))
    __obj.updateDynamic("onChipSelect")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.Element, t1: org.scalajs.dom.raw.Element) => onChipSelect(t0, t1).runNow()))
    __obj.asInstanceOf[ChipsOptions]
  }
}

