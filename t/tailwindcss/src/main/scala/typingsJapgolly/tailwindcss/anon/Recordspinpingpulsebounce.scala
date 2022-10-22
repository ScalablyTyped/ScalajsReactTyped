package typingsJapgolly.tailwindcss.anon

import typingsJapgolly.std.Record
import typingsJapgolly.tailwindcss.typesGeneratedDefaultThemeMod.CSSDeclarationList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'spin' | 'ping' | 'pulse' | 'bounce', std.Record<string, tailwindcss.tailwindcss/types/generated/default-theme.CSSDeclarationList>> */
trait Recordspinpingpulsebounce extends StObject {
  
  var bounce: Record[String, CSSDeclarationList]
  
  var ping: Record[String, CSSDeclarationList]
  
  var pulse: Record[String, CSSDeclarationList]
  
  var spin: Record[String, CSSDeclarationList]
}
object Recordspinpingpulsebounce {
  
  inline def apply(
    bounce: Record[String, CSSDeclarationList],
    ping: Record[String, CSSDeclarationList],
    pulse: Record[String, CSSDeclarationList],
    spin: Record[String, CSSDeclarationList]
  ): Recordspinpingpulsebounce = {
    val __obj = js.Dynamic.literal(bounce = bounce.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], pulse = pulse.asInstanceOf[js.Any], spin = spin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordspinpingpulsebounce]
  }
  
  extension [Self <: Recordspinpingpulsebounce](x: Self) {
    
    inline def setBounce(value: Record[String, CSSDeclarationList]): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
    
    inline def setPing(value: Record[String, CSSDeclarationList]): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    inline def setPulse(value: Record[String, CSSDeclarationList]): Self = StObject.set(x, "pulse", value.asInstanceOf[js.Any])
    
    inline def setSpin(value: Record[String, CSSDeclarationList]): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
  }
}
