package typingsJapgolly.materialUiCore.anon

import typingsJapgolly.materialUiCore.materialUiCoreStrings.circular
import typingsJapgolly.materialUiCore.materialUiCoreStrings.extended
import typingsJapgolly.materialUiCore.materialUiCoreStrings.large
import typingsJapgolly.materialUiCore.materialUiCoreStrings.medium
import typingsJapgolly.materialUiCore.materialUiCoreStrings.round
import typingsJapgolly.materialUiCore.materialUiCoreStrings.small
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableRipple extends StObject {
  
  /**
    * The content of the button.
    */
  var children: NonNullable[japgolly.scalajs.react.facade.React.Node]
  
  /**
    * The color of the component. It supports those theme colors that make sense for this component.
    */
  var color: js.UndefOr[typingsJapgolly.materialUiCore.mod.PropTypes.Color] = js.undefined
  
  /**
    * If `true`, the  keyboard focus ripple will be disabled.
    */
  var disableFocusRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the ripple effect will be disabled.
    */
  var disableRipple: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the button will be disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
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
    * The variant to use.
    * 'round' is deprecated, use 'circular' instead.
    */
  var variant: js.UndefOr[circular | extended | round] = js.undefined
}
object DisableRipple {
  
  inline def apply(children: NonNullable[japgolly.scalajs.react.facade.React.Node]): DisableRipple = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableRipple]
  }
  
  extension [Self <: DisableRipple](x: Self) {
    
    inline def setChildren(value: NonNullable[japgolly.scalajs.react.facade.React.Node]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setColor(value: typingsJapgolly.materialUiCore.mod.PropTypes.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    inline def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
    
    inline def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setVariant(value: circular | extended | round): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
