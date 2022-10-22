package typingsJapgolly.cucumberCucumberExpressions

import typingsJapgolly.cucumberCucumberExpressions.distCjsSrcArgumentMod.default
import typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.NodeType
import typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.TokenType
import typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.Constructor
import typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.Factory
import typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.RegExps
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cucumber/cucumber-expressions", "Argument")
  @js.native
  open class Argument protected () extends default {
    def this(
      group: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.default,
      parameterType: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]
    ) = this()
  }
  /* static members */
  object Argument {
    
    @JSImport("@cucumber/cucumber-expressions", "Argument")
    @js.native
    val ^ : js.Any = js.native
    
    inline def build(
      group: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.default,
      parameterTypes: js.Array[
          typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]
        ]
    ): js.Array[typingsJapgolly.cucumberCucumberExpressions.distCjsSrcArgumentMod.Argument] = (^.asInstanceOf[js.Dynamic].applyDynamic("build")(group.asInstanceOf[js.Any], parameterTypes.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.cucumberCucumberExpressions.distCjsSrcArgumentMod.Argument]]
  }
  
  @JSImport("@cucumber/cucumber-expressions", "CucumberExpression")
  @js.native
  open class CucumberExpression protected ()
    extends typingsJapgolly.cucumberCucumberExpressions.distCjsSrcCucumberExpressionMod.default {
    /**
      * @param expression
      * @param parameterTypeRegistry
      */
    def this(
      expression: String,
      parameterTypeRegistry: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeRegistryMod.default
    ) = this()
  }
  /* static members */
  object CucumberExpression {
    
    @JSImport("@cucumber/cucumber-expressions", "CucumberExpression")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@cucumber/cucumber-expressions", "CucumberExpression.escapeRegex")
    @js.native
    def escapeRegex: Any = js.native
    inline def escapeRegex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeRegex")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@cucumber/cucumber-expressions", "CucumberExpressionGenerator")
  @js.native
  open class CucumberExpressionGenerator protected ()
    extends typingsJapgolly.cucumberCucumberExpressions.distCjsSrcCucumberExpressionGeneratorMod.default {
    def this(parameterTypes: js.Function0[
            js.Iterable[
              typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]
            ]
          ]) = this()
  }
  /* static members */
  object CucumberExpressionGenerator {
    
    @JSImport("@cucumber/cucumber-expressions", "CucumberExpressionGenerator")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@cucumber/cucumber-expressions", "CucumberExpressionGenerator.createParameterTypeMatchers2")
    @js.native
    def createParameterTypeMatchers2: Any = js.native
    inline def createParameterTypeMatchers2_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createParameterTypeMatchers2")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@cucumber/cucumber-expressions", "ExpressionFactory")
  @js.native
  open class ExpressionFactory protected ()
    extends typingsJapgolly.cucumberCucumberExpressions.distCjsSrcExpressionFactoryMod.default {
    def this(parameterTypeRegistry: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeRegistryMod.default) = this()
  }
  
  @JSImport("@cucumber/cucumber-expressions", "GeneratedExpression")
  @js.native
  open class GeneratedExpression protected ()
    extends typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGeneratedExpressionMod.default {
    def this(
      expressionTemplate: String,
      parameterTypes: js.Array[
            typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[Any]
          ]
    ) = this()
  }
  
  @JSImport("@cucumber/cucumber-expressions", "Group")
  @js.native
  open class Group protected ()
    extends typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.default {
    def this(
      value: String,
      start: Double,
      end: Double,
      children: js.Array[typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.Group]
    ) = this()
    def this(
      value: String,
      start: Double,
      end: Unit,
      children: js.Array[typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.Group]
    ) = this()
    def this(
      value: String,
      start: Unit,
      end: Double,
      children: js.Array[typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.Group]
    ) = this()
    def this(
      value: String,
      start: Unit,
      end: Unit,
      children: js.Array[typingsJapgolly.cucumberCucumberExpressions.distCjsSrcGroupMod.Group]
    ) = this()
  }
  
  @JSImport("@cucumber/cucumber-expressions", "Node")
  @js.native
  open class Node protected ()
    extends typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.Node {
    def this(
      `type`: NodeType,
      nodes: js.Array[typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.Node],
      token: String,
      start: Double,
      end: Double
    ) = this()
    def this(
      `type`: NodeType,
      nodes: js.Array[typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.Node],
      token: Unit,
      start: Double,
      end: Double
    ) = this()
    def this(`type`: NodeType, nodes: Unit, token: String, start: Double, end: Double) = this()
    def this(`type`: NodeType, nodes: Unit, token: Unit, start: Double, end: Double) = this()
  }
  
  @JSImport("@cucumber/cucumber-expressions", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.NodeType & String] = js.native
    
    /* "ALTERNATION_NODE" */ val alternation: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.NodeType.alternation & String = js.native
    
    /* "ALTERNATIVE_NODE" */ val alternative: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.NodeType.alternative & String = js.native
    
    /* "EXPRESSION_NODE" */ val expression: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.NodeType.expression & String = js.native
    
    /* "OPTIONAL_NODE" */ val optional: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.NodeType.optional & String = js.native
    
    /* "PARAMETER_NODE" */ val parameter: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.NodeType.parameter & String = js.native
    
    /* "TEXT_NODE" */ val text: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.NodeType.text & String = js.native
  }
  
  @JSImport("@cucumber/cucumber-expressions", "ParameterType")
  @js.native
  open class ParameterType[T] protected ()
    extends typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.default[T] {
    def this(
      name: String,
      regexps: RegExps,
      `type`: Null,
      transform: js.Function1[/* repeated */ String, T | PromiseLike[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    /**
      * @param name {String} the name of the type
      * @param regexps {Array.<RegExp | String>,RegExp,String} that matche the type
      * @param type {Function} the prototype (constructor) of the type. May be null.
      * @param transform {Function} function transforming string to another type. May be null.
      * @param useForSnippets {boolean} true if this should be used for snippets. Defaults to true.
      * @param preferForRegexpMatch {boolean} true if this is a preferential type. Defaults to false.
      */
    def this(
      name: String,
      regexps: RegExps,
      `type`: Constructor[T],
      transform: js.Function1[/* repeated */ String, T | PromiseLike[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    def this(
      name: String,
      regexps: RegExps,
      `type`: Factory[T],
      transform: js.Function1[/* repeated */ String, T | PromiseLike[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    def this(
      name: Unit,
      regexps: RegExps,
      `type`: Null,
      transform: js.Function1[/* repeated */ String, T | PromiseLike[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    def this(
      name: Unit,
      regexps: RegExps,
      `type`: Constructor[T],
      transform: js.Function1[/* repeated */ String, T | PromiseLike[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
    def this(
      name: Unit,
      regexps: RegExps,
      `type`: Factory[T],
      transform: js.Function1[/* repeated */ String, T | PromiseLike[T]],
      useForSnippets: Boolean,
      preferForRegexpMatch: Boolean
    ) = this()
  }
  /* static members */
  object ParameterType {
    
    @JSImport("@cucumber/cucumber-expressions", "ParameterType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkParameterTypeName(typeName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkParameterTypeName")(typeName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def compare(
      pt1: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.ParameterType[Any],
      pt2: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeMod.ParameterType[Any]
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(pt1.asInstanceOf[js.Any], pt2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def isValidParameterTypeName(typeName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidParameterTypeName")(typeName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@cucumber/cucumber-expressions", "ParameterTypeRegistry")
  @js.native
  open class ParameterTypeRegistry ()
    extends typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeRegistryMod.default
  
  @JSImport("@cucumber/cucumber-expressions", "RegularExpression")
  @js.native
  open class RegularExpression protected ()
    extends typingsJapgolly.cucumberCucumberExpressions.distCjsSrcRegularExpressionMod.default {
    def this(
      regexp: js.RegExp,
      parameterTypeRegistry: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcParameterTypeRegistryMod.default
    ) = this()
  }
  
  @JSImport("@cucumber/cucumber-expressions", "Token")
  @js.native
  open class Token protected ()
    extends typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.Token {
    def this(`type`: TokenType, text: String, start: Double, end: Double) = this()
  }
  /* static members */
  object Token {
    
    @JSImport("@cucumber/cucumber-expressions", "Token")
    @js.native
    val ^ : js.Any = js.native
    
    inline def canEscape(codePoint: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canEscape")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isEscapeCharacter(codePoint: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEscapeCharacter")(codePoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def typeOf(codePoint: String): TokenType = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(codePoint.asInstanceOf[js.Any]).asInstanceOf[TokenType]
  }
  
  @JSImport("@cucumber/cucumber-expressions", "TokenType")
  @js.native
  object TokenType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.TokenType & String] = js.native
    
    /* "ALTERNATION" */ val alternation: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.TokenType.alternation & String = js.native
    
    /* "BEGIN_OPTIONAL" */ val beginOptional: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.TokenType.beginOptional & String = js.native
    
    /* "BEGIN_PARAMETER" */ val beginParameter: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.TokenType.beginParameter & String = js.native
    
    /* "END_OF_LINE" */ val endOfLine: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.TokenType.endOfLine & String = js.native
    
    /* "END_OPTIONAL" */ val endOptional: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.TokenType.endOptional & String = js.native
    
    /* "END_PARAMETER" */ val endParameter: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.TokenType.endParameter & String = js.native
    
    /* "START_OF_LINE" */ val startOfLine: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.TokenType.startOfLine & String = js.native
    
    /* "TEXT" */ val text: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.TokenType.text & String = js.native
    
    /* "WHITE_SPACE" */ val whiteSpace: typingsJapgolly.cucumberCucumberExpressions.distCjsSrcAstMod.TokenType.whiteSpace & String = js.native
  }
}
