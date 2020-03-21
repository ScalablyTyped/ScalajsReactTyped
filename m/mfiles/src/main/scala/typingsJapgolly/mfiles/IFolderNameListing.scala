package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderNameListing extends js.Object {
  val Count: Double
  val MoreValues: Boolean
  def Item(Index: Double): ITypedValue
  def SortWithExpression(Expression: IExpression, Locale: Double): Unit
}

object IFolderNameListing {
  @scala.inline
  def apply(
    Count: Double,
    Item: Double => CallbackTo[ITypedValue],
    MoreValues: Boolean,
    SortWithExpression: (IExpression, Double) => Callback
  ): IFolderNameListing = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], MoreValues = MoreValues.asInstanceOf[js.Any])
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("SortWithExpression")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IExpression, t1: scala.Double) => SortWithExpression(t0, t1).runNow()))
    __obj.asInstanceOf[IFolderNameListing]
  }
}

