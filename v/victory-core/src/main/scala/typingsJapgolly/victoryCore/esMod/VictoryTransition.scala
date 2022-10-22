package typingsJapgolly.victoryCore.esMod

import typingsJapgolly.react.mod.Context
import typingsJapgolly.victoryCore.anon.Animate
import typingsJapgolly.victoryCore.anon.AnimationTimer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("victory-core/es", "VictoryTransition")
@js.native
open class VictoryTransition protected ()
  extends typingsJapgolly.victoryCore.esVictoryTransitionVictoryTransitionMod.VictoryTransition {
  def this(props: Any, context: Any) = this()
}
/* static members */
object VictoryTransition {
  
  @JSImport("victory-core/es", "VictoryTransition")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "VictoryTransition.contextType")
  @js.native
  def contextType: Context[AnimationTimer] = js.native
  inline def contextType_=(x: Context[AnimationTimer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryTransition.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryTransition.propTypes")
  @js.native
  def propTypes: Animate = js.native
  inline def propTypes_=(x: Animate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
