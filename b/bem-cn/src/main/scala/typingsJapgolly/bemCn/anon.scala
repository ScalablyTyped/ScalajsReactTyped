package typingsJapgolly.bemCn

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<bem-cn.bem-cn.BemSettings> */
  trait PartialBemSettings extends StObject {
    
    var classMap: js.UndefOr[Record[String, String]] = js.undefined
    
    var el: js.UndefOr[String] = js.undefined
    
    var mod: js.UndefOr[String] = js.undefined
    
    var modValue: js.UndefOr[String] = js.undefined
    
    var ns: js.UndefOr[String] = js.undefined
  }
  object PartialBemSettings {
    
    inline def apply(): PartialBemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialBemSettings]
    }
    
    extension [Self <: PartialBemSettings](x: Self) {
      
      inline def setClassMap(value: Record[String, String]): Self = StObject.set(x, "classMap", value.asInstanceOf[js.Any])
      
      inline def setClassMapUndefined: Self = StObject.set(x, "classMap", js.undefined)
      
      inline def setEl(value: String): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
      
      inline def setMod(value: String): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      inline def setModUndefined: Self = StObject.set(x, "mod", js.undefined)
      
      inline def setModValue(value: String): Self = StObject.set(x, "modValue", value.asInstanceOf[js.Any])
      
      inline def setModValueUndefined: Self = StObject.set(x, "modValue", js.undefined)
      
      inline def setNs(value: String): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    }
  }
  
  trait ToString extends StObject
}
