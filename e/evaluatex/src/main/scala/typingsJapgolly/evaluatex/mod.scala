package typingsJapgolly.evaluatex

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.evaluatex.anon.Latex
import typingsJapgolly.evaluatex.anon.Name
import typingsJapgolly.evaluatex.distEvaluatexMod.Constant
import typingsJapgolly.evaluatex.evaluatexStrings.COMMAND
import typingsJapgolly.evaluatex.evaluatexStrings.DIVIDE
import typingsJapgolly.evaluatex.evaluatexStrings.INVERSE
import typingsJapgolly.evaluatex.evaluatexStrings.LPAREN
import typingsJapgolly.evaluatex.evaluatexStrings.NEGATE
import typingsJapgolly.evaluatex.evaluatexStrings.NUMBER
import typingsJapgolly.evaluatex.evaluatexStrings.POWER
import typingsJapgolly.evaluatex.evaluatexStrings.PRODUCT
import typingsJapgolly.evaluatex.evaluatexStrings.RPAREN
import typingsJapgolly.evaluatex.evaluatexStrings.SUM
import typingsJapgolly.evaluatex.evaluatexStrings.SYMBOL
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("evaluatex", JSImport.Namespace)
  @js.native
  val ^ : js.Function3[
    /* expression */ String, 
    /* constants */ js.UndefOr[Record[String, Constant]], 
    /* options */ js.UndefOr[Latex], 
    EvaluatexResult
  ] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.evaluatex.anon.typeFUNCTIONvaluenamekeyo
    - typingsJapgolly.evaluatex.anon.typeSYMBOLPRODUCTSUMINVER
    - typingsJapgolly.evaluatex.anon.typeNUMBERvaluenumberchil
  */
  trait AbstractSyntaxTreeNode extends StObject
  object AbstractSyntaxTreeNode {
    
    inline def typeFUNCTIONvaluenamekeyo(
      children: js.Array[AbstractSyntaxTreeNode],
      name: (String | Null) & (Null | String),
      value: Name & (js.Function1[/* repeated */ Any, Double])
    ): typingsJapgolly.evaluatex.anon.typeFUNCTIONvaluenamekeyo = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FUNCTION")
      __obj.asInstanceOf[typingsJapgolly.evaluatex.anon.typeFUNCTIONvaluenamekeyo]
    }
    
    inline def typeNUMBERvaluenumberchil(children: js.Array[AbstractSyntaxTreeNode], value: Double): typingsJapgolly.evaluatex.anon.typeNUMBERvaluenumberchil = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], name = null)
      __obj.updateDynamic("type")("NUMBER")
      __obj.asInstanceOf[typingsJapgolly.evaluatex.anon.typeNUMBERvaluenumberchil]
    }
    
    inline def typeSYMBOLPRODUCTSUMINVER(
      children: js.Array[AbstractSyntaxTreeNode],
      `type`: SYMBOL | PRODUCT | SUM | INVERSE | NEGATE | POWER,
      value: String
    ): typingsJapgolly.evaluatex.anon.typeSYMBOLPRODUCTSUMINVER = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], name = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.evaluatex.anon.typeSYMBOLPRODUCTSUMINVER]
    }
  }
  
  @js.native
  trait EvaluatexResult extends StObject {
    
    /**
      * @param variables a map of variables that can change between invocations of fn.
      * @returns the numerical result of the calculation.
      */
    def apply(): Double = js.native
    def apply(variables: Record[String, Variable]): Double = js.native
    
    var ast: AbstractSyntaxTreeNode = js.native
    
    var expression: String = js.native
    
    var tokens: js.Array[Token] = js.native
  }
  
  type IncludeMethods[T] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (_ : any): any? K : never}[keyof T] */ js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.evaluatex.anon.Type
    - typingsJapgolly.evaluatex.anon.Value
    - typingsJapgolly.evaluatex.anon.NameType
  */
  trait Token extends StObject
  object Token {
    
    inline def NameType(name: Null, value: String): typingsJapgolly.evaluatex.anon.NameType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SYMBOL")
      __obj.asInstanceOf[typingsJapgolly.evaluatex.anon.NameType]
    }
    
    inline def Type(`type`: NUMBER | POWER | DIVIDE | LPAREN | RPAREN | COMMAND, value: String | Double): typingsJapgolly.evaluatex.anon.Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], name = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.evaluatex.anon.Type]
    }
    
    inline def Value(value: js.Array[Any] => Any): typingsJapgolly.evaluatex.anon.Value = {
      val __obj = js.Dynamic.literal(value = js.Any.fromFunction1(value), name = null)
      __obj.updateDynamic("type")("COMMAND")
      __obj.asInstanceOf[typingsJapgolly.evaluatex.anon.Value]
    }
  }
  
  type Variable = Double
  
  type _To = js.Function3[
    /* expression */ String, 
    /* constants */ js.UndefOr[Record[String, Constant]], 
    /* options */ js.UndefOr[Latex], 
    EvaluatexResult
  ]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Function3[
    /* expression */ String, 
    /* constants */ js.UndefOr[Record[String, Constant]], 
    /* options */ js.UndefOr[Latex], 
    EvaluatexResult
  ] = ^
}
