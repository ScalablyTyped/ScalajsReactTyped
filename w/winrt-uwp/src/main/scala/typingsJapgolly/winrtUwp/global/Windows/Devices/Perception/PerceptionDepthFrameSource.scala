package typingsJapgolly.winrtUwp.global.Windows.Devices.Perception

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A frame source that provides depth frames. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSource")
@js.native
open class PerceptionDepthFrameSource ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSource
object PerceptionDepthFrameSource {
  
  @JSGlobal("Windows.Devices.Perception.PerceptionDepthFrameSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new depth frame source watcher.
    * @return A new depth frame source watcher.
    */
  /* static member */
  inline def createWatcher(): typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSourceWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSourceWatcher]
  
  /**
    * Finds all depth frame sources.
    * @return When the method completes, it asynchronously returns a list of depth frame sources.
    */
  /* static member */
  inline def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  
  /**
    * Finds an depth frame source by looking up its unique ID.
    * @param id The unique ID of the depth frame source.
    * @return When this method completes, it asynchronously returns a depth frame source if one exists with the specified ID. Otherwise, this method asynchronously returns null.
    */
  /* static member */
  inline def fromIdAsync(id: String): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(id.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionDepthFrameSource]]
  
  /**
    * Requests access to use depth frame sources.
    * @return When this method completes, it asynchronously returns a PerceptionFrameSourceAccessStatus indicating the result of the access request.
    */
  /* static member */
  inline def requestAccessAsync(): IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")().asInstanceOf[IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus
  ]]
}
