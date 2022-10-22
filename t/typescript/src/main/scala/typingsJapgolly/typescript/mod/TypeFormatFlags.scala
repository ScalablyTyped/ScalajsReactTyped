package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeFormatFlags extends StObject
@JSImport("typescript", "TypeFormatFlags")
@js.native
object TypeFormatFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeFormatFlags & Double] = js.native
  
  @js.native
  sealed trait AddUndefined
    extends StObject
       with TypeFormatFlags
  /* 131072 */ val AddUndefined: typingsJapgolly.typescript.mod.TypeFormatFlags.AddUndefined & Double = js.native
  
  @js.native
  sealed trait AllowUniqueESSymbolType
    extends StObject
       with TypeFormatFlags
  /* 1048576 */ val AllowUniqueESSymbolType: typingsJapgolly.typescript.mod.TypeFormatFlags.AllowUniqueESSymbolType & Double = js.native
  
  @js.native
  sealed trait InArrayType
    extends StObject
       with TypeFormatFlags
  /* 524288 */ val InArrayType: typingsJapgolly.typescript.mod.TypeFormatFlags.InArrayType & Double = js.native
  
  @js.native
  sealed trait InElementType
    extends StObject
       with TypeFormatFlags
  /* 2097152 */ val InElementType: typingsJapgolly.typescript.mod.TypeFormatFlags.InElementType & Double = js.native
  
  @js.native
  sealed trait InFirstTypeArgument
    extends StObject
       with TypeFormatFlags
  /* 4194304 */ val InFirstTypeArgument: typingsJapgolly.typescript.mod.TypeFormatFlags.InFirstTypeArgument & Double = js.native
  
  @js.native
  sealed trait InTypeAlias
    extends StObject
       with TypeFormatFlags
  /* 8388608 */ val InTypeAlias: typingsJapgolly.typescript.mod.TypeFormatFlags.InTypeAlias & Double = js.native
  
  @js.native
  sealed trait MultilineObjectLiterals
    extends StObject
       with TypeFormatFlags
  /* 1024 */ val MultilineObjectLiterals: typingsJapgolly.typescript.mod.TypeFormatFlags.MultilineObjectLiterals & Double = js.native
  
  @js.native
  sealed trait NoTruncation
    extends StObject
       with TypeFormatFlags
  /* 1 */ val NoTruncation: typingsJapgolly.typescript.mod.TypeFormatFlags.NoTruncation & Double = js.native
  
  @js.native
  sealed trait NoTypeReduction
    extends StObject
       with TypeFormatFlags
  /* 536870912 */ val NoTypeReduction: typingsJapgolly.typescript.mod.TypeFormatFlags.NoTypeReduction & Double = js.native
  
  @js.native
  sealed trait NodeBuilderFlagsMask
    extends StObject
       with TypeFormatFlags
  /* 848330091 */ val NodeBuilderFlagsMask: typingsJapgolly.typescript.mod.TypeFormatFlags.NodeBuilderFlagsMask & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TypeFormatFlags
  /* 0 */ val None: typingsJapgolly.typescript.mod.TypeFormatFlags.None & Double = js.native
  
  @js.native
  sealed trait OmitParameterModifiers
    extends StObject
       with TypeFormatFlags
  /* 8192 */ val OmitParameterModifiers: typingsJapgolly.typescript.mod.TypeFormatFlags.OmitParameterModifiers & Double = js.native
  
  @js.native
  sealed trait OmitThisParameter
    extends StObject
       with TypeFormatFlags
  /* 33554432 */ val OmitThisParameter: typingsJapgolly.typescript.mod.TypeFormatFlags.OmitThisParameter & Double = js.native
  
  @js.native
  sealed trait SuppressAnyReturnType
    extends StObject
       with TypeFormatFlags
  /* 256 */ val SuppressAnyReturnType: typingsJapgolly.typescript.mod.TypeFormatFlags.SuppressAnyReturnType & Double = js.native
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope
    extends StObject
       with TypeFormatFlags
  /* 16384 */ val UseAliasDefinedOutsideCurrentScope: typingsJapgolly.typescript.mod.TypeFormatFlags.UseAliasDefinedOutsideCurrentScope & Double = js.native
  
  @js.native
  sealed trait UseFullyQualifiedType
    extends StObject
       with TypeFormatFlags
  /* 64 */ val UseFullyQualifiedType: typingsJapgolly.typescript.mod.TypeFormatFlags.UseFullyQualifiedType & Double = js.native
  
  @js.native
  sealed trait UseSingleQuotesForStringLiteralType
    extends StObject
       with TypeFormatFlags
  /* 268435456 */ val UseSingleQuotesForStringLiteralType: typingsJapgolly.typescript.mod.TypeFormatFlags.UseSingleQuotesForStringLiteralType & Double = js.native
  
  @js.native
  sealed trait UseStructuralFallback
    extends StObject
       with TypeFormatFlags
  /* 8 */ val UseStructuralFallback: typingsJapgolly.typescript.mod.TypeFormatFlags.UseStructuralFallback & Double = js.native
  
  @js.native
  sealed trait UseTypeOfFunction
    extends StObject
       with TypeFormatFlags
  /* 4096 */ val UseTypeOfFunction: typingsJapgolly.typescript.mod.TypeFormatFlags.UseTypeOfFunction & Double = js.native
  
  @js.native
  sealed trait WriteArrayAsGenericType
    extends StObject
       with TypeFormatFlags
  /* 2 */ val WriteArrayAsGenericType: typingsJapgolly.typescript.mod.TypeFormatFlags.WriteArrayAsGenericType & Double = js.native
  
  @js.native
  sealed trait WriteArrowStyleSignature
    extends StObject
       with TypeFormatFlags
  /* 262144 */ val WriteArrowStyleSignature: typingsJapgolly.typescript.mod.TypeFormatFlags.WriteArrowStyleSignature & Double = js.native
  
  @js.native
  sealed trait WriteClassExpressionAsTypeLiteral
    extends StObject
       with TypeFormatFlags
  /* 2048 */ val WriteClassExpressionAsTypeLiteral: typingsJapgolly.typescript.mod.TypeFormatFlags.WriteClassExpressionAsTypeLiteral & Double = js.native
  
  /** @deprecated */ @js.native
  sealed trait WriteOwnNameForAnyLike
    extends StObject
       with TypeFormatFlags
  /* 0 */ val WriteOwnNameForAnyLike: typingsJapgolly.typescript.mod.TypeFormatFlags.WriteOwnNameForAnyLike & Double = js.native
  
  @js.native
  sealed trait WriteTypeArgumentsOfSignature
    extends StObject
       with TypeFormatFlags
  /* 32 */ val WriteTypeArgumentsOfSignature: typingsJapgolly.typescript.mod.TypeFormatFlags.WriteTypeArgumentsOfSignature & Double = js.native
}
