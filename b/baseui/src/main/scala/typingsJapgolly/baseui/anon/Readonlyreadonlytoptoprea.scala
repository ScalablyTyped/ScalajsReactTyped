package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.baseuiStrings.trailing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{ readonly top :'top',  readonly trailing :'trailing'}> */
trait Readonlyreadonlytoptoprea extends StObject {
  
  val top: typingsJapgolly.baseui.baseuiStrings.top
  
  val trailing: typingsJapgolly.baseui.baseuiStrings.trailing
}
object Readonlyreadonlytoptoprea {
  
  inline def apply(): Readonlyreadonlytoptoprea = {
    val __obj = js.Dynamic.literal(top = "top", trailing = "trailing")
    __obj.asInstanceOf[Readonlyreadonlytoptoprea]
  }
  
  extension [Self <: Readonlyreadonlytoptoprea](x: Self) {
    
    inline def setTop(value: top): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTrailing(value: trailing): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
  }
}
