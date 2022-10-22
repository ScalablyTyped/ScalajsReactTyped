package typingsJapgolly.swr.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.swr.anon.PartialPublicConfiguratio
import typingsJapgolly.swr.anon.PropsWithChildrenvaluePar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SWRConfig {
  
  @JSImport("swr", "SWRConfig")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def value(value: PartialPublicConfiguratio): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SWRConfig.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithChildrenvaluePar): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
