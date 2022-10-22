package typingsJapgolly.reactNativePaper.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativePaper.anon.`4`
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.global.ReactNativePaper.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @JSImport("react-native-paper", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ThemeProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: `4`): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
