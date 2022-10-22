package typingsJapgolly.antd

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.anon.`2`
import typingsJapgolly.antd.anon.`4`
import typingsJapgolly.antd.libTreeTreeMod.TreeProps
import typingsJapgolly.rcTree.esInterfaceMod.BasicDataNode
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esInterfaceMod.Key
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTreeDirectoryTreeMod extends Shortcut {
  
  @JSImport("antd/lib/tree/DirectoryTree", JSImport.Default)
  @js.native
  val default: DirectoryTreeCompoundedComponent = js.native
  
  type DirectoryTreeCompoundedComponent = (js.Function1[/* props */ PropsWithChildren[DirectoryTreeProps[DataNode]] & `4`, Element]) & `2`
  
  trait DirectoryTreeProps[T /* <: BasicDataNode */]
    extends StObject
       with TreeProps[T] {
    
    @JSName("expandAction")
    var expandAction_DirectoryTreeProps: js.UndefOr[ExpandAction] = js.undefined
  }
  object DirectoryTreeProps {
    
    inline def apply[T /* <: BasicDataNode */](): DirectoryTreeProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryTreeProps[T]]
    }
    
    extension [Self <: DirectoryTreeProps[?], T /* <: BasicDataNode */](x: Self & DirectoryTreeProps[T]) {
      
      inline def setExpandAction(value: ExpandAction): Self = StObject.set(x, "expandAction", value.asInstanceOf[js.Any])
      
      inline def setExpandActionUndefined: Self = StObject.set(x, "expandAction", js.undefined)
    }
  }
  
  trait DirectoryTreeState extends StObject {
    
    var expandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.undefined
  }
  object DirectoryTreeState {
    
    inline def apply(): DirectoryTreeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryTreeState]
    }
    
    extension [Self <: DirectoryTreeState](x: Self) {
      
      inline def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
      
      inline def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdBooleans.`false`
    - typingsJapgolly.antd.antdStrings.click
    - typingsJapgolly.antd.antdStrings.doubleClick
  */
  trait ExpandAction extends StObject
  object ExpandAction {
    
    inline def click: typingsJapgolly.antd.antdStrings.click = "click".asInstanceOf[typingsJapgolly.antd.antdStrings.click]
    
    inline def doubleClick: typingsJapgolly.antd.antdStrings.doubleClick = "doubleClick".asInstanceOf[typingsJapgolly.antd.antdStrings.doubleClick]
    
    inline def `false`: typingsJapgolly.antd.antdBooleans.`false` = false.asInstanceOf[typingsJapgolly.antd.antdBooleans.`false`]
  }
  
  type _To = DirectoryTreeCompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libTreeDirectoryTreeMod.foo` */
  override def _to: DirectoryTreeCompoundedComponent = default
}
