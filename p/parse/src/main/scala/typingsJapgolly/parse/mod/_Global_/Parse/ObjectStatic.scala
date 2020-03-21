package typingsJapgolly.parse.mod._Global_.Parse

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.parse.AnonClassName
import typingsJapgolly.parse.mod._Global_.Parse.Object.DestroyAllOptions
import typingsJapgolly.parse.mod._Global_.Parse.Object.FetchAllOptions
import typingsJapgolly.parse.mod._Global_.Parse.Object.SaveAllOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectStatic extends js.Object {
  def createWithoutData[T /* <: Object[Attributes] */](id: String): T = js.native
  def destroyAll[T /* <: Object[Attributes] */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def destroyAll[T /* <: Object[Attributes] */](list: js.Array[T], options: DestroyAllOptions): js.Promise[js.Array[T]] = js.native
  def extend(className: String): js.Any = js.native
  def extend(className: String, protoProps: js.Any): js.Any = js.native
  def extend(className: String, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def extend(className: AnonClassName): js.Any = js.native
  def extend(className: AnonClassName, protoProps: js.Any): js.Any = js.native
  def extend(className: AnonClassName, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def fetchAll[T /* <: Object[Attributes] */](list: js.Array[T], options: FetchAllOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllIfNeeded[T /* <: Object[Attributes] */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def fetchAllIfNeeded[T /* <: Object[Attributes] */](list: js.Array[T], options: FetchAllOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllIfNeededWithInclude[T /* <: Object[Attributes] */](list: js.Array[T], keys: String): js.Promise[js.Array[T]] = js.native
  def fetchAllIfNeededWithInclude[T /* <: Object[Attributes] */](list: js.Array[T], keys: String, options: RequestOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllIfNeededWithInclude[T /* <: Object[Attributes] */](list: js.Array[T], keys: js.Array[String | js.Array[String]]): js.Promise[js.Array[T]] = js.native
  def fetchAllIfNeededWithInclude[T /* <: Object[Attributes] */](list: js.Array[T], keys: js.Array[String | js.Array[String]], options: RequestOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: Object[Attributes] */](list: js.Array[T], keys: String): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: Object[Attributes] */](list: js.Array[T], keys: String, options: RequestOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: Object[Attributes] */](list: js.Array[T], keys: js.Array[String | js.Array[String]]): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: Object[Attributes] */](list: js.Array[T], keys: js.Array[String | js.Array[String]], options: RequestOptions): js.Promise[js.Array[T]] = js.native
  def fromJSON[T /* <: Object[Attributes] */](json: js.Any): T = js.native
  def fromJSON[T /* <: Object[Attributes] */](json: js.Any, `override`: Boolean): T = js.native
  def pinAll(objects: js.Array[Object[Attributes]]): js.Promise[Unit] = js.native
  def pinAllWithName(name: String, objects: js.Array[Object[Attributes]]): js.Promise[Unit] = js.native
  def registerSubclass[T /* <: Object[Attributes] */](className: String, clazz: Instantiable1[js.UndefOr[/* options */ js.Any], T]): Unit = js.native
  def saveAll[T /* <: js.Array[Object[Attributes]] */](list: T): js.Promise[T] = js.native
  def saveAll[T /* <: js.Array[Object[Attributes]] */](list: T, options: SaveAllOptions): js.Promise[T] = js.native
  def unPinAll(objects: js.Array[Object[Attributes]]): js.Promise[Unit] = js.native
  def unPinAllObjects(): js.Promise[Unit] = js.native
  def unPinAllObjectsWithName(name: String): js.Promise[Unit] = js.native
  def unPinAllWithName(name: String, objects: js.Array[Object[Attributes]]): js.Promise[Unit] = js.native
}

