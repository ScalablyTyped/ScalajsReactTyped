package typingsJapgolly.reactOnsenui.anon

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactOnsenui.mod.Navigator
import typingsJapgolly.reactOnsenui.mod.NavigatorAnimationTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialRoute extends StObject {
  
  var animation: js.UndefOr[NavigatorAnimationTypes] = js.native
  
  var animationOptions: js.UndefOr[typingsJapgolly.reactOnsenui.mod.AnimationOptions] = js.native
  
  var initialRoute: js.UndefOr[Any] = js.native
  
  var initialRouteStack: js.UndefOr[js.Array[String]] = js.native
  
  var onPostPop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPostPush: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPrePop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onPrePush: js.UndefOr[js.Function0[Unit]] = js.native
  
  def renderPage(route: Any): Element = js.native
  def renderPage(route: Any, navigator: Navigator): Element = js.native
}
