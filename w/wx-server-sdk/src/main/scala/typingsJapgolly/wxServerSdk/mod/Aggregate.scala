package typingsJapgolly.wxServerSdk.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.wxServerSdk.AnonBoundaries
import typingsJapgolly.wxServerSdk.AnonBuckets
import typingsJapgolly.wxServerSdk.AnonDictfieldName
import typingsJapgolly.wxServerSdk.AnonDistanceField
import typingsJapgolly.wxServerSdk.AnonIncludeArrayIndex
import typingsJapgolly.wxServerSdk.AnonNewRoot
import typingsJapgolly.wxServerSdk.AnonSize
import typingsJapgolly.wxServerSdk.wxServerSdkNumbers.`-1`
import typingsJapgolly.wxServerSdk.wxServerSdkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregate extends js.Object {
  def addFields(fieldObj: StringDictionary[js.Any]): Aggregate
  def bucket(bucketObj: AnonBoundaries): Aggregate
  def bucketAuto(bucketObj: AnonBuckets): Aggregate
  def count(expr: String): js.Any
  def end(): Unit
  def geoNear(geoNearObj: AnonDistanceField): Aggregate
  def group(groupObj: AnonDictfieldName): Aggregate
  def limit(limitRecords: Double): js.Any
  def `match`(matchObj: StringDictionary[js.Any]): Aggregate
  def project(projectObj: StringDictionary[js.Any]): Aggregate
  def replaceRoot(replaceRootObj: AnonNewRoot): Aggregate
  def sample(replaceRootObj: AnonSize): Aggregate
  def skip(skipNum: Double): js.Any
  def sort(replaceRootObj: StringDictionary[`1` | `-1`]): Aggregate
  def sortByCount(fieldName: String): Aggregate
  def unwind(unwindObj: AnonIncludeArrayIndex): Aggregate
}

object Aggregate {
  @scala.inline
  def apply(
    addFields: StringDictionary[js.Any] => CallbackTo[Aggregate],
    bucket: AnonBoundaries => CallbackTo[Aggregate],
    bucketAuto: AnonBuckets => CallbackTo[Aggregate],
    count: String => CallbackTo[js.Any],
    end: Callback,
    geoNear: AnonDistanceField => CallbackTo[Aggregate],
    group: AnonDictfieldName => CallbackTo[Aggregate],
    limit: Double => CallbackTo[js.Any],
    `match`: StringDictionary[js.Any] => CallbackTo[Aggregate],
    project: StringDictionary[js.Any] => CallbackTo[Aggregate],
    replaceRoot: AnonNewRoot => CallbackTo[Aggregate],
    sample: AnonSize => CallbackTo[Aggregate],
    skip: Double => CallbackTo[js.Any],
    sort: StringDictionary[`1` | `-1`] => CallbackTo[Aggregate],
    sortByCount: String => CallbackTo[Aggregate],
    unwind: AnonIncludeArrayIndex => CallbackTo[Aggregate]
  ): Aggregate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addFields")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[js.Any]) => addFields(t0).runNow()))
    __obj.updateDynamic("bucket")(js.Any.fromFunction1((t0: typingsJapgolly.wxServerSdk.AnonBoundaries) => bucket(t0).runNow()))
    __obj.updateDynamic("bucketAuto")(js.Any.fromFunction1((t0: typingsJapgolly.wxServerSdk.AnonBuckets) => bucketAuto(t0).runNow()))
    __obj.updateDynamic("count")(js.Any.fromFunction1((t0: java.lang.String) => count(t0).runNow()))
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("geoNear")(js.Any.fromFunction1((t0: typingsJapgolly.wxServerSdk.AnonDistanceField) => geoNear(t0).runNow()))
    __obj.updateDynamic("group")(js.Any.fromFunction1((t0: typingsJapgolly.wxServerSdk.AnonDictfieldName) => group(t0).runNow()))
    __obj.updateDynamic("limit")(js.Any.fromFunction1((t0: scala.Double) => limit(t0).runNow()))
    __obj.updateDynamic("match")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[js.Any]) => `match`(t0).runNow()))
    __obj.updateDynamic("project")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[js.Any]) => project(t0).runNow()))
    __obj.updateDynamic("replaceRoot")(js.Any.fromFunction1((t0: typingsJapgolly.wxServerSdk.AnonNewRoot) => replaceRoot(t0).runNow()))
    __obj.updateDynamic("sample")(js.Any.fromFunction1((t0: typingsJapgolly.wxServerSdk.AnonSize) => sample(t0).runNow()))
    __obj.updateDynamic("skip")(js.Any.fromFunction1((t0: scala.Double) => skip(t0).runNow()))
    __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[
  typingsJapgolly.wxServerSdk.wxServerSdkNumbers.`1` | typingsJapgolly.wxServerSdk.wxServerSdkNumbers.`-1`]) => sort(t0).runNow()))
    __obj.updateDynamic("sortByCount")(js.Any.fromFunction1((t0: java.lang.String) => sortByCount(t0).runNow()))
    __obj.updateDynamic("unwind")(js.Any.fromFunction1((t0: typingsJapgolly.wxServerSdk.AnonIncludeArrayIndex) => unwind(t0).runNow()))
    __obj.asInstanceOf[Aggregate]
  }
}

