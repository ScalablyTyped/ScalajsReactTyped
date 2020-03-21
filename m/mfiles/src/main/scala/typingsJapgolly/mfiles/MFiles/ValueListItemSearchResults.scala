package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IValueListItem
import typingsJapgolly.mfiles.IValueListItemSearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ValueListItemSearchResults")
@js.native
class ValueListItemSearchResults () extends IValueListItemSearchResults {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override var MoreResults: Boolean = js.native
  /* CompleteClass */
  override def Add(Index: Double, ValueListItem: IValueListItem): Unit = js.native
  /* CompleteClass */
  override def Clone(): IValueListItemSearchResults = js.native
  /* CompleteClass */
  override def Item(Index: Double): IValueListItem = js.native
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}

@JSGlobal("MFiles.ValueListItemSearchResults")
@js.native
object ValueListItemSearchResults extends Instantiable0[IValueListItemSearchResults]

