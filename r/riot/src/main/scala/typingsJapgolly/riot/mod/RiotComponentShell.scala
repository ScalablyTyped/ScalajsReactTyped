package typingsJapgolly.riot.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RiotComponentShell[Props, State] extends js.Object {
  val css: js.UndefOr[String] = js.undefined
  val exports: js.UndefOr[js.Function0[(RiotComponentExport[Props, State]) | js.Object]] = js.undefined
  val name: js.UndefOr[String] = js.undefined
  // TODO: add the @riotjs/dom-bindings types
  def template(): js.Any
}

object RiotComponentShell {
  @scala.inline
  def apply[Props, State](
    template: CallbackTo[js.Any],
    css: String = null,
    exports: js.UndefOr[CallbackTo[(RiotComponentExport[Props, State]) | js.Object]] = js.undefined,
    name: String = null
  ): RiotComponentShell[Props, State] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("template")(template.toJsFn)
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    exports.foreach(p => __obj.updateDynamic("exports")(p.toJsFn))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiotComponentShell[Props, State]]
  }
}

