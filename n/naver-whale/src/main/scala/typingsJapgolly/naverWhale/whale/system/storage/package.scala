package typingsJapgolly.naverWhale.whale.system

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storage {
  type SystemStorageAttachedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* info */ typingsJapgolly.chrome.chrome.system.storage.StorageUnitInfo, 
      scala.Unit
    ]
  ]
  type SystemStorageDetachedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
}
