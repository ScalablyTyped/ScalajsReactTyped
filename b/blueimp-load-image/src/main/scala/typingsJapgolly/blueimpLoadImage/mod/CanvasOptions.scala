package typingsJapgolly.blueimpLoadImage.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.blueimpLoadImage.mod.CanvasTrueOptions
  - typingsJapgolly.blueimpLoadImage.mod.CanvasFalseOptions
*/
trait CanvasOptions extends StObject
object CanvasOptions {
  
  inline def CanvasFalseOptions(): typingsJapgolly.blueimpLoadImage.mod.CanvasFalseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsJapgolly.blueimpLoadImage.mod.CanvasFalseOptions]
  }
  
  inline def CanvasTrueOptions(): typingsJapgolly.blueimpLoadImage.mod.CanvasTrueOptions = {
    val __obj = js.Dynamic.literal(canvas = true)
    __obj.asInstanceOf[typingsJapgolly.blueimpLoadImage.mod.CanvasTrueOptions]
  }
}
