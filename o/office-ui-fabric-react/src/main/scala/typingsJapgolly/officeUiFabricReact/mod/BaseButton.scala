package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.anon.PartialIBaseButtonProps
import typingsJapgolly.officeUiFabricReact.libComponentsButtonBaseButtonMod.IBaseButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "BaseButton")
@js.native
open class BaseButton protected ()
  extends typingsJapgolly.officeUiFabricReact.libButtonMod.BaseButton {
  def this(props: IBaseButtonProps) = this()
}
/* static members */
object BaseButton {
  
  @JSImport("office-ui-fabric-react", "BaseButton")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "BaseButton.defaultProps")
  @js.native
  def defaultProps: PartialIBaseButtonProps = js.native
  inline def defaultProps_=(x: PartialIBaseButtonProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
