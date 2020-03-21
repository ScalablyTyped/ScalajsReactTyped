package typingsJapgolly.eventTargetShim.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventTarget {
  type EventAttributes[TEventAttributes /* <: typingsJapgolly.eventTargetShim.mod.EventTarget.EventDefinition */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof TEventAttributes ]: event-target-shim.event-target-shim.EventTarget.FunctionListener<TEventAttributes[P]> | null}
    */ typingsJapgolly.eventTargetShim.eventTargetShimStrings.EventAttributes with TEventAttributes
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.eventTargetShim.mod.Event
    - typingsJapgolly.eventTargetShim.mod.EventTarget.NonStandardEvent
    - (typingsJapgolly.std.Pick[
  / * import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] * / js.Any, 
  typingsJapgolly.std.Exclude[
    / * import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] * / js.Any, 
    typingsJapgolly.eventTargetShim.mod.EventTarget.OmittableEventKeys
  ]]) with typingsJapgolly.eventTargetShim.PartialPickEventOmittable
  */
  type EventData[TEvents /* <: typingsJapgolly.eventTargetShim.mod.EventTarget.EventDefinition */, TEventType /* <: java.lang.String */, TMode /* <: typingsJapgolly.eventTargetShim.mod.EventTarget.Mode */] = (typingsJapgolly.eventTargetShim.mod.EventTarget._EventData[TEvents, TEventType, TMode]) | ((typingsJapgolly.std.Pick[
    /* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any, 
    typingsJapgolly.std.Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: keyof TEvents[TEventType] */ js.Any, 
      typingsJapgolly.eventTargetShim.mod.EventTarget.OmittableEventKeys
    ]
  ]) with typingsJapgolly.eventTargetShim.PartialPickEventOmittable)
  type EventDefinition = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.eventTargetShim.mod.Event]
  type EventType[TEvents /* <: typingsJapgolly.eventTargetShim.mod.EventTarget.EventDefinition */, TMode /* <: typingsJapgolly.eventTargetShim.mod.EventTarget.Mode */] = java.lang.String
  type FunctionListener[TEvent] = js.Function1[/* event */ TEvent, scala.Unit]
  type Listener[TEvent] = typingsJapgolly.eventTargetShim.mod.EventTarget.FunctionListener[TEvent] | typingsJapgolly.eventTargetShim.mod.EventTarget.ObjectListener[TEvent]
  type PickEvent[TEvents /* <: typingsJapgolly.eventTargetShim.mod.EventTarget.EventDefinition */, TEventType /* <: java.lang.String */] = typingsJapgolly.eventTargetShim.mod.Event | (/* import warning: importer.ImportType#apply Failed type conversion: TEvents[TEventType] */ js.Any)
}
