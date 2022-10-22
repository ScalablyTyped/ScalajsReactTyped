package typingsJapgolly.reactMdForm.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdForm.typesFormThemeProviderMod.FormTheme
import typingsJapgolly.reactMdForm.typesFormThemeProviderMod.FormThemeProviderProps
import typingsJapgolly.reactMdForm.typesFormThemeProviderMod.FormUnderlineDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormThemeProvider {
  
  @JSImport("@react-md/form", "FormThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def theme(value: FormTheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def underlineDirection(value: FormUnderlineDirection): this.type = set("underlineDirection", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FormThemeProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FormThemeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
