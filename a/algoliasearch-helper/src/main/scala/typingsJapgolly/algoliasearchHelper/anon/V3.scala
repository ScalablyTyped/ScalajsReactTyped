package typingsJapgolly.algoliasearchHelper.anon

import typingsJapgolly.algoliasearchHelper.typesAlgoliasearchMod.ClientV34
import typingsJapgolly.algoliasearchHelper.typesAlgoliasearchMod.ClientV5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait V3 extends StObject {
  
  var v3: ClientV34
  
  var v4: ClientV34
  
  var v5: ClientV5
}
object V3 {
  
  inline def apply(v3: ClientV34, v4: ClientV34, v5: ClientV5): V3 = {
    val __obj = js.Dynamic.literal(v3 = v3.asInstanceOf[js.Any], v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any])
    __obj.asInstanceOf[V3]
  }
  
  extension [Self <: V3](x: Self) {
    
    inline def setV3(value: ClientV34): Self = StObject.set(x, "v3", value.asInstanceOf[js.Any])
    
    inline def setV4(value: ClientV34): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
    
    inline def setV5(value: ClientV5): Self = StObject.set(x, "v5", value.asInstanceOf[js.Any])
  }
}
