package typingsJapgolly.reduxPersist

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.ReducersMapObject
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.reduxPersist.esCreateMigrateMod.MigrationConfig
import typingsJapgolly.reduxPersist.esCreateTransformMod.TransformConfig
import typingsJapgolly.reduxPersist.esPersistReducerMod.PersistPartial
import typingsJapgolly.reduxPersist.esTypesMod.MigrationManifest
import typingsJapgolly.reduxPersist.esTypesMod.PersistConfig
import typingsJapgolly.reduxPersist.esTypesMod.PersistMigrate
import typingsJapgolly.reduxPersist.esTypesMod.Persistoid
import typingsJapgolly.reduxPersist.esTypesMod.Persistor
import typingsJapgolly.reduxPersist.esTypesMod.PersistorOptions
import typingsJapgolly.reduxPersist.esTypesMod.Transform
import typingsJapgolly.reduxPersist.esTypesMod.TransformInbound
import typingsJapgolly.reduxPersist.esTypesMod.TransformOutbound
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistColon
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashFLUSH
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashPAUSE
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashPERSIST
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashPURGE
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashREGISTER
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashREHYDRATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// This is not single module. There are many module included by reference directives.
// tslint:disable-next-line: no-single-declare-module
object mod {
  
  @JSImport("redux-persist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-persist", "DEFAULT_VERSION")
  @js.native
  val DEFAULT_VERSION: Double = js.native
  
  @JSImport("redux-persist", "FLUSH")
  @js.native
  val FLUSH: persistSlashFLUSH = js.native
  
  @JSImport("redux-persist", "KEY_PREFIX")
  @js.native
  val KEY_PREFIX: persistColon = js.native
  
  @JSImport("redux-persist", "PAUSE")
  @js.native
  val PAUSE: persistSlashPAUSE = js.native
  
  @JSImport("redux-persist", "PERSIST")
  @js.native
  val PERSIST: persistSlashPERSIST = js.native
  
  @JSImport("redux-persist", "PURGE")
  @js.native
  val PURGE: persistSlashPURGE = js.native
  
  @JSImport("redux-persist", "REGISTER")
  @js.native
  val REGISTER: persistSlashREGISTER = js.native
  
  @JSImport("redux-persist", "REHYDRATE")
  @js.native
  val REHYDRATE: persistSlashREHYDRATE = js.native
  
  inline def createMigrate(migrations: MigrationManifest): PersistMigrate = ^.asInstanceOf[js.Dynamic].applyDynamic("createMigrate")(migrations.asInstanceOf[js.Any]).asInstanceOf[PersistMigrate]
  inline def createMigrate(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = (^.asInstanceOf[js.Dynamic].applyDynamic("createMigrate")(migrations.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[PersistMigrate]
  
  inline def createPersistoid(config: PersistConfig[Any, Any, Any, Any]): Persistoid = ^.asInstanceOf[js.Dynamic].applyDynamic("createPersistoid")(config.asInstanceOf[js.Any]).asInstanceOf[Persistoid]
  
  inline def createTransform[HSS, ESS, S, RS](): Transform[HSS, ESS, S, RS] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")().asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: Unit, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Null, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Unit, outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Unit, outbound: Unit, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Unit, outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: Unit, outbound: TransformOutbound[ESS, HSS, RS], config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S]): Transform[HSS, ESS, S, RS] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any]).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Null, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: Unit, config: TransformConfig): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](inbound: TransformInbound[HSS, ESS, S], outbound: TransformOutbound[ESS, HSS, RS]): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  inline def createTransform[HSS, ESS, S, RS](
    inbound: TransformInbound[HSS, ESS, S],
    outbound: TransformOutbound[ESS, HSS, RS],
    config: TransformConfig
  ): Transform[HSS, ESS, S, RS] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTransform")(inbound.asInstanceOf[js.Any], outbound.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Transform[HSS, ESS, S, RS]]
  
  inline def getStoredState(config: PersistConfig[Any, Any, Any, Any]): js.Promise[js.UndefOr[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStoredState")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[js.Object]]]
  
  inline def persistCombineReducers[S, A /* <: Action[Any] */](config: PersistConfig[S, Any, Any, Any], reducers: ReducersMapObject[S, A]): Reducer[S & PersistPartial, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistCombineReducers")(config.asInstanceOf[js.Any], reducers.asInstanceOf[js.Any])).asInstanceOf[Reducer[S & PersistPartial, A]]
  
  inline def persistReducer[S, A /* <: Action[Any] */](config: PersistConfig[S, Any, Any, Any], baseReducer: Reducer[S, A]): Reducer[S & PersistPartial, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("persistReducer")(config.asInstanceOf[js.Any], baseReducer.asInstanceOf[js.Any])).asInstanceOf[Reducer[S & PersistPartial, A]]
  
  inline def persistStore(store: Store[Any, AnyAction]): Persistor = ^.asInstanceOf[js.Dynamic].applyDynamic("persistStore")(store.asInstanceOf[js.Any]).asInstanceOf[Persistor]
  inline def persistStore(store: Store[Any, AnyAction], persistorOptions: Null, callback: js.Function0[Any]): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("persistStore")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  inline def persistStore(store: Store[Any, AnyAction], persistorOptions: Unit, callback: js.Function0[Any]): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("persistStore")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  inline def persistStore(store: Store[Any, AnyAction], persistorOptions: PersistorOptions): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("persistStore")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  inline def persistStore(store: Store[Any, AnyAction], persistorOptions: PersistorOptions, callback: js.Function0[Any]): Persistor = (^.asInstanceOf[js.Dynamic].applyDynamic("persistStore")(store.asInstanceOf[js.Any], persistorOptions.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Persistor]
  
  inline def purgeStoredState[S](config: PersistConfig[S, Any, Any, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeStoredState")(config.asInstanceOf[js.Any]).asInstanceOf[Any]
}
