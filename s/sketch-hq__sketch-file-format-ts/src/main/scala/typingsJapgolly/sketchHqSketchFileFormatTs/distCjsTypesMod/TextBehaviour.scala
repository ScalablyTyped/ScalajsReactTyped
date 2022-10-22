package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextBehaviour extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "TextBehaviour")
@js.native
object TextBehaviour extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextBehaviour & Double] = js.native
  
  @js.native
  sealed trait Fixed
    extends StObject
       with TextBehaviour
  /* 1 */ val Fixed: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.TextBehaviour.Fixed & Double = js.native
  
  @js.native
  sealed trait FixedWidthAndHeight
    extends StObject
       with TextBehaviour
  /* 2 */ val FixedWidthAndHeight: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.TextBehaviour.FixedWidthAndHeight & Double = js.native
  
  @js.native
  sealed trait Flexible
    extends StObject
       with TextBehaviour
  /* 0 */ val Flexible: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.TextBehaviour.Flexible & Double = js.native
}
