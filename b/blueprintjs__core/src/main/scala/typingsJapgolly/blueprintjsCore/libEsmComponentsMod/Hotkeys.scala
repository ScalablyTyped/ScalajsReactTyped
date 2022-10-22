package typingsJapgolly.blueprintjsCore.libEsmComponentsMod

import typingsJapgolly.blueprintjsCore.anon.TabIndex
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysTypesMod.IHotkeysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Hotkeys")
@js.native
open class Hotkeys protected ()
  extends typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysMod.Hotkeys {
  def this(props: IHotkeysProps) = this()
  def this(props: IHotkeysProps, context: Any) = this()
}
/* static members */
object Hotkeys {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Hotkeys")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Hotkeys.defaultProps")
  @js.native
  def defaultProps: TabIndex = js.native
  inline def defaultProps_=(x: TabIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Hotkeys.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
