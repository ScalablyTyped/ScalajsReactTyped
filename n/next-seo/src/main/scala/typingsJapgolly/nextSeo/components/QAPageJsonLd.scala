package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldQaPageMod.QAPageJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QAPageJsonLd {
  
  inline def apply(
    mainEntity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Question */ Any
  ): Builder = {
    val __props = js.Dynamic.literal(mainEntity = mainEntity.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[QAPageJsonLdProps]))
  }
  
  @JSImport("next-seo", "QAPageJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: QAPageJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
