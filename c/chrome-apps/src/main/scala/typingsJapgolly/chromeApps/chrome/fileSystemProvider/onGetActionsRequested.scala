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
  * Raised when a list of actions for a set of files or directories at entryPaths is requested.
  * All of the returned actions must be applicable to each entry.
  * If there are no such actions, an empty array should be returned.
  * The actions must be returned with the successCallback call.
  * In case of an error, errorCallback must be called.
  * @see ProviderError
  * @since Chrome 48.
  **/
@JSGlobal("chrome.fileSystemProvider.onGetActionsRequested")
@js.native
object onGetActionsRequested
  extends TopLevel[
      Event[
        js.Function3[
          /* options */ GetActionsRequestedEventOptions, 
          /* successCallback */ js.Function1[/* actions */ js.Array[Action], Unit], 
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

