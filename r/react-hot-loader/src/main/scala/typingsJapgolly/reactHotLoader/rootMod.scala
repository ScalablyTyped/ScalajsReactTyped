package typingsJapgolly.reactHotLoader

import typingsJapgolly.reactHotLoader.mod.AppContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-hot-loader/root", JSImport.Namespace)
@js.native
object rootMod extends js.Object {
  def hot[T](Component: T): T = js.native
  def hot[T](Component: T, props: AppContainerProps): T = js.native
}

