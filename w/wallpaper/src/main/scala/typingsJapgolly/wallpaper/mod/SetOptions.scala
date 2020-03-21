package typingsJapgolly.wallpaper.mod

import typingsJapgolly.wallpaper.wallpaperStrings.all
import typingsJapgolly.wallpaper.wallpaperStrings.auto
import typingsJapgolly.wallpaper.wallpaperStrings.center
import typingsJapgolly.wallpaper.wallpaperStrings.fill
import typingsJapgolly.wallpaper.wallpaperStrings.fit
import typingsJapgolly.wallpaper.wallpaperStrings.main
import typingsJapgolly.wallpaper.wallpaperStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends js.Object {
  /**
  		__macOS only.__
  		Scaling method. Values: `auto` `fill` `fit` `stretch` `center`.
  		@default 'auto'
  		*/
  val scale: js.UndefOr[auto | fill | fit | stretch | center] = js.undefined
  /**
  		__macOS only.__
  		The screen to set the wallpaper on.
  		Values: `all`, `main`, or the index of a screen from `.screens()`.
  		*On Linux and Windows it's hard-coded to `main`.*
  		@default 'all'
  		*/
  val screen: js.UndefOr[all | main | Double] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(scale: auto | fill | fit | stretch | center = null, screen: all | main | Double = null): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions]
  }
}

