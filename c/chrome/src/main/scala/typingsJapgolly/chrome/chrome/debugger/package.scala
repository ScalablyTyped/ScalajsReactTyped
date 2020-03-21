package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object debugger {
  type DebuggerDetachedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* source */ typingsJapgolly.chrome.chrome.debugger.Debuggee, 
      /* reason */ java.lang.String, 
      scala.Unit
    ]
  ]
  type DebuggerEventEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* source */ typingsJapgolly.chrome.chrome.debugger.Debuggee, 
      /* method */ java.lang.String, 
      /* params */ js.UndefOr[js.Object], 
      scala.Unit
    ]
  ]
}
