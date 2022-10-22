package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * an event has a source that causes an event to be fired and a trigger that defines under which condition an event should be raised and an offset if the
  * event should be raised a defined amount of time after the event is triggered.
  */
trait ParagraphTarget extends StObject {
  
  var Paragraph: Double
  
  var Shape: XShape
}
object ParagraphTarget {
  
  inline def apply(Paragraph: Double, Shape: XShape): ParagraphTarget = {
    val __obj = js.Dynamic.literal(Paragraph = Paragraph.asInstanceOf[js.Any], Shape = Shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphTarget]
  }
  
  extension [Self <: ParagraphTarget](x: Self) {
    
    inline def setParagraph(value: Double): Self = StObject.set(x, "Paragraph", value.asInstanceOf[js.Any])
    
    inline def setShape(value: XShape): Self = StObject.set(x, "Shape", value.asInstanceOf[js.Any])
  }
}
