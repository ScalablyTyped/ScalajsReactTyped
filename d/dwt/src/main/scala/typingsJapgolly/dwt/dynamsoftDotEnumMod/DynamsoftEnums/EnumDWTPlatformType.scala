package typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnumDWTPlatformType extends StObject
@JSImport("dwt/Dynamsoft.Enum", "DynamsoftEnums.EnumDWT_PlatformType")
@js.native
object EnumDWTPlatformType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTPlatformType & Double] = js.native
  
  /// Fit the image to the width of the window
  @js.native
  sealed trait enumLinux
    extends StObject
       with EnumDWTPlatformType
  /* 2 */ val enumLinux: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTPlatformType.enumLinux & Double = js.native
  
  /// Fit the image to the height of the window
  @js.native
  sealed trait enumMac
    extends StObject
       with EnumDWTPlatformType
  /* 1 */ val enumMac: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTPlatformType.enumMac & Double = js.native
  
  /// Fit the image to the width and height of the window
  @js.native
  sealed trait enumWindow
    extends StObject
       with EnumDWTPlatformType
  /* 0 */ val enumWindow: typingsJapgolly.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTPlatformType.enumWindow & Double = js.native
}
