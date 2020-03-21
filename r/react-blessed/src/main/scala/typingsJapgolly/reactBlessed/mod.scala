package typingsJapgolly.reactBlessed

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.blessed.mod.Widgets.Screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-blessed", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createBlessedRenderer(bls: js.Any): renderer = js.native
  def render(c: Element, s: Screen): (Component[js.Object, js.Object]) | Null = js.native
  def render(c: Element, s: Screen, callback: Callback): (Component[js.Object, js.Object]) | Null = js.native
  type Callback = js.Function0[js.UndefOr[Unit | Null]]
  type renderer = js.Function3[
    Element, 
    /* s */ Screen, 
    /* callback */ js.UndefOr[Callback], 
    (Component[js.Any with js.Object, js.Object]) | Null
  ]
}

