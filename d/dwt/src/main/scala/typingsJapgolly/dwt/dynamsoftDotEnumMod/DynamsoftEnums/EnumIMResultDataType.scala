package typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumIMResultDataType extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumIMResultDataType")
@js.native
object EnumIMResultDataType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumIMResultDataType & Double] = js.native
  
  @js.native
  sealed trait IMRDT_CONTOUR
    extends StObject
       with EnumIMResultDataType
  /* 2 */ val IMRDT_CONTOUR: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumIMResultDataType.IMRDT_CONTOUR & Double = js.native
  
  @js.native
  sealed trait IMRDT_IMAGE
    extends StObject
       with EnumIMResultDataType
  /* 1 */ val IMRDT_IMAGE: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumIMResultDataType.IMRDT_IMAGE & Double = js.native
  
  @js.native
  sealed trait IMRDT_LINESEGMENT
    extends StObject
       with EnumIMResultDataType
  /* 4 */ val IMRDT_LINESEGMENT: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumIMResultDataType.IMRDT_LINESEGMENT & Double = js.native
  
  @js.native
  sealed trait IMRDT_LOCALIZATIONRESULT
    extends StObject
       with EnumIMResultDataType
  /* 8 */ val IMRDT_LOCALIZATIONRESULT: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumIMResultDataType.IMRDT_LOCALIZATIONRESULT & Double = js.native
  
  @js.native
  sealed trait IMRDT_QUADRILATERAL
    extends StObject
       with EnumIMResultDataType
  /* 32 */ val IMRDT_QUADRILATERAL: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumIMResultDataType.IMRDT_QUADRILATERAL & Double = js.native
  
  @js.native
  sealed trait IMRDT_REGIONOFINTEREST
    extends StObject
       with EnumIMResultDataType
  /* 16 */ val IMRDT_REGIONOFINTEREST: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumIMResultDataType.IMRDT_REGIONOFINTEREST & Double = js.native
}
