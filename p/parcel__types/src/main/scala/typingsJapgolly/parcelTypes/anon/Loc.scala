package typingsJapgolly.parcelTypes.anon

import typingsJapgolly.parcelTypes.mod.Meta
import typingsJapgolly.parcelTypes.mod.SourceLocation
import typingsJapgolly.parcelTypes.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loc extends StObject {
  
  var loc: js.UndefOr[SourceLocation | Null] = js.undefined
  
  var local: Symbol
  
  var meta: js.UndefOr[Meta | Null] = js.undefined
}
object Loc {
  
  inline def apply(local: Symbol): Loc = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loc]
  }
  
  extension [Self <: Loc](x: Self) {
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setLocal(value: Symbol): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaNull: Self = StObject.set(x, "meta", null)
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
