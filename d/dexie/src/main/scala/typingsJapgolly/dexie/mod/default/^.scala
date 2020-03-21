package typingsJapgolly.dexie.mod.default

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.dexie.AnonIDBKeyRange
import typingsJapgolly.dexie.mod.Dexie
import typingsJapgolly.dexie.mod.Dexie.DexiePromiseConstructor
import typingsJapgolly.dexie.mod.Dexie.Transaction
import typingsJapgolly.dexie.mod.ThenShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", JSImport.Default)
@js.native
object ^ extends js.Object {
  var Promise: DexiePromiseConstructor = js.native
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(IndexSpec, Events) */ var TableSchema: Instantiable0[typingsJapgolly.dexie.mod.Dexie.TableSchema] = js.native
  var addons: js.Array[js.Function1[/* db */ Dexie, Unit]] = js.native
  var currentTransaction: Transaction = js.native
  var default: Dexie = js.native
  var dependencies: AnonIDBKeyRange = js.native
  var maxKey: js.Array[js.Array[Unit]] | String = js.native
  var minKey: Double = js.native
  var semVer: String = js.native
  var version: Double = js.native
  def asap(fn: js.Function): Unit = js.native
  def deepClone[T](obj: T): T = js.native
  def delByKeyPath(obj: js.Object, keyPath: String): Unit = js.native
  def delete(dbName: String): typingsJapgolly.dexie.mod.Dexie.Promise[Unit] = js.native
  def exists(dbName: String): typingsJapgolly.dexie.mod.Dexie.Promise[Boolean] = js.native
  def getByKeyPath(obj: js.Object, keyPath: String): js.Any = js.native
  def getDatabaseNames(): typingsJapgolly.dexie.mod.Dexie.Promise[js.Array[String]] = js.native
  def getDatabaseNames[R](thenShortcut: ThenShortcut[js.Array[String], R]): typingsJapgolly.dexie.mod.Dexie.Promise[R] = js.native
  def `override`[F](origFunc: F, overridedFactory: js.Function1[/* fn */ js.Any, _]): F = js.native
  def setByKeyPath(obj: js.Object, keyPath: String, value: js.Any): Unit = js.native
  def shallowClone[T](obj: T): T = js.native
  def waitFor[T](promise: T): typingsJapgolly.dexie.mod.Dexie.Promise[T] = js.native
  def waitFor[T](promise: T, timeoutMilliseconds: Double): typingsJapgolly.dexie.mod.Dexie.Promise[T] = js.native
  def waitFor[T](promise: js.Thenable[T]): typingsJapgolly.dexie.mod.Dexie.Promise[T] = js.native
  def waitFor[T](promise: js.Thenable[T], timeoutMilliseconds: Double): typingsJapgolly.dexie.mod.Dexie.Promise[T] = js.native
}

