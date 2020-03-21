package typingsJapgolly.antd

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.antd.uploadInterfaceMod.UploadFile
import typingsJapgolly.antd.uploadInterfaceMod.UploadListProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload/UploadList", JSImport.Namespace)
@js.native
object uploadListMod extends js.Object {
  @js.native
  trait UploadList
    extends Component[UploadListProps, js.Any, js.Any] {
    @JSName("componentDidUpdate")
    def componentDidUpdate_MUploadList(): Unit = js.native
    def handleActionIconRender(customIcon: Node, callback: js.Function0[Unit]): Element = js.native
    def handleActionIconRender(customIcon: Node, callback: js.Function0[Unit], title: String): Element = js.native
    def handleClose(file: UploadFile[_]): Unit = js.native
    def handleDownload(file: UploadFile[_]): Unit = js.native
    def handleIconRender(file: UploadFile[_]): js.UndefOr[js.Object | Null] = js.native
    def handlePreview(file: UploadFile[_], e: ReactEventFrom[HTMLElement]): Unit = js.native
    def renderUploadList(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  }
  
  @js.native
  class default () extends UploadList
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonListType = js.native
  }
  
}

