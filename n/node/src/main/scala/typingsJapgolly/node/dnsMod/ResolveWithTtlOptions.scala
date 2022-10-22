package typingsJapgolly.node.dnsMod

import typingsJapgolly.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveWithTtlOptions
  extends StObject
     with ResolveOptions {
  
  @JSName("ttl")
  var ttl_ResolveWithTtlOptions: `true`
}
object ResolveWithTtlOptions {
  
  inline def apply(): ResolveWithTtlOptions = {
    val __obj = js.Dynamic.literal(ttl = true)
    __obj.asInstanceOf[ResolveWithTtlOptions]
  }
  
  extension [Self <: ResolveWithTtlOptions](x: Self) {
    
    inline def setTtl(value: `true`): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}
