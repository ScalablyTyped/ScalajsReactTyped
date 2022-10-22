package typingsJapgolly.sharedb.mod

import typingsJapgolly.sharedb.libSharedbMod.ServerResponseError
import typingsJapgolly.sharedb.libSharedbMod.ServerResponseSuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendEventListenerMap extends StObject {
  
  def error(err: Error): Unit = js.native
  
  def send(agent: typingsJapgolly.sharedb.libAgentMod.^[Any], response: ServerResponseError): Unit = js.native
  def send(agent: typingsJapgolly.sharedb.libAgentMod.^[Any], response: ServerResponseSuccess): Unit = js.native
  
  def submitRequestEnd(error: Error, request: SubmitRequest): Unit = js.native
  
  def timing(`type`: String, time: Double, request: Any): Unit = js.native
}
