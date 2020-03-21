package typingsJapgolly.antd.treeSelectMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.RefHandle
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeSelect[T]
  extends Component[TreeSelectProps[T], js.Object, js.Any] {
  var selectRef: RefHandle[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RcTreeSelect<imported_interface.DefaultValueType> */ _
  ] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def renderTreeSelect(hasGetPopupContainerGetPrefixClsRenderEmptyDirection: ConfigConsumerProps): Element = js.native
}

