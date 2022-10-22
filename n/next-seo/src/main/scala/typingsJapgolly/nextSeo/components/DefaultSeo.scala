package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.anon.AppId
import typingsJapgolly.nextSeo.libTypesMod.AdditionalRobotsProps
import typingsJapgolly.nextSeo.libTypesMod.DefaultSeoProps
import typingsJapgolly.nextSeo.libTypesMod.LanguageAlternate
import typingsJapgolly.nextSeo.libTypesMod.LinkTag
import typingsJapgolly.nextSeo.libTypesMod.MetaTag
import typingsJapgolly.nextSeo.libTypesMod.MobileAlternate
import typingsJapgolly.nextSeo.libTypesMod.OpenGraph
import typingsJapgolly.nextSeo.libTypesMod.Twitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DefaultSeo {
  
  @JSImport("next-seo", "DefaultSeo")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.nextSeo.mod.DefaultSeo] {
    
    inline def additionalLinkTags(value: js.Array[LinkTag]): this.type = set("additionalLinkTags", value.asInstanceOf[js.Any])
    
    inline def additionalLinkTagsVarargs(value: LinkTag*): this.type = set("additionalLinkTags", js.Array(value*))
    
    inline def additionalMetaTags(value: js.Array[MetaTag]): this.type = set("additionalMetaTags", value.asInstanceOf[js.Any])
    
    inline def additionalMetaTagsVarargs(value: MetaTag*): this.type = set("additionalMetaTags", js.Array(value*))
    
    inline def canonical(value: String): this.type = set("canonical", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetAllPagesToNoFollow(value: Boolean): this.type = set("dangerouslySetAllPagesToNoFollow", value.asInstanceOf[js.Any])
    
    inline def dangerouslySetAllPagesToNoIndex(value: Boolean): this.type = set("dangerouslySetAllPagesToNoIndex", value.asInstanceOf[js.Any])
    
    inline def defaultOpenGraphImageHeight(value: Double): this.type = set("defaultOpenGraphImageHeight", value.asInstanceOf[js.Any])
    
    inline def defaultOpenGraphImageWidth(value: Double): this.type = set("defaultOpenGraphImageWidth", value.asInstanceOf[js.Any])
    
    inline def defaultOpenGraphVideoHeight(value: Double): this.type = set("defaultOpenGraphVideoHeight", value.asInstanceOf[js.Any])
    
    inline def defaultOpenGraphVideoWidth(value: Double): this.type = set("defaultOpenGraphVideoWidth", value.asInstanceOf[js.Any])
    
    inline def defaultTitle(value: String): this.type = set("defaultTitle", value.asInstanceOf[js.Any])
    
    inline def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def facebook(value: AppId): this.type = set("facebook", value.asInstanceOf[js.Any])
    
    inline def languageAlternates(value: js.Array[LanguageAlternate]): this.type = set("languageAlternates", value.asInstanceOf[js.Any])
    
    inline def languageAlternatesVarargs(value: LanguageAlternate*): this.type = set("languageAlternates", js.Array(value*))
    
    inline def mobileAlternate(value: MobileAlternate): this.type = set("mobileAlternate", value.asInstanceOf[js.Any])
    
    inline def openGraph(value: OpenGraph): this.type = set("openGraph", value.asInstanceOf[js.Any])
    
    inline def robotsProps(value: AdditionalRobotsProps): this.type = set("robotsProps", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleTemplate(value: String): this.type = set("titleTemplate", value.asInstanceOf[js.Any])
    
    inline def twitter(value: Twitter): this.type = set("twitter", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DefaultSeo.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DefaultSeoProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
