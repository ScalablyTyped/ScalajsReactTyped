package typingsJapgolly.reactEmailEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactEmailEditor.mod.AppearanceConfig
import typingsJapgolly.reactEmailEditor.mod.EmailEditorProps
import typingsJapgolly.reactEmailEditor.mod.ToolsConfig
import typingsJapgolly.reactEmailEditor.mod.UnlayerOptions
import typingsJapgolly.reactEmailEditor.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactEmailEditor {
  
  @JSImport("react-email-editor", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def appearance(value: AppearanceConfig): this.type = set("appearance", value.asInstanceOf[js.Any])
    
    inline def minHeight(value: Double | String): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    inline def onLoad(value: Callback): this.type = set("onLoad", value.toJsFn)
    
    inline def onReady(value: Callback): this.type = set("onReady", value.toJsFn)
    
    inline def options(value: UnlayerOptions): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def projectId(value: Double): this.type = set("projectId", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tools(value: ToolsConfig): this.type = set("tools", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactEmailEditor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: EmailEditorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
