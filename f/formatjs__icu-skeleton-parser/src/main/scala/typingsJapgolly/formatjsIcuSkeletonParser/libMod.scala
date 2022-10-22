package typingsJapgolly.formatjsIcuSkeletonParser

import typingsJapgolly.formatjsIcuSkeletonParser.libNumberMod.ExtendedNumberFormatOptions
import typingsJapgolly.formatjsIcuSkeletonParser.libNumberMod.NumberSkeletonToken
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@formatjs/icu-skeleton-parser/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseDateTimeSkeleton(skeleton: String): DateTimeFormatOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDateTimeSkeleton")(skeleton.asInstanceOf[js.Any]).asInstanceOf[DateTimeFormatOptions]
  
  inline def parseNumberSkeleton(tokens: js.Array[NumberSkeletonToken]): ExtendedNumberFormatOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumberSkeleton")(tokens.asInstanceOf[js.Any]).asInstanceOf[ExtendedNumberFormatOptions]
  
  inline def parseNumberSkeletonFromString(skeleton: String): js.Array[NumberSkeletonToken] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumberSkeletonFromString")(skeleton.asInstanceOf[js.Any]).asInstanceOf[js.Array[NumberSkeletonToken]]
}
