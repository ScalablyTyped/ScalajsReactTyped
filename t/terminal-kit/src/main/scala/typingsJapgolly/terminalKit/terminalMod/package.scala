package typingsJapgolly.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object terminalMod {
  type Autocompletion = (js.Function2[
    /* inputString */ java.lang.String, 
    /* callback */ typingsJapgolly.terminalKit.terminalMod.Callback[
      java.lang.String | typingsJapgolly.terminalKit.terminalMod.AutocompletionArray[java.lang.String]
    ], 
    scala.Unit
  ]) | (js.Function1[
    /* inputString */ java.lang.String, 
    js.Promise[
      java.lang.String | typingsJapgolly.terminalKit.terminalMod.AutocompletionArray[java.lang.String]
    ]
  ])
  type CTerminal = typingsJapgolly.terminalKit.terminalMod.Terminal with (js.Function1[/* repeated */ js.Any, typingsJapgolly.terminalKit.terminalMod.Terminal])
  type Callback[T] = (js.Function1[/* err */ js.Any, scala.Unit]) | (js.Function2[/* err */ js.UndefOr[scala.Nothing], /* arg */ T, scala.Unit])
  type Chainable[T] = T with typingsJapgolly.terminalKit.terminalMod.ChainableInterface[T]
  type Palette = js.Array[typingsJapgolly.terminalKit.AnonG]
  type Terminal = typingsJapgolly.terminalKit.terminalMod.Impl with typingsJapgolly.nextgenEvents.mod.^ 
}
