package typingsJapgolly.antdMobile

import typingsJapgolly.react.mod.Component
import typingsJapgolly.rmcPullToRefresh.propsTypeMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/pull-to-refresh", JSImport.Namespace)
@js.native
object pullToRefreshMod extends js.Object {
  @js.native
  trait PullToRefresh
    extends Component[PropsType, js.Any, js.Any]
  
  @js.native
  class default () extends PullToRefresh
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextTypes: AnonAntLocale = js.native
    var defaultProps: AnonPrefixCls = js.native
  }
  
}

