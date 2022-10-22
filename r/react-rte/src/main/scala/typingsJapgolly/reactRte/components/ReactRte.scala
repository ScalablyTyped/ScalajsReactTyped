package typingsJapgolly.reactRte.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.draftJs.mod.ContentBlock
import typingsJapgolly.reactRte.mod.CustomControl
import typingsJapgolly.reactRte.mod.EditorValue
import typingsJapgolly.reactRte.mod.Props
import typingsJapgolly.reactRte.mod.ToolbarConfig
import typingsJapgolly.reactRte.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactRte {
  
  inline def apply(value: EditorValue): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-rte", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def blockStyleFn(value: /* block */ ContentBlock => js.UndefOr[String]): this.type = set("blockStyleFn", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def customControls(value: js.Array[CustomControl]): this.type = set("customControls", value.asInstanceOf[js.Any])
    
    inline def customControlsVarargs(value: CustomControl*): this.type = set("customControls", js.Array(value*))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def editorClassName(value: String): this.type = set("editorClassName", value.asInstanceOf[js.Any])
    
    inline def editorStyle(value: js.Object): this.type = set("editorStyle", value.asInstanceOf[js.Any])
    
    inline def handleReturn(value: /* event */ js.Object => Boolean): this.type = set("handleReturn", js.Any.fromFunction1(value))
    
    inline def keyBindingFn(value: /* event */ js.Object => js.UndefOr[String]): this.type = set("keyBindingFn", js.Any.fromFunction1(value))
    
    inline def onChange(value: /* value */ EditorValue => Any): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def rootStyle(value: js.Object): this.type = set("rootStyle", value.asInstanceOf[js.Any])
    
    inline def toolbarClassName(value: String): this.type = set("toolbarClassName", value.asInstanceOf[js.Any])
    
    inline def toolbarConfig(value: ToolbarConfig): this.type = set("toolbarConfig", value.asInstanceOf[js.Any])
    
    inline def toolbarStyle(value: js.Object): this.type = set("toolbarStyle", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
