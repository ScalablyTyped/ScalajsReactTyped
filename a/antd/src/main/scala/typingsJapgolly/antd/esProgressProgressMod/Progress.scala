package typingsJapgolly.antd.esProgressProgressMod

import typingsJapgolly.antd.antdStrings.active
import typingsJapgolly.antd.antdStrings.exception
import typingsJapgolly.antd.antdStrings.normal
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress
  extends Component[ProgressProps, js.Object, js.Any] {
  def getPercentNumber(): Double = js.native
  def getProgressStatus(): normal | active | success | exception = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_active(prefixCls: String, progressStatus: active): Element | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_exception(prefixCls: String, progressStatus: exception): Element | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_normal(prefixCls: String, progressStatus: normal): Element | Null = js.native
  @JSName("renderProcessInfo")
  def renderProcessInfo_success(prefixCls: String, progressStatus: success): Element | Null = js.native
  def renderProgress(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

