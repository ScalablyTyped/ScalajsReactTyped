package typingsJapgolly.sharepoint.SP.Publishing.Navigation

import typingsJapgolly.sharepoint.SP.BooleanResult
import typingsJapgolly.sharepoint.SP.ClientObjectCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationTermProviderNameCollection extends ClientObjectCollection[String] {
  def Add(item: String): Unit = js.native
  def Clear(): Unit = js.native
  def Remove(item: String): BooleanResult = js.native
}

