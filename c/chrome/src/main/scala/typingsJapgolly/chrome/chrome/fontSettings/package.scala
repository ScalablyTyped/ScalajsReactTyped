package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fontSettings {
  type DefaultFixedFontSizeChangedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* details */ typingsJapgolly.chrome.chrome.fontSettings.FontSizeDetails, 
      scala.Unit
    ]
  ]
  type DefaultFontSizeChangedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* details */ typingsJapgolly.chrome.chrome.fontSettings.FontSizeDetails, 
      scala.Unit
    ]
  ]
  type FontChangedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* details */ typingsJapgolly.chrome.chrome.fontSettings.FullFontDetails, 
      scala.Unit
    ]
  ]
  type MinimumFontSizeChangedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* details */ typingsJapgolly.chrome.chrome.fontSettings.FontSizeDetails, 
      scala.Unit
    ]
  ]
}
