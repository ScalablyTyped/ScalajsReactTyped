package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.anon.ConnectionPathInFragmentData
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilGetPaginationMetadataMod {
  
  @JSImport("relay-runtime/lib/util/getPaginationMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fragmentNode: ReaderFragment, componentDisplayName: String): ConnectionPathInFragmentData = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fragmentNode.asInstanceOf[js.Any], componentDisplayName.asInstanceOf[js.Any])).asInstanceOf[ConnectionPathInFragmentData]
}
