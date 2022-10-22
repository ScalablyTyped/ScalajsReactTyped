package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LayerListExpanded extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "LayerListExpanded")
@js.native
object LayerListExpanded extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LayerListExpanded & Double] = js.native
  
  @js.native
  sealed trait Collapsed
    extends StObject
       with LayerListExpanded
  /* 1 */ val Collapsed: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LayerListExpanded.Collapsed & Double = js.native
  
  @js.native
  sealed trait Expanded
    extends StObject
       with LayerListExpanded
  /* 2 */ val Expanded: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LayerListExpanded.Expanded & Double = js.native
  
  @js.native
  sealed trait Undecided
    extends StObject
       with LayerListExpanded
  /* 0 */ val Undecided: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LayerListExpanded.Undecided & Double = js.native
}
