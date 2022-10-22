package typingsJapgolly.parcelTypes.anon

import typingsJapgolly.parcelTypes.mod.Meta
import typingsJapgolly.parcelTypes.mod.SourceLocation
import typingsJapgolly.parcelTypes.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsWeak extends StObject {
  
  var isWeak: Boolean
  
  var loc: js.UndefOr[SourceLocation | Null] = js.undefined
  
  var local: Symbol
  
  var meta: js.UndefOr[Meta] = js.undefined
}
object IsWeak {
  
  inline def apply(isWeak: Boolean, local: Symbol): IsWeak = {
    val __obj = js.Dynamic.literal(isWeak = isWeak.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsWeak]
  }
  
  extension [Self <: IsWeak](x: Self) {
    
    inline def setIsWeak(value: Boolean): Self = StObject.set(x, "isWeak", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setLocal(value: Symbol): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
