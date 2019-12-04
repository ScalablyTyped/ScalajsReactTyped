package typingsJapgolly.antd

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.antd.libUploadInterfaceMod.UploadFile
import typingsJapgolly.antd.libUploadInterfaceMod.UploadListProps
import typingsJapgolly.antd.libUploadUploadListMod.UploadList
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload/UploadList", JSImport.Namespace)
@js.native
object libUploadUploadListMod extends js.Object {
  @js.native
  trait UploadList
    extends Component[UploadListProps, js.Any, js.Any] {
    @JSName("componentDidUpdate")
    def componentDidUpdate_MUploadList(): Unit = js.native
    def handleClose(file: UploadFile[_]): Unit = js.native
    def handleDownload(file: UploadFile[_]): Unit = js.native
    def handlePreview(file: UploadFile[_], e: ReactEventFrom[HTMLElement]): Unit = js.native
    def renderUploadList(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
  }
  
  @js.native
  class default () extends UploadList
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_File = js.native
  }
  
}

