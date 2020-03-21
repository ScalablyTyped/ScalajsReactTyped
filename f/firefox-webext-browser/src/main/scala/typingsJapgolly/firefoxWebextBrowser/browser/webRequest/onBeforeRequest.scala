package typingsJapgolly.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.firefoxWebextBrowser.AnonDocumentUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* webRequest events */
/**
  * Fired when a request is about to occur.
  * @returns If "blocking" is specified in the "extraInfoSpec" parameter, the event listener should return an object
  *     of this type.
  */
@JSGlobal("browser.webRequest.onBeforeRequest")
@js.native
object onBeforeRequest
  extends TopLevel[
      WebRequestOnBeforeRequestEvent[
        js.Function1[
          /* details */ AnonDocumentUrl, 
          BlockingResponse | js.Promise[BlockingResponse] | Unit
        ]
      ]
    ]

