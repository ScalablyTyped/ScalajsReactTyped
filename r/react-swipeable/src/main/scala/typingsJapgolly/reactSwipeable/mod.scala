package typingsJapgolly.reactSwipeable

import typingsJapgolly.reactSwipeable.esTypesMod.SwipeableHandlers
import typingsJapgolly.reactSwipeable.esTypesMod.SwipeableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-swipeable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-swipeable", "DOWN")
  @js.native
  val DOWN: /* "Down" */ String = js.native
  
  @JSImport("react-swipeable", "LEFT")
  @js.native
  val LEFT: /* "Left" */ String = js.native
  
  @JSImport("react-swipeable", "RIGHT")
  @js.native
  val RIGHT: /* "Right" */ String = js.native
  
  @JSImport("react-swipeable", "UP")
  @js.native
  val UP: /* "Up" */ String = js.native
  
  inline def useSwipeable(options: SwipeableProps): SwipeableHandlers = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwipeable")(options.asInstanceOf[js.Any]).asInstanceOf[SwipeableHandlers]
}
