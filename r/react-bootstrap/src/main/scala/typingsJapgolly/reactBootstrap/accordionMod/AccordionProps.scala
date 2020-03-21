package typingsJapgolly.reactBootstrap.accordionMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps
  extends AllHTMLAttributes[Accordion]
     with ClassAttributes[Accordion] {
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
  var defaultExpanded: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var footer: js.UndefOr[Node] = js.undefined
  var header: js.UndefOr[Node] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Accordion] = null,
    ClassAttributes: ClassAttributes[Accordion] = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined,
    defaultExpanded: js.UndefOr[Boolean] = js.undefined,
    eventKey: js.Any = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    footer: VdomNode = null,
    header: VdomNode = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpanded)) __obj.updateDynamic("defaultExpanded")(defaultExpanded.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.rawNode.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionProps]
  }
}

