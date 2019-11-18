package typingsJapgolly.antd.antdMod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.antd.Anon_AcceptAction
import typingsJapgolly.antd.Anon_FileListArray
import typingsJapgolly.antd.libUploadInterfaceMod.UploadProps
import typingsJapgolly.antd.libUploadMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Upload")
@js.native
class Upload protected () extends default {
  def this(props: UploadProps) = this()
}

/* static members */
@JSImport("antd", "Upload")
@js.native
object Upload extends js.Object {
  var Dragger: Instantiable0[typingsJapgolly.antd.libUploadDraggerMod.default] = js.native
  var defaultProps: Anon_AcceptAction = js.native
  def getDerivedStateFromProps(nextProps: UploadProps): Anon_FileListArray | Null = js.native
}

