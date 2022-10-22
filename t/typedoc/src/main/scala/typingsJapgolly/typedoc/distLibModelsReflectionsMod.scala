package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.CallSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.ConstructorSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.GetSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.IndexSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.SetSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsTypeParameterMod.VarianceModifier
import typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType
import typingsJapgolly.typedoc.typedocStrings.`in out`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModelsReflectionsMod {
  
  @JSImport("typedoc/dist/lib/models/reflections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/models/reflections", "ContainerReflection")
  @js.native
  open class ContainerReflection protected ()
    extends typingsJapgolly.typedoc.distLibModelsReflectionsContainerMod.ContainerReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(
      name: String,
      kind: ReflectionKind,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ConversionFlags")
  @js.native
  object ConversionFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.ConversionFlags & Double
      ] = js.native
    
    /* 0 */ val None: typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.ConversionFlags.None & Double = js.native
    
    /* 1 */ val VariableSource: typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.ConversionFlags.VariableSource & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "DeclarationReflection")
  @js.native
  open class DeclarationReflection protected ()
    extends typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(
      name: String,
      kind: ReflectionKind,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ParameterReflection")
  @js.native
  open class ParameterReflection protected ()
    extends typingsJapgolly.typedoc.distLibModelsReflectionsParameterMod.ParameterReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(
      name: String,
      kind: ReflectionKind,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ProjectReflection")
  @js.native
  open class ProjectReflection protected ()
    extends typingsJapgolly.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReferenceReflection")
  @js.native
  open class ReferenceReflection protected ()
    extends typingsJapgolly.typedoc.distLibModelsReflectionsReferenceMod.ReferenceReflection {
    /**
      * Creates a reference reflection. Should only be used within the factory function.
      * @param name
      * @param state
      * @param parent
      *
      * @internal
      */
    def this(
      name: String,
      state: /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/models/reflections/reference.ReferenceReflection['_target'] */ js.Any
    ) = this()
    def this(
      name: String,
      state: /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/models/reflections/reference.ReferenceReflection['_target'] */ js.Any,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("typedoc/dist/lib/models/reflections", "Reflection")
  @js.native
  open class Reflection protected ()
    extends typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(
      name: String,
      kind: ReflectionKind,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReflectionFlag")
  @js.native
  object ReflectionFlag extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag & Double
      ] = js.native
    
    /* 512 */ val Abstract: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Abstract & Double = js.native
    
    /* 1024 */ val Const: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Const & Double = js.native
    
    /* 128 */ val DefaultValue: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.DefaultValue & Double = js.native
    
    /* 16 */ val ExportAssignment: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.ExportAssignment & Double = js.native
    
    /* 32 */ val External: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.External & Double = js.native
    
    /* 2048 */ val Let: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Let & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.None & Double = js.native
    
    /* 64 */ val Optional: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Optional & Double = js.native
    
    /* 1 */ val Private: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Private & Double = js.native
    
    /* 2 */ val Protected: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Protected & Double = js.native
    
    /* 4 */ val Public: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Public & Double = js.native
    
    /* 4096 */ val Readonly: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Readonly & Double = js.native
    
    /* 256 */ val Rest: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Rest & Double = js.native
    
    /* 8 */ val Static: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Static & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReflectionFlags")
  @js.native
  open class ReflectionFlags ()
    extends typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlags
  /* static members */
  object ReflectionFlags {
    
    @JSImport("typedoc/dist/lib/models/reflections", "ReflectionFlags")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/models/reflections", "ReflectionFlags.serializedFlags")
    @js.native
    def serializedFlags: Any = js.native
    inline def serializedFlags_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serializedFlags")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReflectionKind")
  @js.native
  object ReflectionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind & Double] = js.native
    
    /* 262144 */ val Accessor: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Accessor & Double = js.native
    
    val All: Double = js.native
    
    /* 4096 */ val CallSignature: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.CallSignature & Double = js.native
    
    /* 128 */ val Class: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Class & Double = js.native
    
    val ClassMember: Double = js.native
    
    val ClassOrInterface: Double = js.native
    
    /* 512 */ val Constructor: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Constructor & Double = js.native
    
    /* 16384 */ val ConstructorSignature: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.ConstructorSignature & Double = js.native
    
    /** @internal */
    val ContainsCallSignatures: Double = js.native
    
    /* 8 */ val Enum: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Enum & Double = js.native
    
    /* 16 */ val EnumMember: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.EnumMember & Double = js.native
    
    val ExportContainer: Double = js.native
    
    /* 64 */ val Function: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Function & Double = js.native
    
    val FunctionOrMethod: Double = js.native
    
    /* 524288 */ val GetSignature: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.GetSignature & Double = js.native
    
    /* 8192 */ val IndexSignature: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.IndexSignature & Double = js.native
    
    /** @internal */
    val Inheritable: Double = js.native
    
    /* 256 */ val Interface: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Interface & Double = js.native
    
    /* 2048 */ val Method: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Method & Double = js.native
    
    /* 2 */ val Module: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Module & Double = js.native
    
    /* 4 */ val Namespace: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Namespace & Double = js.native
    
    /* 2097152 */ val ObjectLiteral: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.ObjectLiteral & Double = js.native
    
    /* 32768 */ val Parameter: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Parameter & Double = js.native
    
    /* 1 */ val Project: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Project & Double = js.native
    
    /* 1024 */ val Property: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Property & Double = js.native
    
    /* 8388608 */ val Reference: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Reference & Double = js.native
    
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
    
    /* 4194304 */ val TypeAlias: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.TypeAlias & Double = js.native
    
    /* 65536 */ val TypeLiteral: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.TypeLiteral & Double = js.native
    
    /* 131072 */ val TypeParameter: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.TypeParameter & Double = js.native
    
    /* 32 */ val Variable: typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Variable & Double = js.native
    
    val VariableOrProperty: Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "SignatureReflection")
  @js.native
  open class SignatureReflection protected ()
    extends typingsJapgolly.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection {
    def this(
      name: String,
      kind: CallSignature,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
    ) = this()
    def this(
      name: String,
      kind: ConstructorSignature,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
    ) = this()
    def this(
      name: String,
      kind: GetSignature,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
    ) = this()
    def this(
      name: String,
      kind: IndexSignature,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
    ) = this()
    def this(
      name: String,
      kind: SetSignature,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "TraverseProperty")
  @js.native
  object TraverseProperty extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty & Double
      ] = js.native
    
    /* 0 */ val Children: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Children & Double = js.native
    
    /* 6 */ val GetSignature: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.GetSignature & Double = js.native
    
    /* 5 */ val IndexSignature: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.IndexSignature & Double = js.native
    
    /* 1 */ val Parameters: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Parameters & Double = js.native
    
    /* 7 */ val SetSignature: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.SetSignature & Double = js.native
    
    /* 4 */ val Signatures: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Signatures & Double = js.native
    
    /* 2 */ val TypeLiteral: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.TypeLiteral & Double = js.native
    
    /* 3 */ val TypeParameter: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.TypeParameter & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "TypeParameterReflection")
  @js.native
  open class TypeParameterReflection protected ()
    extends typingsJapgolly.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection {
    def this(
      name: String,
      constraint: Unit,
      defaultType: Unit,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
    def this(
      name: String,
      constraint: Unit,
      defaultType: SomeType,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: Unit,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: SomeType,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
    def this(
      name: String,
      constraint: Unit,
      defaultType: Unit,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    def this(
      name: String,
      constraint: Unit,
      defaultType: SomeType,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: Unit,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: SomeType,
      parent: typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
      varianceModifier: VarianceModifier
    ) = this()
  }
  
  object VarianceModifier {
    
    @JSImport("typedoc/dist/lib/models/reflections", "VarianceModifier.in")
    @js.native
    val in: typingsJapgolly.typedoc.typedocStrings.in = js.native
    
    @JSImport("typedoc/dist/lib/models/reflections", "VarianceModifier.inOut")
    @js.native
    val inOut: `in out` = js.native
    
    @JSImport("typedoc/dist/lib/models/reflections", "VarianceModifier.out")
    @js.native
    val out: typingsJapgolly.typedoc.typedocStrings.out = js.native
  }
  
  inline def splitUnquotedString(input: String, delimiter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitUnquotedString")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
