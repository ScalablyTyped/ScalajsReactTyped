package typingsJapgolly.reactNative.mod

import typingsJapgolly.reactNative.reactNativeStrings.UIBackgroundFetchResultFailed
import typingsJapgolly.reactNative.reactNativeStrings.UIBackgroundFetchResultNewData
import typingsJapgolly.reactNative.reactNativeStrings.UIBackgroundFetchResultNoData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchResult extends js.Object {
  var NewData: UIBackgroundFetchResultNewData
  var NoData: UIBackgroundFetchResultNoData
  var ResultFailed: UIBackgroundFetchResultFailed
}

object FetchResult {
  @scala.inline
  def apply(
    NewData: UIBackgroundFetchResultNewData,
    NoData: UIBackgroundFetchResultNoData,
    ResultFailed: UIBackgroundFetchResultFailed
  ): FetchResult = {
    val __obj = js.Dynamic.literal(NewData = NewData.asInstanceOf[js.Any], NoData = NoData.asInstanceOf[js.Any], ResultFailed = ResultFailed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FetchResult]
  }
}

