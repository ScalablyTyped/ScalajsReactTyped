package typingsJapgolly.multiformats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash[Format /* <: Double */, Version /* <: typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version */] extends StObject {
  
  var code: Format
  
  var hash: js.typedarray.Uint8Array
  
  var version: Version
}
object Hash {
  
  inline def apply[Format /* <: Double */, Version /* <: typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version */](code: Format, hash: js.typedarray.Uint8Array, version: Version): Hash[Format, Version] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash[Format, Version]]
  }
  
  extension [Self <: Hash[?, ?], Format /* <: Double */, Version /* <: typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version */](x: Self & (Hash[Format, Version])) {
    
    inline def setCode(value: Format): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setHash(value: js.typedarray.Uint8Array): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
