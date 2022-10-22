package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldProfilePageMod.ProfilePageJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProfilePageJsonLd {
  
  inline def apply(
    breadcrumb: String | (js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ItemListElements */ Any
    ])
  ): Builder = {
    val __props = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ProfilePageJsonLdProps]))
  }
  
  @JSImport("next-seo", "ProfilePageJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def lastReviewed(value: String): this.type = set("lastReviewed", value.asInstanceOf[js.Any])
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProfilePageJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
