package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldRecipeMod.RecipeJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RecipeJsonLd {
  
  inline def apply(
    authorName: String | js.Array[String],
    description: String,
    ingredients: js.Array[String],
    instructions: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Instruction */ Any
    ],
    name: String
  ): Builder = {
    val __props = js.Dynamic.literal(authorName = authorName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], ingredients = ingredients.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[RecipeJsonLdProps]))
  }
  
  @JSImport("next-seo", "RecipeJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def aggregateRating(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateRating */ Any
    ): this.type = set("aggregateRating", value.asInstanceOf[js.Any])
    
    inline def calories(value: Double): this.type = set("calories", value.asInstanceOf[js.Any])
    
    inline def category(value: String): this.type = set("category", value.asInstanceOf[js.Any])
    
    inline def cookTime(value: String): this.type = set("cookTime", value.asInstanceOf[js.Any])
    
    inline def cuisine(value: String): this.type = set("cuisine", value.asInstanceOf[js.Any])
    
    inline def datePublished(value: String): this.type = set("datePublished", value.asInstanceOf[js.Any])
    
    inline def images(value: js.Array[String]): this.type = set("images", value.asInstanceOf[js.Any])
    
    inline def imagesVarargs(value: String*): this.type = set("images", js.Array(value*))
    
    inline def keywords(value: String): this.type = set("keywords", value.asInstanceOf[js.Any])
    
    inline def prepTime(value: String): this.type = set("prepTime", value.asInstanceOf[js.Any])
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def totalTime(value: String): this.type = set("totalTime", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def video(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Video */ Any
    ): this.type = set("video", value.asInstanceOf[js.Any])
    
    inline def yields(value: String): this.type = set("yields", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: RecipeJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
