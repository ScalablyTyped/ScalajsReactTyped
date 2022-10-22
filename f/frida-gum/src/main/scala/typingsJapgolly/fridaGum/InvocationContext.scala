package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fridaGum.PortableInvocationContext
  - typingsJapgolly.fridaGum.WindowsInvocationContext
  - typingsJapgolly.fridaGum.UnixInvocationContext
*/
trait InvocationContext extends StObject
object InvocationContext {
  
  inline def PortableInvocationContext(context: CpuContext, depth: Double, returnAddress: NativePointer, threadId: ThreadId): typingsJapgolly.fridaGum.PortableInvocationContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.PortableInvocationContext]
  }
  
  inline def UnixInvocationContext(
    context: CpuContext,
    depth: Double,
    errno: Double,
    returnAddress: NativePointer,
    threadId: ThreadId
  ): typingsJapgolly.fridaGum.UnixInvocationContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.UnixInvocationContext]
  }
  
  inline def WindowsInvocationContext(
    context: CpuContext,
    depth: Double,
    lastError: Double,
    returnAddress: NativePointer,
    threadId: ThreadId
  ): typingsJapgolly.fridaGum.WindowsInvocationContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], lastError = lastError.asInstanceOf[js.Any], returnAddress = returnAddress.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.fridaGum.WindowsInvocationContext]
  }
}
