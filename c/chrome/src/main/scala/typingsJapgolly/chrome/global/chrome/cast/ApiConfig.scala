package typingsJapgolly.chrome.global.chrome.cast

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.ApiConfig")
@js.native
open class ApiConfig protected ()
  extends StObject
     with typingsJapgolly.chrome.chrome.cast.ApiConfig {
  /**
    * @param sessionRequest
    * @param sessionListener
    * @param receiverListener
    * @param opt_autoJoinPolicy
    * @param opt_defaultActionPolicy
    * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.ApiConfig
    */
  def this(
    sessionRequest: typingsJapgolly.chrome.chrome.cast.SessionRequest,
    sessionListener: js.Function1[/* session */ typingsJapgolly.chrome.chrome.cast.Session, Unit],
    receiverListener: js.Function1[
        /* receiverAvailability */ typingsJapgolly.chrome.chrome.cast.ReceiverAvailability, 
        Unit
      ]
  ) = this()
  def this(
    sessionRequest: typingsJapgolly.chrome.chrome.cast.SessionRequest,
    sessionListener: js.Function1[/* session */ typingsJapgolly.chrome.chrome.cast.Session, Unit],
    receiverListener: js.Function1[
        /* receiverAvailability */ typingsJapgolly.chrome.chrome.cast.ReceiverAvailability, 
        Unit
      ],
    autoJoinPolicy: typingsJapgolly.chrome.chrome.cast.AutoJoinPolicy
  ) = this()
  def this(
    sessionRequest: typingsJapgolly.chrome.chrome.cast.SessionRequest,
    sessionListener: js.Function1[/* session */ typingsJapgolly.chrome.chrome.cast.Session, Unit],
    receiverListener: js.Function1[
        /* receiverAvailability */ typingsJapgolly.chrome.chrome.cast.ReceiverAvailability, 
        Unit
      ],
    autoJoinPolicy: Unit,
    defaultActionPolicy: typingsJapgolly.chrome.chrome.cast.DefaultActionPolicy
  ) = this()
  def this(
    sessionRequest: typingsJapgolly.chrome.chrome.cast.SessionRequest,
    sessionListener: js.Function1[/* session */ typingsJapgolly.chrome.chrome.cast.Session, Unit],
    receiverListener: js.Function1[
        /* receiverAvailability */ typingsJapgolly.chrome.chrome.cast.ReceiverAvailability, 
        Unit
      ],
    autoJoinPolicy: typingsJapgolly.chrome.chrome.cast.AutoJoinPolicy,
    defaultActionPolicy: typingsJapgolly.chrome.chrome.cast.DefaultActionPolicy
  ) = this()
  
  /* CompleteClass */
  var autoJoinPolicy: typingsJapgolly.chrome.chrome.cast.AutoJoinPolicy = js.native
  
  /* CompleteClass */
  var defaultActionPolicy: typingsJapgolly.chrome.chrome.cast.DefaultActionPolicy = js.native
  
  /* CompleteClass */
  override def receiverListener(receiverAvailability: typingsJapgolly.chrome.chrome.cast.ReceiverAvailability): Unit = js.native
  
  /* CompleteClass */
  override def sessionListener(session: typingsJapgolly.chrome.chrome.cast.Session): Unit = js.native
  
  /* CompleteClass */
  var sessionRequest: typingsJapgolly.chrome.chrome.cast.SessionRequest = js.native
}
