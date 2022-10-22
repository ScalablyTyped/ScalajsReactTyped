package typingsJapgolly.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Presents an item._
  * @see https://docs.scriptable.app/quicklook
  */
object QuickLook {
  
  @JSGlobal("QuickLook")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Presents the item._
    *
    * Chooses the best suited presentation of the item and performs the presentation if possible.
    * @param item - Item to be present.
    * @param fullscreen - Optional. Set to true to present the item in fullscreen. This only has an effect when used within the app. Defaults to false.
    * @see https://docs.scriptable.app/quicklook/#present
    */
  inline def present(item: Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("present")(item.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def present(item: Any, fullscreen: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("present")(item.asInstanceOf[js.Any], fullscreen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
