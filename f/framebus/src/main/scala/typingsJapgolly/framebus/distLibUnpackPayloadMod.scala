package typingsJapgolly.framebus

import org.scalajs.dom.MessageEvent
import typingsJapgolly.framebus.distLibTypesMod.FramebusPayload
import typingsJapgolly.framebus.framebusBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUnpackPayloadMod {
  
  @JSImport("framebus/dist/lib/unpack-payload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unpackPayload(e: MessageEvent): FramebusPayload | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("unpackPayload")(e.asInstanceOf[js.Any]).asInstanceOf[FramebusPayload | `false`]
}
