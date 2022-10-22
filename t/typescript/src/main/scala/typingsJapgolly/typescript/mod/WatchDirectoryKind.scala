package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchDirectoryKind extends StObject
@JSImport("typescript", "WatchDirectoryKind")
@js.native
object WatchDirectoryKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchDirectoryKind & Double] = js.native
  
  @js.native
  sealed trait DynamicPriorityPolling
    extends StObject
       with WatchDirectoryKind
  /* 2 */ val DynamicPriorityPolling: typingsJapgolly.typescript.mod.WatchDirectoryKind.DynamicPriorityPolling & Double = js.native
  
  @js.native
  sealed trait FixedChunkSizePolling
    extends StObject
       with WatchDirectoryKind
  /* 3 */ val FixedChunkSizePolling: typingsJapgolly.typescript.mod.WatchDirectoryKind.FixedChunkSizePolling & Double = js.native
  
  @js.native
  sealed trait FixedPollingInterval
    extends StObject
       with WatchDirectoryKind
  /* 1 */ val FixedPollingInterval: typingsJapgolly.typescript.mod.WatchDirectoryKind.FixedPollingInterval & Double = js.native
  
  @js.native
  sealed trait UseFsEvents
    extends StObject
       with WatchDirectoryKind
  /* 0 */ val UseFsEvents: typingsJapgolly.typescript.mod.WatchDirectoryKind.UseFsEvents & Double = js.native
}
