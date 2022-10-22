package typingsJapgolly.storybookReactNative

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.storybookAddons.distTs3Dot9Mod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPreviewComponentsOnDeviceUIAddonsListMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/list", JSImport.Default)
  @js.native
  open class default () extends AddonList
  
  @js.native
  trait AddonList
    extends PureComponent[Props, js.Object, Any] {
    
    def renderTab(id: String, title: String): Element = js.native
  }
  
  trait Props extends StObject {
    
    var addonSelected: String
    
    def onPressAddon(id: String): Unit
    
    var panels: Collection
  }
  object Props {
    
    inline def apply(addonSelected: String, onPressAddon: String => Callback, panels: Collection): Props = {
      val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], onPressAddon = js.Any.fromFunction1((t0: String) => onPressAddon(t0).runNow()), panels = panels.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAddonSelected(value: String): Self = StObject.set(x, "addonSelected", value.asInstanceOf[js.Any])
      
      inline def setOnPressAddon(value: String => Callback): Self = StObject.set(x, "onPressAddon", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setPanels(value: Collection): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    }
  }
}
