package typingsJapgolly.webrtc

import typingsJapgolly.std.RTCErrorDetailType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("RTCError")
  @js.native
  open class RTCError protected ()
    extends StObject
       with typingsJapgolly.webrtc.RTCError {
    def this(init: RTCErrorInit) = this()
    def this(init: RTCErrorInit, message: String) = this()
    
    /* standard dom */
    /* CompleteClass */
    override val ABORT_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val DATA_CLONE_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val DOMSTRING_SIZE_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val HIERARCHY_REQUEST_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INDEX_SIZE_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INUSE_ATTRIBUTE_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INVALID_ACCESS_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INVALID_CHARACTER_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INVALID_MODIFICATION_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INVALID_NODE_TYPE_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val INVALID_STATE_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val NAMESPACE_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val NETWORK_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val NOT_FOUND_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val NOT_SUPPORTED_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val NO_DATA_ALLOWED_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val NO_MODIFICATION_ALLOWED_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val QUOTA_EXCEEDED_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val SECURITY_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val SYNTAX_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val TIMEOUT_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val TYPE_MISMATCH_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val URL_MISMATCH_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val VALIDATION_ERR: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val WRONG_DOCUMENT_ERR: Double = js.native
    
    /** @deprecated */
    /* standard dom */
    /* CompleteClass */
    override val code: Double = js.native
    
    /* CompleteClass */
    override val errorDetail: RTCErrorDetailType = js.native
    
    /* CompleteClass */
    override val httpRequestStatusCode: Double | Null = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override val receivedAlert: Double | Null = js.native
    
    /* CompleteClass */
    override val sctpCauseCode: Double | Null = js.native
    
    /* CompleteClass */
    override val sdpLineNumber: Double | Null = js.native
    
    /* CompleteClass */
    override val sentAlert: Double | Null = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("RTCErrorEvent")
  @js.native
  open class RTCErrorEvent protected ()
    extends StObject
       with typingsJapgolly.webrtc.RTCErrorEvent {
    def this(`type`: String, eventInitDict: RTCErrorEventInit) = this()
  }
  
  // to use with adapter.js, see: https://github.com/webrtc/adapter
  @JSGlobal("getUserMedia")
  @js.native
  def getUserMedia: NavigatorGetUserMedia = js.native
  inline def getUserMedia_=(x: NavigatorGetUserMedia): Unit = js.Dynamic.global.updateDynamic("getUserMedia")(x.asInstanceOf[js.Any])
}
