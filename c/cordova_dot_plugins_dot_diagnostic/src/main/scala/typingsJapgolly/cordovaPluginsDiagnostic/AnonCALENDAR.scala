package typingsJapgolly.cordovaPluginsDiagnostic

import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ACCESS_COARSE_LOCATION
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ACCESS_FINE_LOCATION
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.ADD_VOICEMAIL
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.BODY_SENSORS
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.CALL_PHONE
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.CAMERA
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.GET_ACCOUNTS
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.PROCESS_OUTGOING_CALLS
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.READ_CALENDAR
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.READ_CALL_LOG
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.READ_CONTACTS
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.READ_EXTERNAL_STORAGE
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.READ_PHONE_STATE
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.READ_SMS
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.RECEIVE_MMS
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.RECEIVE_SMS
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.RECEIVE_WAP_PUSH
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.RECORD_AUDIO
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.SEND_SMS
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.USE_SIP
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.WRITE_CALENDAR
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.WRITE_CALL_LOG
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.WRITE_CONTACTS
import typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.WRITE_EXTERNAL_STORAGE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCALENDAR extends js.Object {
  var CALENDAR: js.Tuple2[READ_CALENDAR, WRITE_CALENDAR]
  var CAMERA: js.Array[typingsJapgolly.cordovaPluginsDiagnostic.cordovaPluginsDiagnosticStrings.CAMERA]
  var CONTACTS: js.Tuple3[READ_CONTACTS, WRITE_CONTACTS, GET_ACCOUNTS]
  var LOCATION: js.Tuple2[ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION]
  var MICROPHONE: js.Array[RECORD_AUDIO]
  var PHONE: js.Tuple7[
    READ_PHONE_STATE, 
    CALL_PHONE, 
    ADD_VOICEMAIL, 
    USE_SIP, 
    PROCESS_OUTGOING_CALLS, 
    READ_CALL_LOG, 
    WRITE_CALL_LOG
  ]
  var SENSORS: js.Array[BODY_SENSORS]
  var SMS: js.Tuple5[SEND_SMS, RECEIVE_SMS, READ_SMS, RECEIVE_WAP_PUSH, RECEIVE_MMS]
  var STORAGE: js.Tuple2[READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE]
}

object AnonCALENDAR {
  @scala.inline
  def apply(
    CALENDAR: js.Tuple2[READ_CALENDAR, WRITE_CALENDAR],
    CAMERA: js.Array[CAMERA],
    CONTACTS: js.Tuple3[READ_CONTACTS, WRITE_CONTACTS, GET_ACCOUNTS],
    LOCATION: js.Tuple2[ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION],
    MICROPHONE: js.Array[RECORD_AUDIO],
    PHONE: js.Tuple7[
      READ_PHONE_STATE, 
      CALL_PHONE, 
      ADD_VOICEMAIL, 
      USE_SIP, 
      PROCESS_OUTGOING_CALLS, 
      READ_CALL_LOG, 
      WRITE_CALL_LOG
    ],
    SENSORS: js.Array[BODY_SENSORS],
    SMS: js.Tuple5[SEND_SMS, RECEIVE_SMS, READ_SMS, RECEIVE_WAP_PUSH, RECEIVE_MMS],
    STORAGE: js.Tuple2[READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE]
  ): AnonCALENDAR = {
    val __obj = js.Dynamic.literal(CALENDAR = CALENDAR.asInstanceOf[js.Any], CAMERA = CAMERA.asInstanceOf[js.Any], CONTACTS = CONTACTS.asInstanceOf[js.Any], LOCATION = LOCATION.asInstanceOf[js.Any], MICROPHONE = MICROPHONE.asInstanceOf[js.Any], PHONE = PHONE.asInstanceOf[js.Any], SENSORS = SENSORS.asInstanceOf[js.Any], SMS = SMS.asInstanceOf[js.Any], STORAGE = STORAGE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCALENDAR]
  }
}

