package typingsJapgolly.reactRemoveScroll

import org.scalajs.dom.TouchEvent
import typingsJapgolly.react.mod.Touch
import typingsJapgolly.reactRemoveScroll.anon.Action
import typingsJapgolly.reactRemoveScroll.anon.Coords
import typingsJapgolly.reactRemoveScroll.reactRemoveScrollBooleans.`false`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5PinchAndZoomMod {
  
  @JSImport("react-remove-scroll/dist/es5/pinchAndZoom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pinchOrZoom(event: TouchEvent, cache: Record[Double, Touch]): `false` | Action | Coords = (^.asInstanceOf[js.Dynamic].applyDynamic("pinchOrZoom")(event.asInstanceOf[js.Any], cache.asInstanceOf[js.Any])).asInstanceOf[`false` | Action | Coords]
}
