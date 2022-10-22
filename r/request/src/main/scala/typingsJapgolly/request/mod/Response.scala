package typingsJapgolly.request.mod

import typingsJapgolly.caseless.mod.Caseless
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.request.anon.Connect
import typingsJapgolly.request.anon.Dns
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends IncomingMessage {
  
  var body: Any = js.native
  
  // Buffer, string, stream.Readable, or a plain object if `json` was truthy
  var caseless: Caseless = js.native
  
  var elapsedTime: js.UndefOr[Double] = js.native
  
  var request: Request = js.native
  
  @JSName("statusCode")
  var statusCode_Response: Double = js.native
  
  @JSName("statusMessage")
  var statusMessage_Response: String = js.native
  
  var timingPhases: js.UndefOr[Dns] = js.native
  
  var timingStart: js.UndefOr[Double] = js.native
  
  var timings: js.UndefOr[Connect] = js.native
  
  // case-insensitive access to headers
  def toJSON(): ResponseAsJSON = js.native
}
