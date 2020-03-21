package typingsJapgolly.reactBeautifulDnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Announce = js.Function1[/* message */ java.lang.String, scala.Unit]
  type ContextId = typingsJapgolly.reactBeautifulDnd.mod.Id
  type DisplacementMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reactBeautifulDnd.mod.Displacement]
  type DraggableChildrenFn = js.Function3[
    /* provided */ typingsJapgolly.reactBeautifulDnd.mod.DraggableProvided, 
    /* snapshot */ typingsJapgolly.reactBeautifulDnd.mod.DraggableStateSnapshot, 
    /* rubric */ typingsJapgolly.reactBeautifulDnd.mod.DraggableRubric, 
    japgolly.scalajs.react.raw.React.Element
  ]
  type DraggableDimensionMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reactBeautifulDnd.mod.DraggableDimension]
  type DraggableId = typingsJapgolly.reactBeautifulDnd.mod.Id
  type DraggableIdMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reactBeautifulDnd.reactBeautifulDndBooleans.`true`]
  type DroppableDimensionMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reactBeautifulDnd.mod.DroppableDimension]
  type DroppableId = typingsJapgolly.reactBeautifulDnd.mod.Id
  type DroppableIdMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reactBeautifulDnd.reactBeautifulDndBooleans.`true`]
  type ElementId = typingsJapgolly.reactBeautifulDnd.mod.Id
  type Id = java.lang.String
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type OnBeforeCaptureResponder = js.Function1[/* before */ typingsJapgolly.reactBeautifulDnd.mod.BeforeCapture, scala.Unit]
  type OnBeforeDragStartResponder = js.Function1[/* start */ typingsJapgolly.reactBeautifulDnd.mod.DragStart, scala.Unit]
  type OnDragEndResponder = js.Function2[
    /* result */ typingsJapgolly.reactBeautifulDnd.mod.DropResult, 
    /* provided */ typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided, 
    scala.Unit
  ]
  type OnDragStartResponder = js.Function2[
    /* start */ typingsJapgolly.reactBeautifulDnd.mod.DragStart, 
    /* provided */ typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided, 
    scala.Unit
  ]
  type OnDragUpdateResponder = js.Function2[
    /* update */ typingsJapgolly.reactBeautifulDnd.mod.DragUpdate, 
    /* provided */ typingsJapgolly.reactBeautifulDnd.mod.ResponderProvided, 
    scala.Unit
  ]
  type Sensor = js.Function1[/* api */ typingsJapgolly.reactBeautifulDnd.mod.SensorAPI, scala.Unit]
  type TryGetLock = js.Function3[
    /* draggableId */ typingsJapgolly.reactBeautifulDnd.mod.DraggableId, 
    /* forceStop */ js.UndefOr[js.Function0[scala.Unit]], 
    /* options */ js.UndefOr[typingsJapgolly.reactBeautifulDnd.mod.TryGetLockOptions], 
    typingsJapgolly.reactBeautifulDnd.mod.PreDragActions | scala.Null
  ]
  type TypeId = typingsJapgolly.reactBeautifulDnd.mod.Id
}
