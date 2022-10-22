package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VisibleScaleType extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "VisibleScaleType")
@js.native
object VisibleScaleType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VisibleScaleType & Double] = js.native
  
  @js.native
  sealed trait Height
    extends StObject
       with VisibleScaleType
  /* 2 */ val Height: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.VisibleScaleType.Height & Double = js.native
  
  @js.native
  sealed trait Scale
    extends StObject
       with VisibleScaleType
  /* 0 */ val Scale: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.VisibleScaleType.Scale & Double = js.native
  
  @js.native
  sealed trait Width
    extends StObject
       with VisibleScaleType
  /* 1 */ val Width: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.VisibleScaleType.Width & Double = js.native
}
