package typingsJapgolly.nivoColors.anon

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  line :std.Partial<std.Partial<react.react.CSSProperties>>}> */
trait PartiallinePartialPartial extends StObject {
  
  var line: js.UndefOr[Partial[Partial[CSSProperties]]] = js.undefined
}
object PartiallinePartialPartial {
  
  inline def apply(): PartiallinePartialPartial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartiallinePartialPartial]
  }
  
  extension [Self <: PartiallinePartialPartial](x: Self) {
    
    inline def setLine(value: Partial[Partial[CSSProperties]]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
