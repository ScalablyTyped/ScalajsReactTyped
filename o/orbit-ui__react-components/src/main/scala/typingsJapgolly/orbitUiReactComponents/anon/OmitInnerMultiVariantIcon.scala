package typingsJapgolly.orbitUiReactComponents.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@orbit-ui/react-components.@orbit-ui/react-components/dist/icons/src/MultiVariantIcon.InnerMultiVariantIconProps, 'src24' | 'src32'> */
trait OmitInnerMultiVariantIcon extends StObject {
  
  var forwardedRef: ForwardedRef[Any]
  
  var size: js.UndefOr[`2xs` | xs | sm | md | lg | xl | inherit] = js.undefined
  
  var slot: js.UndefOr[String] = js.undefined
}
object OmitInnerMultiVariantIcon {
  
  inline def apply(): OmitInnerMultiVariantIcon = {
    val __obj = js.Dynamic.literal(forwardedRef = null)
    __obj.asInstanceOf[OmitInnerMultiVariantIcon]
  }
  
  extension [Self <: OmitInnerMultiVariantIcon](x: Self) {
    
    inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
    
    inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    
    inline def setSize(value: `2xs` | xs | sm | md | lg | xl | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
  }
}
