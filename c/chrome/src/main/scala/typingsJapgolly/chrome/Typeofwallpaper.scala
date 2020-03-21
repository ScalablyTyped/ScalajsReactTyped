package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.wallpaper.WallpaperDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofwallpaper extends js.Object {
  def setWallpaper(details: WallpaperDetails, callback: js.Function1[/* thumbnail */ js.Any, Unit]): Unit
}

object Typeofwallpaper {
  @scala.inline
  def apply(setWallpaper: (WallpaperDetails, js.Function1[/* thumbnail */ js.Any, Unit]) => Callback): Typeofwallpaper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setWallpaper")(js.Any.fromFunction2((t0: typingsJapgolly.chrome.chrome.wallpaper.WallpaperDetails, t1: js.Function1[/* thumbnail */ js.Any, scala.Unit]) => setWallpaper(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofwallpaper]
  }
}

