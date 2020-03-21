package typingsJapgolly.reactContentLoader.nativeMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.reactNativeSvg.mod.RectProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-content-loader/dist/native", "Rect")
@js.native
class Rect protected ()
  extends typingsJapgolly.reactContentLoader.holderMod.Rect {
  def this(props: RectProps) = this()
  def this(props: RectProps, context: js.Any) = this()
}

@JSImport("react-content-loader/dist/native", "Rect")
@js.native
object Rect extends TopLevel[ComponentClass[RectProps, ComponentState]]

