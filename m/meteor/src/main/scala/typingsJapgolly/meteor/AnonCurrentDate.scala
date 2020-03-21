package typingsJapgolly.meteor

import typingsJapgolly.meteor.meteorNumbers.`-1`
import typingsJapgolly.meteor.meteorNumbers.`0`
import typingsJapgolly.meteor.meteorNumbers.`1`
import typingsJapgolly.meteor.mongoMod.Mongo.ArraysOrEach
import typingsJapgolly.meteor.mongoMod.Mongo.CurrentDateModifier
import typingsJapgolly.meteor.mongoMod.Mongo.Dictionary
import typingsJapgolly.meteor.mongoMod.Mongo.ElementsOf
import typingsJapgolly.meteor.mongoMod.Mongo.PartialMapTo
import typingsJapgolly.meteor.mongoMod.Mongo.PushModifier
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCurrentDate[T] extends js.Object {
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[ArraysOrEach[T] with Dictionary[_]] = js.native
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[
    (Partial[Record[String, CurrentDateModifier]]) with Dictionary[CurrentDateModifier]
  ] = js.native
  @JSName("$inc")
  var $inc: js.UndefOr[(PartialMapTo[T, Double]) with Dictionary[Double]] = js.native
  @JSName("$max")
  var $max: js.UndefOr[(PartialMapTo[T, js.Date | Double]) with (Dictionary[js.Date | Double])] = js.native
  @JSName("$min")
  var $min: js.UndefOr[(PartialMapTo[T, js.Date | Double]) with (Dictionary[js.Date | Double])] = js.native
  @JSName("$mul")
  var $mul: js.UndefOr[(PartialMapTo[T, Double]) with Dictionary[Double]] = js.native
  @JSName("$pop")
  var $pop: js.UndefOr[(PartialMapTo[T, `1` | `-1`]) with (Dictionary[`1` | `-1`])] = js.native
  @JSName("$pull")
  var $pull: js.UndefOr[ElementsOf[T] with Dictionary[_]] = js.native
  @JSName("$pullAll")
  var $pullAll: js.UndefOr[Partial[T] with Dictionary[_]] = js.native
  @JSName("$push")
  var $push: js.UndefOr[PushModifier[T] with Dictionary[_]] = js.native
  @JSName("$rename")
  var $rename: js.UndefOr[(PartialMapTo[T, String]) with Dictionary[String]] = js.native
  @JSName("$set")
  var $set: js.UndefOr[Partial[T] with Dictionary[_]] = js.native
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[Partial[T] with Dictionary[_]] = js.native
  @JSName("$unset")
  var $unset: js.UndefOr[(PartialMapTo[T, String | Boolean | `1` | `0`]) with Dictionary[_]] = js.native
}

