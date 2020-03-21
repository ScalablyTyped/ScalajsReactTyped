package typingsJapgolly.vegaTypings

import typingsJapgolly.vegaTypings.exprMod.Expr
import typingsJapgolly.vegaTypings.selectorMod.EventSelector
import typingsJapgolly.vegaTypings.streamMod.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/spec/on-events", JSImport.Namespace)
@js.native
object onEventsMod extends js.Object {
  trait _EventListener extends js.Object
  
  trait _Update extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.signalMod.SignalRef
    - typingsJapgolly.vegaTypings.AnonScaleString
    - typingsJapgolly.vegaTypings.streamMod.Stream
  */
  type EventListener = _EventListener | EventStream
  type Events = EventSelector | EventListener
  type OnEvent = (AnonEncode | AnonUpdate) with AnonEvents
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaTypings.exprMod.Expr
    - typingsJapgolly.vegaTypings.exprMod.ExprRef
    - typingsJapgolly.vegaTypings.signalMod.SignalRef
    - typingsJapgolly.vegaTypings.AnonValueSignalValue
  */
  type Update = _Update | Expr
}

