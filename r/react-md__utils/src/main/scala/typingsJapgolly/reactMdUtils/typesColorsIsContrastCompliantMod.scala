package typingsJapgolly.reactMdUtils

import typingsJapgolly.reactMdUtils.typesColorsHexToRGBMod.HexString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesColorsIsContrastCompliantMod {
  
  @JSImport("@react-md/utils/types/colors/isContrastCompliant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/colors/isContrastCompliant", "AAA_CONTRAST_RATIO")
  @js.native
  val AAA_CONTRAST_RATIO: /* 7 */ Double = js.native
  
  @JSImport("@react-md/utils/types/colors/isContrastCompliant", "LARGE_TEXT_CONTRAST_RATIO")
  @js.native
  val LARGE_TEXT_CONTRAST_RATIO: /* 3 */ Double = js.native
  
  @JSImport("@react-md/utils/types/colors/isContrastCompliant", "NORMAL_TEXT_CONTRAST_RATIO")
  @js.native
  val NORMAL_TEXT_CONTRAST_RATIO: /* 4.5 */ Double = js.native
  
  inline def isContrastCompliant(background: HexString, foreground: HexString): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdUtils.reactMdUtilsStrings.large
    - typingsJapgolly.reactMdUtils.reactMdUtilsStrings.normal
    - typingsJapgolly.reactMdUtils.reactMdUtilsStrings.AAA
  */
  trait ContrastRatioCompliance extends StObject
  object ContrastRatioCompliance {
    
    inline def AAA: typingsJapgolly.reactMdUtils.reactMdUtilsStrings.AAA = "AAA".asInstanceOf[typingsJapgolly.reactMdUtils.reactMdUtilsStrings.AAA]
    
    inline def large: typingsJapgolly.reactMdUtils.reactMdUtilsStrings.large = "large".asInstanceOf[typingsJapgolly.reactMdUtils.reactMdUtilsStrings.large]
    
    inline def normal: typingsJapgolly.reactMdUtils.reactMdUtilsStrings.normal = "normal".asInstanceOf[typingsJapgolly.reactMdUtils.reactMdUtilsStrings.normal]
  }
}
