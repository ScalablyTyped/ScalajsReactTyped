package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.DefaultIcons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProviderConsumerBackwardCompatible {
  
  @JSImport("wix-style-react/dist/types/ThemeProvider/ThemeProviderConsumerBackwardCompatible", "ThemeProviderConsumerBackwardCompatible")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def defaultIcons(value: js.Object): this.type = set("defaultIcons", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ThemeProviderConsumerBackwardCompatible.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DefaultIcons): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
