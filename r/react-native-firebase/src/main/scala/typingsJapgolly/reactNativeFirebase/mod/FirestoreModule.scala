package typingsJapgolly.reactNativeFirebase.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.reactNativeFirebase.anon.TypeofBlob
import typingsJapgolly.reactNativeFirebase.anon.TypeofFieldPath
import typingsJapgolly.reactNativeFirebase.anon.TypeofFieldValue
import typingsJapgolly.reactNativeFirebase.anon.TypeofTimestamp
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Firestore
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.debug
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.error_
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.silent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-firebase.react-native-firebase.FirebaseModuleAndStatics<react-native-firebase.react-native-firebase.RNFirebase.firestore.Firestore, react-native-firebase.react-native-firebase.RNFirebase.firestore.FirestoreStatics> */
@js.native
trait FirestoreModule extends StObject {
  
  def apply(): Firestore = js.native
  
  var Blob: TypeofBlob & Instantiable0[typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Blob] = js.native
  
  var FieldPath: TypeofFieldPath & (Instantiable1[
    /* segments (repeated) */ String, 
    typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.FieldPath
  ]) = js.native
  
  var FieldValue: TypeofFieldValue & Instantiable0[typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.FieldValue] = js.native
  
  var GeoPoint: Instantiable2[
    /* latitude */ Double, 
    /* longitude */ Double, 
    typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.GeoPoint
  ] = js.native
  
  var Timestamp: TypeofTimestamp & (Instantiable2[
    /* seconds */ Double, 
    /* nanoseconds */ Double, 
    typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Timestamp
  ]) = js.native
  
  def enableLogging(enabled: Boolean): Unit = js.native
  
  var nativeModuleExists: Boolean = js.native
  
  def setLogLevel(logLevel: debug | error_ | silent): Unit = js.native
}
