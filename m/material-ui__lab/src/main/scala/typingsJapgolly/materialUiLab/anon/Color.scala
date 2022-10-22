package typingsJapgolly.materialUiLab.anon

import typingsJapgolly.materialUiLab.materialUiLabStrings.`end-ellipsis`
import typingsJapgolly.materialUiLab.materialUiLabStrings.`start-ellipsis`
import typingsJapgolly.materialUiLab.materialUiLabStrings.first
import typingsJapgolly.materialUiLab.materialUiLabStrings.large
import typingsJapgolly.materialUiLab.materialUiLabStrings.last
import typingsJapgolly.materialUiLab.materialUiLabStrings.medium
import typingsJapgolly.materialUiLab.materialUiLabStrings.next
import typingsJapgolly.materialUiLab.materialUiLabStrings.outlined
import typingsJapgolly.materialUiLab.materialUiLabStrings.page
import typingsJapgolly.materialUiLab.materialUiLabStrings.previous
import typingsJapgolly.materialUiLab.materialUiLabStrings.primary
import typingsJapgolly.materialUiLab.materialUiLabStrings.round
import typingsJapgolly.materialUiLab.materialUiLabStrings.rounded
import typingsJapgolly.materialUiLab.materialUiLabStrings.secondary
import typingsJapgolly.materialUiLab.materialUiLabStrings.small
import typingsJapgolly.materialUiLab.materialUiLabStrings.standard
import typingsJapgolly.materialUiLab.materialUiLabStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  /**
    * The active color.
    */
  var color: js.UndefOr[standard | primary | secondary] = js.undefined
  
  /**
    * If `true`, the item will be disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current page number.
    */
  var page: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true` the pagination item is selected.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The shape of the pagination item.
    */
  var shape: js.UndefOr[round | rounded] = js.undefined
  
  /**
    * The size of the pagination item.
    */
  var size: js.UndefOr[small | medium | large] = js.undefined
  
  /**
    * The type of pagination item.
    */
  var `type`: js.UndefOr[page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`] = js.undefined
  
  /**
    * The pagination item variant.
    */
  var variant: js.UndefOr[text | outlined] = js.undefined
}
object Color {
  
  inline def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setColor(value: standard | primary | secondary): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShape(value: round | rounded): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: page | first | last | next | previous | `start-ellipsis` | `end-ellipsis`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVariant(value: text | outlined): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
