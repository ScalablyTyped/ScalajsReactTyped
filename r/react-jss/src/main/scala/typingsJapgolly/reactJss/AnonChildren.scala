package typingsJapgolly.reactJss

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.jss.mod.CreateGenerateIdOptions
import typingsJapgolly.jss.mod.GenerateId
import typingsJapgolly.jss.mod.Jss
import typingsJapgolly.jss.mod.Rule
import typingsJapgolly.jss.mod.SheetsRegistry
import typingsJapgolly.jss.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: Node
  var classNamePrefix: js.UndefOr[String] = js.undefined
  var disableStylesGeneration: js.UndefOr[Boolean] = js.undefined
  var generateId: js.UndefOr[GenerateId] = js.undefined
  var id: js.UndefOr[CreateGenerateIdOptions] = js.undefined
  var jss: js.UndefOr[Jss] = js.undefined
  var registry: js.UndefOr[SheetsRegistry] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(
    children: VdomNode = null,
    classNamePrefix: String = null,
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => CallbackTo[String] = null,
    id: CreateGenerateIdOptions = null,
    jss: Jss = null,
    registry: SheetsRegistry = null
  ): AnonChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration.asInstanceOf[js.Any])
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2((t0: /* rule */ typingsJapgolly.jss.mod.Rule, t1: /* sheet */ js.UndefOr[typingsJapgolly.jss.mod.StyleSheet[java.lang.String]]) => generateId(t0, t1).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

