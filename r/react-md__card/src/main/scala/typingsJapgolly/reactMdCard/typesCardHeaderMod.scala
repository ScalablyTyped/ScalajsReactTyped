package typingsJapgolly.reactMdCard

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdCard.reactMdCardStrings.bottom
import typingsJapgolly.reactMdCard.reactMdCardStrings.center
import typingsJapgolly.reactMdCard.reactMdCardStrings.none
import typingsJapgolly.reactMdCard.reactMdCardStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCardHeaderMod {
  
  @JSImport("@react-md/card/types/CardHeader", "CardHeader")
  @js.native
  val CardHeader: ForwardRefExoticComponent[CardHeaderProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait CardHeaderProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Optional children to render after the main `children` in the component.
      * This is a good place to add expander buttons or overflow menus.
      *
      * This using the `TextIconSpacing` component behind the scenes, so some
      * additional margin will be added to separate the content.
      */
    var afterChildren: js.UndefOr[Node] = js.undefined
    
    /**
      * This is how to align the items within the header component. It's really
      * just a simple pass-through to `align-items`.
      */
    var align: js.UndefOr[top | center | bottom | none] = js.undefined
    
    /**
      * Optional children to render before the main `children` in the component.
      * This is a good place to add `Avatar`s or additional `Media` to display with
      * the card.
      *
      * This using the `TextIconSpacing` component behind the scenes, so some
      * additional margin will be added to separate the content.
      */
    var beforeChildren: js.UndefOr[Node] = js.undefined
    
    /**
      * Since it's possible to add content before or after the main children, the
      * main content gets wrapped in a small `<span>` to help stack the `CardTitle`
      * and `CardSubtitle` components while still allowing content to be centered
      * vertically. If you need to add additional styles to this element for some
      * reason, you can use this class name to do so.
      */
    var contentClassName: js.UndefOr[String] = js.undefined
  }
  object CardHeaderProps {
    
    inline def apply(): CardHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderProps]
    }
    
    extension [Self <: CardHeaderProps](x: Self) {
      
      inline def setAfterChildren(value: VdomNode): Self = StObject.set(x, "afterChildren", value.rawNode.asInstanceOf[js.Any])
      
      inline def setAfterChildrenNull: Self = StObject.set(x, "afterChildren", null)
      
      inline def setAfterChildrenUndefined: Self = StObject.set(x, "afterChildren", js.undefined)
      
      inline def setAfterChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "afterChildren", js.Array(value*))
      
      inline def setAfterChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "afterChildren", value.rawElement.asInstanceOf[js.Any])
      
      inline def setAlign(value: top | center | bottom | none): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBeforeChildren(value: VdomNode): Self = StObject.set(x, "beforeChildren", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBeforeChildrenNull: Self = StObject.set(x, "beforeChildren", null)
      
      inline def setBeforeChildrenUndefined: Self = StObject.set(x, "beforeChildren", js.undefined)
      
      inline def setBeforeChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "beforeChildren", js.Array(value*))
      
      inline def setBeforeChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "beforeChildren", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
    }
  }
}
