package typingsJapgolly.antDesignPro.components

import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from PropsI because couldn't resolve ClassTree. */
object Base {
  
  def apply[PropsI](p: PropsI): Builder[PropsI] = new Builder[PropsI](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("ant-design-pro/lib/Charts/bizcharts", "Annotation.Base")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[PropsI] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.libChartsBizchartsMod.Annotation.Base[PropsI]]
  
  implicit def make[PropsI](companion: Base.type): Builder[PropsI] = new Builder[PropsI](js.Array(this.component, js.Dictionary.empty))()
}
