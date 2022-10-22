package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldHowToMod.HowToJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HowToJsonLd {
  
  inline def apply(
    name: String,
    step: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Step */ Any
    ]
  ): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[HowToJsonLdProps]))
  }
  
  @JSImport("next-seo", "HowToJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def estimatedCost(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PriceSpecification */ Any
    ): this.type = set("estimatedCost", value.asInstanceOf[js.Any])
    
    inline def image(value: String): this.type = set("image", value.asInstanceOf[js.Any])
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def supply(value: js.Array[String]): this.type = set("supply", value.asInstanceOf[js.Any])
    
    inline def supplyVarargs(value: String*): this.type = set("supply", js.Array(value*))
    
    inline def tool(value: js.Array[String]): this.type = set("tool", value.asInstanceOf[js.Any])
    
    inline def toolVarargs(value: String*): this.type = set("tool", js.Array(value*))
    
    inline def totalTime(value: String): this.type = set("totalTime", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HowToJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
