package typingsJapgolly.chrome.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.wallpaper.WallpaperDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofwallpaper extends StObject {
  
  def setWallpaper(
    details: WallpaperDetails,
    callback: js.Function1[/* thumbnail */ js.UndefOr[js.typedarray.ArrayBuffer], Unit]
  ): Unit
}
object Typeofwallpaper {
  
  inline def apply(
    setWallpaper: (WallpaperDetails, js.Function1[/* thumbnail */ js.UndefOr[js.typedarray.ArrayBuffer], Unit]) => Callback
  ): Typeofwallpaper = {
    val __obj = js.Dynamic.literal(setWallpaper = js.Any.fromFunction2((t0: WallpaperDetails, t1: js.Function1[/* thumbnail */ js.UndefOr[js.typedarray.ArrayBuffer], Unit]) => (setWallpaper(t0, t1)).runNow()))
    __obj.asInstanceOf[Typeofwallpaper]
  }
  
  extension [Self <: Typeofwallpaper](x: Self) {
    
    inline def setSetWallpaper(
      value: (WallpaperDetails, js.Function1[/* thumbnail */ js.UndefOr[js.typedarray.ArrayBuffer], Unit]) => Callback
    ): Self = StObject.set(x, "setWallpaper", js.Any.fromFunction2((t0: WallpaperDetails, t1: js.Function1[/* thumbnail */ js.UndefOr[js.typedarray.ArrayBuffer], Unit]) => (value(t0, t1)).runNow()))
  }
}
