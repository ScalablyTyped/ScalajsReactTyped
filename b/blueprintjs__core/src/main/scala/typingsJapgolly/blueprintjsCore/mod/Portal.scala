package typingsJapgolly.blueprintjsCore.mod

import typingsJapgolly.blueprintjsCore.anon.PartialPortalProps
import typingsJapgolly.blueprintjsCore.anon.ValidationMapPortalLegacy
import typingsJapgolly.blueprintjsCore.libEsmComponentsPortalPortalMod.PortalProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Portal")
@js.native
open class Portal protected ()
  extends typingsJapgolly.blueprintjsCore.libEsmComponentsMod.Portal {
  def this(props: PortalProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: PortalProps, context: Any) = this()
}
/* static members */
object Portal {
  
  @JSImport("@blueprintjs/core", "Portal")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Portal.contextTypes")
  @js.native
  def contextTypes: ValidationMapPortalLegacy = js.native
  inline def contextTypes_=(x: ValidationMapPortalLegacy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Portal.defaultProps")
  @js.native
  def defaultProps: PartialPortalProps = js.native
  inline def defaultProps_=(x: PartialPortalProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Portal.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
