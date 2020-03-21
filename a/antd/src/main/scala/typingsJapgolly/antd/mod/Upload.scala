package typingsJapgolly.antd.mod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.antd.AnonAccept
import typingsJapgolly.antd.AnonFileList
import typingsJapgolly.antd.uploadInterfaceMod.UploadProps
import typingsJapgolly.antd.uploadMod.default
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
  var Dragger: Instantiable0[typingsJapgolly.antd.draggerMod.default] = js.native
  var defaultProps: AnonAccept = js.native
  def getDerivedStateFromProps(nextProps: UploadProps): AnonFileList | Null = js.native
}

