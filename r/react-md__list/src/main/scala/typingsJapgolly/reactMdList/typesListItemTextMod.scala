package typingsJapgolly.reactMdList

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListItemTextMod {
  
  @JSImport("@react-md/list/types/ListItemText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ListItemText(hasClassNameSecondaryTextClassNameSecondaryTextChildren: ListItemTextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemText")(hasClassNameSecondaryTextClassNameSecondaryTextChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ListItemTextProps extends StObject {
    
    /**
      * The main text children to display. This will be stacked above the
      * `secondaryText` if it was provided.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    /**
      * An optional `className` to apply to the `<span>` surrounding the `children`.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Optional secondary text to display that will be stacked below the
      * `children`. This also applies some styles to make the text less prominent
      * than the `children`.
      */
    var secondaryText: js.UndefOr[Node] = js.undefined
    
    /**
      * An optional `className` to apply to the `<span>` surrounding the
      * `secondaryText` if it was provided.
      */
    var secondaryTextClassName: js.UndefOr[String] = js.undefined
  }
  object ListItemTextProps {
    
    inline def apply(): ListItemTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemTextProps]
    }
    
    extension [Self <: ListItemTextProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setSecondaryText(value: VdomNode): Self = StObject.set(x, "secondaryText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSecondaryTextClassName(value: String): Self = StObject.set(x, "secondaryTextClassName", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextClassNameUndefined: Self = StObject.set(x, "secondaryTextClassName", js.undefined)
      
      inline def setSecondaryTextNull: Self = StObject.set(x, "secondaryText", null)
      
      inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
      
      inline def setSecondaryTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "secondaryText", js.Array(value*))
      
      inline def setSecondaryTextVdomElement(value: VdomElement): Self = StObject.set(x, "secondaryText", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
