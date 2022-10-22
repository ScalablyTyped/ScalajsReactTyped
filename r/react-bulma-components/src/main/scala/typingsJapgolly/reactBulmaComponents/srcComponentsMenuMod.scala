package typingsJapgolly.reactBulmaComponents

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.aside
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsMenuMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/menu", JSImport.Default)
  @js.native
  val default: (BulmaComponent[js.Object, aside]) & typingsJapgolly.reactBulmaComponents.anon.List = js.native
  
  trait MenuListComponentProps extends StObject {
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object MenuListComponentProps {
    
    inline def apply(): MenuListComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuListComponentProps]
    }
    
    extension [Self <: MenuListComponentProps](x: Self) {
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait MenuListItemProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
  }
  object MenuListItemProps {
    
    inline def apply(): MenuListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuListItemProps]
    }
    
    extension [Self <: MenuListItemProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = (BulmaComponent[js.Object, aside]) & typingsJapgolly.reactBulmaComponents.anon.List
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsMenuMod.foo` */
  override def _to: (BulmaComponent[js.Object, aside]) & typingsJapgolly.reactBulmaComponents.anon.List = default
}
