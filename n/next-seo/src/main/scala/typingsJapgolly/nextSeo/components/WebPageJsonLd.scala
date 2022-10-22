package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldWebPageMod.WebPageJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebPageJsonLd {
  
  inline def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[WebPageJsonLdProps]))
  }
  
  @JSImport("next-seo", "WebPageJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def keyOverride(value: String): this.type = set("keyOverride", value.asInstanceOf[js.Any])
    
    inline def lastReviewed(value: String): this.type = set("lastReviewed", value.asInstanceOf[js.Any])
    
    inline def reviewedBy(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReviewedBy */ Any
    ): this.type = set("reviewedBy", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: WebPageJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
