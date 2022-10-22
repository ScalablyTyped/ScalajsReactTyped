package typingsJapgolly.expoConfigPlugins.anon

import typingsJapgolly.expoConfigPlugins.buildAndroidResourcesMod.ResourceKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind extends StObject {
  
  var kind: js.UndefOr[ResourceKind] = js.undefined
}
object Kind {
  
  inline def apply(): Kind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Kind]
  }
  
  extension [Self <: Kind](x: Self) {
    
    inline def setKind(value: ResourceKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
