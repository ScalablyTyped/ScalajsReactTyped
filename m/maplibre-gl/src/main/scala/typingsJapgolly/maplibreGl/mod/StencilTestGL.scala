package typingsJapgolly.maplibreGl.mod

import typingsJapgolly.std.GLenum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.maplibreGl.anon.Func
  - typingsJapgolly.maplibreGl.anon.Mask
*/
trait StencilTestGL extends StObject
object StencilTestGL {
  
  inline def Func(func: GLenum): typingsJapgolly.maplibreGl.anon.Func = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], mask = 0)
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Func]
  }
  
  inline def Mask(func: GLenum, mask: Double): typingsJapgolly.maplibreGl.anon.Mask = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.maplibreGl.anon.Mask]
  }
}
