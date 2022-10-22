package typingsJapgolly.mobxReactDevtools.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.mobxReactDevtools.anon.Bottom
import typingsJapgolly.mobxReactDevtools.mobxReactDevtoolsStrings.bottomLeft
import typingsJapgolly.mobxReactDevtools.mobxReactDevtoolsStrings.bottomRight
import typingsJapgolly.mobxReactDevtools.mobxReactDevtoolsStrings.topLeft
import typingsJapgolly.mobxReactDevtools.mobxReactDevtoolsStrings.topRight
import typingsJapgolly.mobxReactDevtools.mod.IDevToolProps
import typingsJapgolly.mobxReactDevtools.mod.default
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MobxReactDevtools {
  
  @JSImport("mobx-react-devtools", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def highlightTimeout(value: Double): this.type = set("highlightTimeout", value.asInstanceOf[js.Any])
    
    inline def noPanel(value: Boolean): this.type = set("noPanel", value.asInstanceOf[js.Any])
    
    inline def position(value: topRight | bottomRight | bottomLeft | topLeft | Bottom): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MobxReactDevtools.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDevToolProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
