package typingsJapgolly.atvlegacycontentkit

import japgolly.scalajs.react.Callback
import typingsJapgolly.atvlegacycontentkit.atv.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Functions to do with the currently playing item.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVNowPlaying extends StObject {
  
  /**
    * Get the element containing the currently playing asset.
    * @param callback The callback containing the element as an argument.
    */
  def currentAsset(callback: js.Function1[/* element */ Element, Unit]): Unit
  
  /**
    * Return to the player view for the currently played item if it has been closed.
    */
  def showNowPlaying(): Unit
}
object ATVNowPlaying {
  
  inline def apply(currentAsset: js.Function1[/* element */ Element, Unit] => Callback, showNowPlaying: Callback): ATVNowPlaying = {
    val __obj = js.Dynamic.literal(currentAsset = js.Any.fromFunction1((t0: js.Function1[/* element */ Element, Unit]) => currentAsset(t0).runNow()), showNowPlaying = showNowPlaying.toJsFn)
    __obj.asInstanceOf[ATVNowPlaying]
  }
  
  extension [Self <: ATVNowPlaying](x: Self) {
    
    inline def setCurrentAsset(value: js.Function1[/* element */ Element, Unit] => Callback): Self = StObject.set(x, "currentAsset", js.Any.fromFunction1((t0: js.Function1[/* element */ Element, Unit]) => value(t0).runNow()))
    
    inline def setShowNowPlaying(value: Callback): Self = StObject.set(x, "showNowPlaying", value.toJsFn)
  }
}
