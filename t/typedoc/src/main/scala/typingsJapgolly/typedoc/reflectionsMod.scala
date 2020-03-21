package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.abstractMod.ReflectionKind
import typingsJapgolly.typedoc.modelsTypesMod.TypeParameterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections", JSImport.Namespace)
@js.native
object reflectionsMod extends js.Object {
  @js.native
  class ContainerReflection ()
    extends typingsJapgolly.typedoc.containerMod.ContainerReflection
  
  @js.native
  class DeclarationReflection ()
    extends typingsJapgolly.typedoc.reflectionsDeclarationMod.DeclarationReflection
  
  @js.native
  class ParameterReflection ()
    extends typingsJapgolly.typedoc.reflectionsParameterMod.ParameterReflection
  
  @js.native
  class ProjectReflection protected ()
    extends typingsJapgolly.typedoc.projectMod.ProjectReflection {
    def this(name: String) = this()
  }
  
  @js.native
  abstract class Reflection protected ()
    extends typingsJapgolly.typedoc.abstractMod.Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typingsJapgolly.typedoc.abstractMod.Reflection) = this()
  }
  
  @js.native
  class SignatureReflection ()
    extends typingsJapgolly.typedoc.reflectionsSignatureMod.SignatureReflection
  
  @js.native
  class TypeParameterReflection protected ()
    extends typingsJapgolly.typedoc.reflectionsTypeParameterMod.TypeParameterReflection {
    def this(`type`: TypeParameterType) = this()
    def this(`type`: TypeParameterType, parent: typingsJapgolly.typedoc.abstractMod.Reflection) = this()
  }
  
  def splitUnquotedString(input: String, delimiter: String): js.Array[String] = js.native
  @js.native
  object ReflectionFlag extends js.Object {
    /* 2048 */ val Abstract: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.Abstract with Double = js.native
    /* 4096 */ val Const: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.Const with Double = js.native
    /* 1024 */ val ConstructorProperty: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.ConstructorProperty with Double = js.native
    /* 256 */ val DefaultValue: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.DefaultValue with Double = js.native
    /* 32 */ val ExportAssignment: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.ExportAssignment with Double = js.native
    /* 16 */ val Exported: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.Exported with Double = js.native
    /* 64 */ val External: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.External with Double = js.native
    /* 8192 */ val Let: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.Let with Double = js.native
    /* 0 */ val None: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.None with Double = js.native
    /* 128 */ val Optional: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.Optional with Double = js.native
    /* 1 */ val Private: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.Private with Double = js.native
    /* 2 */ val Protected: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.Protected with Double = js.native
    /* 4 */ val Public: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.Public with Double = js.native
    /* 512 */ val Rest: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.Rest with Double = js.native
    /* 8 */ val Static: typingsJapgolly.typedoc.abstractMod.ReflectionFlag.Static with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.typedoc.abstractMod.ReflectionFlag with Double] = js.native
  }
  
  @js.native
  object ReflectionKind extends js.Object {
    /* 262144 */ val Accessor: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Accessor with Double = js.native
    /* 4096 */ val CallSignature: typingsJapgolly.typedoc.abstractMod.ReflectionKind.CallSignature with Double = js.native
    /* 128 */ val Class: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Class with Double = js.native
    /* 8654336 */ val ClassMember: typingsJapgolly.typedoc.abstractMod.ReflectionKind.ClassMember with Double = js.native
    /* 384 */ val ClassOrInterface: typingsJapgolly.typedoc.abstractMod.ReflectionKind.ClassOrInterface with Double = js.native
    /* 512 */ val Constructor: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Constructor with Double = js.native
    /* 16384 */ val ConstructorSignature: typingsJapgolly.typedoc.abstractMod.ReflectionKind.ConstructorSignature with Double = js.native
    /* 4 */ val Enum: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Enum with Double = js.native
    /* 16 */ val EnumMember: typingsJapgolly.typedoc.abstractMod.ReflectionKind.EnumMember with Double = js.native
    /* 8388608 */ val Event: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Event with Double = js.native
    /* 1 */ val ExternalModule: typingsJapgolly.typedoc.abstractMod.ReflectionKind.ExternalModule with Double = js.native
    /* 64 */ val Function: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Function with Double = js.native
    /* 2112 */ val FunctionOrMethod: typingsJapgolly.typedoc.abstractMod.ReflectionKind.FunctionOrMethod with Double = js.native
    /* 524288 */ val GetSignature: typingsJapgolly.typedoc.abstractMod.ReflectionKind.GetSignature with Double = js.native
    /* 0 */ val Global: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Global with Double = js.native
    /* 8192 */ val IndexSignature: typingsJapgolly.typedoc.abstractMod.ReflectionKind.IndexSignature with Double = js.native
    /* 256 */ val Interface: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Interface with Double = js.native
    /* 2048 */ val Method: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Method with Double = js.native
    /* 2 */ val Module: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Module with Double = js.native
    /* 2097152 */ val ObjectLiteral: typingsJapgolly.typedoc.abstractMod.ReflectionKind.ObjectLiteral with Double = js.native
    /* 32768 */ val Parameter: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Parameter with Double = js.native
    /* 1024 */ val Property: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Property with Double = js.native
    /* 1048576 */ val SetSignature: typingsJapgolly.typedoc.abstractMod.ReflectionKind.SetSignature with Double = js.native
    /* 3 */ val SomeModule: typingsJapgolly.typedoc.abstractMod.ReflectionKind.SomeModule with Double = js.native
    /* 1601536 */ val SomeSignature: typingsJapgolly.typedoc.abstractMod.ReflectionKind.SomeSignature with Double = js.native
    /* 4391168 */ val SomeType: typingsJapgolly.typedoc.abstractMod.ReflectionKind.SomeType with Double = js.native
    /* 2097248 */ val SomeValue: typingsJapgolly.typedoc.abstractMod.ReflectionKind.SomeValue with Double = js.native
    /* 4194304 */ val TypeAlias: typingsJapgolly.typedoc.abstractMod.ReflectionKind.TypeAlias with Double = js.native
    /* 65536 */ val TypeLiteral: typingsJapgolly.typedoc.abstractMod.ReflectionKind.TypeLiteral with Double = js.native
    /* 131072 */ val TypeParameter: typingsJapgolly.typedoc.abstractMod.ReflectionKind.TypeParameter with Double = js.native
    /* 32 */ val Variable: typingsJapgolly.typedoc.abstractMod.ReflectionKind.Variable with Double = js.native
    /* 1056 */ val VariableOrProperty: typingsJapgolly.typedoc.abstractMod.ReflectionKind.VariableOrProperty with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.typedoc.abstractMod.ReflectionKind with Double] = js.native
  }
  
  @js.native
  object TraverseProperty extends js.Object {
    /* 0 */ val Children: typingsJapgolly.typedoc.abstractMod.TraverseProperty.Children with Double = js.native
    /* 6 */ val GetSignature: typingsJapgolly.typedoc.abstractMod.TraverseProperty.GetSignature with Double = js.native
    /* 5 */ val IndexSignature: typingsJapgolly.typedoc.abstractMod.TraverseProperty.IndexSignature with Double = js.native
    /* 1 */ val Parameters: typingsJapgolly.typedoc.abstractMod.TraverseProperty.Parameters with Double = js.native
    /* 7 */ val SetSignature: typingsJapgolly.typedoc.abstractMod.TraverseProperty.SetSignature with Double = js.native
    /* 4 */ val Signatures: typingsJapgolly.typedoc.abstractMod.TraverseProperty.Signatures with Double = js.native
    /* 2 */ val TypeLiteral: typingsJapgolly.typedoc.abstractMod.TraverseProperty.TypeLiteral with Double = js.native
    /* 3 */ val TypeParameter: typingsJapgolly.typedoc.abstractMod.TraverseProperty.TypeParameter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.typedoc.abstractMod.TraverseProperty with Double] = js.native
  }
  
}

