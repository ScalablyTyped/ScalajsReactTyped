package typingsJapgolly.antvGLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCssCssomCssmathoperatorMod {
  
  @JSImport("@antv/g-lite/dist/css/cssom/CSSMathOperator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait CSSMathOperator extends StObject
  @JSImport("@antv/g-lite/dist/css/cssom/CSSMathOperator", "CSSMathOperator")
  @js.native
  object CSSMathOperator extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CSSMathOperator & String] = js.native
    
    @js.native
    sealed trait kAdd
      extends StObject
         with CSSMathOperator
    /* "+" */ val kAdd: typingsJapgolly.antvGLite.distCssCssomCssmathoperatorMod.CSSMathOperator.kAdd & String = js.native
    
    @js.native
    sealed trait kClamp
      extends StObject
         with CSSMathOperator
    /* "clamp" */ val kClamp: typingsJapgolly.antvGLite.distCssCssomCssmathoperatorMod.CSSMathOperator.kClamp & String = js.native
    
    @js.native
    sealed trait kDivide
      extends StObject
         with CSSMathOperator
    /* "/" */ val kDivide: typingsJapgolly.antvGLite.distCssCssomCssmathoperatorMod.CSSMathOperator.kDivide & String = js.native
    
    @js.native
    sealed trait kInvalid
      extends StObject
         with CSSMathOperator
    /* "" */ val kInvalid: typingsJapgolly.antvGLite.distCssCssomCssmathoperatorMod.CSSMathOperator.kInvalid & String = js.native
    
    @js.native
    sealed trait kMax
      extends StObject
         with CSSMathOperator
    /* "max" */ val kMax: typingsJapgolly.antvGLite.distCssCssomCssmathoperatorMod.CSSMathOperator.kMax & String = js.native
    
    @js.native
    sealed trait kMin
      extends StObject
         with CSSMathOperator
    /* "min" */ val kMin: typingsJapgolly.antvGLite.distCssCssomCssmathoperatorMod.CSSMathOperator.kMin & String = js.native
    
    @js.native
    sealed trait kMultiply
      extends StObject
         with CSSMathOperator
    /* "*" */ val kMultiply: typingsJapgolly.antvGLite.distCssCssomCssmathoperatorMod.CSSMathOperator.kMultiply & String = js.native
    
    @js.native
    sealed trait kSubtract
      extends StObject
         with CSSMathOperator
    /* "-" */ val kSubtract: typingsJapgolly.antvGLite.distCssCssomCssmathoperatorMod.CSSMathOperator.kSubtract & String = js.native
  }
  
  inline def isComparison(op: CSSMathOperator): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComparison")(op.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
