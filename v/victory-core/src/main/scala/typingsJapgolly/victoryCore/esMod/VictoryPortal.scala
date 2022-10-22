package typingsJapgolly.victoryCore.esMod

import typingsJapgolly.react.mod.Context
import typingsJapgolly.victoryCore.anon.GroupComponent
import typingsJapgolly.victoryCore.anon.GroupComponentElement
import typingsJapgolly.victoryCore.esVictoryPortalPortalContextMod.PortalContextValue
import typingsJapgolly.victoryCore.esVictoryPortalVictoryPortalMod.VictoryPortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("victory-core/es", "VictoryPortal")
@js.native
open class VictoryPortal protected ()
  extends typingsJapgolly.victoryCore.esVictoryPortalVictoryPortalMod.VictoryPortal {
  def this(props: VictoryPortalProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: VictoryPortalProps, context: Any) = this()
}
/* static members */
object VictoryPortal {
  
  @JSImport("victory-core/es", "VictoryPortal")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "VictoryPortal.contextType")
  @js.native
  def contextType: Context[PortalContextValue] = js.native
  inline def contextType_=(x: Context[PortalContextValue]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryPortal.defaultProps")
  @js.native
  def defaultProps: GroupComponentElement = js.native
  inline def defaultProps_=(x: GroupComponentElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryPortal.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryPortal.propTypes")
  @js.native
  def propTypes: GroupComponent = js.native
  inline def propTypes_=(x: GroupComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryPortal.role")
  @js.native
  def role: String = js.native
  inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
}
