package typingsJapgolly.storybookReactNative

import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.storybookAddons.distTs3Dot9Mod.Collection
import typingsJapgolly.storybookReactNative.anon.AddonSelected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPreviewComponentsOnDeviceUIAddonsWrapperMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/wrapper", JSImport.Default)
  @js.native
  open class default () extends Wrapper
  /* static members */
  object default {
    
    @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/wrapper", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/wrapper", "default.defaultProps")
    @js.native
    def defaultProps: AddonSelected = js.native
    inline def defaultProps_=(x: AddonSelected): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait Props extends StObject {
    
    var addonSelected: String
    
    var panels: Collection
  }
  object Props {
    
    inline def apply(addonSelected: String, panels: Collection): Props = {
      val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAddonSelected(value: String): Self = StObject.set(x, "addonSelected", value.asInstanceOf[js.Any])
      
      inline def setPanels(value: Collection): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Wrapper
    extends PureComponent[Props, js.Object, Any]
}
