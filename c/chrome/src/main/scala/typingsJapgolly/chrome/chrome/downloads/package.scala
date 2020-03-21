package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downloads {
  type DownloadChangedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* downloadDelta */ typingsJapgolly.chrome.chrome.downloads.DownloadDelta, 
      scala.Unit
    ]
  ]
  type DownloadCreatedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* downloadItem */ typingsJapgolly.chrome.chrome.downloads.DownloadItem, 
      scala.Unit
    ]
  ]
  type DownloadDeterminingFilenameEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* downloadItem */ typingsJapgolly.chrome.chrome.downloads.DownloadItem, 
      /* suggest */ js.Function1[
        /* suggestion */ js.UndefOr[typingsJapgolly.chrome.chrome.downloads.DownloadFilenameSuggestion], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type DownloadErasedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* downloadId */ scala.Double, scala.Unit]]
}
