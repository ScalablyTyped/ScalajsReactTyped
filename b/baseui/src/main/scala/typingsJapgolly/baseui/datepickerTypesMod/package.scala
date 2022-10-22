package typingsJapgolly.baseui.datepickerTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.baseui.baseuiStrings.startDate
  - typingsJapgolly.baseui.baseuiStrings.endDate
  - scala.Unit
  - scala.Null
*/
type InputRole = js.UndefOr[_InputRole | Null]

type Locale = Any

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.baseui.baseuiStrings.default_
  - typingsJapgolly.baseui.baseuiStrings.locked
  - scala.Unit
  - scala.Null
*/
type RangedCalendarBehavior = js.UndefOr[_RangedCalendarBehavior | Null]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.baseui.baseuiStrings.mouseLeave
  - typingsJapgolly.baseui.baseuiStrings.moveRight
  - typingsJapgolly.baseui.baseuiStrings.moveDown
  - typingsJapgolly.baseui.baseuiStrings.moveUp
  - typingsJapgolly.baseui.baseuiStrings.mouseOver
  - typingsJapgolly.baseui.baseuiStrings.change_
  - typingsJapgolly.baseui.baseuiStrings.moveLeft
  - scala.Unit
  - scala.Null
*/
type StateChangeType = js.UndefOr[_StateChangeType | Null]

type StateReducer[T] = js.Function3[
/* stateType */ StateChangeType, 
/* nextState */ ContainerState[T], 
/* currentState */ ContainerState[T], 
ContainerState[T]]
