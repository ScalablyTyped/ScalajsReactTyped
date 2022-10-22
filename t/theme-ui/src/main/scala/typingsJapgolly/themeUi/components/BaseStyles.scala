package typingsJapgolly.themeUi.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.std.Record
import typingsJapgolly.themeUi.anon.Sx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseStyles {
  
  @JSImport("theme-ui", "BaseStyles")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def sx(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeUIStyleObject */ Any
    ): this.type = set("sx", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: BaseStyles.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: (Record[String, Any]) & Sx): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
