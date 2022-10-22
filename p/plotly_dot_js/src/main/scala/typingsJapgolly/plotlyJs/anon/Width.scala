package typingsJapgolly.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width extends StObject {
  
  var dash: typingsJapgolly.plotlyJs.libTracesOhclMod.Dash
  
  var width: Double
}
object Width {
  
  inline def apply(dash: typingsJapgolly.plotlyJs.libTracesOhclMod.Dash, width: Double): Width = {
    val __obj = js.Dynamic.literal(dash = dash.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
  
  extension [Self <: Width](x: Self) {
    
    inline def setDash(value: typingsJapgolly.plotlyJs.libTracesOhclMod.Dash): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
