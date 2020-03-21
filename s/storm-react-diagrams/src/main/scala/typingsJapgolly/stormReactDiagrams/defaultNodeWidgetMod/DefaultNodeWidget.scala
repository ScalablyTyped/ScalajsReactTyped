package typingsJapgolly.stormReactDiagrams.defaultNodeWidgetMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.stormReactDiagrams.baseWidgetMod.BaseWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultNodeWidget", "DefaultNodeWidget")
@js.native
class DefaultNodeWidget protected () extends BaseWidget[DefaultNodeProps, DefaultNodeState] {
  def this(props: DefaultNodeProps) = this()
  def generatePort(port: js.Any): Element = js.native
}

