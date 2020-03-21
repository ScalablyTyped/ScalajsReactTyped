package typingsJapgolly.sharepoint.SP.Taxonomy

import typingsJapgolly.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelCollection extends ClientObjectCollection[Label] {
  def getByValue(name: String): Label = js.native
  def get_item(index: Double): Label = js.native
  def itemAt(index: Double): Label = js.native
}

