package typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarHandle
  - typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedHandle
*/
trait NormalizationHandle
  extends StObject
     with NormalizationSelection
object NormalizationHandle {
  
  inline def NormalizationLinkedHandle(handle: String, key: String, kind: String, name: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationLinkedHandle]
  }
  
  inline def NormalizationScalarHandle(handle: String, key: String, kind: String, name: String): typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.relayRuntime.libUtilNormalizationNodeMod.NormalizationScalarHandle]
  }
}
