package typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTVideoRotateMode extends StObject
/** Specifies the video rotate mode on a video capture device. */
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_VideoRotateMode")
@js.native
object EnumDWTVideoRotateMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTVideoRotateMode & Double] = js.native
  
  /** 180 deg Clockwise */
  @js.native
  sealed trait VRM_180_DEGREES_CLOCKWISE
    extends StObject
       with EnumDWTVideoRotateMode
  /* 2 */ val VRM_180_DEGREES_CLOCKWISE: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode.VRM_180_DEGREES_CLOCKWISE & Double = js.native
  
  /** 270 deg Clockwise */
  @js.native
  sealed trait VRM_270_DEGREES_CLOCKWISE
    extends StObject
       with EnumDWTVideoRotateMode
  /* 3 */ val VRM_270_DEGREES_CLOCKWISE: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode.VRM_270_DEGREES_CLOCKWISE & Double = js.native
  
  /** 90 deg Clockwise */
  @js.native
  sealed trait VRM_90_DEGREES_CLOCKWISE
    extends StObject
       with EnumDWTVideoRotateMode
  /* 1 */ val VRM_90_DEGREES_CLOCKWISE: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode.VRM_90_DEGREES_CLOCKWISE & Double = js.native
  
  /** Mirror */
  @js.native
  sealed trait VRM_FLIP_HORIZONTAL
    extends StObject
       with EnumDWTVideoRotateMode
  /* 5 */ val VRM_FLIP_HORIZONTAL: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode.VRM_FLIP_HORIZONTAL & Double = js.native
  
  /** Flip */
  @js.native
  sealed trait VRM_FLIP_VERTICAL
    extends StObject
       with EnumDWTVideoRotateMode
  /* 4 */ val VRM_FLIP_VERTICAL: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode.VRM_FLIP_VERTICAL & Double = js.native
  
  /** Don't rotate */
  @js.native
  sealed trait VRM_NONE
    extends StObject
       with EnumDWTVideoRotateMode
  /* 0 */ val VRM_NONE: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTVideoRotateMode.VRM_NONE & Double = js.native
}
