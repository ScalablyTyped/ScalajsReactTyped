package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOMSnapshot.CaptureSnapshotRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOMSnapshot.CaptureSnapshotResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOMSnapshot.GetSnapshotRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOMSnapshot.GetSnapshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMSnapshotApi extends StObject {
  
  /**
    * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
    * template contents, and imported documents) in a flattened array, as well as layout and
    * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
    * flattened.
    */
  def captureSnapshot(params: CaptureSnapshotRequest): js.Promise[CaptureSnapshotResponse]
  
  /**
    * Disables DOM snapshot agent for the given page.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enables DOM snapshot agent for the given page.
    */
  def enable(): js.Promise[Unit]
  
  /**
    * Returns a document snapshot, including the full DOM tree of the root node (including iframes,
    * template contents, and imported documents) in a flattened array, as well as layout and
    * white-listed computed style information for the nodes. Shadow DOM in the returned DOM tree is
    * flattened.
    */
  def getSnapshot(params: GetSnapshotRequest): js.Promise[GetSnapshotResponse]
}
object DOMSnapshotApi {
  
  inline def apply(
    captureSnapshot: CaptureSnapshotRequest => js.Promise[CaptureSnapshotResponse],
    disable: CallbackTo[js.Promise[Unit]],
    enable: CallbackTo[js.Promise[Unit]],
    getSnapshot: GetSnapshotRequest => js.Promise[GetSnapshotResponse]
  ): DOMSnapshotApi = {
    val __obj = js.Dynamic.literal(captureSnapshot = js.Any.fromFunction1(captureSnapshot), disable = disable.toJsFn, enable = enable.toJsFn, getSnapshot = js.Any.fromFunction1(getSnapshot))
    __obj.asInstanceOf[DOMSnapshotApi]
  }
  
  extension [Self <: DOMSnapshotApi](x: Self) {
    
    inline def setCaptureSnapshot(value: CaptureSnapshotRequest => js.Promise[CaptureSnapshotResponse]): Self = StObject.set(x, "captureSnapshot", js.Any.fromFunction1(value))
    
    inline def setDisable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setGetSnapshot(value: GetSnapshotRequest => js.Promise[GetSnapshotResponse]): Self = StObject.set(x, "getSnapshot", js.Any.fromFunction1(value))
  }
}
