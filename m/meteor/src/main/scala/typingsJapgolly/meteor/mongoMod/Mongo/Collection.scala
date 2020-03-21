package typingsJapgolly.meteor.mongoMod.Mongo

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.meteor.AnonFetch
import typingsJapgolly.meteor.AnonInsertedId
import typingsJapgolly.meteor.AnonLimit
import typingsJapgolly.meteor.AnonMulti
import typingsJapgolly.meteor.AnonMultiBoolean
import typingsJapgolly.meteor.AnonSkip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[T] extends js.Object {
  def _dropIndex(keys: String): Unit = js.native
  def _dropIndex(keys: StringDictionary[Double | String]): Unit = js.native
  def _ensureIndex(keys: String): Unit = js.native
  def _ensureIndex(keys: String, options: StringDictionary[js.Any]): Unit = js.native
  def _ensureIndex(keys: StringDictionary[Double | String]): Unit = js.native
  def _ensureIndex(keys: StringDictionary[Double | String], options: StringDictionary[js.Any]): Unit = js.native
  def allow(options: AnonFetch[T]): Boolean = js.native
  def deny(options: AnonFetch[T]): Boolean = js.native
  def find(): Cursor[T] = js.native
  def find(selector: String): Cursor[T] = js.native
  def find(selector: String, options: AnonLimit): Cursor[T] = js.native
  def find(selector: ObjectID): Cursor[T] = js.native
  def find(selector: ObjectID, options: AnonLimit): Cursor[T] = js.native
  def find(selector: Selector[T]): Cursor[T] = js.native
  def find(selector: Selector[T], options: AnonLimit): Cursor[T] = js.native
  def findOne(): js.UndefOr[T] = js.native
  def findOne(selector: String): js.UndefOr[T] = js.native
  def findOne(selector: String, options: AnonSkip): js.UndefOr[T] = js.native
  def findOne(selector: ObjectID): js.UndefOr[T] = js.native
  def findOne(selector: ObjectID, options: AnonSkip): js.UndefOr[T] = js.native
  def findOne(selector: Selector[T]): js.UndefOr[T] = js.native
  def findOne(selector: Selector[T], options: AnonSkip): js.UndefOr[T] = js.native
  def insert(doc: OptionalId[T]): String = js.native
  def insert(doc: OptionalId[T], callback: js.Function): String = js.native
  def rawCollection(): js.Any = js.native
  def rawDatabase(): js.Any = js.native
  def remove(selector: String): Double = js.native
  def remove(selector: String, callback: js.Function): Double = js.native
  def remove(selector: ObjectID): Double = js.native
  def remove(selector: ObjectID, callback: js.Function): Double = js.native
  def remove(selector: Selector[T]): Double = js.native
  def remove(selector: Selector[T], callback: js.Function): Double = js.native
  def update(selector: String, modifier: Modifier[T]): Double = js.native
  def update(selector: String, modifier: Modifier[T], options: AnonMulti): Double = js.native
  def update(selector: String, modifier: Modifier[T], options: AnonMulti, callback: js.Function): Double = js.native
  def update(selector: ObjectID, modifier: Modifier[T]): Double = js.native
  def update(selector: ObjectID, modifier: Modifier[T], options: AnonMulti): Double = js.native
  def update(selector: ObjectID, modifier: Modifier[T], options: AnonMulti, callback: js.Function): Double = js.native
  def update(selector: Selector[T], modifier: Modifier[T]): Double = js.native
  def update(selector: Selector[T], modifier: Modifier[T], options: AnonMulti): Double = js.native
  def update(selector: Selector[T], modifier: Modifier[T], options: AnonMulti, callback: js.Function): Double = js.native
  def upsert(selector: String, modifier: Modifier[T]): AnonInsertedId = js.native
  def upsert(selector: String, modifier: Modifier[T], options: AnonMultiBoolean): AnonInsertedId = js.native
  def upsert(selector: String, modifier: Modifier[T], options: AnonMultiBoolean, callback: js.Function): AnonInsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier[T]): AnonInsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier[T], options: AnonMultiBoolean): AnonInsertedId = js.native
  def upsert(selector: ObjectID, modifier: Modifier[T], options: AnonMultiBoolean, callback: js.Function): AnonInsertedId = js.native
  def upsert(selector: Selector[T], modifier: Modifier[T]): AnonInsertedId = js.native
  def upsert(selector: Selector[T], modifier: Modifier[T], options: AnonMultiBoolean): AnonInsertedId = js.native
  def upsert(selector: Selector[T], modifier: Modifier[T], options: AnonMultiBoolean, callback: js.Function): AnonInsertedId = js.native
}

@JSImport("meteor/mongo", "Mongo.Collection")
@js.native
object Collection extends TopLevel[CollectionStatic]

