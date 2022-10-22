package typingsJapgolly.chartist.anon

import typingsJapgolly.chartist.chartistStrings.height
import typingsJapgolly.chartist.chartistStrings.vertical
import typingsJapgolly.chartist.chartistStrings.x1
import typingsJapgolly.chartist.chartistStrings.y
import typingsJapgolly.chartist.chartistStrings.y1
import typingsJapgolly.chartist.chartistStrings.y2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Len extends StObject {
  
  val dir: vertical
  
  val len: height
  
  val pos: y
  
  val rectEnd: y1
  
  val rectOffset: x1
  
  val rectStart: y2
}
object Len {
  
  inline def apply(): Len = {
    val __obj = js.Dynamic.literal(dir = "vertical", len = "height", pos = "y", rectEnd = "y1", rectOffset = "x1", rectStart = "y2")
    __obj.asInstanceOf[Len]
  }
  
  extension [Self <: Len](x: Self) {
    
    inline def setDir(value: vertical): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setLen(value: height): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
    
    inline def setPos(value: y): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setRectEnd(value: y1): Self = StObject.set(x, "rectEnd", value.asInstanceOf[js.Any])
    
    inline def setRectOffset(value: x1): Self = StObject.set(x, "rectOffset", value.asInstanceOf[js.Any])
    
    inline def setRectStart(value: y2): Self = StObject.set(x, "rectStart", value.asInstanceOf[js.Any])
  }
}
