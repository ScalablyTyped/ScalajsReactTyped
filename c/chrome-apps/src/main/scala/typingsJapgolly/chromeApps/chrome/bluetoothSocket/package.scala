package typingsJapgolly.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bluetoothSocket {
  type OnAcceptErrorEvent = typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function1[
      /* info */ typingsJapgolly.chromeApps.chrome.bluetoothSocket.OnAcceptErrorEventData, 
      scala.Unit
    ]
  ]
  type OnAcceptEvent = typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function1[
      /* info */ typingsJapgolly.chromeApps.chrome.bluetoothSocket.OnAcceptInfoData, 
      scala.Unit
    ]
  ]
  type OnReceiveErrorEvent = typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function1[
      /* info */ typingsJapgolly.chromeApps.chrome.bluetoothSocket.OnReceiveErrorEventData, 
      scala.Unit
    ]
  ]
  type OnReceiveEvent = typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function1[
      /* info */ typingsJapgolly.chromeApps.chrome.bluetoothSocket.OnReceiveEventData, 
      scala.Unit
    ]
  ]
}
