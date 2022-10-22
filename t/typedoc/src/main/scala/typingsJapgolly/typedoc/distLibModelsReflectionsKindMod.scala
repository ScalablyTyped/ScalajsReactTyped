package typingsJapgolly.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModelsReflectionsKindMod {
  
  @js.native
  sealed trait ReflectionKind extends StObject
  @JSImport("typedoc/dist/lib/models/reflections/kind", "ReflectionKind")
  @js.native
  object ReflectionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReflectionKind & Double] = js.native
    
    @js.native
    sealed trait Accessor
      extends StObject
         with ReflectionKind
    /* 262144 */ val Accessor: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Accessor & Double = js.native
    
    val All: Double = js.native
    
    @js.native
    sealed trait CallSignature
      extends StObject
         with ReflectionKind
    /* 4096 */ val CallSignature: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.CallSignature & Double = js.native
    
    @js.native
    sealed trait Class
      extends StObject
         with ReflectionKind
    /* 128 */ val Class: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Class & Double = js.native
    
    val ClassMember: Double = js.native
    
    val ClassOrInterface: Double = js.native
    
    @js.native
    sealed trait Constructor
      extends StObject
         with ReflectionKind
    /* 512 */ val Constructor: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Constructor & Double = js.native
    
    @js.native
    sealed trait ConstructorSignature
      extends StObject
         with ReflectionKind
    /* 16384 */ val ConstructorSignature: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.ConstructorSignature & Double = js.native
    
    /** @internal */
    val ContainsCallSignatures: Double = js.native
    
    @js.native
    sealed trait Enum
      extends StObject
         with ReflectionKind
    /* 8 */ val Enum: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Enum & Double = js.native
    
    @js.native
    sealed trait EnumMember
      extends StObject
         with ReflectionKind
    /* 16 */ val EnumMember: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.EnumMember & Double = js.native
    
    val ExportContainer: Double = js.native
    
    @js.native
    sealed trait Function
      extends StObject
         with ReflectionKind
    /* 64 */ val Function: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Function & Double = js.native
    
    val FunctionOrMethod: Double = js.native
    
    @js.native
    sealed trait GetSignature
      extends StObject
         with ReflectionKind
    /* 524288 */ val GetSignature: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.GetSignature & Double = js.native
    
    @js.native
    sealed trait IndexSignature
      extends StObject
         with ReflectionKind
    /* 8192 */ val IndexSignature: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.IndexSignature & Double = js.native
    
    /** @internal */
    val Inheritable: Double = js.native
    
    @js.native
    sealed trait Interface
      extends StObject
         with ReflectionKind
    /* 256 */ val Interface: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Interface & Double = js.native
    
    @js.native
    sealed trait Method
      extends StObject
         with ReflectionKind
    /* 2048 */ val Method: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Method & Double = js.native
    
    @js.native
    sealed trait Module
      extends StObject
         with ReflectionKind
    /* 2 */ val Module: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Module & Double = js.native
    
    @js.native
    sealed trait Namespace
      extends StObject
         with ReflectionKind
    /* 4 */ val Namespace: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Namespace & Double = js.native
    
    @js.native
    sealed trait ObjectLiteral
      extends StObject
         with ReflectionKind
    /* 2097152 */ val ObjectLiteral: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.ObjectLiteral & Double = js.native
    
    @js.native
    sealed trait Parameter
      extends StObject
         with ReflectionKind
    /* 32768 */ val Parameter: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Parameter & Double = js.native
    
    @js.native
    sealed trait Project
      extends StObject
         with ReflectionKind
    /* 1 */ val Project: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Project & Double = js.native
    
    @js.native
    sealed trait Property
      extends StObject
         with ReflectionKind
    /* 1024 */ val Property: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Property & Double = js.native
    
    @js.native
    sealed trait Reference
      extends StObject
         with ReflectionKind
    /* 8388608 */ val Reference: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Reference & Double = js.native
    
    @js.native
    sealed trait SetSignature
      extends StObject
         with ReflectionKind
    /* 1048576 */ val SetSignature: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.SetSignature & Double = js.native
    
    /**
      * Note: This does not include Class/Interface, even though they technically could contain index signatures
      * @internal
      */
    val SignatureContainer: Double = js.native
    
    val SomeExport: Double = js.native
    
    val SomeMember: Double = js.native
    
    val SomeModule: Double = js.native
    
    val SomeSignature: Double = js.native
    
    val SomeType: Double = js.native
    
    val SomeValue: Double = js.native
    
    @js.native
    sealed trait TypeAlias
      extends StObject
         with ReflectionKind
    /* 4194304 */ val TypeAlias: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.TypeAlias & Double = js.native
    
    @js.native
    sealed trait TypeLiteral
      extends StObject
         with ReflectionKind
    /* 65536 */ val TypeLiteral: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.TypeLiteral & Double = js.native
    
    @js.native
    sealed trait TypeParameter
      extends StObject
         with ReflectionKind
    /* 131072 */ val TypeParameter: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.TypeParameter & Double = js.native
    
    @js.native
    sealed trait Variable
      extends StObject
         with ReflectionKind
    /* 32 */ val Variable: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Variable & Double = js.native
    
    val VariableOrProperty: Double = js.native
  }
}
