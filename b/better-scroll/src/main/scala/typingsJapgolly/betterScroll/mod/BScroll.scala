package typingsJapgolly.betterScroll.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.betterScroll.betterScrollStrings.beforeScrollStart
import typingsJapgolly.betterScroll.betterScrollStrings.destroy
import typingsJapgolly.betterScroll.betterScrollStrings.flick
import typingsJapgolly.betterScroll.betterScrollStrings.pullingDown
import typingsJapgolly.betterScroll.betterScrollStrings.pullingUp
import typingsJapgolly.betterScroll.betterScrollStrings.refresh
import typingsJapgolly.betterScroll.betterScrollStrings.scroll
import typingsJapgolly.betterScroll.betterScrollStrings.scrollCancel
import typingsJapgolly.betterScroll.betterScrollStrings.scrollEnd
import typingsJapgolly.betterScroll.betterScrollStrings.scrollStart
import typingsJapgolly.betterScroll.betterScrollStrings.touchEnd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BScroll extends StObject {
  
  def destroy(): Unit = js.native
  
  var directionX: Double = js.native
  
  var directionY: Double = js.native
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  var enabled: Boolean = js.native
  
  def finishPullDown(): Unit = js.native
  
  def finishPullUp(): Unit = js.native
  
  def getCurrentPage(): PageOption = js.native
  
  def getSelectedIndex(): Double = js.native
  
  def goToPage(x: Double, y: Double): Unit = js.native
  def goToPage(x: Double, y: Double, time: Double): Unit = js.native
  def goToPage(x: Double, y: Double, time: Double, easing: js.Object): Unit = js.native
  def goToPage(x: Double, y: Double, time: Unit, easing: js.Object): Unit = js.native
  
  var isAnimating: Boolean = js.native
  
  var isInTransition: Boolean = js.native
  
  var maxScrollX: Double = js.native
  
  var maxScrollY: Double = js.native
  
  var movingDirectionX: Double = js.native
  
  var movingDirectionY: Double = js.native
  
  def next(): Unit = js.native
  def next(time: Double): Unit = js.native
  def next(time: Double, easing: js.Object): Unit = js.native
  def next(time: Unit, easing: js.Object): Unit = js.native
  
  def off(
    `type`: beforeScrollStart | scrollStart | scroll | scrollCancel | scrollEnd | touchEnd | flick | refresh | destroy | pullingDown | pullingUp,
    fn: js.Function1[/* repeated */ Any, Unit]
  ): Unit = js.native
  
  def on(
    `type`: beforeScrollStart | scrollStart | scrollCancel | flick | refresh | destroy | pullingDown | pullingUp,
    fn: js.Function0[Any]
  ): Unit = js.native
  def on(`type`: scroll | scrollEnd | touchEnd, fn: js.Function1[/* pos */ Position, Any]): Unit = js.native
  
  var options: BsOption = js.native
  
  def prev(): Unit = js.native
  def prev(time: Double): Unit = js.native
  def prev(time: Double, easing: js.Object): Unit = js.native
  def prev(time: Unit, easing: js.Object): Unit = js.native
  
  def refresh(): Unit = js.native
  
  def scrollBy(x: Double, y: Double): Unit = js.native
  def scrollBy(x: Double, y: Double, time: Double): Unit = js.native
  def scrollBy(x: Double, y: Double, time: Double, easing: js.Object): Unit = js.native
  def scrollBy(x: Double, y: Double, time: Unit, easing: js.Object): Unit = js.native
  
  def scrollTo(x: Double, y: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, time: Double): Unit = js.native
  def scrollTo(x: Double, y: Double, time: Double, easing: js.Object): Unit = js.native
  def scrollTo(x: Double, y: Double, time: Unit, easing: js.Object): Unit = js.native
  
  def scrollToElement(
    el: HTMLElement | String,
    time: js.UndefOr[Double],
    offsetX: js.UndefOr[Double | Boolean],
    offsetY: js.UndefOr[Double | Boolean],
    easing: js.UndefOr[js.Object]
  ): Unit = js.native
  
  def stop(): Unit = js.native
  
  def trigger(`type`: String): Unit = js.native
  
  def wheelTo(index: Double): Unit = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
