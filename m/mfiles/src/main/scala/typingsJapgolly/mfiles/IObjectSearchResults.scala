package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectSearchResults extends js.Object {
  val Count: Double
  val MoreResults: Boolean
  def Clone(): IObjectSearchResults
  def GetAsObjectVersions(): IObjectVersions
  def GetScoreOfObject(ObjVer: IObjVer): Double
  def Item(Index: Double): IObjectVersion
  def ScoreAt(Index: Double): Double
  def Sort(ObjectComparer: IObjectComparer): Unit
  def SortByScore(Ascending: Boolean): Unit
}

object IObjectSearchResults {
  @scala.inline
  def apply(
    Clone: CallbackTo[IObjectSearchResults],
    Count: Double,
    GetAsObjectVersions: CallbackTo[IObjectVersions],
    GetScoreOfObject: IObjVer => CallbackTo[Double],
    Item: Double => CallbackTo[IObjectVersion],
    MoreResults: Boolean,
    ScoreAt: Double => CallbackTo[Double],
    Sort: IObjectComparer => Callback,
    SortByScore: Boolean => Callback
  ): IObjectSearchResults = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetAsObjectVersions")(GetAsObjectVersions.toJsFn)
    __obj.updateDynamic("GetScoreOfObject")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVer) => GetScoreOfObject(t0).runNow()))
    __obj.updateDynamic("Item")(js.Any.fromFunction1((t0: scala.Double) => Item(t0).runNow()))
    __obj.updateDynamic("ScoreAt")(js.Any.fromFunction1((t0: scala.Double) => ScoreAt(t0).runNow()))
    __obj.updateDynamic("Sort")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjectComparer) => Sort(t0).runNow()))
    __obj.updateDynamic("SortByScore")(js.Any.fromFunction1((t0: scala.Boolean) => SortByScore(t0).runNow()))
    __obj.asInstanceOf[IObjectSearchResults]
  }
}

