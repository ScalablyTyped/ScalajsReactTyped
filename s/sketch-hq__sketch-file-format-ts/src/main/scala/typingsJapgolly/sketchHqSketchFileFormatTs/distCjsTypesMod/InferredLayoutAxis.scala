package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InferredLayoutAxis extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "InferredLayoutAxis")
@js.native
object InferredLayoutAxis extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InferredLayoutAxis & Double] = js.native
  
  @js.native
  sealed trait Horizontal
    extends StObject
       with InferredLayoutAxis
  /* 0 */ val Horizontal: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.InferredLayoutAxis.Horizontal & Double = js.native
  
  @js.native
  sealed trait Vertical
    extends StObject
       with InferredLayoutAxis
  /* 1 */ val Vertical: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.InferredLayoutAxis.Vertical & Double = js.native
}
