package typingsJapgolly.chrome.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typingsJapgolly.chrome.chrome.cast.ApiConfig
import typingsJapgolly.chrome.chrome.cast.AutoJoinPolicy
import typingsJapgolly.chrome.chrome.cast.Capability
import typingsJapgolly.chrome.chrome.cast.DefaultActionPolicy
import typingsJapgolly.chrome.chrome.cast.Error
import typingsJapgolly.chrome.chrome.cast.ErrorCode
import typingsJapgolly.chrome.chrome.cast.Image
import typingsJapgolly.chrome.chrome.cast.Receiver
import typingsJapgolly.chrome.chrome.cast.ReceiverAction
import typingsJapgolly.chrome.chrome.cast.ReceiverAvailability
import typingsJapgolly.chrome.chrome.cast.SenderPlatform
import typingsJapgolly.chrome.chrome.cast.Session
import typingsJapgolly.chrome.chrome.cast.SessionRequest
import typingsJapgolly.chrome.chrome.cast.Volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcast extends StObject {
  
  var ApiConfig: Instantiable5[
    /* sessionRequest */ SessionRequest, 
    /* sessionListener */ js.Function1[/* session */ Session, Unit], 
    /* receiverListener */ js.Function1[/* receiverAvailability */ ReceiverAvailability, Unit], 
    /* autoJoinPolicy */ js.UndefOr[AutoJoinPolicy], 
    /* defaultActionPolicy */ js.UndefOr[DefaultActionPolicy], 
    typingsJapgolly.chrome.chrome.cast.ApiConfig
  ] = js.native
  
  var Error: Instantiable3[
    /* code */ ErrorCode, 
    /* description */ js.UndefOr[String], 
    /* details */ js.UndefOr[js.Object], 
    typingsJapgolly.chrome.chrome.cast.Error
  ] = js.native
  
  var Image: Instantiable1[/* url */ String, typingsJapgolly.chrome.chrome.cast.Image] = js.native
  
  var Receiver: Instantiable4[
    /* label */ String, 
    /* friendlyName */ String, 
    /* capabilities */ js.UndefOr[js.Array[Capability]], 
    /* volume */ js.UndefOr[Volume], 
    typingsJapgolly.chrome.chrome.cast.Receiver
  ] = js.native
  
  var ReceiverDisplayStatus: Instantiable2[
    /* statusText */ String, 
    /* appImages */ js.Array[Image], 
    typingsJapgolly.chrome.chrome.cast.ReceiverDisplayStatus
  ] = js.native
  
  var SenderApplication: Instantiable1[
    /* platform */ SenderPlatform, 
    typingsJapgolly.chrome.chrome.cast.SenderApplication
  ] = js.native
  
  var Session: Instantiable5[
    /* sessionId */ String, 
    /* appId */ String, 
    /* displayName */ String, 
    /* appImages */ js.Array[Image], 
    /* receiver */ Receiver, 
    typingsJapgolly.chrome.chrome.cast.Session
  ] = js.native
  
  var SessionRequest: Instantiable3[
    /* appId */ String, 
    /* capabilities */ js.UndefOr[js.Array[Capability]], 
    /* timeout */ js.UndefOr[Double], 
    typingsJapgolly.chrome.chrome.cast.SessionRequest
  ] = js.native
  
  var VERSION: js.Array[Double] = js.native
  
  var Volume: Instantiable2[
    /* level */ js.UndefOr[Double], 
    /* muted */ js.UndefOr[Boolean], 
    typingsJapgolly.chrome.chrome.cast.Volume
  ] = js.native
  
  def addReceiverActionListener(listener: js.Function2[/* receiver */ Receiver, /* receiverAction */ ReceiverAction, Unit]): Unit = js.native
  
  def initialize(
    apiConfig: ApiConfig,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  var isAvailable: Boolean = js.native
  
  def logMessage(message: String): Unit = js.native
  
  val media: Typeofmedia = js.native
  
  def removeReceiverActionListener(listener: js.Function2[/* receiver */ Receiver, /* receiverAction */ ReceiverAction, Unit]): Unit = js.native
  
  def requestSession(
    successCallback: js.Function1[/* session */ Session, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ Session, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit],
    sessionRequest: Unit,
    label: String
  ): Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ Session, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit],
    sessionRequest: SessionRequest
  ): Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ Session, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit],
    sessionRequest: SessionRequest,
    label: String
  ): Unit = js.native
  
  def requestSessionById(sessionId: String): Unit = js.native
  
  def setCustomReceivers(
    receivers: js.Array[Receiver],
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  def setReceiverDisplayStatus(
    receiver: Receiver,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  def unescape(escaped: String): String = js.native
}
