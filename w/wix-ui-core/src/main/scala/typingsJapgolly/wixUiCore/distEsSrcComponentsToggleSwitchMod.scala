package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.TabIndex
import typingsJapgolly.wixUiCore.distEsSrcComponentsToggleSwitchToggleSwitchMod.ToggleSwitchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsToggleSwitchMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/toggle-switch", "ToggleSwitch")
  @js.native
  open class ToggleSwitch protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsToggleSwitchToggleSwitchMod.ToggleSwitch {
    def this(props: ToggleSwitchProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ToggleSwitchProps, context: Any) = this()
  }
  /* static members */
  object ToggleSwitch {
    
    @JSImport("wix-ui-core/dist/es/src/components/toggle-switch", "ToggleSwitch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/toggle-switch", "ToggleSwitch.defaultProps")
    @js.native
    def defaultProps: TabIndex = js.native
    inline def defaultProps_=(x: TabIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/toggle-switch", "ToggleSwitch.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
