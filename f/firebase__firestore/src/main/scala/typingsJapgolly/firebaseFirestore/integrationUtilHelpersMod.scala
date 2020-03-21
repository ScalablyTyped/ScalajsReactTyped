package typingsJapgolly.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.`test-db2`
import typingsJapgolly.firebaseFirestoreTypes.mod.CollectionReference
import typingsJapgolly.firebaseFirestoreTypes.mod.DocumentData
import typingsJapgolly.firebaseFirestoreTypes.mod.DocumentReference
import typingsJapgolly.firebaseFirestoreTypes.mod.FirebaseFirestore
import typingsJapgolly.firebaseFirestoreTypes.mod.QuerySnapshot
import typingsJapgolly.firebaseFirestoreTypes.mod.Settings
import typingsJapgolly.firebaseFirestoreTypes.mod.SnapshotListenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/integration/util/helpers", JSImport.Namespace)
@js.native
object integrationUtilHelpersMod extends js.Object {
  @js.native
  trait ApiDescribe_ extends js.Object {
    @JSName("only")
    var only_Original: ApiSuiteFunction = js.native
    @JSName("skip")
    var skip_Original: ApiSuiteFunction = js.native
    def apply(message: String, testSuite: js.Function1[/* persistence */ Boolean, Unit]): Unit = js.native
    def only(message: String, testSuite: js.Function1[/* persistence */ Boolean, Unit]): Unit = js.native
    def skip(message: String, testSuite: js.Function1[/* persistence */ Boolean, Unit]): Unit = js.native
  }
  
  val ALT_PROJECT_ID: `test-db2` = js.native
  val DEFAULT_PROJECT_ID: js.Any = js.native
  val DEFAULT_SETTINGS: Settings = js.native
  val USE_EMULATOR: Boolean = js.native
  val apiDescribe: ApiDescribe_ = js.native
  def isPersistenceAvailable(): Boolean = js.native
  def isRunningAgainstEmulator(): Boolean = js.native
  def toChangesArray(docSet: QuerySnapshot[DocumentData]): js.Array[DocumentData] = js.native
  def toChangesArray(docSet: QuerySnapshot[DocumentData], options: SnapshotListenOptions): js.Array[DocumentData] = js.native
  def toDataArray(docSet: QuerySnapshot[DocumentData]): js.Array[DocumentData] = js.native
  def toDataMap(docSet: QuerySnapshot[DocumentData]): StringDictionary[DocumentData] = js.native
  def toIds(docSet: QuerySnapshot[DocumentData]): js.Array[String] = js.native
  def withAlternateTestDb(persistence: Boolean, fn: js.Function1[/* db */ FirebaseFirestore, js.Promise[Unit]]): js.Promise[Unit] = js.native
  def withTestCollection(
    persistence: Boolean,
    docs: StringDictionary[DocumentData],
    fn: js.Function1[/* collection */ CollectionReference[DocumentData], js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  def withTestCollectionSettings(
    persistence: Boolean,
    settings: Settings,
    docs: StringDictionary[DocumentData],
    fn: js.Function1[/* collection */ CollectionReference[DocumentData], js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  def withTestDb(persistence: Boolean, fn: js.Function1[/* db */ FirebaseFirestore, js.Promise[Unit]]): js.Promise[Unit] = js.native
  def withTestDbs(
    persistence: Boolean,
    numDbs: Double,
    fn: js.Function1[/* db */ js.Array[FirebaseFirestore], js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  def withTestDbsSettings(
    persistence: Boolean,
    projectId: String,
    settings: Settings,
    numDbs: Double,
    fn: js.Function1[/* db */ js.Array[FirebaseFirestore], js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  def withTestDoc(
    persistence: Boolean,
    fn: js.Function1[/* doc */ DocumentReference[DocumentData], js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  def withTestDocAndInitialData(
    persistence: Boolean,
    initialData: Null,
    fn: js.Function1[/* doc */ DocumentReference[DocumentData], js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  def withTestDocAndInitialData(
    persistence: Boolean,
    initialData: DocumentData,
    fn: js.Function1[/* doc */ DocumentReference[DocumentData], js.Promise[Unit]]
  ): js.Promise[Unit] = js.native
  type ApiSuiteFunction = js.Function2[
    /* message */ String, 
    /* testSuite */ js.Function1[/* persistence */ Boolean, Unit], 
    Unit
  ]
}

