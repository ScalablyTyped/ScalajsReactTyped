package typingsJapgolly.slate

import typingsJapgolly.slate.distInterfacesEditorMod.Editor
import typingsJapgolly.slate.distInterfacesPathMod.Path
import typingsJapgolly.slate.distInterfacesPathRefMod.PathRef
import typingsJapgolly.slate.distInterfacesPointRefMod.PointRef
import typingsJapgolly.slate.distInterfacesRangeRefMod.RangeRef
import typingsJapgolly.std.Set
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsWeakMapsMod {
  
  @JSImport("slate/dist/utils/weak-maps", "DIRTY_PATHS")
  @js.native
  val DIRTY_PATHS: WeakMap[Editor, js.Array[Path]] = js.native
  
  @JSImport("slate/dist/utils/weak-maps", "DIRTY_PATH_KEYS")
  @js.native
  val DIRTY_PATH_KEYS: WeakMap[Editor, Set[String]] = js.native
  
  @JSImport("slate/dist/utils/weak-maps", "FLUSHING")
  @js.native
  val FLUSHING: WeakMap[Editor, Boolean] = js.native
  
  @JSImport("slate/dist/utils/weak-maps", "NORMALIZING")
  @js.native
  val NORMALIZING: WeakMap[Editor, Boolean] = js.native
  
  @JSImport("slate/dist/utils/weak-maps", "PATH_REFS")
  @js.native
  val PATH_REFS: WeakMap[Editor, Set[PathRef]] = js.native
  
  @JSImport("slate/dist/utils/weak-maps", "POINT_REFS")
  @js.native
  val POINT_REFS: WeakMap[Editor, Set[PointRef]] = js.native
  
  @JSImport("slate/dist/utils/weak-maps", "RANGE_REFS")
  @js.native
  val RANGE_REFS: WeakMap[Editor, Set[RangeRef]] = js.native
}
