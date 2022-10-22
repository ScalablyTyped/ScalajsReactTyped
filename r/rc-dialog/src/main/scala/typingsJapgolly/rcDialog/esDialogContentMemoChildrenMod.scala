package typingsJapgolly.rcDialog

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.MemoExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDialogContentMemoChildrenMod extends Shortcut {
  
  @JSImport("rc-dialog/es/Dialog/Content/MemoChildren", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* hasChildren */ MemoChildrenProps, Element]] = js.native
  
  trait MemoChildrenProps extends StObject {
    
    var children: Node
    
    var shouldUpdate: Boolean
  }
  object MemoChildrenProps {
    
    inline def apply(shouldUpdate: Boolean): MemoChildrenProps = {
      val __obj = js.Dynamic.literal(shouldUpdate = shouldUpdate.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[MemoChildrenProps]
    }
    
    extension [Self <: MemoChildrenProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setShouldUpdate(value: Boolean): Self = StObject.set(x, "shouldUpdate", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = MemoExoticComponent[js.Function1[/* hasChildren */ MemoChildrenProps, Element]]
  
  /* This means you don't have to write `default`, but can instead just say `esDialogContentMemoChildrenMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* hasChildren */ MemoChildrenProps, Element]] = default
}
