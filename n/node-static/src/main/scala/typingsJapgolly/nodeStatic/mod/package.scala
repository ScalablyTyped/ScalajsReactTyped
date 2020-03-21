package typingsJapgolly.nodeStatic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* e */ js.Error, scala.Unit]
  type Finish = js.Function2[
    /* status */ scala.Double, 
    /* headers */ js.UndefOr[typingsJapgolly.nodeStatic.mod.Headers], 
    scala.Unit
  ]
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
}
