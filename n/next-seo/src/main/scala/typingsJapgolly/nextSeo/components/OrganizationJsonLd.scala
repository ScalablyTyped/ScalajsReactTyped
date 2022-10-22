package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldOrganizationMod.OrganizationJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OrganizationJsonLd {
  
  inline def apply(name: String, url: String): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OrganizationJsonLdProps]))
  }
  
  @JSImport("next-seo", "OrganizationJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def address(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Address */ Any
    ): this.type = set("address", value.asInstanceOf[js.Any])
    
    inline def contactPoints(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any
        ]
    ): this.type = set("contactPoints", value.asInstanceOf[js.Any])
    
    inline def contactPointsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ContactPoint */ Any)*
    ): this.type = set("contactPoints", js.Array(value*))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def legalName(value: String): this.type = set("legalName", value.asInstanceOf[js.Any])
    
    inline def logo(value: String): this.type = set("logo", value.asInstanceOf[js.Any])
    
    inline def sameAs(value: js.Array[String]): this.type = set("sameAs", value.asInstanceOf[js.Any])
    
    inline def sameAsVarargs(value: String*): this.type = set("sameAs", js.Array(value*))
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrganizationCategory */ Any
    ): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OrganizationJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
