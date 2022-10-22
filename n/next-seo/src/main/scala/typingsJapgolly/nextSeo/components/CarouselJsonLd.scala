package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldCarouselMod.CarouselJsonLdProps
import typingsJapgolly.nextSeo.libJsonldCarouselMod.DefaultDataProps
import typingsJapgolly.nextSeo.libJsonldCarouselMod.ExtendedCourseJsonLdProps
import typingsJapgolly.nextSeo.libJsonldCarouselMod.ExtendedRecipeJsonLdProps
import typingsJapgolly.nextSeo.libJsonldCarouselMod.MovieJsonLdProps
import typingsJapgolly.nextSeo.nextSeoStrings.course
import typingsJapgolly.nextSeo.nextSeoStrings.default
import typingsJapgolly.nextSeo.nextSeoStrings.movie
import typingsJapgolly.nextSeo.nextSeoStrings.recipe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CarouselJsonLd {
  
  inline def apply(
    data: Any | (js.Array[
      DefaultDataProps | ExtendedCourseJsonLdProps | ExtendedRecipeJsonLdProps | MovieJsonLdProps
    ]),
    ofType: default | movie | recipe | course
  ): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ofType = ofType.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CarouselJsonLdProps]))
  }
  
  @JSImport("next-seo", "CarouselJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CarouselJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
