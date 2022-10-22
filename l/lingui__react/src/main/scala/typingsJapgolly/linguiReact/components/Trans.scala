package typingsJapgolly.linguiReact.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.linguiReact.cjsTransMod.TransProps
import typingsJapgolly.linguiReact.cjsTransMod.TransRenderProps
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Trans {
  
  inline def apply(id: String, values: js.Object): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TransProps]))
  }
  
  @JSImport("@lingui/react", "Trans")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def component(value: ComponentType[TransRenderProps]): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def context(value: String): this.type = set("context", value.asInstanceOf[js.Any])
    
    inline def formats(value: js.Object): this.type = set("formats", value.asInstanceOf[js.Any])
    
    inline def message(value: String): this.type = set("message", value.asInstanceOf[js.Any])
    
    inline def render(value: /* props */ TransRenderProps => Element | Null): this.type = set("render", js.Any.fromFunction1(value))
  }
  
  def withProps(p: TransProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
