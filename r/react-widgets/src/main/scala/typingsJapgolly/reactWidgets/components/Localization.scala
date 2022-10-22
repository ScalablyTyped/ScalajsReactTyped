package typingsJapgolly.reactWidgets.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactWidgets.esmLocalizationMod.DateLocalizer
import typingsJapgolly.reactWidgets.esmLocalizationMod.NumberLocalizer
import typingsJapgolly.reactWidgets.esmLocalizationMod.ProviderProps
import typingsJapgolly.reactWidgets.esmMessagesMod.UserProvidedMessages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Localization {
  
  @JSImport("react-widgets/esm", "Localization")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def date(value: DateLocalizer[Any]): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def messages(value: UserProvidedMessages): this.type = set("messages", value.asInstanceOf[js.Any])
    
    inline def number(value: NumberLocalizer[Any]): this.type = set("number", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Localization.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
