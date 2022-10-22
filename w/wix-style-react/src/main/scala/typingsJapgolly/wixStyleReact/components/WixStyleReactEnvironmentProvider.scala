package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesWixStyleReactEnvironmentProviderMod.WixStyleReactEnvironmentProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WixStyleReactEnvironmentProvider {
  
  @JSImport("wix-style-react", "WixStyleReactEnvironmentProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: WixStyleReactEnvironmentProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: WixStyleReactEnvironmentProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
