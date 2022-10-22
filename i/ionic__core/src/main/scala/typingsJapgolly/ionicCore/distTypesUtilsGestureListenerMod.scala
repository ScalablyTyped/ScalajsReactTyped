package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.anon.Capture
import typingsJapgolly.std.EventListenerOrEventListenerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsGestureListenerMod {
  
  @JSImport("@ionic/core/dist/types/utils/gesture/listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEventListener(el: Any, eventName: String, callback: EventListenerOrEventListenerObject, opts: Capture): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(el.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
