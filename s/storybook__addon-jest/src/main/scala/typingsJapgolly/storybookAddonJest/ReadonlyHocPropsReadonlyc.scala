package typingsJapgolly.storybookAddonJest

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.storybookApi.mod.API
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@storybook/addon-jest.@storybook/addon-jest/dist/hoc/provideJestResult.HocProps> & std.Readonly<{  children ? :react.react.ReactNode}> */
trait ReadonlyHocPropsReadonlyc extends js.Object {
  val active: js.UndefOr[Boolean] = js.undefined
  val api: API
  val children: js.UndefOr[Node] = js.undefined
}

object ReadonlyHocPropsReadonlyc {
  @scala.inline
  def apply(api: API, active: js.UndefOr[Boolean] = js.undefined, children: VdomNode = null): ReadonlyHocPropsReadonlyc = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyHocPropsReadonlyc]
  }
}

