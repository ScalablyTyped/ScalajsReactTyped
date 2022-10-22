package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldNewsarticleMod.NewsArticleJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NewsArticleJsonLd {
  
  inline def apply(
    authorName: String | js.Array[String],
    body: String,
    dateCreated: String,
    datePublished: String,
    description: String,
    images: js.Array[String],
    keywords: String,
    publisherLogo: String,
    publisherName: String,
    section: String,
    title: String,
    url: String
  ): Builder = {
    val __props = js.Dynamic.literal(authorName = authorName.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], datePublished = datePublished.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], publisherLogo = publisherLogo.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NewsArticleJsonLdProps]))
  }
  
  @JSImport("next-seo", "NewsArticleJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dateModified(value: String): this.type = set("dateModified", value.asInstanceOf[js.Any])
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NewsArticleJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
