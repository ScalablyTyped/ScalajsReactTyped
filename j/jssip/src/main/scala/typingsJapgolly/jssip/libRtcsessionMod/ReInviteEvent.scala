package typingsJapgolly.jssip.libRtcsessionMod

import typingsJapgolly.jssip.libSipmessageMod.IncomingRequest
import typingsJapgolly.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReInviteEvent extends StObject {
  
  var callback: js.UndefOr[VoidFunction] = js.native
  
  def reject(): Unit = js.native
  def reject(options: RejectOptions): Unit = js.native
  
  var request: IncomingRequest = js.native
}
