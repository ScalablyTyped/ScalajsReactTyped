package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileBrowserHandler {
  type FileBrowserHandlerExecuteEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* details */ typingsJapgolly.chrome.chrome.fileBrowserHandler.FileHandlerExecuteEventDetails, 
      scala.Unit
    ]
  ]
}
