package typingsJapgolly.winrtUwp.global.Windows.Devices.Perception

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A frame source that provides infrared frames. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameSource")
@js.native
open class PerceptionInfraredFrameSource ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrameSource
object PerceptionInfraredFrameSource {
  
  @JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new infrared frame source watcher.
    * @return A new infrared frame source watcher.
    */
  /* static member */
  inline def createWatcher(): typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrameSourceWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")().asInstanceOf[typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrameSourceWatcher]
  
  /**
    * Finds all infrared frame sources.
    * @return When the method completes, it asynchronously returns a list of infrared frame sources.
    */
  /* static member */
  inline def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")().asInstanceOf[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  
  /**
    * Finds an infrared frame source by looking up its unique ID.
    * @param id The unique ID of the infrared frame source.
    * @return When the method completes, it asynchronously returns an infrared frame source if one exists with the specified ID. Otherwise, this method asynchronously returns nullptr.
    */
  /* static member */
  inline def fromIdAsync(id: String): IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrameSource
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(id.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrameSource
  ]]
  
  /**
    * Requests access to use infrared frame sources.
    * @return When this method completes, it asynchronously returns a PerceptionFrameSourceAccessStatus indicating the result of the access request.
    */
  /* static member */
  inline def requestAccessAsync(): IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestAccessAsync")().asInstanceOf[IPromiseWithIAsyncOperation[
    typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourceAccessStatus
  ]]
}
