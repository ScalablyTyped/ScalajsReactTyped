package typingsJapgolly.victorySelectionContainer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.victorySelectionContainer.anon.X
import typingsJapgolly.victorySelectionContainer.esMod.PointsInterface
import typingsJapgolly.victorySelectionContainer.esMod.VictorySelectionContainerProps
import typingsJapgolly.victorySelectionContainer.victorySelectionContainerStrings.x
import typingsJapgolly.victorySelectionContainer.victorySelectionContainerStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictorySelectionContainer {
  
  @JSImport("victory-selection-container/es", "VictorySelectionContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victorySelectionContainer.esMod.VictorySelectionContainer] {
    
    inline def activateSelectedData(value: Boolean): this.type = set("activateSelectedData", value.asInstanceOf[js.Any])
    
    inline def allowSelection(value: Boolean): this.type = set("allowSelection", value.asInstanceOf[js.Any])
    
    inline def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    
    inline def onSelection(
      value: (/* points */ js.Array[PointsInterface], /* bounds */ js.Array[X], VictorySelectionContainerProps) => Callback
    ): this.type = set("onSelection", js.Any.fromFunction3((t0: /* points */ js.Array[PointsInterface], t1: /* bounds */ js.Array[X], t2: VictorySelectionContainerProps) => (value(t0, t1, t2)).runNow()))
    
    inline def onSelectionCleared(value: VictorySelectionContainerProps => Callback): this.type = set("onSelectionCleared", js.Any.fromFunction1((t0: VictorySelectionContainerProps) => value(t0).runNow()))
    
    inline def selectionBlacklist(value: js.Array[String]): this.type = set("selectionBlacklist", value.asInstanceOf[js.Any])
    
    inline def selectionBlacklistVarargs(value: String*): this.type = set("selectionBlacklist", js.Array(value*))
    
    inline def selectionComponent(value: VdomElement): this.type = set("selectionComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def selectionDimension(value: x | y): this.type = set("selectionDimension", value.asInstanceOf[js.Any])
    
    inline def selectionStyle(value: CSSProperties): this.type = set("selectionStyle", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictorySelectionContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictorySelectionContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
