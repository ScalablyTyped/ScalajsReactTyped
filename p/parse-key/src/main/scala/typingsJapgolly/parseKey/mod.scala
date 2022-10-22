package typingsJapgolly.parseKey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(s: String): KeyObject = ^.asInstanceOf[js.Dynamic].apply(s.asInstanceOf[js.Any]).asInstanceOf[KeyObject]
  
  @JSImport("parse-key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait KeyObject extends StObject {
    
    var alt: Boolean
    
    var ctrl: Boolean
    
    var meta: Boolean
    
    var name: String
    
    var sequence: String
    
    var shift: Boolean
  }
  object KeyObject {
    
    inline def apply(alt: Boolean, ctrl: Boolean, meta: Boolean, name: String, sequence: String, shift: Boolean): KeyObject = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], ctrl = ctrl.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyObject]
    }
    
    extension [Self <: KeyObject](x: Self) {
      
      inline def setAlt(value: Boolean): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    }
  }
}
