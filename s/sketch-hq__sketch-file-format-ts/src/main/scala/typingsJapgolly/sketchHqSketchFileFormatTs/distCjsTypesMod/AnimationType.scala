package typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnimationType extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "AnimationType")
@js.native
object AnimationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationType & Double] = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with AnimationType
  /* 0 */ val None: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.AnimationType.None & Double = js.native
  
  @js.native
  sealed trait SlideFromBottom
    extends StObject
       with AnimationType
  /* 3 */ val SlideFromBottom: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.AnimationType.SlideFromBottom & Double = js.native
  
  @js.native
  sealed trait SlideFromLeft
    extends StObject
       with AnimationType
  /* 1 */ val SlideFromLeft: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.AnimationType.SlideFromLeft & Double = js.native
  
  @js.native
  sealed trait SlideFromRight
    extends StObject
       with AnimationType
  /* 2 */ val SlideFromRight: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.AnimationType.SlideFromRight & Double = js.native
  
  @js.native
  sealed trait SlideFromTop
    extends StObject
       with AnimationType
  /* 4 */ val SlideFromTop: typingsJapgolly.sketchHqSketchFileFormatTs.distCjsTypesMod.AnimationType.SlideFromTop & Double = js.native
}
