package typingsJapgolly.wordpressEditor

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlocks.mod.BlockInstance
import typingsJapgolly.wordpressEditor.anon.PartialEditorSettings
import typingsJapgolly.wordpressEditor.componentsProviderMod.EditorProvider.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsProviderMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/editor/components/provider", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object EditorProvider {
    
    trait Props extends StObject {
      
      var blocks: js.UndefOr[js.Array[BlockInstance[StringDictionary[Any]]]] = js.undefined
      
      var children: Node
      
      var initialEdits: js.UndefOr[js.Object] = js.undefined
      
      var post: Record[String, Any]
      
      var settings: js.UndefOr[PartialEditorSettings] = js.undefined
      
      var useSubRegistry: js.UndefOr[Boolean] = js.undefined
    }
    object Props {
      
      inline def apply(post: Record[String, Any]): Props = {
        val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any], children = null)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setBlocks(value: js.Array[BlockInstance[StringDictionary[Any]]]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
        
        inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
        
        inline def setBlocksVarargs(value: BlockInstance[StringDictionary[Any]]*): Self = StObject.set(x, "blocks", js.Array(value*))
        
        inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
        
        inline def setChildrenNull: Self = StObject.set(x, "children", null)
        
        inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
        
        inline def setInitialEdits(value: js.Object): Self = StObject.set(x, "initialEdits", value.asInstanceOf[js.Any])
        
        inline def setInitialEditsUndefined: Self = StObject.set(x, "initialEdits", js.undefined)
        
        inline def setPost(value: Record[String, Any]): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
        
        inline def setSettings(value: PartialEditorSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
        
        inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
        
        inline def setUseSubRegistry(value: Boolean): Self = StObject.set(x, "useSubRegistry", value.asInstanceOf[js.Any])
        
        inline def setUseSubRegistryUndefined: Self = StObject.set(x, "useSubRegistry", js.undefined)
      }
    }
  }
}
