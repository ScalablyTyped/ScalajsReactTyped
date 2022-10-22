package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldCollectionPageMod.CollectionPageJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CollectionPageJsonLd {
  
  inline def apply(
    hasPart: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreativeWork */ Any
    ],
    name: String
  ): Builder = {
    val __props = js.Dynamic.literal(hasPart = hasPart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CollectionPageJsonLdProps]))
  }
  
  @JSImport("next-seo", "CollectionPageJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CollectionPageJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
