package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiCore.materialUiCoreStrings.contained
import typingsJapgolly.materialUiCore.materialUiCoreStrings.large
import typingsJapgolly.materialUiCore.materialUiCoreStrings.medium
import typingsJapgolly.materialUiCore.materialUiCoreStrings.outlined
import typingsJapgolly.materialUiCore.materialUiCoreStrings.small
import typingsJapgolly.materialUiCore.materialUiCoreStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableElevation extends StObject {
  
  /**
    * The content of the button.
    */
  var children: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    */
  var color: js.UndefOr[typingsJapgolly.materialUiCore.mod.PropTypes.Color] = js.undefined
  
  /**
    * If `true`, no elevation is used.
    */
  var disableElevation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the  keyboard focus ripple will be disabled.
    */
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the button will be disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Element placed after the children.
    */
  var endIcon: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * If `true`, the button will take up the full width of its container.
    */
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The URL to link to when the button is clicked.
    * If defined, an `a` element will be used as the root node.
    */
  var href: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the button.
    * `small` is equivalent to the dense button styling.
    */
  var size: js.UndefOr[small | medium | large] = js.undefined
  
  /**
    * Element placed before the children.
    */
  var startIcon: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
  
  /**
    * The variant to use.
    */
  var variant: js.UndefOr[text | outlined | contained] = js.undefined
}
object DisableElevation {
  
  inline def apply(): DisableElevation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableElevation]
  }
  
  extension [Self <: DisableElevation](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setColor(value: typingsJapgolly.materialUiCore.mod.PropTypes.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisableElevation(value: Boolean): Self = StObject.set(x, "disableElevation", value.asInstanceOf[js.Any])
    
    inline def setDisableElevationUndefined: Self = StObject.set(x, "disableElevation", js.undefined)
    
    inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEndIcon(value: VdomNode): Self = StObject.set(x, "endIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setEndIconNull: Self = StObject.set(x, "endIcon", null)
    
    inline def setEndIconUndefined: Self = StObject.set(x, "endIcon", js.undefined)
    
    inline def setEndIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endIcon", js.Array(value*))
    
    inline def setEndIconVdomElement(value: VdomElement): Self = StObject.set(x, "endIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartIcon(value: VdomNode): Self = StObject.set(x, "startIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setStartIconNull: Self = StObject.set(x, "startIcon", null)
    
    inline def setStartIconUndefined: Self = StObject.set(x, "startIcon", js.undefined)
    
    inline def setStartIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "startIcon", js.Array(value*))
    
    inline def setStartIconVdomElement(value: VdomElement): Self = StObject.set(x, "startIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setVariant(value: text | outlined | contained): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
