package typingsJapgolly.linguiMacro.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.linguiMacro.mod.TransProps
import typingsJapgolly.linguiReact.cjsTransMod.TransRenderProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Trans {
  
  @JSImport("@lingui/macro", "Trans")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def comment(value: String): this.type = set("comment", value.asInstanceOf[js.Any])
    
    inline def component(value: ComponentType[TransRenderProps]): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def context(value: String): this.type = set("context", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def render(value: /* props */ TransRenderProps => Element | Null): this.type = set("render", js.Any.fromFunction1(value))
    
    inline def values(value: Record[String, Any]): this.type = set("values", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Trans.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TransProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
