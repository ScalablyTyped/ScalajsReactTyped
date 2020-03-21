package typingsJapgolly.grommet.tabsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.grommet.AnonTabContents
import typingsJapgolly.grommet.grommetStrings.center
import typingsJapgolly.grommet.grommetStrings.end
import typingsJapgolly.grommet.grommetStrings.grow
import typingsJapgolly.grommet.grommetStrings.shrink
import typingsJapgolly.grommet.grommetStrings.start
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var activeIndex: js.UndefOr[Double] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var children: Node
  var flex: js.UndefOr[grow | shrink | Boolean] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var justify: js.UndefOr[start | center | end] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var messages: js.UndefOr[AnonTabContents] = js.undefined
  var onActive: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    a11yTitle: A11yTitleType = null,
    activeIndex: Int | Double = null,
    alignSelf: AlignSelfType = null,
    children: VdomNode = null,
    flex: grow | shrink | Boolean = null,
    gridArea: GridAreaType = null,
    justify: start | center | end = null,
    margin: MarginType = null,
    messages: AnonTabContents = null,
    onActive: /* index */ Double => Callback = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (justify != null) __obj.updateDynamic("justify")(justify.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (onActive != null) __obj.updateDynamic("onActive")(js.Any.fromFunction1((t0: /* index */ scala.Double) => onActive(t0).runNow()))
    __obj.asInstanceOf[TabsProps]
  }
}

