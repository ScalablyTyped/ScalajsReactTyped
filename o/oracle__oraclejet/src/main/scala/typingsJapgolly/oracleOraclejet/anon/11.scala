package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.ojgaugeMod.ojRatingGauge.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  def renderer(context: TooltipContext): Insert | PreventDefault
}
object `11` {
  
  inline def apply(renderer: TooltipContext => Insert | PreventDefault): `11` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setRenderer(value: TooltipContext => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
