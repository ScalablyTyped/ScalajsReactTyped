package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ListSelect.IItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ListSelect. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.ListSelect")
@js.native
/**
  * Constructs a new ListSelect.
  * @param [properties] Properties to set
  */
class ListSelect_ () extends IListSelect {
  def this(properties: IListSelect) = this()
  /** ListSelect items. */
  @JSName("items")
  var items_ListSelect_ : js.Array[IItem] = js.native
  /** ListSelect title. */
  @JSName("title")
  var title_ListSelect_ : String = js.native
  /**
    * Converts this ListSelect to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

