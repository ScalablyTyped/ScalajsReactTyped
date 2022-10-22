package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldProductMod.ProductJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProductJsonLd {
  
  inline def apply(productName: String): Builder = {
    val __props = js.Dynamic.literal(productName = productName.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ProductJsonLdProps]))
  }
  
  @JSImport("next-seo", "ProductJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def aggregateOffer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateOffer */ Any
    ): this.type = set("aggregateOffer", value.asInstanceOf[js.Any])
    
    inline def aggregateRating(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
    ): this.type = set("aggregateRating", value.asInstanceOf[js.Any])
    
    inline def award(value: String): this.type = set("award", value.asInstanceOf[js.Any])
    
    inline def brand(value: String): this.type = set("brand", value.asInstanceOf[js.Any])
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def disambiguatingDescription(value: String): this.type = set("disambiguatingDescription", value.asInstanceOf[js.Any])
    
    inline def gtin13(value: String): this.type = set("gtin13", value.asInstanceOf[js.Any])
    
    inline def gtin14(value: String): this.type = set("gtin14", value.asInstanceOf[js.Any])
    
    inline def gtin8(value: String): this.type = set("gtin8", value.asInstanceOf[js.Any])
    
    inline def images(value: js.Array[String]): this.type = set("images", value.asInstanceOf[js.Any])
    
    inline def imagesVarargs(value: String*): this.type = set("images", js.Array(value*))
    
    inline def manufacturerLogo(value: String): this.type = set("manufacturerLogo", value.asInstanceOf[js.Any])
    
    inline def manufacturerName(value: String): this.type = set("manufacturerName", value.asInstanceOf[js.Any])
    
    inline def material(value: String): this.type = set("material", value.asInstanceOf[js.Any])
    
    inline def mpn(value: String): this.type = set("mpn", value.asInstanceOf[js.Any])
    
    inline def offers(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any
        ])
    ): this.type = set("offers", value.asInstanceOf[js.Any])
    
    inline def offersVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any)*
    ): this.type = set("offers", js.Array(value*))
    
    inline def productionDate(value: String): this.type = set("productionDate", value.asInstanceOf[js.Any])
    
    inline def purchaseDate(value: String): this.type = set("purchaseDate", value.asInstanceOf[js.Any])
    
    inline def releaseDate(value: String): this.type = set("releaseDate", value.asInstanceOf[js.Any])
    
    inline def reviews(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
        ]
    ): this.type = set("reviews", value.asInstanceOf[js.Any])
    
    inline def reviewsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any)*
    ): this.type = set("reviews", js.Array(value*))
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def sku(value: String): this.type = set("sku", value.asInstanceOf[js.Any])
    
    inline def slogan(value: String): this.type = set("slogan", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProductJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
