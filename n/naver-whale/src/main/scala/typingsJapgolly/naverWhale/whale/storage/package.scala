package typingsJapgolly.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storage {
  type StorageChangedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* changes */ org.scalablytyped.runtime.StringDictionary[typingsJapgolly.chrome.chrome.storage.StorageChange], 
      /* areaName */ java.lang.String, 
      scala.Unit
    ]
  ]
}
