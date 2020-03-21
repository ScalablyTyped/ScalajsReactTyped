package typingsJapgolly.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  type ChromeSettingChangedEvent = typingsJapgolly.chromeApps.chrome.events.Event[typingsJapgolly.chromeApps.chrome.types.DetailsCallback]
  /**
    * @param details Details of the currently effective value.
    */
  type DetailsCallback = js.Function1[
    /* details */ typingsJapgolly.chromeApps.chrome.types.ChromeSettingGetResultDetails, 
    scala.Unit
  ]
}
