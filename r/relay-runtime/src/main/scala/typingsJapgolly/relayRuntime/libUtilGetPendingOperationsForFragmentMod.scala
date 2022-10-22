package typingsJapgolly.relayRuntime

import typingsJapgolly.relayRuntime.anon.PendingOperations
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.RequestDescriptor
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilGetPendingOperationsForFragmentMod {
  
  @JSImport("relay-runtime/lib/util/getPendingOperationsForFragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(environment: Environment, fragmentNode: ReaderFragment, fragmentOwner: RequestDescriptor): PendingOperations | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(environment.asInstanceOf[js.Any], fragmentNode.asInstanceOf[js.Any], fragmentOwner.asInstanceOf[js.Any])).asInstanceOf[PendingOperations | Null]
}
