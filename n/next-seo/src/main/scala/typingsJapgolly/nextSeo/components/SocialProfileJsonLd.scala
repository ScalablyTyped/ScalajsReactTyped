package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldSocialProfileMod.SocialProfileJsonLdProps
import typingsJapgolly.nextSeo.nextSeoStrings.Organization
import typingsJapgolly.nextSeo.nextSeoStrings.Person
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SocialProfileJsonLd {
  
  inline def apply(name: String, sameAs: js.Array[String], `type`: Person | Organization, url: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sameAs = sameAs.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SocialProfileJsonLdProps]))
  }
  
  @JSImport("next-seo", "SocialProfileJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SocialProfileJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
