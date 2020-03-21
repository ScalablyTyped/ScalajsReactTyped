package typingsJapgolly.antd.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.AnonListStyle
import typingsJapgolly.antd.AnonSourceSelectedKeys
import typingsJapgolly.antd.TypeofList
import typingsJapgolly.antd.TypeofSearchInstantiable
import typingsJapgolly.antd.operationMod.TransferOperationProps
import typingsJapgolly.antd.transferMod.TransferProps
import typingsJapgolly.antd.transferMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Transfer")
@js.native
class Transfer protected () extends default {
  def this(props: TransferProps) = this()
}

/* static members */
@JSImport("antd", "Transfer")
@js.native
object Transfer extends js.Object {
  var List: TypeofList = js.native
  var Search: TypeofSearchInstantiable = js.native
  var defaultProps: AnonListStyle = js.native
  def Operation(
    hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirection: TransferOperationProps
  ): Element = js.native
  def getDerivedStateFromProps(nextProps: TransferProps): AnonSourceSelectedKeys | Null = js.native
}

