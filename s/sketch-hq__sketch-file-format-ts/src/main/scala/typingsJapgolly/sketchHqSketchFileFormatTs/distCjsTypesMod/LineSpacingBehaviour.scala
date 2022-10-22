package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LineSpacingBehaviour extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "LineSpacingBehaviour")
@js.native
object LineSpacingBehaviour extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineSpacingBehaviour & Double] = js.native
  
  @js.native
  sealed trait ConsistentBaseline
    extends StObject
       with LineSpacingBehaviour
  /* 2 */ val ConsistentBaseline: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LineSpacingBehaviour.ConsistentBaseline & Double = js.native
  
  @js.native
  sealed trait Legacy
    extends StObject
       with LineSpacingBehaviour
  /* 1 */ val Legacy: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LineSpacingBehaviour.Legacy & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with LineSpacingBehaviour
  /* 0 */ val None: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.LineSpacingBehaviour.None & Double = js.native
}
