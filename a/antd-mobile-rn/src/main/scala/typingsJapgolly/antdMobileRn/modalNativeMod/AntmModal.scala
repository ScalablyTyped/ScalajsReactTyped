package typingsJapgolly.antdMobileRn.modalNativeMod

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.LayoutChangeEvent
import typingsJapgolly.reactNative.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntmModal
  extends Component[IModalNativeProps, js.Any, js.Any] {
  var root: View | Null = js.native
  def onFooterLayout(e: LayoutChangeEvent): Unit = js.native
  def saveRoot(root: js.Any): Unit = js.native
}

