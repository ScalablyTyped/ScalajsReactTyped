package typingsJapgolly.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details about results of a UICC application record read operation initiated with MobileBroadbandUiccAppClass.GetRecordDetailsAsync . */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccAppRecordDetailsResult")
@js.native
open class MobileBroadbandUiccAppRecordDetailsResult ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppRecordDetailsResult {
  
  /** Gets an enumeration value specifying what kind of record this is. */
  /* CompleteClass */
  var kind: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.UiccAppRecordKind = js.native
  
  /** Gets a value specifying how read access to this record is determined. */
  /* CompleteClass */
  var readAccessCondition: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.UiccAccessCondition = js.native
  
  /** Gets the count of this record in the list of records provided by this UICC application. */
  /* CompleteClass */
  var recordCount: Double = js.native
  
  /** Gets the size in bytes of this record. */
  /* CompleteClass */
  var recordSize: Double = js.native
  
  /** Gets the status of the operation to retrieve UICC application record details. If this value is not Success, then other properties might not contain valid values. */
  /* CompleteClass */
  var status: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppOperationStatus = js.native
  
  /** Gets a value specifying how write access to this record is determined. */
  /* CompleteClass */
  var writeAccessCondition: typingsJapgolly.winrtUwp.Windows.Networking.NetworkOperators.UiccAccessCondition = js.native
}
