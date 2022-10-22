package typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PersistenceFunction extends StObject
@JSImport("@firebase/auth/dist/cordova/test/integration/webdriver/util/functions", "PersistenceFunction")
@js.native
object PersistenceFunction extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PersistenceFunction & String] = js.native
  
  @js.native
  sealed trait CLEAR_PERSISTENCE
    extends StObject
       with PersistenceFunction
  /* "persistence.clearPersistence" */ val CLEAR_PERSISTENCE: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.CLEAR_PERSISTENCE & String = js.native
  
  @js.native
  sealed trait INDEXED_DB_SNAP
    extends StObject
       with PersistenceFunction
  /* "persistence.indexedDBSnap" */ val INDEXED_DB_SNAP: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.INDEXED_DB_SNAP & String = js.native
  
  @js.native
  sealed trait LOCAL_STORAGE_SET
    extends StObject
       with PersistenceFunction
  /* "persistence.localStorageSet" */ val LOCAL_STORAGE_SET: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.LOCAL_STORAGE_SET & String = js.native
  
  @js.native
  sealed trait LOCAL_STORAGE_SNAP
    extends StObject
       with PersistenceFunction
  /* "persistence.localStorageSnap" */ val LOCAL_STORAGE_SNAP: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.LOCAL_STORAGE_SNAP & String = js.native
  
  @js.native
  sealed trait MAKE_INDEXED_DB_READONLY
    extends StObject
       with PersistenceFunction
  /* "persistence.makeIndexedDBReadonly" */ val MAKE_INDEXED_DB_READONLY: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.MAKE_INDEXED_DB_READONLY & String = js.native
  
  @js.native
  sealed trait SESSION_STORAGE_SET
    extends StObject
       with PersistenceFunction
  /* "persistence.sessionStorageSet" */ val SESSION_STORAGE_SET: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.SESSION_STORAGE_SET & String = js.native
  
  @js.native
  sealed trait SESSION_STORAGE_SNAP
    extends StObject
       with PersistenceFunction
  /* "persistence.sessionStorageSnap" */ val SESSION_STORAGE_SNAP: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.SESSION_STORAGE_SNAP & String = js.native
  
  @js.native
  sealed trait SET_PERSISTENCE_INDEXED_DB
    extends StObject
       with PersistenceFunction
  /* "persistence.setPersistenceIndexedDB" */ val SET_PERSISTENCE_INDEXED_DB: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.SET_PERSISTENCE_INDEXED_DB & String = js.native
  
  @js.native
  sealed trait SET_PERSISTENCE_LOCAL_STORAGE
    extends StObject
       with PersistenceFunction
  /* "persistence.setPersistenceLocalStorage" */ val SET_PERSISTENCE_LOCAL_STORAGE: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.SET_PERSISTENCE_LOCAL_STORAGE & String = js.native
  
  @js.native
  sealed trait SET_PERSISTENCE_MEMORY
    extends StObject
       with PersistenceFunction
  /* "persistence.setPersistenceMemory" */ val SET_PERSISTENCE_MEMORY: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.SET_PERSISTENCE_MEMORY & String = js.native
  
  @js.native
  sealed trait SET_PERSISTENCE_SESSION
    extends StObject
       with PersistenceFunction
  /* "persistence.setPersistenceSession" */ val SET_PERSISTENCE_SESSION: typingsJapgolly.firebaseAuth.distCordovaTestIntegrationWebdriverUtilFunctionsMod.PersistenceFunction.SET_PERSISTENCE_SESSION & String = js.native
}
