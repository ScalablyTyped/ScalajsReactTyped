package typingsJapgolly.linguiReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.linguiCore.mod.I18n_
import typingsJapgolly.linguiReact.cjsI18nProviderMod.I18nProviderProps
import typingsJapgolly.linguiReact.cjsTransMod.TransRenderProps
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object I18nProvider {
  
  inline def apply(i18n: I18n_): Builder = {
    val __props = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[I18nProviderProps]))
  }
  
  @JSImport("@lingui/react", "I18nProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def defaultComponent(value: ComponentType[TransRenderProps]): this.type = set("defaultComponent", value.asInstanceOf[js.Any])
    
    inline def forceRenderOnLocaleChange(value: Boolean): this.type = set("forceRenderOnLocaleChange", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: I18nProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
