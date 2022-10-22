package typingsJapgolly.semanticUiSite

import typingsJapgolly.semanticUiSite.SemanticUI.Site
import typingsJapgolly.semanticUiSite.SemanticUI.SiteSettings
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.destroy
import typingsJapgolly.semanticUiSite.semanticUiSiteStrings.setting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def site(): JQuery
  def site(settings: SiteSettings): JQuery
  @JSName("site")
  var site_Original: Site
  @JSName("site")
  def site_destroy(behavior: destroy): JQuery
  @JSName("site")
  def site_setting(behavior: setting, value: SiteSettings): JQuery
  @JSName("site")
  def site_setting[K /* <: /* keyof semantic-ui-site.SemanticUI.SiteSettings */ String */](
    behavior: setting,
    name: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-site.SemanticUI.SiteSettings._Impl[K] */ js.Any
  ): JQuery
  @JSName("site")
  def site_setting[K /* <: /* keyof semantic-ui-site.SemanticUI.SiteSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-site.SemanticUI.SiteSettings._Impl[K] */ js.Any
}
object JQuery {
  
  inline def apply(site: Site): JQuery = {
    val __obj = js.Dynamic.literal(site = site.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setSite(value: Site): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
  }
}
