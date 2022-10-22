package typingsJapgolly.reactReduxI18n.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactReduxI18n.mod.LocalizeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Localize {
  
  inline def apply(value: String | Double | js.Object): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LocalizeProps]))
  }
  
  @JSImport("react-redux-i18n", "Localize")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactReduxI18n.mod.Localize] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dangerousHTML(value: Boolean): this.type = set("dangerousHTML", value.asInstanceOf[js.Any])
    
    inline def dateFormat(value: String): this.type = set("dateFormat", value.asInstanceOf[js.Any])
    
    inline def options(value: js.Object): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tag(value: ElementType): this.type = set("tag", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LocalizeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
