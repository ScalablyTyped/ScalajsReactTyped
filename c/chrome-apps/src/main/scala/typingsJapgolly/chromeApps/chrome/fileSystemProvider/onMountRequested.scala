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
  * Raised when showing a dialog for mounting a new file system is requested.
  * If the app is a file handler, then this event shouldn't be handled.
  * Instead app.runtime.onLaunched should be handled in order to mount new file systems when a file is opened.
  * @requires Manifest (for multiple mounts): 'file_system_provider.multiple_mounts' = true
  * @see ProviderError
  * @since Chrome 44.
  */
@JSGlobal("chrome.fileSystemProvider.onMountRequested")
@js.native
object onMountRequested
  extends TopLevel[
      Event[
        js.Function2[
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

