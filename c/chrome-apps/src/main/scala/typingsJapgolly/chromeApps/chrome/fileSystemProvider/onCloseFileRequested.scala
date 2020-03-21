package typingsJapgolly.chromeApps.chrome.fileSystemProvider

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.chromeApps.AnonABORT
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.events.Event
import typingsJapgolly.chromeApps.chromeAppsStrings.ABORT
import typingsJapgolly.chromeApps.chromeAppsStrings.ACCESS_DENIED
import typingsJapgolly.chromeApps.chromeAppsStrings.EXISTS
import typingsJapgolly.chromeApps.chromeAppsStrings.FAILED
import typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_OPERATION
import typingsJapgolly.chromeApps.chromeAppsStrings.INVALID_URL
import typingsJapgolly.chromeApps.chromeAppsStrings.IN_USE
import typingsJapgolly.chromeApps.chromeAppsStrings.IO
import typingsJapgolly.chromeApps.chromeAppsStrings.NOT_A_DIRECTORY
import typingsJapgolly.chromeApps.chromeAppsStrings.NOT_A_FILE
import typingsJapgolly.chromeApps.chromeAppsStrings.NOT_EMPTY
import typingsJapgolly.chromeApps.chromeAppsStrings.NOT_FOUND
import typingsJapgolly.chromeApps.chromeAppsStrings.NO_MEMORY
import typingsJapgolly.chromeApps.chromeAppsStrings.NO_SPACE
import typingsJapgolly.chromeApps.chromeAppsStrings.OK
import typingsJapgolly.chromeApps.chromeAppsStrings.SECURITY
import typingsJapgolly.chromeApps.chromeAppsStrings.TOO_MANY_OPENED
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Raised when opening a file previously opened
  * with openRequestId is requested to be closed.
  * @see ProviderError
  */
@JSGlobal("chrome.fileSystemProvider.onCloseFileRequested")
@js.native
object onCloseFileRequested
  extends TopLevel[
      Event[
        js.Function3[
          /* options */ CloseFileRequestedEventOptions, 
          /* successCallback */ js.Function0[Unit], 
          /* errorCallback */ js.Function1[
            /* error */ ToStringLiteral[
              AnonABORT, 
              String, 
              Exclude[
                String, 
                INVALID_URL | IN_USE | OK | ABORT | SECURITY | NOT_A_DIRECTORY | NOT_A_FILE | INVALID_OPERATION | TOO_MANY_OPENED | NO_MEMORY | ACCESS_DENIED | NOT_FOUND | FAILED | NO_SPACE | EXISTS | NOT_EMPTY | IO
              ]
            ], 
            Unit
          ], 
          Unit
        ]
      ]
    ]

