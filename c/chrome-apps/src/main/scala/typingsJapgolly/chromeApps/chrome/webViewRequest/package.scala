package typingsJapgolly.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webViewRequest {
  type DeclarativeWebRequestConditionsList = typingsJapgolly.chromeApps.chromeAppsStrings.declarativeContentDotPageStateMatcher
  /**
    * Fired when a message is sent via **declarativeWebRequest.SendMessageToExtension**
    * from an action of the declarative web request API.
    */
  type OnMessageEvent = typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function1[
      /* details */ typingsJapgolly.chromeApps.chrome.webViewRequest.OnMessageEventDetails, 
      scala.Unit
    ]
  ]
  /** Supported conditions */
  type OnRequestConditions = typingsJapgolly.chromeApps.chrome.webViewRequest.RequestMatcher
  /**
    * Description of a declarative rule for handling events.
    * With correct types for the onRequest event.
    */
  type OnRequestRule = typingsJapgolly.chromeApps.chrome.events.Rule[
    typingsJapgolly.chromeApps.chrome.webViewRequest.OnRequestConditions, 
    typingsJapgolly.chromeApps.chrome.webViewRequest.OnRequestActions
  ]
}
