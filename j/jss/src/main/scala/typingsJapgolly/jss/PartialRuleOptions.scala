package typingsJapgolly.jss

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jss.mod.Classes
import typingsJapgolly.jss.mod.ContainerRule
import typingsJapgolly.jss.mod.GenerateId
import typingsJapgolly.jss.mod.Jss
import typingsJapgolly.jss.mod.Renderer
import typingsJapgolly.jss.mod.Rule
import typingsJapgolly.jss.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jss.jss.RuleOptions> */
trait PartialRuleOptions extends js.Object {
  var Renderer: js.UndefOr[typingsJapgolly.jss.mod.Renderer] = js.undefined
  var classes: js.UndefOr[Classes[String]] = js.undefined
  var generateId: js.UndefOr[GenerateId] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var jss: js.UndefOr[Jss] = js.undefined
  var parent: js.UndefOr[ContainerRule | (StyleSheet[String | Double | js.Symbol])] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.undefined
}

object PartialRuleOptions {
  @scala.inline
  def apply(
    Renderer: Renderer = null,
    classes: Classes[String] = null,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => CallbackTo[String] = null,
    index: Int | Double = null,
    jss: Jss = null,
    parent: ContainerRule | (StyleSheet[String | Double | js.Symbol]) = null,
    selector: String = null,
    sheet: StyleSheet[String | Double | js.Symbol] = null
  ): PartialRuleOptions = {
    val __obj = js.Dynamic.literal()
    if (Renderer != null) __obj.updateDynamic("Renderer")(Renderer.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2((t0: /* rule */ typingsJapgolly.jss.mod.Rule, t1: /* sheet */ js.UndefOr[typingsJapgolly.jss.mod.StyleSheet[java.lang.String]]) => generateId(t0, t1).runNow()))
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (sheet != null) __obj.updateDynamic("sheet")(sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialRuleOptions]
  }
}

