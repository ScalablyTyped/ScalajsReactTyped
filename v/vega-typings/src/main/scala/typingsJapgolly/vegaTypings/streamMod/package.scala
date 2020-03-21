package typingsJapgolly.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamMod {
  type EventSource = (/* import warning: importer.ImportType#apply Failed type conversion: vega-typings.vega-typings/types/spec/stream.EventStream['source'] */ js.Any) with js.Object
  type EventStream = typingsJapgolly.vegaTypings.streamMod.StreamParameters with (typingsJapgolly.vegaTypings.AnonSource | typingsJapgolly.vegaTypings.AnonType)
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.streamMod.EventStream
    - typingsJapgolly.vegaTypings.streamMod.DerivedStream
    - typingsJapgolly.vegaTypings.streamMod.MergedStream
  */
  type Stream = typingsJapgolly.vegaTypings.streamMod._Stream | typingsJapgolly.vegaTypings.streamMod.EventStream
  type WindowEventType = typingsJapgolly.vegaTypings.streamMod.EventType | java.lang.String
}
