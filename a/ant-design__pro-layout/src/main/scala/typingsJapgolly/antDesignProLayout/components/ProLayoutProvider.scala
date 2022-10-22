package typingsJapgolly.antDesignProLayout.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.esContextProLayoutContextMod.DeepPartial
import typingsJapgolly.antDesignProLayout.esContextProLayoutContextMod.LayoutDesignToken
import typingsJapgolly.antDesignProLayout.esContextProLayoutContextMod.ProLayoutProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProLayoutProvider {
  
  @JSImport("@ant-design/pro-layout/es/context/ProLayoutContext", "ProLayoutProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def token(value: DeepPartial[LayoutDesignToken]): this.type = set("token", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ProLayoutProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProLayoutProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
