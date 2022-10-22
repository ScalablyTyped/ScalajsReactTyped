package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NodeBuilderFlags extends StObject
@JSImport("typescript", "NodeBuilderFlags")
@js.native
object NodeBuilderFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeBuilderFlags & Double] = js.native
  
  @js.native
  sealed trait AllowAnonymousIdentifier
    extends StObject
       with NodeBuilderFlags
  /* 131072 */ val AllowAnonymousIdentifier: typingsJapgolly.typescript.mod.NodeBuilderFlags.AllowAnonymousIdentifier & Double = js.native
  
  @js.native
  sealed trait AllowEmptyIndexInfoType
    extends StObject
       with NodeBuilderFlags
  /* 2097152 */ val AllowEmptyIndexInfoType: typingsJapgolly.typescript.mod.NodeBuilderFlags.AllowEmptyIndexInfoType & Double = js.native
  
  @js.native
  sealed trait AllowEmptyTuple
    extends StObject
       with NodeBuilderFlags
  /* 524288 */ val AllowEmptyTuple: typingsJapgolly.typescript.mod.NodeBuilderFlags.AllowEmptyTuple & Double = js.native
  
  @js.native
  sealed trait AllowEmptyUnionOrIntersection
    extends StObject
       with NodeBuilderFlags
  /* 262144 */ val AllowEmptyUnionOrIntersection: typingsJapgolly.typescript.mod.NodeBuilderFlags.AllowEmptyUnionOrIntersection & Double = js.native
  
  @js.native
  sealed trait AllowNodeModulesRelativePaths
    extends StObject
       with NodeBuilderFlags
  /* 67108864 */ val AllowNodeModulesRelativePaths: typingsJapgolly.typescript.mod.NodeBuilderFlags.AllowNodeModulesRelativePaths & Double = js.native
  
  /** @deprecated AllowQualifedNameInPlaceOfIdentifier. Use AllowQualifiedNameInPlaceOfIdentifier instead. */
  @js.native
  sealed trait AllowQualifedNameInPlaceOfIdentifier
    extends StObject
       with NodeBuilderFlags
  /* 65536 */ val AllowQualifedNameInPlaceOfIdentifier: typingsJapgolly.typescript.mod.NodeBuilderFlags.AllowQualifedNameInPlaceOfIdentifier & Double = js.native
  
  @js.native
  sealed trait AllowQualifiedNameInPlaceOfIdentifier
    extends StObject
       with NodeBuilderFlags
  /* 65536 */ val AllowQualifiedNameInPlaceOfIdentifier: typingsJapgolly.typescript.mod.NodeBuilderFlags.AllowQualifiedNameInPlaceOfIdentifier & Double = js.native
  
  @js.native
  sealed trait AllowThisInObjectLiteral
    extends StObject
       with NodeBuilderFlags
  /* 32768 */ val AllowThisInObjectLiteral: typingsJapgolly.typescript.mod.NodeBuilderFlags.AllowThisInObjectLiteral & Double = js.native
  
  @js.native
  sealed trait AllowUniqueESSymbolType
    extends StObject
       with NodeBuilderFlags
  /* 1048576 */ val AllowUniqueESSymbolType: typingsJapgolly.typescript.mod.NodeBuilderFlags.AllowUniqueESSymbolType & Double = js.native
  
  @js.native
  sealed trait ForbidIndexedAccessSymbolReferences
    extends StObject
       with NodeBuilderFlags
  /* 16 */ val ForbidIndexedAccessSymbolReferences: typingsJapgolly.typescript.mod.NodeBuilderFlags.ForbidIndexedAccessSymbolReferences & Double = js.native
  
  @js.native
  sealed trait GenerateNamesForShadowedTypeParams
    extends StObject
       with NodeBuilderFlags
  /* 4 */ val GenerateNamesForShadowedTypeParams: typingsJapgolly.typescript.mod.NodeBuilderFlags.GenerateNamesForShadowedTypeParams & Double = js.native
  
  @js.native
  sealed trait IgnoreErrors
    extends StObject
       with NodeBuilderFlags
  /* 70221824 */ val IgnoreErrors: typingsJapgolly.typescript.mod.NodeBuilderFlags.IgnoreErrors & Double = js.native
  
  @js.native
  sealed trait InInitialEntityName
    extends StObject
       with NodeBuilderFlags
  /* 16777216 */ val InInitialEntityName: typingsJapgolly.typescript.mod.NodeBuilderFlags.InInitialEntityName & Double = js.native
  
  @js.native
  sealed trait InObjectTypeLiteral
    extends StObject
       with NodeBuilderFlags
  /* 4194304 */ val InObjectTypeLiteral: typingsJapgolly.typescript.mod.NodeBuilderFlags.InObjectTypeLiteral & Double = js.native
  
  @js.native
  sealed trait InTypeAlias
    extends StObject
       with NodeBuilderFlags
  /* 8388608 */ val InTypeAlias: typingsJapgolly.typescript.mod.NodeBuilderFlags.InTypeAlias & Double = js.native
  
  @js.native
  sealed trait MultilineObjectLiterals
    extends StObject
       with NodeBuilderFlags
  /* 1024 */ val MultilineObjectLiterals: typingsJapgolly.typescript.mod.NodeBuilderFlags.MultilineObjectLiterals & Double = js.native
  
  @js.native
  sealed trait NoTruncation
    extends StObject
       with NodeBuilderFlags
  /* 1 */ val NoTruncation: typingsJapgolly.typescript.mod.NodeBuilderFlags.NoTruncation & Double = js.native
  
  @js.native
  sealed trait NoTypeReduction
    extends StObject
       with NodeBuilderFlags
  /* 536870912 */ val NoTypeReduction: typingsJapgolly.typescript.mod.NodeBuilderFlags.NoTypeReduction & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with NodeBuilderFlags
  /* 0 */ val None: typingsJapgolly.typescript.mod.NodeBuilderFlags.None & Double = js.native
  
  @js.native
  sealed trait OmitParameterModifiers
    extends StObject
       with NodeBuilderFlags
  /* 8192 */ val OmitParameterModifiers: typingsJapgolly.typescript.mod.NodeBuilderFlags.OmitParameterModifiers & Double = js.native
  
  @js.native
  sealed trait OmitThisParameter
    extends StObject
       with NodeBuilderFlags
  /* 33554432 */ val OmitThisParameter: typingsJapgolly.typescript.mod.NodeBuilderFlags.OmitThisParameter & Double = js.native
  
  @js.native
  sealed trait SuppressAnyReturnType
    extends StObject
       with NodeBuilderFlags
  /* 256 */ val SuppressAnyReturnType: typingsJapgolly.typescript.mod.NodeBuilderFlags.SuppressAnyReturnType & Double = js.native
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope
    extends StObject
       with NodeBuilderFlags
  /* 16384 */ val UseAliasDefinedOutsideCurrentScope: typingsJapgolly.typescript.mod.NodeBuilderFlags.UseAliasDefinedOutsideCurrentScope & Double = js.native
  
  @js.native
  sealed trait UseFullyQualifiedType
    extends StObject
       with NodeBuilderFlags
  /* 64 */ val UseFullyQualifiedType: typingsJapgolly.typescript.mod.NodeBuilderFlags.UseFullyQualifiedType & Double = js.native
  
  @js.native
  sealed trait UseOnlyExternalAliasing
    extends StObject
       with NodeBuilderFlags
  /* 128 */ val UseOnlyExternalAliasing: typingsJapgolly.typescript.mod.NodeBuilderFlags.UseOnlyExternalAliasing & Double = js.native
  
  @js.native
  sealed trait UseSingleQuotesForStringLiteralType
    extends StObject
       with NodeBuilderFlags
  /* 268435456 */ val UseSingleQuotesForStringLiteralType: typingsJapgolly.typescript.mod.NodeBuilderFlags.UseSingleQuotesForStringLiteralType & Double = js.native
  
  @js.native
  sealed trait UseStructuralFallback
    extends StObject
       with NodeBuilderFlags
  /* 8 */ val UseStructuralFallback: typingsJapgolly.typescript.mod.NodeBuilderFlags.UseStructuralFallback & Double = js.native
  
  @js.native
  sealed trait UseTypeOfFunction
    extends StObject
       with NodeBuilderFlags
  /* 4096 */ val UseTypeOfFunction: typingsJapgolly.typescript.mod.NodeBuilderFlags.UseTypeOfFunction & Double = js.native
  
  @js.native
  sealed trait WriteArrayAsGenericType
    extends StObject
       with NodeBuilderFlags
  /* 2 */ val WriteArrayAsGenericType: typingsJapgolly.typescript.mod.NodeBuilderFlags.WriteArrayAsGenericType & Double = js.native
  
  @js.native
  sealed trait WriteClassExpressionAsTypeLiteral
    extends StObject
       with NodeBuilderFlags
  /* 2048 */ val WriteClassExpressionAsTypeLiteral: typingsJapgolly.typescript.mod.NodeBuilderFlags.WriteClassExpressionAsTypeLiteral & Double = js.native
  
  @js.native
  sealed trait WriteTypeArgumentsOfSignature
    extends StObject
       with NodeBuilderFlags
  /* 32 */ val WriteTypeArgumentsOfSignature: typingsJapgolly.typescript.mod.NodeBuilderFlags.WriteTypeArgumentsOfSignature & Double = js.native
  
  @js.native
  sealed trait WriteTypeParametersInQualifiedName
    extends StObject
       with NodeBuilderFlags
  /* 512 */ val WriteTypeParametersInQualifiedName: typingsJapgolly.typescript.mod.NodeBuilderFlags.WriteTypeParametersInQualifiedName & Double = js.native
}
