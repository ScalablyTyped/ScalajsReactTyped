package typingsJapgolly.slateReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.slate.distInterfacesNodeMod.Descendant
import typingsJapgolly.slateReact.distPluginReactEditorMod.ReactEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: japgolly.scalajs.react.facade.React.Node
  
  var editor: ReactEditor
  
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[Descendant], Unit]] = js.undefined
  
  var value: js.Array[Descendant]
}
object Children {
  
  inline def apply(editor: ReactEditor, value: js.Array[Descendant]): Children = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], children = null)
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setEditor(value: ReactEditor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: /* value */ js.Array[Descendant] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ js.Array[Descendant]) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setValue(value: js.Array[Descendant]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Descendant*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
