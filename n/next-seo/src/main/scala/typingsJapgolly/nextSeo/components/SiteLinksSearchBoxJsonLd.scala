package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldSiteLinksSearchBoxMod.PotentialAction
import typingsJapgolly.nextSeo.libJsonldSiteLinksSearchBoxMod.SiteLinksSearchBoxJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SiteLinksSearchBoxJsonLd {
  
  inline def apply(potentialActions: js.Array[PotentialAction], url: String): Builder = {
    val __props = js.Dynamic.literal(potentialActions = potentialActions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SiteLinksSearchBoxJsonLdProps]))
  }
  
  @JSImport("next-seo", "SiteLinksSearchBoxJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SiteLinksSearchBoxJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
