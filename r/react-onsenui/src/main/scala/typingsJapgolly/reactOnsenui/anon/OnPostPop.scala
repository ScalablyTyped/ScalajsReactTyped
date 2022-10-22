package typingsJapgolly.reactOnsenui.anon

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactOnsenui.mod.Navigator
import typingsJapgolly.reactOnsenui.reactOnsenuiStrings.force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPostPop extends StObject {
  
  var animation: js.UndefOr[String] = js.native
  
  def onPostPop(): Unit = js.native
  
  def onPostPush(): Unit = js.native
  
  def renderPage(route: Any): Element = js.native
  def renderPage(route: Any, navigator: Navigator): Element = js.native
  
  var routeConfig: Any = js.native
  
  var swipePop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var swipeTargetWidth: js.UndefOr[Double] = js.native
  
  var swipeable: js.UndefOr[Boolean | force] = js.native
}
