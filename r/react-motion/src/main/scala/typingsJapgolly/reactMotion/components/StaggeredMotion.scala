package typingsJapgolly.reactMotion.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMotion.mod.PlainStyle
import typingsJapgolly.reactMotion.mod.StaggeredMotionProps
import typingsJapgolly.reactMotion.mod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StaggeredMotion {
  
  inline def apply(children: Any => Element, styles: js.UndefOr[js.Array[PlainStyle]] => js.Array[Style]): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), styles = js.Any.fromFunction1(styles))
    new Builder(js.Array(this.component, __props.asInstanceOf[StaggeredMotionProps]))
  }
  
  @JSImport("react-motion", "StaggeredMotion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMotion.mod.StaggeredMotion] {
    
    inline def defaultStyles(value: js.Array[PlainStyle]): this.type = set("defaultStyles", value.asInstanceOf[js.Any])
    
    inline def defaultStylesVarargs(value: PlainStyle*): this.type = set("defaultStyles", js.Array(value*))
  }
  
  def withProps(p: StaggeredMotionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
