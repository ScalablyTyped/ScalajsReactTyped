package typingsJapgolly.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitActivityStatsResponseItem extends js.Object {
  var days: js.Array[Double]
  var total: Double
  var week: Double
}

object ReposGetCommitActivityStatsResponseItem {
  @scala.inline
  def apply(days: js.Array[Double], total: Double, week: Double): ReposGetCommitActivityStatsResponseItem = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetCommitActivityStatsResponseItem]
  }
}

