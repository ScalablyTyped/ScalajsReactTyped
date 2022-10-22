package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PointsRadiusBehaviour extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "PointsRadiusBehaviour")
@js.native
object PointsRadiusBehaviour extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointsRadiusBehaviour & Double] = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with PointsRadiusBehaviour
  /* -1 */ val Disabled: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PointsRadiusBehaviour.Disabled & Double = js.native
  
  @js.native
  sealed trait Legacy
    extends StObject
       with PointsRadiusBehaviour
  /* 0 */ val Legacy: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PointsRadiusBehaviour.Legacy & Double = js.native
  
  @js.native
  sealed trait Rounded
    extends StObject
       with PointsRadiusBehaviour
  /* 1 */ val Rounded: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PointsRadiusBehaviour.Rounded & Double = js.native
  
  @js.native
  sealed trait Smooth
    extends StObject
       with PointsRadiusBehaviour
  /* 2 */ val Smooth: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PointsRadiusBehaviour.Smooth & Double = js.native
}
