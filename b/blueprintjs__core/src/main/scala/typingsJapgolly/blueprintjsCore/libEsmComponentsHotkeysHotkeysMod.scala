package typingsJapgolly.blueprintjsCore

import typingsJapgolly.blueprintjsCore.anon.IHotkeysPropschildrenReac
import typingsJapgolly.blueprintjsCore.anon.TabIndex
import typingsJapgolly.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysTypesMod.IHotkeysProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsHotkeysHotkeysMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeys", "Hotkeys")
  @js.native
  open class Hotkeys protected ()
    extends AbstractPureComponent2[IHotkeysProps, js.Object, js.Object] {
    def this(props: IHotkeysProps) = this()
    def this(props: IHotkeysProps, context: Any) = this()
    
    /* protected */ def validateProps(props: IHotkeysPropschildrenReac): Unit = js.native
  }
  /* static members */
  object Hotkeys {
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeys", "Hotkeys")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeys", "Hotkeys.defaultProps")
    @js.native
    def defaultProps: TabIndex = js.native
    inline def defaultProps_=(x: TabIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys/hotkeys", "Hotkeys.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
