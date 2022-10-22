package typingsJapgolly.wordpressBlockEditor

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.wordpressBlockEditor.anon.OnClick
import typingsJapgolly.wordpressBlockEditor.componentsWarningMod.Warning.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsWarningMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/warning", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Warning {
    
    trait Props extends StObject {
      
      var actions: js.UndefOr[ReactFragment] = js.undefined
      
      var children: Node
      
      var className: js.UndefOr[String] = js.undefined
      
      var secondaryActions: js.UndefOr[js.Array[OnClick]] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal(children = null)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setActions(value: ReactFragment): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setSecondaryActions(value: js.Array[OnClick]): Self = StObject.set(x, "secondaryActions", value.asInstanceOf[js.Any])
        
        inline def setSecondaryActionsUndefined: Self = StObject.set(x, "secondaryActions", js.undefined)
        
        inline def setSecondaryActionsVarargs(value: OnClick*): Self = StObject.set(x, "secondaryActions", js.Array(value*))
      }
    }
  }
}
