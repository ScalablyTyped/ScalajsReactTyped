package typingsJapgolly.baseui.accordionMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.baseui.baseuiStrings.expand
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/accordion", "Accordion")
@js.native
class Accordion ()
  extends Component[AccordionProps, AccordionState, js.Any] {
  def getItems(): Node = js.native
  @JSName("internalSetState")
  def internalSetState_expand(`type`: expand, changes: AccordionState): Unit = js.native
  def onPanelChange(
    key: Key,
    onChange: js.Function0[_],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
  ): Unit = js.native
}

