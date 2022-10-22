package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PatternFillType extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "PatternFillType")
@js.native
object PatternFillType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PatternFillType & Double] = js.native
  
  @js.native
  sealed trait Fill
    extends StObject
       with PatternFillType
  /* 1 */ val Fill: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PatternFillType.Fill & Double = js.native
  
  @js.native
  sealed trait Fit
    extends StObject
       with PatternFillType
  /* 3 */ val Fit: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PatternFillType.Fit & Double = js.native
  
  @js.native
  sealed trait Stretch
    extends StObject
       with PatternFillType
  /* 2 */ val Stretch: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PatternFillType.Stretch & Double = js.native
  
  @js.native
  sealed trait Tile
    extends StObject
       with PatternFillType
  /* 0 */ val Tile: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.PatternFillType.Tile & Double = js.native
}
