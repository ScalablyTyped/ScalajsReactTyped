package typingsJapgolly.antvGLite.distCssMod

import typingsJapgolly.antvGLite.distCssCssomCssnumericsumvalueMod.UnitMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-lite/dist/css", "CSSMathProduct")
@js.native
open class CSSMathProduct protected ()
  extends typingsJapgolly.antvGLite.distCssCssomMod.CSSMathProduct {
  def this(
    values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue],
    `type`: typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValueType
  ) = this()
}
/* static members */
object CSSMathProduct {
  
  @JSImport("@antv/g-lite/dist/css", "CSSMathProduct")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(values: js.Array[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSNumericValue]): typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathProduct = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(values.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.antvGLite.distCssCssomCssnumericvalueMod.CSSMathProduct]
  
  inline def multiplyUnitMaps(a: UnitMap, b: UnitMap): UnitMap = (^.asInstanceOf[js.Dynamic].applyDynamic("multiplyUnitMaps")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[UnitMap]
}
