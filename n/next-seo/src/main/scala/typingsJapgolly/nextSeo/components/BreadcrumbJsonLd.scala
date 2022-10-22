package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldBreadcrumbMod.BreadCrumbJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BreadcrumbJsonLd {
  
  inline def apply(
    itemListElements: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ItemListElements */ Any
    ]
  ): Builder = {
    val __props = js.Dynamic.literal(itemListElements = itemListElements.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BreadCrumbJsonLdProps]))
  }
  
  @JSImport("next-seo", "BreadcrumbJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BreadCrumbJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
