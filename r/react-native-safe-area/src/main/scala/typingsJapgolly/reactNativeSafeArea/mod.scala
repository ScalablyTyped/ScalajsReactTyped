package typingsJapgolly.reactNativeSafeArea

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.absolutePosition
import typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.contentInset
import typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.margin
import typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.padding
import typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.safeAreaInsetsForRootViewDidChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-safe-area", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-safe-area", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SafeArea
  /* static members */
  object default {
    
    @JSImport("react-native-safe-area", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def addEventListener(eventType: EventType, listener: js.Function1[/* payload */ EventPayload, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(eventType.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getSafeAreaInsetsForRootView(): js.Promise[EventPayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSafeAreaInsetsForRootView")().asInstanceOf[js.Promise[EventPayload]]
    
    inline def removeEventListener(eventType: EventType, listener: js.Function1[/* payload */ EventPayload, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(eventType.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def withSafeArea[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: margin | padding | absolutePosition | contentInset,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSafeArea")(WrappedComponent.asInstanceOf[js.Any], applyTo.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  // from `withSafeArea.js`
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.top
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottom
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.left
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.right
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.topLeft
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndLeft
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.topRight
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndRight
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomLeft
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndLeft
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomRight
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndRight
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.vertical
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontal
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndLeft
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndRight
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndTop
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndBottom
    - typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.all
  */
  trait Direction extends StObject
  object Direction {
    
    inline def all: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.all = "all".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.all]
    
    inline def bottom: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottom]
    
    inline def bottomAndLeft: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndLeft = "bottomAndLeft".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndLeft]
    
    inline def bottomAndRight: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndRight = "bottomAndRight".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndRight]
    
    inline def bottomLeft: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomLeft]
    
    inline def bottomRight: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomRight = "bottomRight".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomRight]
    
    inline def horizontal: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontal]
    
    inline def horizontalAndBottom: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndBottom = "horizontalAndBottom".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndBottom]
    
    inline def horizontalAndTop: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndTop = "horizontalAndTop".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndTop]
    
    inline def left: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.left = "left".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.left]
    
    inline def right: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.right = "right".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.right]
    
    inline def top: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.top = "top".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.top]
    
    inline def topAndLeft: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndLeft = "topAndLeft".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndLeft]
    
    inline def topAndRight: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndRight = "topAndRight".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndRight]
    
    inline def topLeft: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.topLeft = "topLeft".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.topLeft]
    
    inline def topRight: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.topRight = "topRight".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.topRight]
    
    inline def vertical: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.vertical]
    
    inline def verticalAndLeft: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndLeft = "verticalAndLeft".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndLeft]
    
    inline def verticalAndRight: typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndRight = "verticalAndRight".asInstanceOf[typingsJapgolly.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndRight]
  }
  
  trait EventPayload extends StObject {
    
    var safeAreaInsets: SafeAreaInsets
  }
  object EventPayload {
    
    inline def apply(safeAreaInsets: SafeAreaInsets): EventPayload = {
      val __obj = js.Dynamic.literal(safeAreaInsets = safeAreaInsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPayload]
    }
    
    extension [Self <: EventPayload](x: Self) {
      
      inline def setSafeAreaInsets(value: SafeAreaInsets): Self = StObject.set(x, "safeAreaInsets", value.asInstanceOf[js.Any])
    }
  }
  
  type EventType = safeAreaInsetsForRootViewDidChange
  
  trait SafeArea extends StObject
  
  // from `TypeDefinition.js`
  trait SafeAreaInsets extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object SafeAreaInsets {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): SafeAreaInsets = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafeAreaInsets]
    }
    
    extension [Self <: SafeAreaInsets](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
