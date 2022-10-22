package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.orbitUiReactComponents.anon.OmitInnerIconPropssrc
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.distSharedSrcTypesMod.AriaLabelingProps
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

object distIconsSrcIconMod {
  
  @JSImport("@orbit-ui/react-components/dist/icons/src/Icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/icons/src/Icon", "Icon")
  @js.native
  val Icon: OrbitComponent[svg, InnerIconProps] = js.native
  
  inline def InnerIcon(props: InnerIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerIcon")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createIcon(src: ElementType): OrbitComponent[svg, OmitInnerIconPropssrc] = ^.asInstanceOf[js.Dynamic].applyDynamic("createIcon")(src.asInstanceOf[js.Any]).asInstanceOf[OrbitComponent[svg, OmitInnerIconPropssrc]]
  
  type IconProps = ComponentProps[OrbitComponent[svg, InnerIconProps]]
  
  trait InnerIconProps
    extends StObject
       with AriaLabelingProps {
    
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
      * An icon as a React component.
      */
    var src: ElementType
  }
  object InnerIconProps {
    
    inline def apply(src: ElementType): InnerIconProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], forwardedRef = null)
      __obj.asInstanceOf[InnerIconProps]
    }
    
    extension [Self <: InnerIconProps](x: Self) {
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setSize(value: `2xs` | xs | sm | md | lg | xl | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      inline def setSrc(value: ElementType): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
}
