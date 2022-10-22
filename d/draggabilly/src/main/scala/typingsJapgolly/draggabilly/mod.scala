package typingsJapgolly.draggabilly

import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Touch
import typingsJapgolly.draggabilly.draggabillyStrings.x
import typingsJapgolly.draggabilly.draggabillyStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("draggabilly", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Draggabilly {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: DraggabillyOptions) = this()
    def this(element: Element, options: DraggabillyOptions) = this()
  }
  
  @js.native
  trait Draggabilly extends StObject {
    
    def destroy(): Unit = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def off(
      eventName: DraggabillyClickEventName,
      listener: js.Function2[/* event */ Event, /* pointer */ MouseEvent | Touch, Unit]
    ): Draggabilly = js.native
    def off(
      eventName: DraggabillyMoveEventName,
      listener: js.Function3[/* event */ Event, /* pointer */ MouseEvent | Touch, /* moveVector */ Position, Unit]
    ): Draggabilly = js.native
    
    def on(
      eventName: DraggabillyClickEventName,
      listener: js.Function2[/* event */ Event, /* pointer */ MouseEvent | Touch, Unit]
    ): Draggabilly = js.native
    def on(
      eventName: DraggabillyMoveEventName,
      listener: js.Function3[/* event */ Event, /* pointer */ MouseEvent | Touch, /* moveVector */ Position, Unit]
    ): Draggabilly = js.native
    
    def once(
      eventName: DraggabillyClickEventName,
      listener: js.Function2[/* event */ Event, /* pointer */ MouseEvent | Touch, Unit]
    ): Draggabilly = js.native
    def once(
      eventName: DraggabillyMoveEventName,
      listener: js.Function3[/* event */ Event, /* pointer */ MouseEvent | Touch, /* moveVector */ Position, Unit]
    ): Draggabilly = js.native
    
    var position: Position = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.draggabilly.draggabillyStrings.dragStart
    - typingsJapgolly.draggabilly.draggabillyStrings.dragEnd
    - typingsJapgolly.draggabilly.draggabillyStrings.pointerDown
    - typingsJapgolly.draggabilly.draggabillyStrings.pointerUp
    - typingsJapgolly.draggabilly.draggabillyStrings.staticClick
  */
  trait DraggabillyClickEventName extends StObject
  object DraggabillyClickEventName {
    
    inline def dragEnd: typingsJapgolly.draggabilly.draggabillyStrings.dragEnd = "dragEnd".asInstanceOf[typingsJapgolly.draggabilly.draggabillyStrings.dragEnd]
    
    inline def dragStart: typingsJapgolly.draggabilly.draggabillyStrings.dragStart = "dragStart".asInstanceOf[typingsJapgolly.draggabilly.draggabillyStrings.dragStart]
    
    inline def pointerDown: typingsJapgolly.draggabilly.draggabillyStrings.pointerDown = "pointerDown".asInstanceOf[typingsJapgolly.draggabilly.draggabillyStrings.pointerDown]
    
    inline def pointerUp: typingsJapgolly.draggabilly.draggabillyStrings.pointerUp = "pointerUp".asInstanceOf[typingsJapgolly.draggabilly.draggabillyStrings.pointerUp]
    
    inline def staticClick: typingsJapgolly.draggabilly.draggabillyStrings.staticClick = "staticClick".asInstanceOf[typingsJapgolly.draggabilly.draggabillyStrings.staticClick]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.draggabilly.draggabillyStrings.dragMove
    - typingsJapgolly.draggabilly.draggabillyStrings.pointerMove
  */
  trait DraggabillyMoveEventName extends StObject
  object DraggabillyMoveEventName {
    
    inline def dragMove: typingsJapgolly.draggabilly.draggabillyStrings.dragMove = "dragMove".asInstanceOf[typingsJapgolly.draggabilly.draggabillyStrings.dragMove]
    
    inline def pointerMove: typingsJapgolly.draggabilly.draggabillyStrings.pointerMove = "pointerMove".asInstanceOf[typingsJapgolly.draggabilly.draggabillyStrings.pointerMove]
  }
  
  trait DraggabillyOptions extends StObject {
    
    var axis: js.UndefOr[x | y] = js.undefined
    
    var containment: js.UndefOr[Element | String | Boolean] = js.undefined
    
    var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var handle: js.UndefOr[String] = js.undefined
  }
  object DraggabillyOptions {
    
    inline def apply(): DraggabillyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraggabillyOptions]
    }
    
    extension [Self <: DraggabillyOptions](x: Self) {
      
      inline def setAxis(value: typingsJapgolly.draggabilly.draggabillyStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setContainment(value: Element | String | Boolean): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
      
      inline def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
      
      inline def setGrid(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Position {
    
    inline def apply(x: Double, y: Double): Position = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
