package typingsJapgolly.reactNativeMaps

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeMaps.libDecorateMapComponentMod.MapManagerCommand
import typingsJapgolly.reactNativeMaps.libDecorateMapComponentMod.NativeComponent
import typingsJapgolly.reactNativeMaps.libDecorateMapComponentMod.UIManagerCommand
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.CalloutPressEvent
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapCalloutMod {
  
  /* was `typeof MapCallout` */
  @JSImport("react-native-maps/lib/MapCallout", JSImport.Default)
  @js.native
  open class default () extends MapCallout
  
  @JSImport("react-native-maps/lib/MapCallout", "MapCallout")
  @js.native
  open class MapCallout protected ()
    extends Component[MapCalloutProps, js.Object, Any] {
    def this(props: MapCalloutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MapCalloutProps, context: Any) = this()
    
    @JSName("context")
    var context_MapCallout: ContextType[Context[Provider]] = js.native
    
    def getMapManagerCommand(name: String): MapManagerCommand = js.native
    
    def getNativeComponent(): NativeComponent[NativeProps] = js.native
    
    def getUIManagerCommand(name: String): UIManagerCommand = js.native
  }
  
  trait MapCalloutProps
    extends StObject
       with ViewProps {
    
    /**
      * If `true`, clicks on transparent areas in callout will be passed to map.
      *
      * @default false
      * @platform iOS: Supported
      * @platform Android: Not supported
      */
    var alphaHitTest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback that is called when the user presses on the callout
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var onPress: js.UndefOr[js.Function1[/* event */ CalloutPressEvent, Unit]] = js.undefined
    
    /**
      * If `false`, a default "tooltip" bubble window will be drawn around this callouts children.
      * If `true`, the child views can fully customize their appearance, including any "bubble" like styles.
      *
      * @default false
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var tooltip: js.UndefOr[Boolean] = js.undefined
  }
  object MapCalloutProps {
    
    inline def apply(): MapCalloutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapCalloutProps]
    }
    
    extension [Self <: MapCalloutProps](x: Self) {
      
      inline def setAlphaHitTest(value: Boolean): Self = StObject.set(x, "alphaHitTest", value.asInstanceOf[js.Any])
      
      inline def setAlphaHitTestUndefined: Self = StObject.set(x, "alphaHitTest", js.undefined)
      
      inline def setOnPress(value: /* event */ CalloutPressEvent => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: /* event */ CalloutPressEvent) => value(t0).runNow()))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type NativeProps = MapCalloutProps
  
  /* was `typeof MapCallout` */
  type _default = MapCallout
}
