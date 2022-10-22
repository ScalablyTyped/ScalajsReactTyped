package typingsJapgolly.reactNativeMaps

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ContextType
import typingsJapgolly.reactNative.mod.NativeSyntheticEvent
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeMaps.anon.Action
import typingsJapgolly.reactNativeMaps.libDecorateMapComponentMod.MapManagerCommand
import typingsJapgolly.reactNativeMaps.libDecorateMapComponentMod.NativeComponent
import typingsJapgolly.reactNativeMaps.libDecorateMapComponentMod.UIManagerCommand
import typingsJapgolly.reactNativeMaps.libSharedTypesMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapCalloutSubviewMod {
  
  /* was `typeof MapCalloutSubview` */
  @JSImport("react-native-maps/lib/MapCalloutSubview", JSImport.Default)
  @js.native
  open class default () extends MapCalloutSubview
  
  @JSImport("react-native-maps/lib/MapCalloutSubview", "MapCalloutSubview")
  @js.native
  open class MapCalloutSubview protected ()
    extends Component[MapCalloutSubviewProps, js.Object, Any] {
    def this(props: MapCalloutSubviewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MapCalloutSubviewProps, context: Any) = this()
    
    @JSName("context")
    var context_MapCalloutSubview: ContextType[Context[Provider]] = js.native
    
    def getMapManagerCommand(name: String): MapManagerCommand = js.native
    
    def getNativeComponent(): NativeComponent[NativeProps] = js.native
    
    def getUIManagerCommand(name: String): UIManagerCommand = js.native
  }
  
  type CalloutSubviewPressEvent = NativeSyntheticEvent[Action]
  
  trait MapCalloutSubviewProps
    extends StObject
       with ViewProps {
    
    /**
      * Callback that is called when the user presses on this subview inside callout
      *
      * @platform iOS: Supported
      * @platform Android: Not supported
      */
    var onPress: js.UndefOr[js.Function1[/* event */ CalloutSubviewPressEvent, Unit]] = js.undefined
  }
  object MapCalloutSubviewProps {
    
    inline def apply(): MapCalloutSubviewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapCalloutSubviewProps]
    }
    
    extension [Self <: MapCalloutSubviewProps](x: Self) {
      
      inline def setOnPress(value: /* event */ CalloutSubviewPressEvent => Callback): Self = StObject.set(x, "onPress", js.Any.fromFunction1((t0: /* event */ CalloutSubviewPressEvent) => value(t0).runNow()))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    }
  }
  
  type NativeProps = MapCalloutSubviewProps
  
  /* was `typeof MapCalloutSubview` */
  type _default = MapCalloutSubview
}
