package typingsJapgolly.rtlDetect

import typingsJapgolly.rtlDetect.rtlDetectStrings.ltr
import typingsJapgolly.rtlDetect.rtlDetectStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rtl-detect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLangDir(strLocale: String): ltr | rtl = ^.asInstanceOf[js.Dynamic].applyDynamic("getLangDir")(strLocale.asInstanceOf[js.Any]).asInstanceOf[ltr | rtl]
  
  inline def isRtlLang(strLocale: String): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isRtlLang")(strLocale.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
}
