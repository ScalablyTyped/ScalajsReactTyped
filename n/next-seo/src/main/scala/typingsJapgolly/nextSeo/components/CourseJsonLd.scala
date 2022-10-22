package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldCourseMod.CourseJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CourseJsonLd {
  
  inline def apply(
    courseName: String,
    description: String,
    provider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Provider */ Any
  ): Builder = {
    val __props = js.Dynamic.literal(courseName = courseName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CourseJsonLdProps]))
  }
  
  @JSImport("next-seo", "CourseJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CourseJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
