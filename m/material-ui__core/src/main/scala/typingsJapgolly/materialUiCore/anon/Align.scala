package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiCore.materialUiCoreStrings.`inline`
import typingsJapgolly.materialUiCore.materialUiCoreStrings.block
import typingsJapgolly.materialUiCore.materialUiCoreStrings.error
import typingsJapgolly.materialUiCore.materialUiCoreStrings.inherit
import typingsJapgolly.materialUiCore.materialUiCoreStrings.initial
import typingsJapgolly.materialUiCore.materialUiCoreStrings.primary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.secondary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.textPrimary
import typingsJapgolly.materialUiCore.materialUiCoreStrings.textSecondary
import typingsJapgolly.materialUiCore.mod.PropTypes.Alignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: js.UndefOr[Alignment] = js.undefined
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  var color: js.UndefOr[initial | inherit | primary | secondary | textPrimary | textSecondary | error] = js.undefined
  
  var display: js.UndefOr[initial | block | `inline`] = js.undefined
  
  var gutterBottom: js.UndefOr[Boolean] = js.undefined
  
  var noWrap: js.UndefOr[Boolean] = js.undefined
  
  var paragraph: js.UndefOr[Boolean] = js.undefined
  
  var variant: js.UndefOr[typingsJapgolly.materialUiCore.typographyTypographyMod.Variant | inherit] = js.undefined
  
  var variantMapping: js.UndefOr[PartialRecordVariantstrin] = js.undefined
}
object Align {
  
  inline def apply(): Align = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Align]
  }
  
  extension [Self <: Align](x: Self) {
    
    inline def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColor(value: initial | inherit | primary | secondary | textPrimary | textSecondary | error): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisplay(value: initial | block | `inline`): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setGutterBottom(value: Boolean): Self = StObject.set(x, "gutterBottom", value.asInstanceOf[js.Any])
    
    inline def setGutterBottomUndefined: Self = StObject.set(x, "gutterBottom", js.undefined)
    
    inline def setNoWrap(value: Boolean): Self = StObject.set(x, "noWrap", value.asInstanceOf[js.Any])
    
    inline def setNoWrapUndefined: Self = StObject.set(x, "noWrap", js.undefined)
    
    inline def setParagraph(value: Boolean): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
    
    inline def setParagraphUndefined: Self = StObject.set(x, "paragraph", js.undefined)
    
    inline def setVariant(value: typingsJapgolly.materialUiCore.typographyTypographyMod.Variant | inherit): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantMapping(value: PartialRecordVariantstrin): Self = StObject.set(x, "variantMapping", value.asInstanceOf[js.Any])
    
    inline def setVariantMappingUndefined: Self = StObject.set(x, "variantMapping", js.undefined)
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
