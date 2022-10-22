package typingsJapgolly.reactNativeReanimated

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeReanimated.anon.Component
import typingsJapgolly.reactNativeReanimated.anon.SetAttribute
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedStyle
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.StyleProps
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2JsReanimatedMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/js-reanimated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/js-reanimated", JSImport.Default)
  @js.native
  val default: typingsJapgolly.reactNativeReanimated.libTypesReanimated2JsReanimatedJsreanimatedMod.default = js.native
  
  inline def updatePropsJS(updates: AnimatedStyle, viewRef: Component): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_updatePropsJS")(updates.asInstanceOf[js.Any], viewRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updatePropsJS(updates: StyleProps, viewRef: Component): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_updatePropsJS")(updates.asInstanceOf[js.Any], viewRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait JSReanimatedComponent extends StObject {
    
    var _touchableNode: SetAttribute
    
    var previousStyle: StyleProps
    
    var props: Record[String, String | Double]
    
    def setNativeProps(style: StyleProps): Unit
  }
  object JSReanimatedComponent {
    
    inline def apply(
      _touchableNode: SetAttribute,
      previousStyle: StyleProps,
      props: Record[String, String | Double],
      setNativeProps: StyleProps => Callback
    ): JSReanimatedComponent = {
      val __obj = js.Dynamic.literal(_touchableNode = _touchableNode.asInstanceOf[js.Any], previousStyle = previousStyle.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], setNativeProps = js.Any.fromFunction1((t0: StyleProps) => setNativeProps(t0).runNow()))
      __obj.asInstanceOf[JSReanimatedComponent]
    }
    
    extension [Self <: JSReanimatedComponent](x: Self) {
      
      inline def setPreviousStyle(value: StyleProps): Self = StObject.set(x, "previousStyle", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Record[String, String | Double]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setSetNativeProps(value: StyleProps => Callback): Self = StObject.set(x, "setNativeProps", js.Any.fromFunction1((t0: StyleProps) => value(t0).runNow()))
      
      inline def set_touchableNode(value: SetAttribute): Self = StObject.set(x, "_touchableNode", value.asInstanceOf[js.Any])
    }
  }
}
