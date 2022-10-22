package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.mod.StencilTestGL
import typingsJapgolly.std.GLenum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Func
  extends StObject
     with StencilTestGL {
  
  var func: GLenum
  
  var mask: typingsJapgolly.maplibreGl.maplibreGlInts.`0`
}
object Func {
  
  inline def apply(func: GLenum): Func = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], mask = 0)
    __obj.asInstanceOf[Func]
  }
  
  extension [Self <: Func](x: Self) {
    
    inline def setFunc(value: GLenum): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setMask(value: typingsJapgolly.maplibreGl.maplibreGlInts.`0`): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
