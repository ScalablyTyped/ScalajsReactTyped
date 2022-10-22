package typingsJapgolly.victoryCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryCore.esVictoryAnimationVictoryAnimationMod.AnimationData
import typingsJapgolly.victoryCore.esVictoryAnimationVictoryAnimationMod.AnimationEasing
import typingsJapgolly.victoryCore.esVictoryAnimationVictoryAnimationMod.AnimationInfo
import typingsJapgolly.victoryCore.esVictoryAnimationVictoryAnimationMod.AnimationStyle
import typingsJapgolly.victoryCore.esVictoryAnimationVictoryAnimationMod.VictoryAnimationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryAnimation {
  
  inline def apply(children: (AnimationStyle, AnimationInfo) => Node, data: AnimationData): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VictoryAnimationProps]))
  }
  
  @JSImport("victory-core/es", "VictoryAnimation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryCore.esMod.VictoryAnimation] {
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def easing(value: AnimationEasing): this.type = set("easing", value.asInstanceOf[js.Any])
    
    inline def onEnd(value: Callback): this.type = set("onEnd", value.toJsFn)
  }
  
  def withProps(p: VictoryAnimationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
