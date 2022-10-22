package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldVideoGameMod.VideoGameJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VideoGameJsonLd {
  
  inline def apply(name: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VideoGameJsonLdProps]))
  }
  
  @JSImport("next-seo", "VideoGameJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def aggregateRating(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
    ): this.type = set("aggregateRating", value.asInstanceOf[js.Any])
    
    inline def applicationCategory(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ApplicationCategory */ Any
    ): this.type = set("applicationCategory", value.asInstanceOf[js.Any])
    
    inline def authorName(value: String): this.type = set("authorName", value.asInstanceOf[js.Any])
    
    inline def datePublished(value: String): this.type = set("datePublished", value.asInstanceOf[js.Any])
    
    inline def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def genreName(value: String | js.Array[String]): this.type = set("genreName", value.asInstanceOf[js.Any])
    
    inline def genreNameVarargs(value: String*): this.type = set("genreName", js.Array(value*))
    
    inline def image(value: String): this.type = set("image", value.asInstanceOf[js.Any])
    
    inline def keyOverride(value: String): this.type = set("keyOverride", value.asInstanceOf[js.Any])
    
    inline def keywords(value: String): this.type = set("keywords", value.asInstanceOf[js.Any])
    
    inline def languageName(value: String | js.Array[String]): this.type = set("languageName", value.asInstanceOf[js.Any])
    
    inline def languageNameVarargs(value: String*): this.type = set("languageName", js.Array(value*))
    
    inline def memoryRequirements(value: String): this.type = set("memoryRequirements", value.asInstanceOf[js.Any])
    
    inline def offers(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any
        ])
    ): this.type = set("offers", value.asInstanceOf[js.Any])
    
    inline def offersVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any)*
    ): this.type = set("offers", js.Array(value*))
    
    inline def operatingSystemName(value: String | js.Array[String]): this.type = set("operatingSystemName", value.asInstanceOf[js.Any])
    
    inline def operatingSystemNameVarargs(value: String*): this.type = set("operatingSystemName", js.Array(value*))
    
    inline def platformName(value: String | js.Array[String]): this.type = set("platformName", value.asInstanceOf[js.Any])
    
    inline def platformNameVarargs(value: String*): this.type = set("platformName", js.Array(value*))
    
    inline def playMode(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GamePlayMode */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GamePlayMode */ Any
        ])
    ): this.type = set("playMode", value.asInstanceOf[js.Any])
    
    inline def playModeVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GamePlayMode */ Any)*
    ): this.type = set("playMode", js.Array(value*))
    
    inline def processorRequirements(value: String): this.type = set("processorRequirements", value.asInstanceOf[js.Any])
    
    inline def producerName(value: String): this.type = set("producerName", value.asInstanceOf[js.Any])
    
    inline def producerUrl(value: String): this.type = set("producerUrl", value.asInstanceOf[js.Any])
    
    inline def providerName(value: String): this.type = set("providerName", value.asInstanceOf[js.Any])
    
    inline def providerUrl(value: String): this.type = set("providerUrl", value.asInstanceOf[js.Any])
    
    inline def publisherName(value: String | js.Array[String]): this.type = set("publisherName", value.asInstanceOf[js.Any])
    
    inline def publisherNameVarargs(value: String*): this.type = set("publisherName", js.Array(value*))
    
    inline def reviews(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any
        ]
    ): this.type = set("reviews", value.asInstanceOf[js.Any])
    
    inline def reviewsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Review */ Any)*
    ): this.type = set("reviews", js.Array(value*))
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def storageRequirements(value: String): this.type = set("storageRequirements", value.asInstanceOf[js.Any])
    
    inline def trailer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Video */ Any
    ): this.type = set("trailer", value.asInstanceOf[js.Any])
    
    inline def translatorName(value: String | js.Array[String]): this.type = set("translatorName", value.asInstanceOf[js.Any])
    
    inline def translatorNameVarargs(value: String*): this.type = set("translatorName", js.Array(value*))
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VideoGameJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
