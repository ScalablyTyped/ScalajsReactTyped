package typingsJapgolly.oboe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackSignature = js.Function3[
    /* node */ js.Any, 
    /* pathOrHeaders */ js.Any, 
    /* ancestors */ js.Array[js.Object], 
    js.Any
  ]
  type PatternMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.oboe.mod.CallbackSignature]
}
