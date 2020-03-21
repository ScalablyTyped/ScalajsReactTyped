package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComputeChildIndex extends js.Object {
  var context: js.Any = js.native
  val props: ReadonlychildrenReactNodeChildren = js.native
  var refs: StringDictionary[ReactInstance] = js.native
  var state: js.Any = js.native
  def computeChildIndex(top: js.Any, itemHeight: js.Any, childrenLength: Double): Double = js.native
  def doScrollingComplete(top: js.Any, itemHeight: js.Any, fireValueChange: js.Any): Unit = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[Unit]): Unit = js.native
  def render(): Element = js.native
  def select(value: js.Any, itemHeight: js.Any, scrollTo: js.Any): Unit = js.native
  def selectByIndex(index: Double, itemHeight: js.Any, zscrollTo: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any): Unit = js.native
  def setState[K /* <: String | Double | js.Symbol */](state: js.Any, callback: js.Function0[Unit]): Unit = js.native
}

