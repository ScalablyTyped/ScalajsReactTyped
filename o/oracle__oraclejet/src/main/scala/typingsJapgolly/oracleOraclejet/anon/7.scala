package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.ojganttMod.ojGantt.RowAxisLabelRendererContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[K2, D2] extends StObject {
  
  def renderer(context: RowAxisLabelRendererContext[K2, D2]): InsertElement
}
object `7` {
  
  inline def apply[K2, D2](renderer: RowAxisLabelRendererContext[K2, D2] => InsertElement): `7`[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`7`[K2, D2]]
  }
  
  extension [Self <: `7`[?, ?], K2, D2](x: Self & (`7`[K2, D2])) {
    
    inline def setRenderer(value: RowAxisLabelRendererContext[K2, D2] => InsertElement): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
