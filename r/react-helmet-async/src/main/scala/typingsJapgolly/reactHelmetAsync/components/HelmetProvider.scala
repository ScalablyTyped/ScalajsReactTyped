package typingsJapgolly.reactHelmetAsync.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactHelmetAsync.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HelmetProvider {
  
  @JSImport("react-helmet-async", "HelmetProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactHelmetAsync.mod.HelmetProvider] {
    
    inline def context(value: js.Object): this.type = set("context", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HelmetProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildren[ProviderProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
