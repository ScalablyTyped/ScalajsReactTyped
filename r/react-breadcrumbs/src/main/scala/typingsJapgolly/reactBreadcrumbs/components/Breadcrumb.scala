package typingsJapgolly.reactBreadcrumbs.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactBreadcrumbs.anon.Title
import typingsJapgolly.reactBreadcrumbs.mod.BreadcrumbProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumb {
  
  inline def apply(
    data: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocationDescriptor */ Any) & Title
  ): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[BreadcrumbProps]]))
  }
  
  @JSImport("react-breadcrumbs", "Breadcrumb")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBreadcrumbs.mod.Breadcrumb] {
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[BreadcrumbProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
