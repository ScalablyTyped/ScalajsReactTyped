package typingsJapgolly.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtimeMod {
  type DataListenerHandler = js.Function2[/* name */ java.lang.String, /* value */ js.Any, scala.Unit]
  type EventListenerHandler = js.Function2[
    /* event */ typingsJapgolly.vegaTypings.runtimeMod.ScenegraphEvent, 
    /* item */ js.UndefOr[typingsJapgolly.vegaTypings.runtimeMod.Item[js.Any]], 
    scala.Unit
  ]
  type ResizeHandler = js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit]
  type Runtime = js.Any
  type RuntimeMark = typingsJapgolly.vegaTypings.runtimeMod.DefineMark[
    typingsJapgolly.vegaTypings.vegaTypingsStrings.group | typingsJapgolly.vegaTypings.vegaTypingsStrings.rect | typingsJapgolly.vegaTypings.vegaTypingsStrings.symbol | typingsJapgolly.vegaTypings.vegaTypingsStrings.path | typingsJapgolly.vegaTypings.vegaTypingsStrings.arc | typingsJapgolly.vegaTypings.vegaTypingsStrings.area | typingsJapgolly.vegaTypings.vegaTypingsStrings.line | typingsJapgolly.vegaTypings.vegaTypingsStrings.image | typingsJapgolly.vegaTypings.vegaTypingsStrings.text, 
    typingsJapgolly.vegaTypings.AnonFill | js.Object, 
    typingsJapgolly.vegaTypings.vegaTypingsStrings.`legend-symbol` | typingsJapgolly.vegaTypings.vegaTypingsStrings.`axis-label` | typingsJapgolly.vegaTypings.vegaTypingsStrings.`legend-label` | scala.Nothing
  ]
  type ScenegraphEvent = org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.TouchEvent | org.scalajs.dom.raw.KeyboardEvent
  type SignalListenerHandler = js.Function2[
    /* name */ java.lang.String, 
    /* value */ typingsJapgolly.vegaTypings.signalMod.SignalValue, 
    scala.Unit
  ]
  type TooltipHandler = js.Function4[
    /* handler */ js.Any, 
    /* event */ org.scalajs.dom.raw.MouseEvent, 
    /* item */ typingsJapgolly.vegaTypings.runtimeMod.Item[js.Any], 
    /* value */ js.Any, 
    scala.Unit
  ]
}
