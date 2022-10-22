package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldArticleMod.ArticleJsonLdProps
import typingsJapgolly.nextSeo.nextSeoStrings.Article
import typingsJapgolly.nextSeo.nextSeoStrings.Blog
import typingsJapgolly.nextSeo.nextSeoStrings.NewsArticle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArticleJsonLd {
  
  inline def apply(
    authorName: String | (js.Array[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArticleAuthor */ Any) | String
    ]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArticleAuthor */ Any),
    datePublished: String,
    description: String,
    images: js.Array[String],
    title: String,
    url: String
  ): Builder = {
    val __props = js.Dynamic.literal(authorName = authorName.asInstanceOf[js.Any], datePublished = datePublished.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ArticleJsonLdProps]))
  }
  
  @JSImport("next-seo", "ArticleJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def dateModified(value: String): this.type = set("dateModified", value.asInstanceOf[js.Any])
    
    inline def publisherLogo(value: String): this.type = set("publisherLogo", value.asInstanceOf[js.Any])
    
    inline def publisherName(value: String): this.type = set("publisherName", value.asInstanceOf[js.Any])
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(value: Article | Blog | NewsArticle): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ArticleJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
