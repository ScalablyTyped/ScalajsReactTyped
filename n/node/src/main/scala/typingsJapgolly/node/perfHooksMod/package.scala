package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object perfHooksMod {
  type PerformanceObserverCallback = js.Function2[
    /* list */ typingsJapgolly.node.perfHooksMod.PerformanceObserverEntryList, 
    /* observer */ typingsJapgolly.node.perfHooksMod.PerformanceObserver, 
    scala.Unit
  ]
}
