package typingsJapgolly.tslint

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.tslint.libLanguageRuleRuleMod.IRuleMetadata
import typingsJapgolly.tslint.mod.Rules.TypedRule
import typingsJapgolly.tslint.tslintInts.`0`
import typingsJapgolly.tslint.tslintInts.`1`
import typingsJapgolly.tslint.tslintInts.`2`
import typingsJapgolly.tslint.tslintInts.`3`
import typingsJapgolly.tslint.tslintInts.`4`
import typingsJapgolly.tslint.tslintInts.`5`
import typingsJapgolly.tslint.tslintInts.`6`
import typingsJapgolly.tslint.tslintInts.`7`
import typingsJapgolly.typescript.mod.BaseType
import typingsJapgolly.typescript.mod.BinaryExpression
import typingsJapgolly.typescript.mod.ConditionalExpression
import typingsJapgolly.typescript.mod.DoStatement
import typingsJapgolly.typescript.mod.ForStatement
import typingsJapgolly.typescript.mod.IfStatement
import typingsJapgolly.typescript.mod.PrefixUnaryExpression
import typingsJapgolly.typescript.mod.Signature
import typingsJapgolly.typescript.mod.Symbol
import typingsJapgolly.typescript.mod.Type
import typingsJapgolly.typescript.mod.TypeFlags
import typingsJapgolly.typescript.mod.WhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRulesStrictBooleanExpressionsRuleMod {
  
  @JSImport("tslint/lib/rules/strictBooleanExpressionsRule", "Rule")
  @js.native
  open class Rule protected () extends TypedRule {
    def this(options: IOptions) = this()
  }
  /* static members */
  object Rule {
    
    @JSImport("tslint/lib/rules/strictBooleanExpressionsRule", "Rule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/rules/strictBooleanExpressionsRule", "Rule.metadata")
    @js.native
    def metadata: IRuleMetadata = js.native
    inline def metadata_=(x: IRuleMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
  
  type Location = PrefixUnaryExpression | IfStatement | WhileStatement | DoStatement | ForStatement | ConditionalExpression | BinaryExpression
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tslint.tslintInts.`0`
    - typingsJapgolly.tslint.tslintInts.`1`
    - typingsJapgolly.tslint.tslintInts.`2`
    - typingsJapgolly.tslint.tslintInts.`3`
    - typingsJapgolly.tslint.tslintInts.`4`
    - typingsJapgolly.tslint.tslintInts.`5`
    - typingsJapgolly.tslint.tslintInts.`6`
    - typingsJapgolly.tslint.tslintInts.`7`
  */
  trait TypeFailure extends StObject
  object TypeFailure {
    
    inline def AlwaysFalsy: `1` = 1.asInstanceOf[`1`]
    
    inline def AlwaysTruthy: `0` = 0.asInstanceOf[`0`]
    
    inline def Enum: `6` = 6.asInstanceOf[`6`]
    
    inline def Mixes: `7` = 7.asInstanceOf[`7`]
    
    inline def Null: `4` = 4.asInstanceOf[`4`]
    
    inline def Number: `3` = 3.asInstanceOf[`3`]
    
    inline def String: `2` = 2.asInstanceOf[`2`]
    
    inline def Undefined: `5` = 5.asInstanceOf[`5`]
  }
  
  /* augmented module */
  object typescriptAugmentingMod {
    
    trait IntrinsicType
      extends StObject
         with Type {
      
      var intrinsicName: String
    }
    object IntrinsicType {
      
      inline def apply(
        flags: TypeFlags,
        getApparentProperties: CallbackTo[js.Array[Symbol]],
        getBaseTypes: CallbackTo[js.UndefOr[js.Array[BaseType]]],
        getCallSignatures: CallbackTo[js.Array[Signature]],
        getConstraint: CallbackTo[js.UndefOr[Type]],
        getConstructSignatures: CallbackTo[js.Array[Signature]],
        getDefault: CallbackTo[js.UndefOr[Type]],
        getFlags: CallbackTo[TypeFlags],
        getNonNullableType: CallbackTo[Type],
        getNumberIndexType: CallbackTo[js.UndefOr[Type]],
        getProperties: CallbackTo[js.Array[Symbol]],
        getProperty: String => js.UndefOr[Symbol],
        getStringIndexType: CallbackTo[js.UndefOr[Type]],
        getSymbol: CallbackTo[js.UndefOr[Symbol]],
        intrinsicName: String,
        isClass: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean],
        isClassOrInterface: CallbackTo[/* is typescript.typescript.InterfaceType */ Boolean],
        isIndexType: CallbackTo[/* is typescript.typescript.IndexType */ Boolean],
        isIntersection: CallbackTo[/* is typescript.typescript.IntersectionType */ Boolean],
        isLiteral: CallbackTo[/* is typescript.typescript.LiteralType */ Boolean],
        isNumberLiteral: CallbackTo[/* is typescript.typescript.NumberLiteralType */ Boolean],
        isStringLiteral: CallbackTo[/* is typescript.typescript.StringLiteralType */ Boolean],
        isTypeParameter: CallbackTo[/* is typescript.typescript.TypeParameter */ Boolean],
        isUnion: CallbackTo[/* is typescript.typescript.UnionType */ Boolean],
        isUnionOrIntersection: CallbackTo[/* is typescript.typescript.UnionOrIntersectionType */ Boolean],
        symbol: Symbol
      ): IntrinsicType = {
        val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], getApparentProperties = getApparentProperties.toJsFn, getBaseTypes = getBaseTypes.toJsFn, getCallSignatures = getCallSignatures.toJsFn, getConstraint = getConstraint.toJsFn, getConstructSignatures = getConstructSignatures.toJsFn, getDefault = getDefault.toJsFn, getFlags = getFlags.toJsFn, getNonNullableType = getNonNullableType.toJsFn, getNumberIndexType = getNumberIndexType.toJsFn, getProperties = getProperties.toJsFn, getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = getStringIndexType.toJsFn, getSymbol = getSymbol.toJsFn, intrinsicName = intrinsicName.asInstanceOf[js.Any], isClass = isClass.toJsFn, isClassOrInterface = isClassOrInterface.toJsFn, isIndexType = isIndexType.toJsFn, isIntersection = isIntersection.toJsFn, isLiteral = isLiteral.toJsFn, isNumberLiteral = isNumberLiteral.toJsFn, isStringLiteral = isStringLiteral.toJsFn, isTypeParameter = isTypeParameter.toJsFn, isUnion = isUnion.toJsFn, isUnionOrIntersection = isUnionOrIntersection.toJsFn, symbol = symbol.asInstanceOf[js.Any])
        __obj.asInstanceOf[IntrinsicType]
      }
      
      extension [Self <: IntrinsicType](x: Self) {
        
        inline def setIntrinsicName(value: String): Self = StObject.set(x, "intrinsicName", value.asInstanceOf[js.Any])
      }
    }
  }
}
