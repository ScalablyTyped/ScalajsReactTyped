package typingsJapgolly.winrt.Windows.ApplicationModel.Resources

import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
@js.native
class ResourceLoader () extends IResourceLoader {
  def this(name: String) = this()
  /* CompleteClass */
  override def getString(resource: String): String = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.Resources.ResourceLoader")
@js.native
object ResourceLoader extends js.Object {
  def getStringForReference(uri: Uri): String = js.native
}

