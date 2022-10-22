package typingsJapgolly.reactSelect.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSelect.distDeclarationsSrcAnimatedTransitionsMod.CollapseProps
import typingsJapgolly.reactTransitionGroup.transitionMod.ExitHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapse {
  
  @JSImport("react-select/dist/declarations/src/animated/transitions", "Collapse")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactSelect.distDeclarationsSrcAnimatedTransitionsMod.Collapse] {
    
    inline def in(value: Boolean): this.type = set("in", value.asInstanceOf[js.Any])
    
    inline def onExited(value: ExitHandler[js.UndefOr[HTMLElement]]): this.type = set("onExited", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Collapse.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CollapseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
