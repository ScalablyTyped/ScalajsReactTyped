package typingsJapgolly.reactNativeFirebase

import typingsJapgolly.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase/database", JSImport.Namespace)
@js.native
object databaseMod extends js.Object {
  @js.native
  trait ThenableReference[T]
    extends typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.Reference
       with Promise[T]
  
  type DataSnapshot = typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.DataSnapshot
  type Database = typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.Database
  type DatabaseStatics = typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.DatabaseStatics
  type Query = typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.Query
  type QueryErrorCallback = typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.QueryErrorCallback
  type QueryEventType = typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.QueryEventType
  type QuerySuccessCallback = typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.QuerySuccessCallback
  type Reference = typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.Reference
  type RnReference = typingsJapgolly.reactNativeFirebase.mod.RNFirebase.database.RnReference
}

