package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FillType extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "FillType")
@js.native
object FillType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FillType & Double] = js.native
  
  @js.native
  sealed trait Color
    extends StObject
       with FillType
  /* 0 */ val Color: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FillType.Color & Double = js.native
  
  @js.native
  sealed trait Gradient
    extends StObject
       with FillType
  /* 1 */ val Gradient: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FillType.Gradient & Double = js.native
  
  @js.native
  sealed trait Pattern
    extends StObject
       with FillType
  /* 4 */ val Pattern: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.FillType.Pattern & Double = js.native
}
