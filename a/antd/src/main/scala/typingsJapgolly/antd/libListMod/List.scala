package typingsJapgolly.antd.libListMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antd.Anon_CurrentTotal
import typingsJapgolly.antd.Anon_GridHorizontalItemLayout
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T]
  extends Component[ListProps[T], ListState, js.Any] {
  var defaultPaginationProps: Anon_CurrentTotal = js.native
  var keys: js.Any = js.native
  var onPaginationChange: js.Any = js.native
  var onPaginationShowSizeChange: js.Any = js.native
  def getChildContext(): Anon_GridHorizontalItemLayout = js.native
  def isSomethingAfterLastItem(): Boolean = js.native
  def renderEmpty(prefixCls: String, renderEmpty: js.Function1[/* componentName */ js.UndefOr[String], Node]): Element = js.native
  def renderItem(item: js.Any, index: Double): js.UndefOr[js.Object | Null] = js.native
  def renderList(hasGetPrefixClsRenderEmpty: ConfigConsumerProps): Element = js.native
  def triggerPaginationEvent(eventName: String): js.Function2[/* page */ Double, /* pageSize */ Double, Unit] = js.native
}

