package typingsJapgolly.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  type ChromeSettingChangedEvent = typingsJapgolly.chrome.chrome.events.Event[typingsJapgolly.chrome.chrome.types.DetailsCallback]
  type DetailsCallback = js.Function1[
    /* details */ typingsJapgolly.chrome.chrome.types.ChromeSettingGetResultDetails, 
    scala.Unit
  ]
}
