package typingsJapgolly.reactDates

import typingsJapgolly.reactDates.mod.AnchorDirectionShape
import typingsJapgolly.reactDates.mod.CalendarInfoPositionShape
import typingsJapgolly.reactDates.mod.FocusedInputShape
import typingsJapgolly.reactDates.mod.IconPositionShape
import typingsJapgolly.reactDates.mod.NavPositionShape
import typingsJapgolly.reactDates.mod.OpenDirectionShape
import typingsJapgolly.reactDates.mod.OrientationShape
import typingsJapgolly.reactDates.mod.ScrollableOrientationShape
import typingsJapgolly.reactDates.mod._DisabledShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactDatesStrings {
  
  @js.native
  sealed trait after
    extends StObject
       with CalendarInfoPositionShape
       with IconPositionShape
  inline def after: after = "after".asInstanceOf[after]
  
  @js.native
  sealed trait before
    extends StObject
       with CalendarInfoPositionShape
       with IconPositionShape
  inline def before: before = "before".asInstanceOf[before]
  
  @js.native
  sealed trait bottom
    extends StObject
       with CalendarInfoPositionShape
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait down
    extends StObject
       with OpenDirectionShape
  inline def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait endDate
    extends StObject
       with FocusedInputShape
       with _DisabledShape
  inline def endDate: endDate = "endDate".asInstanceOf[endDate]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with OrientationShape
       with ScrollableOrientationShape
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait left
    extends StObject
       with AnchorDirectionShape
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait navPositionBottom
    extends StObject
       with NavPositionShape
  inline def navPositionBottom: navPositionBottom = "navPositionBottom".asInstanceOf[navPositionBottom]
  
  @js.native
  sealed trait navPositionTop
    extends StObject
       with NavPositionShape
  inline def navPositionTop: navPositionTop = "navPositionTop".asInstanceOf[navPositionTop]
  
  @js.native
  sealed trait right
    extends StObject
       with AnchorDirectionShape
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait startDate
    extends StObject
       with FocusedInputShape
       with _DisabledShape
  inline def startDate: startDate = "startDate".asInstanceOf[startDate]
  
  @js.native
  sealed trait top
    extends StObject
       with CalendarInfoPositionShape
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait up
    extends StObject
       with OpenDirectionShape
  inline def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait vertical
    extends StObject
       with OrientationShape
       with ScrollableOrientationShape
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait verticalScrollable
    extends StObject
       with ScrollableOrientationShape
  inline def verticalScrollable: verticalScrollable = "verticalScrollable".asInstanceOf[verticalScrollable]
}
