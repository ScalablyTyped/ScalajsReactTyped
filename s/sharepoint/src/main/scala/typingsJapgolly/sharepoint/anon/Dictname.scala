package typingsJapgolly.sharepoint.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictname
  extends StObject
     with /* name */ StringDictionary[Any] {
  
  var Key: String
}
object Dictname {
  
  inline def apply(Key: String): Dictname = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictname]
  }
  
  extension [Self <: Dictname](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
