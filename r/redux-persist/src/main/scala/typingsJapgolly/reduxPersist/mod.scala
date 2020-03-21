package typingsJapgolly.reduxPersist

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.ReducersMapObject
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.reduxPersist.createMigrateMod.MigrationConfig
import typingsJapgolly.reduxPersist.createTransformMod.TransformConfig
import typingsJapgolly.reduxPersist.persistReducerMod.PersistPartial
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistColon
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashFLUSH
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashPAUSE
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashPERSIST
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashPURGE
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashREGISTER
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashREHYDRATE
import typingsJapgolly.reduxPersist.typesMod.MigrationManifest
import typingsJapgolly.reduxPersist.typesMod.PersistConfig
import typingsJapgolly.reduxPersist.typesMod.PersistMigrate
import typingsJapgolly.reduxPersist.typesMod.Persistoid
import typingsJapgolly.reduxPersist.typesMod.Persistor
import typingsJapgolly.reduxPersist.typesMod.PersistorOptions
import typingsJapgolly.reduxPersist.typesMod.Transform
import typingsJapgolly.reduxPersist.typesMod.TransformInbound
import typingsJapgolly.reduxPersist.typesMod.TransformOutbound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This is not single module. There are many module included by reference directives.
// tslint:disable-next-line: no-single-declare-module
@JSImport("redux-persist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DEFAULT_VERSION: Double = js.native
  val FLUSH: persistSlashFLUSH = js.native
  val KEY_PREFIX: persistColon = js.native
  val PAUSE: persistSlashPAUSE = js.native
  val PERSIST: persistSlashPERSIST = js.native
  val PURGE: persistSlashPURGE = js.native
  val REGISTER: persistSlashREGISTER = js.native
  val REHYDRATE: persistSlashREHYDRATE = js.native
  def createMigrate(migrations: MigrationManifest): PersistMigrate = js.native
  def createMigrate(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = js.native
  def createPersistoid(config: PersistConfig[_, _, _, _]): Persistoid = js.native
  def createTransform[HSS, ESS, S, RS](): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S]): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = js.native
  def createTransform[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = js.native
  def getStoredState(config: PersistConfig[_, _, _, _]): js.Promise[js.UndefOr[js.Object]] = js.native
  def persistCombineReducers[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], reducers: ReducersMapObject[S, A]): Reducer[S with PersistPartial, A] = js.native
  def persistReducer[S, A /* <: Action[_] */](config: PersistConfig[S, _, _, _], baseReducer: Reducer[S, A]): Reducer[S with PersistPartial, A] = js.native
  def persistStore(store: Store[_, AnyAction]): Persistor = js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: Null, callback: js.Function0[_]): Persistor = js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: PersistorOptions): Persistor = js.native
  def persistStore(store: Store[_, AnyAction], persistorOptions: PersistorOptions, callback: js.Function0[_]): Persistor = js.native
  def purgeStoredState[S](config: PersistConfig[S, _, _, _]): js.Any = js.native
}

