package typingsJapgolly.node.dnsMod

import typingsJapgolly.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupAllOptions
  extends StObject
     with LookupOptions {
  
  @JSName("all")
  var all_LookupAllOptions: `true`
}
object LookupAllOptions {
  
  inline def apply(): LookupAllOptions = {
    val __obj = js.Dynamic.literal(all = true)
    __obj.asInstanceOf[LookupAllOptions]
  }
  
  extension [Self <: LookupAllOptions](x: Self) {
    
    inline def setAll(value: `true`): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
  }
}
