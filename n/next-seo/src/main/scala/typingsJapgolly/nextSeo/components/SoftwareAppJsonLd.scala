package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldSoftwareAppMod.SoftwareAppJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SoftwareAppJsonLd {
  
  inline def apply(name: String, price: String, priceCurrency: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], priceCurrency = priceCurrency.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SoftwareAppJsonLdProps]))
  }
  
  @JSImport("next-seo", "SoftwareAppJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def aggregateRating(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
    ): this.type = set("aggregateRating", value.asInstanceOf[js.Any])
    
    inline def applicationCategory(value: String): this.type = set("applicationCategory", value.asInstanceOf[js.Any])
    
    inline def operatingSystem(value: String): this.type = set("operatingSystem", value.asInstanceOf[js.Any])
    
    inline def review(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
    ): this.type = set("review", value.asInstanceOf[js.Any])
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SoftwareAppJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
