package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesTestimonialListMod.TestimonialListProps
import typingsJapgolly.wixStyleReact.distTypesTestimonialListMod.TestimonialType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TestimonialList {
  
  @JSImport("wix-style-react", "TestimonialList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.TestimonialList] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def testimonials(value: js.Array[TestimonialType]): this.type = set("testimonials", value.asInstanceOf[js.Any])
    
    inline def testimonialsVarargs(value: TestimonialType*): this.type = set("testimonials", js.Array(value*))
  }
  
  implicit def make(companion: TestimonialList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TestimonialListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
