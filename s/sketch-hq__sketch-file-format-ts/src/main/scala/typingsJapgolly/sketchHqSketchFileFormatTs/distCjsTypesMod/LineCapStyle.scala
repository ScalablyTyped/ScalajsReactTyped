package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineCapStyle extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "LineCapStyle")
@js.native
object LineCapStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineCapStyle & Double] = js.native
  
  @js.native
  sealed trait Butt
    extends StObject
       with LineCapStyle
  /* 0 */ val Butt: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LineCapStyle.Butt & Double = js.native
  
  @js.native
  sealed trait Projecting
    extends StObject
       with LineCapStyle
  /* 2 */ val Projecting: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LineCapStyle.Projecting & Double = js.native
  
  @js.native
  sealed trait Round
    extends StObject
       with LineCapStyle
  /* 1 */ val Round: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LineCapStyle.Round & Double = js.native
}
