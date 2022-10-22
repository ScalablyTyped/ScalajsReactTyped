package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisclosureSrcDisclosureArrowMod {
  
  @JSImport("@orbit-ui/react-components/dist/disclosure/src/DisclosureArrow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/disclosure/src/DisclosureArrow", "DisclosureArrow")
  @js.native
  val DisclosureArrow: OrbitComponent[HTMLElement, InnerDisclosureArrowProps] = js.native
  
  inline def InnerDisclosureArrow(hasOpenForwardedRefRest: InnerDisclosureArrowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerDisclosureArrow")(hasOpenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type DisclosureArrowProps = ComponentProps[OrbitComponent[HTMLElement, InnerDisclosureArrowProps]]
  
  trait InnerDisclosureArrowProps extends StObject {
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * A controlled open value that determined whether or not the arrow is up or down.
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An arrow can vary in size.
      */
    var size: js.UndefOr[`2xs` | xs | sm | md | lg | xl | inherit] = js.undefined
  }
  object InnerDisclosureArrowProps {
    
    inline def apply(): InnerDisclosureArrowProps = {
      val __obj = js.Dynamic.literal(forwardedRef = null)
      __obj.asInstanceOf[InnerDisclosureArrowProps]
    }
    
    extension [Self <: InnerDisclosureArrowProps](x: Self) {
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setSize(value: `2xs` | xs | sm | md | lg | xl | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
