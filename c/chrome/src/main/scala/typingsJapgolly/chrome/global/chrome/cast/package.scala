package typingsJapgolly.chrome.global.chrome.cast

import typingsJapgolly.chrome.global.chrome.cast.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def VERSION: js.Array[Double] = ^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[js.Array[Double]]
inline def VERSION_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])

inline def addReceiverActionListener(
  listener: js.Function2[
  /* receiver */ typingsJapgolly.chrome.chrome.cast.Receiver, 
  /* receiverAction */ typingsJapgolly.chrome.chrome.cast.ReceiverAction, 
  Unit
]
): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addReceiverActionListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def initialize(
  apiConfig: typingsJapgolly.chrome.chrome.cast.ApiConfig,
  successCallback: js.Function,
  errorCallback: js.Function1[/* error */ typingsJapgolly.chrome.chrome.cast.Error, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(apiConfig.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def isAvailable: Boolean = ^.asInstanceOf[js.Dynamic].selectDynamic("isAvailable").asInstanceOf[Boolean]
inline def isAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isAvailable")(x.asInstanceOf[js.Any])

inline def logMessage(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logMessage")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def removeReceiverActionListener(
  listener: js.Function2[
  /* receiver */ typingsJapgolly.chrome.chrome.cast.Receiver, 
  /* receiverAction */ typingsJapgolly.chrome.chrome.cast.ReceiverAction, 
  Unit
]
): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeReceiverActionListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def requestSession(
  successCallback: js.Function1[/* session */ typingsJapgolly.chrome.chrome.cast.Session, Unit],
  errorCallback: js.Function1[/* error */ typingsJapgolly.chrome.chrome.cast.Error, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSession")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def requestSession(
  successCallback: js.Function1[/* session */ typingsJapgolly.chrome.chrome.cast.Session, Unit],
  errorCallback: js.Function1[/* error */ typingsJapgolly.chrome.chrome.cast.Error, Unit],
  sessionRequest: Unit,
  label: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSession")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], sessionRequest.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def requestSession(
  successCallback: js.Function1[/* session */ typingsJapgolly.chrome.chrome.cast.Session, Unit],
  errorCallback: js.Function1[/* error */ typingsJapgolly.chrome.chrome.cast.Error, Unit],
  sessionRequest: typingsJapgolly.chrome.chrome.cast.SessionRequest
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSession")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], sessionRequest.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def requestSession(
  successCallback: js.Function1[/* session */ typingsJapgolly.chrome.chrome.cast.Session, Unit],
  errorCallback: js.Function1[/* error */ typingsJapgolly.chrome.chrome.cast.Error, Unit],
  sessionRequest: typingsJapgolly.chrome.chrome.cast.SessionRequest,
  label: String
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSession")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], sessionRequest.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def requestSessionById(sessionId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestSessionById")(sessionId.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setCustomReceivers(
  receivers: js.Array[typingsJapgolly.chrome.chrome.cast.Receiver],
  successCallback: js.Function,
  errorCallback: js.Function1[/* error */ typingsJapgolly.chrome.chrome.cast.Error, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCustomReceivers")(receivers.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setReceiverDisplayStatus(
  receiver: typingsJapgolly.chrome.chrome.cast.Receiver,
  successCallback: js.Function,
  errorCallback: js.Function1[/* error */ typingsJapgolly.chrome.chrome.cast.Error, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setReceiverDisplayStatus")(receiver.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def unescape(escaped: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(escaped.asInstanceOf[js.Any]).asInstanceOf[String]
