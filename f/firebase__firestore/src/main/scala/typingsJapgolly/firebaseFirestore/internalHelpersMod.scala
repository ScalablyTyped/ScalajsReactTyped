package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.asyncQueueMod.AsyncQueue
import typingsJapgolly.firebaseFirestore.credentialsMod.CredentialsProvider
import typingsJapgolly.firebaseFirestore.credentialsMod.EmptyCredentialsProvider
import typingsJapgolly.firebaseFirestore.databaseInfoMod.DatabaseInfo
import typingsJapgolly.firebaseFirestore.datastoreMod.Datastore
import typingsJapgolly.firebaseFirestore.userMod.User
import typingsJapgolly.firebaseFirestoreTypes.mod.FirebaseFirestore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/integration/util/internal_helpers", JSImport.Namespace)
@js.native
object internalHelpersMod extends js.Object {
  @js.native
  class MockCredentialsProvider () extends EmptyCredentialsProvider {
    var listener: js.Any = js.native
    def triggerUserChange(newUser: User): Unit = js.native
  }
  
  def asyncQueue(db: FirebaseFirestore): AsyncQueue = js.native
  def getDefaultDatabaseInfo(): DatabaseInfo = js.native
  def withMockCredentialProviderTestDb(
    persistence: Boolean,
    fn: js.Function2[
      /* db */ FirebaseFirestore, 
      /* mockCredential */ MockCredentialsProvider, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def withTestDatastore(fn: js.Function1[/* datastore */ Datastore, js.Promise[Unit]]): js.Promise[Unit] = js.native
  def withTestDatastore(fn: js.Function1[/* datastore */ Datastore, js.Promise[Unit]], queue: AsyncQueue): js.Promise[Unit] = js.native
  def withTestDatastore(
    fn: js.Function1[/* datastore */ Datastore, js.Promise[Unit]],
    queue: AsyncQueue,
    credentialsProvider: CredentialsProvider
  ): js.Promise[Unit] = js.native
}

