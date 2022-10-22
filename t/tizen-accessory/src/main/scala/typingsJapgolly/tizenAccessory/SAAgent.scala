package typingsJapgolly.tizenAccessory

import typingsJapgolly.tizenAccessory.anon.Onconnect
import typingsJapgolly.tizenAccessory.anon.Onerror
import typingsJapgolly.tizenAccessory.tizenAccessoryStrings.consumer
import typingsJapgolly.tizenAccessory.tizenAccessoryStrings.provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SAAgent extends StObject {
  
  def acceptServiceConnectionRequest(peerAgent: SAPeerAgent): Unit = js.native
  
  def authenticatePeerAgent(
    peerAgent: SAPeerAgent,
    success: js.Function2[/* peerAgent */ SAPeerAgent, /* authToken */ SAAuthenticationToken, Unit]
  ): Unit = js.native
  def authenticatePeerAgent(
    peerAgent: SAPeerAgent,
    success: js.Function2[/* peerAgent */ SAPeerAgent, /* authToken */ SAAuthenticationToken, Unit],
    error: js.Function1[/* e */ js.Error, Unit]
  ): Unit = js.native
  
  val channelIds: js.Array[Double] = js.native
  
  def findPeerAgents(): Unit = js.native
  
  def getSAFileTransfer(): SAFileTransfer = js.native
  
  def getSAMessage(): SAMessage = js.native
  
  val id: String = js.native
  
  val name: String = js.native
  
  def rejectServiceConnectionRequest(peerAgent: SAPeerAgent): Unit = js.native
  
  def requestServiceConnection(peerAgent: SAPeerAgent): Unit = js.native
  
  val role: consumer | provider = js.native
  
  def setPeerAgentFindListener(callback: Onerror): Unit = js.native
  
  def setServiceConnectionListener(callback: Onconnect): Unit = js.native
}
