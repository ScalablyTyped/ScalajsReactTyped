package typingsJapgolly.victoryCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryCore.esVictoryTransitionVictoryTransitionMod.VictoryTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryTransition {
  
  @JSImport("victory-core/es", "VictoryTransition")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryCore.esMod.VictoryTransition] {
    
    inline def animate(value: Boolean | Any): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def animationWhitelist(value: js.Array[String]): this.type = set("animationWhitelist", value.asInstanceOf[js.Any])
    
    inline def animationWhitelistVarargs(value: String*): this.type = set("animationWhitelist", js.Array(value*))
  }
  
  implicit def make(companion: VictoryTransition.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryTransitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
