package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CurveMode extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "CurveMode")
@js.native
object CurveMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CurveMode & Double] = js.native
  
  @js.native
  sealed trait Asymmetric
    extends StObject
       with CurveMode
  /* 3 */ val Asymmetric: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.CurveMode.Asymmetric & Double = js.native
  
  @js.native
  sealed trait Disconnected
    extends StObject
       with CurveMode
  /* 4 */ val Disconnected: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.CurveMode.Disconnected & Double = js.native
  
  @js.native
  sealed trait Mirrored
    extends StObject
       with CurveMode
  /* 2 */ val Mirrored: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.CurveMode.Mirrored & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with CurveMode
  /* 0 */ val None: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.CurveMode.None & Double = js.native
  
  @js.native
  sealed trait Straight
    extends StObject
       with CurveMode
  /* 1 */ val Straight: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.CurveMode.Straight & Double = js.native
}
