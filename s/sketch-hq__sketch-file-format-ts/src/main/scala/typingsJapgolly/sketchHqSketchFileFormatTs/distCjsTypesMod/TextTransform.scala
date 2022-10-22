package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextTransform extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "TextTransform")
@js.native
object TextTransform extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextTransform & Double] = js.native
  
  @js.native
  sealed trait Lowercase
    extends StObject
       with TextTransform
  /* 2 */ val Lowercase: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.TextTransform.Lowercase & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TextTransform
  /* 0 */ val None: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.TextTransform.None & Double = js.native
  
  @js.native
  sealed trait Uppercase
    extends StObject
       with TextTransform
  /* 1 */ val Uppercase: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.TextTransform.Uppercase & Double = js.native
}
