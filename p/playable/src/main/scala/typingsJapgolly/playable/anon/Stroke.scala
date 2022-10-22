package typingsJapgolly.playable.anon

import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stroke extends StObject {
  
  def stroke(data: IThemeConfig): String
}
object Stroke {
  
  inline def apply(stroke: IThemeConfig => String): Stroke = {
    val __obj = js.Dynamic.literal(stroke = js.Any.fromFunction1(stroke))
    __obj.asInstanceOf[Stroke]
  }
  
  extension [Self <: Stroke](x: Self) {
    
    inline def setStroke(value: IThemeConfig => String): Self = StObject.set(x, "stroke", js.Any.fromFunction1(value))
  }
}
