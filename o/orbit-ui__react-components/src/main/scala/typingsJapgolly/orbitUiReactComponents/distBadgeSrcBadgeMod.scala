package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.OrbitComponent
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.circle
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.count
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.dot
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.icon
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBadgeSrcBadgeMod {
  
  @JSImport("@orbit-ui/react-components/dist/badge/src/Badge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/badge/src/Badge", "Badge")
  @js.native
  val Badge: OrbitComponent[HTMLElement, InnerBadgeProps] = js.native
  
  inline def InnerBadge(hasVariantOverlapAsChildrenForwardedRefRest: InnerBadgeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("InnerBadge")(hasVariantOverlapAsChildrenForwardedRefRest.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type BadgeProps = ComponentProps[OrbitComponent[HTMLElement, InnerBadgeProps]]
  
  trait InnerBadgeProps extends StObject {
    
    /**
      * An HTML element type or a custom React element type to render as.
      */
    var as: js.UndefOr[ElementType] = js.undefined
    
    /**
      * React children.
      */
    var children: Node
    
    /**
      * @ignore
      */
    var forwardedRef: ForwardedRef[Any]
    
    /**
      * The shape of the element being overlap by the badge.
      */
    var overlap: js.UndefOr[circle | icon] = js.undefined
    
    /**
      * The style to use.
      */
    var variant: js.UndefOr[count | dot | icon] = js.undefined
  }
  object InnerBadgeProps {
    
    inline def apply(): InnerBadgeProps = {
      val __obj = js.Dynamic.literal(children = null, forwardedRef = null)
      __obj.asInstanceOf[InnerBadgeProps]
    }
    
    extension [Self <: InnerBadgeProps](x: Self) {
      
      inline def setAs(value: ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setForwardedRef(value: ForwardedRef[Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
      
      inline def setForwardedRefFunction1(value: /* instance */ Any | Null => Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ Any | Null) => value(t0).runNow()))
      
      inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
      
      inline def setOverlap(value: circle | icon): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
      
      inline def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
      
      inline def setVariant(value: count | dot | icon): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
