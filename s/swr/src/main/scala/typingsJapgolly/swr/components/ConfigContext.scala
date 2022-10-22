package typingsJapgolly.swr.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.swr.anon.PropsWithChildrenvalueSWR
import typingsJapgolly.swr.anon.SWRConfigurationanyanyBar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigContext {
  
  @JSImport("swr/dist/utils/config-context", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def value(value: SWRConfigurationanyanyBar): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ConfigContext.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildrenvalueSWR): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
