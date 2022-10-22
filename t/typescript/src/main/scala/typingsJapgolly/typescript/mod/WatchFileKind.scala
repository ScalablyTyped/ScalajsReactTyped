package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchFileKind extends StObject
@JSImport("typescript", "WatchFileKind")
@js.native
object WatchFileKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchFileKind & Double] = js.native
  
  @js.native
  sealed trait DynamicPriorityPolling
    extends StObject
       with WatchFileKind
  /* 2 */ val DynamicPriorityPolling: typingsJapgolly.typescript.mod.WatchFileKind.DynamicPriorityPolling & Double = js.native
  
  @js.native
  sealed trait FixedChunkSizePolling
    extends StObject
       with WatchFileKind
  /* 3 */ val FixedChunkSizePolling: typingsJapgolly.typescript.mod.WatchFileKind.FixedChunkSizePolling & Double = js.native
  
  @js.native
  sealed trait FixedPollingInterval
    extends StObject
       with WatchFileKind
  /* 0 */ val FixedPollingInterval: typingsJapgolly.typescript.mod.WatchFileKind.FixedPollingInterval & Double = js.native
  
  @js.native
  sealed trait PriorityPollingInterval
    extends StObject
       with WatchFileKind
  /* 1 */ val PriorityPollingInterval: typingsJapgolly.typescript.mod.WatchFileKind.PriorityPollingInterval & Double = js.native
  
  @js.native
  sealed trait UseFsEvents
    extends StObject
       with WatchFileKind
  /* 4 */ val UseFsEvents: typingsJapgolly.typescript.mod.WatchFileKind.UseFsEvents & Double = js.native
  
  @js.native
  sealed trait UseFsEventsOnParentDirectory
    extends StObject
       with WatchFileKind
  /* 5 */ val UseFsEventsOnParentDirectory: typingsJapgolly.typescript.mod.WatchFileKind.UseFsEventsOnParentDirectory & Double = js.native
}
