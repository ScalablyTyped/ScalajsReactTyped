package typingsJapgolly.multiformats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version[V /* <: typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version */, Format /* <: Double */] extends StObject {
  
  var code: Format
  
  var hash: js.typedarray.Uint8Array
  
  var version: V
}
object Version {
  
  inline def apply[V /* <: typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version */, Format /* <: Double */](code: Format, hash: js.typedarray.Uint8Array, version: V): Version[V, Format] = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version[V, Format]]
  }
  
  extension [Self <: Version[?, ?], V /* <: typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version */, Format /* <: Double */](x: Self & (Version[V, Format])) {
    
    inline def setCode(value: Format): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setHash(value: js.typedarray.Uint8Array): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: V): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
