package typingsJapgolly.storybookReactNative

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.storybookReactNative.anon.IsUIVisible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPreviewComponentsOnDeviceUINavigationMod {
  
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation", JSImport.Default)
  @js.native
  open class default () extends Navigation
  
  @js.native
  trait Navigation
    extends PureComponent[Props, js.Object, Any] {
    
    def handleSwipeLeft(): Unit = js.native
    
    def handleSwipeRight(): Unit = js.native
    
    def handleToggleUI(): Unit = js.native
    
    @JSName("state")
    var state_Navigation: IsUIVisible = js.native
  }
  
  trait Props extends StObject {
    
    var initialUiVisible: js.UndefOr[Boolean] = js.undefined
    
    def onChangeTab(index: Double): Unit
    
    var tabOpen: Double
  }
  object Props {
    
    inline def apply(onChangeTab: Double => Callback, tabOpen: Double): Props = {
      val __obj = js.Dynamic.literal(onChangeTab = js.Any.fromFunction1((t0: Double) => onChangeTab(t0).runNow()), tabOpen = tabOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setInitialUiVisible(value: Boolean): Self = StObject.set(x, "initialUiVisible", value.asInstanceOf[js.Any])
      
      inline def setInitialUiVisibleUndefined: Self = StObject.set(x, "initialUiVisible", js.undefined)
      
      inline def setOnChangeTab(value: Double => Callback): Self = StObject.set(x, "onChangeTab", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setTabOpen(value: Double): Self = StObject.set(x, "tabOpen", value.asInstanceOf[js.Any])
    }
  }
}
