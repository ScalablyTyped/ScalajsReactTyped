package typingsJapgolly.winjs.mod.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies what animation type should be returned by WinJS.UI.Animation.createPageNavigationAnimations.
  **/
@JSImport("winjs", "UI.PageNavigationAnimation")
@js.native
object PageNavigationAnimation extends js.Object {
  /* 3 */ val continuum: typingsJapgolly.winjs.WinJS.UI.PageNavigationAnimation.continuum with Double = js.native
  /* 2 */ val enterPage: typingsJapgolly.winjs.WinJS.UI.PageNavigationAnimation.enterPage with Double = js.native
  /* 1 */ val slide: typingsJapgolly.winjs.WinJS.UI.PageNavigationAnimation.slide with Double = js.native
  /* 0 */ val turnstile: typingsJapgolly.winjs.WinJS.UI.PageNavigationAnimation.turnstile with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.winjs.WinJS.UI.PageNavigationAnimation with Double] = js.native
}

