package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object identity {
  type SignInChangeEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* account */ typingsJapgolly.chrome.chrome.identity.AccountInfo, 
      /* signedIn */ scala.Boolean, 
      scala.Unit
    ]
  ]
}
