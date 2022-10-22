package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldLocalBusinessMod.LocalBusinessJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocalBusinessJsonLd {
  
  inline def apply(
    address: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any,
    description: String,
    id: String,
    name: String,
    `type`: String
  ): Builder = {
    val __props = js.Dynamic.literal(address = address.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LocalBusinessJsonLdProps]))
  }
  
  @JSImport("next-seo", "LocalBusinessJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def action(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ Any
    ): this.type = set("action", value.asInstanceOf[js.Any])
    
    inline def areaServed(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GeoCircle */ Any
        ]
    ): this.type = set("areaServed", value.asInstanceOf[js.Any])
    
    inline def areaServedVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GeoCircle */ Any)*
    ): this.type = set("areaServed", js.Array(value*))
    
    inline def geo(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Geo */ Any
    ): this.type = set("geo", value.asInstanceOf[js.Any])
    
    inline def images(value: js.Array[String]): this.type = set("images", value.asInstanceOf[js.Any])
    
    inline def imagesVarargs(value: String*): this.type = set("images", js.Array(value*))
    
    inline def makesOffer(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offer */ Any
        ]
    ): this.type = set("makesOffer", value.asInstanceOf[js.Any])
    
    inline def makesOfferVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offer */ Any)*
    ): this.type = set("makesOffer", js.Array(value*))
    
    inline def openingHours(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OpeningHoursSpecification */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OpeningHoursSpecification */ Any
        ])
    ): this.type = set("openingHours", value.asInstanceOf[js.Any])
    
    inline def openingHoursVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OpeningHoursSpecification */ Any)*
    ): this.type = set("openingHours", js.Array(value*))
    
    inline def priceRange(value: String): this.type = set("priceRange", value.asInstanceOf[js.Any])
    
    inline def rating(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
    ): this.type = set("rating", value.asInstanceOf[js.Any])
    
    inline def review(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
        ]
    ): this.type = set("review", value.asInstanceOf[js.Any])
    
    inline def reviewVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any)*
    ): this.type = set("review", js.Array(value*))
    
    inline def sameAs(value: js.Array[String]): this.type = set("sameAs", value.asInstanceOf[js.Any])
    
    inline def sameAsVarargs(value: String*): this.type = set("sameAs", js.Array(value*))
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def servesCuisine(value: String | js.Array[String]): this.type = set("servesCuisine", value.asInstanceOf[js.Any])
    
    inline def servesCuisineVarargs(value: String*): this.type = set("servesCuisine", js.Array(value*))
    
    inline def telephone(value: String): this.type = set("telephone", value.asInstanceOf[js.Any])
    
    inline def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LocalBusinessJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
