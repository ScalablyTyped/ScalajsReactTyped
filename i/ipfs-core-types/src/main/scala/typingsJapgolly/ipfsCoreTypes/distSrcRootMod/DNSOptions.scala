package typingsJapgolly.ipfsCoreTypes.distSrcRootMod

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DNSOptions
  extends StObject
     with AbortOptions {
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object DNSOptions {
  
  inline def apply(): DNSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DNSOptions]
  }
  
  extension [Self <: DNSOptions](x: Self) {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
