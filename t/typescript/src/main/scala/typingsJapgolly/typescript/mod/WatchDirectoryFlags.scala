package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WatchDirectoryFlags extends StObject
@JSImport("typescript", "WatchDirectoryFlags")
@js.native
object WatchDirectoryFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WatchDirectoryFlags & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with WatchDirectoryFlags
  /* 0 */ val None: typingsJapgolly.typescript.mod.WatchDirectoryFlags.None & Double = js.native
  
  @js.native
  sealed trait Recursive
    extends StObject
       with WatchDirectoryFlags
  /* 1 */ val Recursive: typingsJapgolly.typescript.mod.WatchDirectoryFlags.Recursive & Double = js.native
}
