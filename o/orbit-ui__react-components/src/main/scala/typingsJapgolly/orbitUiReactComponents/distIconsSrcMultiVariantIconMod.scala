package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.orbitUiReactComponents.anon.OmitInnerMultiVariantIcon
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.svg
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIconsSrcMultiVariantIconMod {
  
  @JSImport("@orbit-ui/react-components/dist/icons/src/MultiVariantIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def InnerMultiVariantIcon(hasComponent24Component32SizeForwardedRefRest: InnerMultiVariantIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerMultiVariantIcon")(hasComponent24Component32SizeForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@orbit-ui/react-components/dist/icons/src/MultiVariantIcon", "MultiVariantIcon")
  @js.native
  val MultiVariantIcon: OrbitComponent[svg, InnerMultiVariantIconProps] = js.native
  
  inline def createMultiVariantIcon(src24: ElementType, src32: ElementType): OrbitComponent[svg, OmitInnerMultiVariantIcon] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMultiVariantIcon")(src24.asInstanceOf[js.Any], src32.asInstanceOf[js.Any])).asInstanceOf[OrbitComponent[svg, OmitInnerMultiVariantIcon]]
  
  trait InnerMultiVariantIconProps extends StObject {
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * An icon can vary in size.
      */
    var size: js.UndefOr[`2xs` | xs | sm | md | lg | xl | inherit] = js.undefined
    
    /**
      * Default slot override.
      */
    var slot: js.UndefOr[String] = js.undefined
    
    /**
      * An icon as a React component for the 24px variant.
      */
    var src24: ElementType
    
    /**
      * An icon as a React component for the 32px variant.
      */
    var src32: ElementType
  }
  object InnerMultiVariantIconProps {
    
    inline def apply(src24: ElementType, src32: ElementType): InnerMultiVariantIconProps = {
      val __obj = js.Dynamic.literal(src24 = src24.asInstanceOf[js.Any], src32 = src32.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerMultiVariantIconProps]
    }
    
    extension [Self <: InnerMultiVariantIconProps](x: Self) {
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setSize(value: `2xs` | xs | sm | md | lg | xl | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSrc24(value: ElementType): Self = StObject.set(x, "src24", value.asInstanceOf[js.Any])
      
      inline def setSrc32(value: ElementType): Self = StObject.set(x, "src32", value.asInstanceOf[js.Any])
    }
  }
  
  type MultiVariantIconProps = ComponentProps[OrbitComponent[svg, InnerMultiVariantIconProps]]
}
