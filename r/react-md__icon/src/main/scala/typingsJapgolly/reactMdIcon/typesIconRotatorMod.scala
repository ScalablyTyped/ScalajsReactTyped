package typingsJapgolly.reactMdIcon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesIconRotatorMod {
  
  @JSImport("@react-md/icon/types/IconRotator", "IconRotator")
  @js.native
  val IconRotator: ForwardRefExoticComponent[IconRotatorProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait IconRotatorBaseProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    /**
      * Boolean if the rotation should be animated instead of static.
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the child icon should be "forcefully" wrapped in a `<span>`
      * element. This should be enabled if you have a custom icon that does not
      * pass the `className` prop down.
      */
    var forceIconWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the icon is currently rotated.
      */
    var rotated: Boolean
  }
  object IconRotatorBaseProps {
    
    inline def apply(rotated: Boolean): IconRotatorBaseProps = {
      val __obj = js.Dynamic.literal(rotated = rotated.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconRotatorBaseProps]
    }
    
    extension [Self <: IconRotatorBaseProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setForceIconWrap(value: Boolean): Self = StObject.set(x, "forceIconWrap", value.asInstanceOf[js.Any])
      
      inline def setForceIconWrapUndefined: Self = StObject.set(x, "forceIconWrap", js.undefined)
      
      inline def setRotated(value: Boolean): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconRotatorProps
    extends StObject
       with IconRotatorBaseProps {
    
    /**
      * The icon that should be rotated. If this is a valid React Element, the
      * class names will be cloned into that icon, otherwise the icon will be
      * wrapped in a span with the correct class names applied.
      */
    @JSName("children")
    var children_IconRotatorProps: Node
  }
  object IconRotatorProps {
    
    inline def apply(rotated: Boolean): IconRotatorProps = {
      val __obj = js.Dynamic.literal(rotated = rotated.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[IconRotatorProps]
    }
    
    extension [Self <: IconRotatorProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
