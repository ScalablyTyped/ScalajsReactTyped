package typingsJapgolly.reactDashNative

import typingsJapgolly.reactDashNative.reactDashNativeMod.ScaledSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Screen extends js.Object {
  var screen: ScaledSize
  var window: ScaledSize
}

object Anon_Screen {
  @scala.inline
  def apply(screen: ScaledSize, window: ScaledSize): Anon_Screen = {
    val __obj = js.Dynamic.literal(screen = screen.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Screen]
  }
}

