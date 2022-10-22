package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiCredentialsMod.CredentialsProvider
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcApiCredentialsMod.EmptyAuthCredentialsProvider
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcAuthUserMod.User
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseInfo
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcRemoteDatastoreMod.Datastore
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcUtilAsyncQueueImplMod.AsyncQueueImpl
import typingsJapgolly.firebaseFirestore.distLiteFirestoreTestIntegrationUtilFirebaseExportMod.Firestore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreTestIntegrationUtilInternalHelpersMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/integration/util/internal_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/integration/util/internal_helpers", "MockAuthCredentialsProvider")
  @js.native
  open class MockAuthCredentialsProvider () extends EmptyAuthCredentialsProvider {
    
    /* private */ var asyncQueue: Any = js.native
    
    /* private */ var listener: Any = js.native
    
    def triggerUserChange(newUser: User): Unit = js.native
  }
  
  inline def asyncQueue(db: Firestore): AsyncQueueImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncQueue")(db.asInstanceOf[js.Any]).asInstanceOf[AsyncQueueImpl]
  
  inline def getDefaultDatabaseInfo(): DatabaseInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDatabaseInfo")().asInstanceOf[DatabaseInfo]
  
  inline def withMockCredentialProviderTestDb(
    persistence: Boolean,
    fn: js.Function2[
      /* db */ Firestore, 
      /* mockCredential */ MockAuthCredentialsProvider, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withMockCredentialProviderTestDb")(persistence.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestDatastore(fn: js.Function1[/* datastore */ Datastore, js.Promise[Unit]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTestDatastore")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def withTestDatastore(
    fn: js.Function1[/* datastore */ Datastore, js.Promise[Unit]],
    authCredentialsProvider: Unit,
    appCheckTokenProvider: CredentialsProvider[String]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestDatastore")(fn.asInstanceOf[js.Any], authCredentialsProvider.asInstanceOf[js.Any], appCheckTokenProvider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def withTestDatastore(
    fn: js.Function1[/* datastore */ Datastore, js.Promise[Unit]],
    authCredentialsProvider: CredentialsProvider[User]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestDatastore")(fn.asInstanceOf[js.Any], authCredentialsProvider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def withTestDatastore(
    fn: js.Function1[/* datastore */ Datastore, js.Promise[Unit]],
    authCredentialsProvider: CredentialsProvider[User],
    appCheckTokenProvider: CredentialsProvider[String]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestDatastore")(fn.asInstanceOf[js.Any], authCredentialsProvider.asInstanceOf[js.Any], appCheckTokenProvider.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
