package typingsJapgolly.antd.esMod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.antd.Anon_Accept
import typingsJapgolly.antd.Anon_FileList
import typingsJapgolly.antd.esUploadInterfaceMod.UploadProps
import typingsJapgolly.antd.esUploadMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/es", "Upload")
@js.native
class Upload protected () extends default {
  def this(props: UploadProps) = this()
}

/* static members */
@JSImport("antd/es", "Upload")
@js.native
object Upload extends js.Object {
  var Dragger: Instantiable0[typingsJapgolly.antd.esUploadDraggerMod.default] = js.native
  var defaultProps: Anon_Accept = js.native
  def getDerivedStateFromProps(nextProps: UploadProps): Anon_FileList | Null = js.native
}

