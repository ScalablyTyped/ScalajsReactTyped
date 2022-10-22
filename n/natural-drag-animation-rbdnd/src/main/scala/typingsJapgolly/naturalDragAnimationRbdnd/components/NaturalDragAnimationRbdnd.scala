package typingsJapgolly.naturalDragAnimationRbdnd.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.naturalDragAnimationRbdnd.mod.NaturalDragAnimationType
import typingsJapgolly.naturalDragAnimationRbdnd.mod.default
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactBeautifulDnd.mod.DraggableStateSnapshot
import typingsJapgolly.reactBeautifulDnd.mod.DraggingStyle
import typingsJapgolly.reactBeautifulDnd.mod.NotDraggingStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NaturalDragAnimationRbdnd {
  
  inline def apply(children: CSSProperties => Node, snapshot: DraggableStateSnapshot): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), snapshot = snapshot.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NaturalDragAnimationType]))
  }
  
  @JSImport("natural-drag-animation-rbdnd", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def animationRotationFade(value: Double): this.type = set("animationRotationFade", value.asInstanceOf[js.Any])
    
    inline def rotationMultiplier(value: Double): this.type = set("rotationMultiplier", value.asInstanceOf[js.Any])
    
    inline def sigmoidFunction(value: /* x */ Double => Double): this.type = set("sigmoidFunction", js.Any.fromFunction1(value))
    
    inline def style(value: DraggingStyle | NotDraggingStyle): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NaturalDragAnimationType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
