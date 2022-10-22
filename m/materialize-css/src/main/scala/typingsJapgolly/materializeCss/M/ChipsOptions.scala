package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import typingsJapgolly.materializeCss.anon.PartialAutocompleteOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChipsOptions extends StObject {
  
  /**
    * Set autocomplete options
    * @default {}
    */
  var autocompleteOptions: PartialAutocompleteOption
  
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
}
object ChipsOptions {
  
  inline def apply(
    autocompleteOptions: PartialAutocompleteOption,
    data: js.Array[ChipData],
    limit: Double,
    onChipAdd: (Element, Element) => Callback,
    onChipDelete: (Element, Element) => Callback,
    onChipSelect: (Element, Element) => Callback,
    placeholder: String,
    secondaryPlaceholder: String
  ): ChipsOptions = {
    val __obj = js.Dynamic.literal(autocompleteOptions = autocompleteOptions.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], onChipAdd = js.Any.fromFunction2((t0: Element, t1: Element) => (onChipAdd(t0, t1)).runNow()), onChipDelete = js.Any.fromFunction2((t0: Element, t1: Element) => (onChipDelete(t0, t1)).runNow()), onChipSelect = js.Any.fromFunction2((t0: Element, t1: Element) => (onChipSelect(t0, t1)).runNow()), placeholder = placeholder.asInstanceOf[js.Any], secondaryPlaceholder = secondaryPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChipsOptions]
  }
  
  extension [Self <: ChipsOptions](x: Self) {
    
    inline def setAutocompleteOptions(value: PartialAutocompleteOption): Self = StObject.set(x, "autocompleteOptions", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[ChipData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: ChipData*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setOnChipAdd(value: (Element, Element) => Callback): Self = StObject.set(x, "onChipAdd", js.Any.fromFunction2((t0: Element, t1: Element) => (value(t0, t1)).runNow()))
    
    inline def setOnChipDelete(value: (Element, Element) => Callback): Self = StObject.set(x, "onChipDelete", js.Any.fromFunction2((t0: Element, t1: Element) => (value(t0, t1)).runNow()))
    
    inline def setOnChipSelect(value: (Element, Element) => Callback): Self = StObject.set(x, "onChipSelect", js.Any.fromFunction2((t0: Element, t1: Element) => (value(t0, t1)).runNow()))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPlaceholder(value: String): Self = StObject.set(x, "secondaryPlaceholder", value.asInstanceOf[js.Any])
  }
}
