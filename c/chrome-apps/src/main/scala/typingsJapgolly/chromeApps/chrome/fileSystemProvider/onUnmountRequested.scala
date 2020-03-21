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

///\/\/\/\/\\\
/// EVENTS \\\
///\/\/\/\/\\\
/**
  * Raised when unmounting for the file system with the fileSystemId identifier is requested.
  * In the response, the unmount API method must be called together with successCallback.
  * If unmounting is not possible (eg. due to a pending operation), then errorCallback must be called.
  * @see ProviderError
  */
@JSGlobal("chrome.fileSystemProvider.onUnmountRequested")
@js.native
object onUnmountRequested
  extends TopLevel[
      Event[
        js.Function3[
          /* options */ UnmountRequestedEventOptions, 
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

