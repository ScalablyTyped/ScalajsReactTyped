package typingsJapgolly.webpack.mod

import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextHash extends StObject {
  
  var hash: String
  
  var resolved: js.UndefOr[String] = js.undefined
  
  var symlinks: js.UndefOr[Set[String]] = js.undefined
}
object ContextHash {
  
  inline def apply(hash: String): ContextHash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextHash]
  }
  
  extension [Self <: ContextHash](x: Self) {
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    
    inline def setSymlinks(value: Set[String]): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
  }
}
