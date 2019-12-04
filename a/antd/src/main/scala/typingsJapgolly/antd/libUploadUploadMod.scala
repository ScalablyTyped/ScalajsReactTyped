package typingsJapgolly.antd

import japgolly.scalajs.react.ReactDragEventFrom
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsJapgolly.antd.libUploadInterfaceMod.RcFile
import typingsJapgolly.antd.libUploadInterfaceMod.UploadChangeParam
import typingsJapgolly.antd.libUploadInterfaceMod.UploadFile
import typingsJapgolly.antd.libUploadInterfaceMod.UploadLocale
import typingsJapgolly.antd.libUploadInterfaceMod.UploadProps
import typingsJapgolly.antd.libUploadInterfaceMod.UploadState
import typingsJapgolly.antd.libUploadUploadMod.Upload
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload/Upload", JSImport.Namespace)
@js.native
object libUploadUploadMod extends js.Object {
  @js.native
  trait Upload
    extends Component[UploadProps, UploadState, js.Any] {
    var progressTimer: js.Any = js.native
    var recentUploadStatus: Boolean | js.Thenable[_] = js.native
    var upload: js.Any = js.native
    def autoUpdateProgress(`_`: js.Any, file: UploadFile[_]): Unit = js.native
    def beforeUpload(file: RcFile, fileList: js.Array[RcFile]): Boolean | js.Thenable[Unit] = js.native
    def clearProgressTimer(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MUpload(): Unit = js.native
    def handleRemove(file: UploadFile[_]): Unit = js.native
    def onChange(info: UploadChangeParam[UploadFile[_]]): Unit = js.native
    def onError(error: js.Error, response: js.Any, file: UploadFile[_]): Unit = js.native
    def onFileDrop(e: ReactDragEventFrom[HTMLDivElement]): Unit = js.native
    def onProgress(e: Anon_Percent, file: UploadFile[_]): Unit = js.native
    def onStart(file: RcFile): Unit = js.native
    def onSuccess(response: js.Any, file: UploadFile[_], xhr: js.Any): Unit = js.native
    def renderUpload(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
    def renderUploadList(locale: UploadLocale): Element = js.native
    def saveUpload(node: js.Any): Unit = js.native
  }
  
  @js.native
  class default protected () extends Upload {
    def this(props: UploadProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Dragger: Instantiable0[typingsJapgolly.antd.libUploadDraggerMod.default] = js.native
    var defaultProps: Anon_Accept = js.native
    def getDerivedStateFromProps(nextProps: UploadProps): Anon_FileList | Null = js.native
  }
  
}

