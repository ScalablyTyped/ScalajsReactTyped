package typingsJapgolly.victoryCore.esMod

import typingsJapgolly.react.mod.Context
import typingsJapgolly.victoryCore.anon.AnimationTimer
import typingsJapgolly.victoryCore.anon.Delay
import typingsJapgolly.victoryCore.anon.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("victory-core/es", "VictoryAnimation")
@js.native
open class VictoryAnimation protected ()
  extends typingsJapgolly.victoryCore.esVictoryAnimationVictoryAnimationMod.VictoryAnimation {
  def this(props: Any, context: Any) = this()
}
/* static members */
object VictoryAnimation {
  
  @JSImport("victory-core/es", "VictoryAnimation")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "VictoryAnimation.contextType")
  @js.native
  def contextType: Context[AnimationTimer] = js.native
  inline def contextType_=(x: Context[AnimationTimer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryAnimation.defaultProps")
  @js.native
  def defaultProps: Duration = js.native
  inline def defaultProps_=(x: Duration): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryAnimation.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryAnimation.propTypes")
  @js.native
  def propTypes: Delay = js.native
  inline def propTypes_=(x: Delay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
