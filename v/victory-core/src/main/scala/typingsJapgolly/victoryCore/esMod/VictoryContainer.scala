package typingsJapgolly.victoryCore.esMod

import typingsJapgolly.react.mod.Context
import typingsJapgolly.victoryCore.anon.Arialabelledby
import typingsJapgolly.victoryCore.anon.PortalComponent
import typingsJapgolly.victoryCore.anon.TransitionTimer
import typingsJapgolly.victoryCore.esVictoryContainerVictoryContainerMod.VictoryContainerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("victory-core/es", "VictoryContainer")
@js.native
open class VictoryContainer protected ()
  extends typingsJapgolly.victoryCore.esVictoryContainerVictoryContainerMod.VictoryContainer {
  def this(props: VictoryContainerProps) = this()
}
/* static members */
object VictoryContainer {
  
  @JSImport("victory-core/es", "VictoryContainer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "VictoryContainer.contextType")
  @js.native
  def contextType: Context[TransitionTimer] = js.native
  inline def contextType_=(x: Context[TransitionTimer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryContainer.defaultProps")
  @js.native
  def defaultProps: PortalComponent = js.native
  inline def defaultProps_=(x: PortalComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryContainer.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryContainer.propTypes")
  @js.native
  def propTypes: Arialabelledby = js.native
  inline def propTypes_=(x: Arialabelledby): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryContainer.role")
  @js.native
  def role: String = js.native
  inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
}
