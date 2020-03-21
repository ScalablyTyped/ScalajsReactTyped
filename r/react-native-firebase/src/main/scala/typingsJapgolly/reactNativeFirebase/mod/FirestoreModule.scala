package typingsJapgolly.reactNativeFirebase.mod

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.reactNativeFirebase.TypeofBlob
import typingsJapgolly.reactNativeFirebase.TypeofFieldPath
import typingsJapgolly.reactNativeFirebase.TypeofFieldValue
import typingsJapgolly.reactNativeFirebase.TypeofTimestamp
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Firestore
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.debug
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.error_
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.silent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-firebase.react-native-firebase.FirebaseModuleAndStatics<react-native-firebase.react-native-firebase.RNFirebase.firestore.Firestore, react-native-firebase.react-native-firebase.RNFirebase.firestore.FirestoreStatics> */
@js.native
trait FirestoreModule extends js.Object {
  var Blob: TypeofBlob = js.native
  var FieldPath: TypeofFieldPath = js.native
  var FieldValue: TypeofFieldValue = js.native
  var GeoPoint: Instantiable2[
    /* latitude */ Double, 
    /* longitude */ Double, 
    typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.GeoPoint
  ] = js.native
  var Timestamp: TypeofTimestamp = js.native
  var nativeModuleExists: Boolean = js.native
  def apply(): Firestore = js.native
  def enableLogging(enabled: Boolean): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_debug(logLevel: debug): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_error(logLevel: error_): Unit = js.native
  @JSName("setLogLevel")
  def setLogLevel_silent(logLevel: silent): Unit = js.native
}

