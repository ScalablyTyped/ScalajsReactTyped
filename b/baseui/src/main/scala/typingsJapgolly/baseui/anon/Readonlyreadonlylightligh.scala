package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.dark
import typingsJapgolly.baseui.baseuiStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{ readonly light :'light',  readonly dark :'dark'}> */
trait Readonlyreadonlylightligh extends StObject {
  
  val dark: typingsJapgolly.baseui.baseuiStrings.dark
  
  val light: typingsJapgolly.baseui.baseuiStrings.light
}
object Readonlyreadonlylightligh {
  
  inline def apply(): Readonlyreadonlylightligh = {
    val __obj = js.Dynamic.literal(dark = "dark", light = "light")
    __obj.asInstanceOf[Readonlyreadonlylightligh]
  }
  
  extension [Self <: Readonlyreadonlylightligh](x: Self) {
    
    inline def setDark(value: dark): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setLight(value: light): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
