package typingsJapgolly.antvGLite.distCssMod

import typingsJapgolly.antvGLite.distCssCssomCssnumericsumvalueMod.CSSNumericSumValue
import typingsJapgolly.antvGLite.distCssCssomCssnumericsumvalueMod.UnitMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "CSSMathSum")
@js.native
open class CSSMathSum protected ()
  extends typingsJapgolly.antvGLite.distCssCssomMod.CSSMathSum {
  def this(
    values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
    `type`: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
  ) = this()
}
/* static members */
object CSSMathSum {
  
  @JSImport("@antv/g-lite/dist/css", "CSSMathSum")
  @js.native
  val ^ : js.Any = js.native
  
  inline def canCreateNumericTypeFromSumValue(sum: CSSNumericSumValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canCreateNumericTypeFromSumValue")(sum.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def create(values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue]): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathSum = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathSum]
  
  inline def numericTypeFromUnitMap(units: UnitMap): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("numericTypeFromUnitMap")(units.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType]
}
