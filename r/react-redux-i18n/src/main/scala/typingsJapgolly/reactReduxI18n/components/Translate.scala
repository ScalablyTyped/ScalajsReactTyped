package typingsJapgolly.reactReduxI18n.components

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactReduxI18n.mod.TranslateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Translate {
  
  inline def apply(value: String): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TranslateProps]))
  }
  
  @JSImport("react-redux-i18n", "Translate")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactReduxI18n.mod.Translate] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dangerousHTML(value: Boolean): this.type = set("dangerousHTML", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tag(value: ElementType): this.type = set("tag", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TranslateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
