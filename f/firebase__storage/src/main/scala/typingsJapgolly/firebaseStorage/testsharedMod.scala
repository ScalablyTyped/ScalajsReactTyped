package typingsJapgolly.firebaseStorage

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseAppTypes.mod.FirebaseApp
import typingsJapgolly.firebaseAuthInteropTypes.mod.FirebaseAuthInternal
import typingsJapgolly.firebaseComponent.mod.Provider
import typingsJapgolly.firebaseStorage.errorMod.Code
import typingsJapgolly.firebaseStorage.errorMod.FirebaseStorageError
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.`totally-legit-auth-token`
import typingsJapgolly.firebaseStorage.firebaseStorageStrings.mybucket
import typingsJapgolly.firebaseStorage.testXhrioMod.SendHook
import typingsJapgolly.firebaseStorage.xhrioMod.Headers
import typingsJapgolly.firebaseStorage.xhrioMod.XhrIo
import typingsJapgolly.firebaseStorage.xhriopoolMod.XhrIoPool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/storage/dist/test/testshared", JSImport.Namespace)
@js.native
object testsharedMod extends js.Object {
  val authToken: `totally-legit-auth-token` = js.native
  val bucket: mybucket = js.native
  val emptyAuthProvider: js.Any = js.native
  val fakeApp: FirebaseApp = js.native
  val fakeAuthProvider: Provider[FirebaseAuthInternal] = js.native
  def assertObjectIncludes(included: StringDictionary[js.Any], obj: StringDictionary[js.Any]): Unit = js.native
  def assertThrows(f: js.Function0[Unit], code: Code): FirebaseStorageError = js.native
  def assertUint8ArrayEquals(arr1: scala.scalajs.js.typedarray.Uint8Array, arr2: scala.scalajs.js.typedarray.Uint8Array): Unit = js.native
  def bind(f: js.Function, ctx: js.Any, args: js.Any*): js.Function0[Unit] = js.native
  def fakeXhrIo(headers: Headers): XhrIo = js.native
  def fakeXhrIo(headers: Headers, status: Double): XhrIo = js.native
  def makeFakeApp(): FirebaseApp = js.native
  def makeFakeApp(bucketArg: String): FirebaseApp = js.native
  def makeFakeAuthProvider(): Provider[FirebaseAuthInternal] = js.native
  def makeFakeAuthProvider(token: js.Object): Provider[FirebaseAuthInternal] = js.native
  def makePool(): XhrIoPool = js.native
  def makePool(sendHook: SendHook): XhrIoPool = js.native
}

