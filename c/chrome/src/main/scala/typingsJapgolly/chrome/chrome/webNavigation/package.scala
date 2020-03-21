package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webNavigation {
  type WebNavigationFramedErrorEvent = typingsJapgolly.chrome.chrome.webNavigation.WebNavigationEvent[
    typingsJapgolly.chrome.chrome.webNavigation.WebNavigationFramedErrorCallbackDetails
  ]
  type WebNavigationFramedEvent = typingsJapgolly.chrome.chrome.webNavigation.WebNavigationEvent[typingsJapgolly.chrome.chrome.webNavigation.WebNavigationFramedCallbackDetails]
  type WebNavigationParentedEvent = typingsJapgolly.chrome.chrome.webNavigation.WebNavigationEvent[typingsJapgolly.chrome.chrome.webNavigation.WebNavigationParentedCallbackDetails]
  type WebNavigationReplacementEvent = typingsJapgolly.chrome.chrome.webNavigation.WebNavigationEvent[
    typingsJapgolly.chrome.chrome.webNavigation.WebNavigationReplacementCallbackDetails
  ]
  type WebNavigationSourceEvent = typingsJapgolly.chrome.chrome.webNavigation.WebNavigationEvent[typingsJapgolly.chrome.chrome.webNavigation.WebNavigationSourceCallbackDetails]
  type WebNavigationTransitionalEvent = typingsJapgolly.chrome.chrome.webNavigation.WebNavigationEvent[
    typingsJapgolly.chrome.chrome.webNavigation.WebNavigationTransitionCallbackDetails
  ]
}
