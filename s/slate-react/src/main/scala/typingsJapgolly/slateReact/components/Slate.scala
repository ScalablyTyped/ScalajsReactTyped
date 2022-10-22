package typingsJapgolly.slateReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.slate.distInterfacesNodeMod.Descendant
import typingsJapgolly.slateReact.anon.Children
import typingsJapgolly.slateReact.distPluginReactEditorMod.ReactEditor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Slate {
  
  inline def apply(editor: ReactEditor, value: js.Array[Descendant]): Builder = {
    val __props = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("slate-react", "Slate")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onChange(value: /* value */ js.Array[Descendant] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ js.Array[Descendant]) => value(t0).runNow()))
  }
  
  def withProps(p: Children): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
