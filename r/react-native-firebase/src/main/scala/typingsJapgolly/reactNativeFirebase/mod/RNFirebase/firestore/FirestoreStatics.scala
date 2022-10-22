package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.reactNativeFirebase.anon.TypeofBlob
import typingsJapgolly.reactNativeFirebase.anon.TypeofFieldPath
import typingsJapgolly.reactNativeFirebase.anon.TypeofFieldValue
import typingsJapgolly.reactNativeFirebase.anon.TypeofTimestamp
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.debug
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.error_
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.silent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirestoreStatics extends StObject {
  
  var Blob: TypeofBlob & Instantiable0[typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Blob]
  
  var FieldPath: TypeofFieldPath & (Instantiable1[
    /* segments (repeated) */ String, 
    typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.FieldPath
  ])
  
  var FieldValue: TypeofFieldValue & Instantiable0[typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.FieldValue]
  
  var GeoPoint: Instantiable2[
    /* latitude */ Double, 
    /* longitude */ Double, 
    typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.GeoPoint
  ]
  
  var Timestamp: TypeofTimestamp & (Instantiable2[
    /* seconds */ Double, 
    /* nanoseconds */ Double, 
    typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore.Timestamp
  ])
  
  def enableLogging(enabled: Boolean): Unit
  
  def setLogLevel(logLevel: debug | error_ | silent): Unit
}
object FirestoreStatics {
  
  inline def apply(
    Blob: TypeofBlob & Instantiable0[Blob],
    FieldPath: TypeofFieldPath & (Instantiable1[/* segments (repeated) */ String, FieldPath]),
    FieldValue: TypeofFieldValue & Instantiable0[FieldValue],
    GeoPoint: Instantiable2[/* latitude */ Double, /* longitude */ Double, GeoPoint],
    Timestamp: TypeofTimestamp & (Instantiable2[/* seconds */ Double, /* nanoseconds */ Double, Timestamp]),
    enableLogging: Boolean => Callback,
    setLogLevel: debug | error_ | silent => Callback
  ): FirestoreStatics = {
    val __obj = js.Dynamic.literal(Blob = Blob.asInstanceOf[js.Any], FieldPath = FieldPath.asInstanceOf[js.Any], FieldValue = FieldValue.asInstanceOf[js.Any], GeoPoint = GeoPoint.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], enableLogging = js.Any.fromFunction1((t0: Boolean) => enableLogging(t0).runNow()), setLogLevel = js.Any.fromFunction1((t0: debug | error_ | silent) => setLogLevel(t0).runNow()))
    __obj.asInstanceOf[FirestoreStatics]
  }
  
  extension [Self <: FirestoreStatics](x: Self) {
    
    inline def setBlob(value: TypeofBlob & Instantiable0[Blob]): Self = StObject.set(x, "Blob", value.asInstanceOf[js.Any])
    
    inline def setEnableLogging(value: Boolean => Callback): Self = StObject.set(x, "enableLogging", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setFieldPath(value: TypeofFieldPath & (Instantiable1[/* segments (repeated) */ String, FieldPath])): Self = StObject.set(x, "FieldPath", value.asInstanceOf[js.Any])
    
    inline def setFieldValue(value: TypeofFieldValue & Instantiable0[FieldValue]): Self = StObject.set(x, "FieldValue", value.asInstanceOf[js.Any])
    
    inline def setGeoPoint(value: Instantiable2[/* latitude */ Double, /* longitude */ Double, GeoPoint]): Self = StObject.set(x, "GeoPoint", value.asInstanceOf[js.Any])
    
    inline def setSetLogLevel(value: debug | error_ | silent => Callback): Self = StObject.set(x, "setLogLevel", js.Any.fromFunction1((t0: debug | error_ | silent) => value(t0).runNow()))
    
    inline def setTimestamp(
      value: TypeofTimestamp & (Instantiable2[/* seconds */ Double, /* nanoseconds */ Double, Timestamp])
    ): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
  }
}
