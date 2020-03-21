package typingsJapgolly.reactSortableHoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ContainerGetter = js.Function1[
    /* element */ japgolly.scalajs.react.raw.React.Element, 
    org.scalajs.dom.raw.HTMLElement | js.Promise[org.scalajs.dom.raw.HTMLElement]
  ]
  type HelperContainerGetter = js.Function0[org.scalajs.dom.raw.HTMLElement]
  type Offset = scala.Double | java.lang.String
  type SortEndHandler = js.Function2[
    /* sort */ typingsJapgolly.reactSortableHoc.mod.SortEnd, 
    /* event */ typingsJapgolly.reactSortableHoc.mod.SortEvent, 
    scala.Unit
  ]
  type SortEvent = (japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element]) | (japgolly.scalajs.react.ReactTouchEventFrom[js.Any with org.scalajs.dom.raw.Element])
  type SortEventWithTag = typingsJapgolly.reactSortableHoc.mod.SortEvent with typingsJapgolly.reactSortableHoc.AnonTarget
  type SortMoveHandler = js.Function1[/* event */ typingsJapgolly.reactSortableHoc.mod.SortEvent, scala.Unit]
  type SortOverHandler = js.Function2[
    /* sort */ typingsJapgolly.reactSortableHoc.mod.SortOver, 
    /* event */ typingsJapgolly.reactSortableHoc.mod.SortEvent, 
    scala.Unit
  ]
  type SortStartHandler = js.Function2[
    /* sort */ typingsJapgolly.reactSortableHoc.mod.SortStart, 
    /* event */ typingsJapgolly.reactSortableHoc.mod.SortEvent, 
    scala.Unit
  ]
  type WrappedComponent[P] = (japgolly.scalajs.react.raw.React.ComponentClassP[P with js.Object]) | typingsJapgolly.react.mod.SFC[P] | typingsJapgolly.reactSortableHoc.mod.WrappedComponentFactory[P]
  type WrappedComponentFactory[P] = js.Function1[/* props */ P, japgolly.scalajs.react.raw.React.Element]
}
