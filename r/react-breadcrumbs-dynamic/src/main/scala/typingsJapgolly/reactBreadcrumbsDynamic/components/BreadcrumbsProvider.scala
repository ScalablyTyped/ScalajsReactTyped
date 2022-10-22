package typingsJapgolly.reactBreadcrumbsDynamic.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BreadcrumbsProvider {
  
  @JSImport("react-breadcrumbs-dynamic", "BreadcrumbsProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBreadcrumbsDynamic.mod.BreadcrumbsProvider] {
    
    inline def shouldBreadcrumbsUpdate(value: /* repeated */ Any => Any): this.type = set("shouldBreadcrumbsUpdate", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: BreadcrumbsProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BreadcrumbsProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
