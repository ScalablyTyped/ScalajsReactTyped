package typingsJapgolly.nivoCore.anon

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinePartial extends StObject {
  
  var line: Partial[CSSProperties]
}
object LinePartial {
  
  inline def apply(line: Partial[CSSProperties]): LinePartial = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinePartial]
  }
  
  extension [Self <: LinePartial](x: Self) {
    
    inline def setLine(value: Partial[CSSProperties]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
