package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineJoinStyle extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "LineJoinStyle")
@js.native
object LineJoinStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineJoinStyle & Double] = js.native
  
  @js.native
  sealed trait Bevel
    extends StObject
       with LineJoinStyle
  /* 2 */ val Bevel: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LineJoinStyle.Bevel & Double = js.native
  
  @js.native
  sealed trait Miter
    extends StObject
       with LineJoinStyle
  /* 0 */ val Miter: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LineJoinStyle.Miter & Double = js.native
  
  @js.native
  sealed trait Round
    extends StObject
       with LineJoinStyle
  /* 1 */ val Round: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LineJoinStyle.Round & Double = js.native
}
