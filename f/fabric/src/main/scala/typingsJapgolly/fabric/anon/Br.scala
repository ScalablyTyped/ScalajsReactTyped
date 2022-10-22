package typingsJapgolly.fabric.anon

import typingsJapgolly.fabric.fabricImplMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Br extends StObject {
  
  var bl: Point
  
  var br: Point
  
  var tl: Point
  
  var tr: Point
}
object Br {
  
  inline def apply(bl: Point, br: Point, tl: Point, tr: Point): Br = {
    val __obj = js.Dynamic.literal(bl = bl.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], tl = tl.asInstanceOf[js.Any], tr = tr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Br]
  }
  
  extension [Self <: Br](x: Self) {
    
    inline def setBl(value: Point): Self = StObject.set(x, "bl", value.asInstanceOf[js.Any])
    
    inline def setBr(value: Point): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
    
    inline def setTl(value: Point): Self = StObject.set(x, "tl", value.asInstanceOf[js.Any])
    
    inline def setTr(value: Point): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
  }
}
