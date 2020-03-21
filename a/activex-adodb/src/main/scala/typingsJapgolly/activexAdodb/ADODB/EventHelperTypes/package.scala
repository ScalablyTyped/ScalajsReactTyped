package typingsJapgolly.activexAdodb.ADODB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  type ConnectionExecuteCompleteArgNames = js.Tuple6[
    typingsJapgolly.activexAdodb.activexAdodbStrings.RecordsAffected, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.pError, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.adStatus, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.pCommand, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.pRecordset, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.pConnection
  ]
  type ConnectionWillConnectArgNames = js.Tuple6[
    typingsJapgolly.activexAdodb.activexAdodbStrings.ConnectionString, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.UserID, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.Password, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.Options, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.adStatus, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.pConnection
  ]
  type ConnectionWillExecuteArgNames = js.Tuple8[
    typingsJapgolly.activexAdodb.activexAdodbStrings.Source, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.CursorType, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.LockType, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.Options, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.adStatus, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.pCommand, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.pRecordset, 
    typingsJapgolly.activexAdodb.activexAdodbStrings.pConnection
  ]
}
