package typingsJapgolly.antvGLite.distCssMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@antv/g-lite/dist/css", "CSSNumericValue")
@js.native
open class CSSNumericValue protected ()
  extends typingsJapgolly.antvGLite.distCssCssomMod.CSSNumericValue {
  /**
    * @see https://chromium.googlesource.com/chromium/src/+/refs/heads/main/third_party/blink/renderer/core/css/cssom/css_numeric_value.cc#296
    */
  def this(type_ : typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType) = this()
}
/* static members */
object CSSNumericValue {
  
  @JSImport("@antv/g-lite/dist/css", "CSSNumericValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidUnit(unit: typingsJapgolly.antvGLite.distCssCssomTypesMod.UnitType): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidUnit")(unit.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
