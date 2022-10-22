package typingsJapgolly.aceBuilds.mod.Ace

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerLike extends StObject {
  
  var clazz: String
  
  var id: Double
  
  var inFront: Boolean
  
  var range: js.UndefOr[Range] = js.undefined
  
  var renderer: js.UndefOr[MarkerRenderer] = js.undefined
  
  var `type`: String
  
  var update: js.UndefOr[
    js.Function4[
      /* html */ js.Array[String], 
      /* marker */ Any, 
      /* session */ EditSession, 
      /* config */ Any, 
      Unit
    ]
  ] = js.undefined
}
object MarkerLike {
  
  inline def apply(clazz: String, id: Double, inFront: Boolean, `type`: String): MarkerLike = {
    val __obj = js.Dynamic.literal(clazz = clazz.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inFront = inFront.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerLike]
  }
  
  extension [Self <: MarkerLike](x: Self) {
    
    inline def setClazz(value: String): Self = StObject.set(x, "clazz", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInFront(value: Boolean): Self = StObject.set(x, "inFront", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setRenderer(
      value: (/* html */ js.Array[String], /* range */ Range, /* left */ Double, /* top */ Double, /* config */ Any) => Callback
    ): Self = StObject.set(x, "renderer", js.Any.fromFunction5((t0: /* html */ js.Array[String], t1: /* range */ Range, t2: /* left */ Double, t3: /* top */ Double, t4: /* config */ Any) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdate(
      value: (/* html */ js.Array[String], /* marker */ Any, /* session */ EditSession, /* config */ Any) => Callback
    ): Self = StObject.set(x, "update", js.Any.fromFunction4((t0: /* html */ js.Array[String], t1: /* marker */ Any, t2: /* session */ EditSession, t3: /* config */ Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
