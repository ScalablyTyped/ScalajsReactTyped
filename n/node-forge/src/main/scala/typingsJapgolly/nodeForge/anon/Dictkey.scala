package typingsJapgolly.nodeForge.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nodeForge.mod.pkcs12.Bag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[js.Array[Bag]]] {
  
  var friendlyName: js.UndefOr[js.Array[Bag]] = js.undefined
  
  var localKeyId: js.UndefOr[js.Array[Bag]] = js.undefined
}
object Dictkey {
  
  inline def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setFriendlyName(value: js.Array[Bag]): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setFriendlyNameVarargs(value: Bag*): Self = StObject.set(x, "friendlyName", js.Array(value*))
    
    inline def setLocalKeyId(value: js.Array[Bag]): Self = StObject.set(x, "localKeyId", value.asInstanceOf[js.Any])
    
    inline def setLocalKeyIdUndefined: Self = StObject.set(x, "localKeyId", js.undefined)
    
    inline def setLocalKeyIdVarargs(value: Bag*): Self = StObject.set(x, "localKeyId", js.Array(value*))
  }
}
