package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.CallSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.ConstructorSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.GetSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.IndexSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.SetSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsParameterMod.ParameterReflection
import typingsJapgolly.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection
import typingsJapgolly.typedoc.distLibModelsTypesMod.ReferenceType
import typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModelsReflectionsSignatureMod {
  
  @JSImport("typedoc/dist/lib/models/reflections/signature", "SignatureReflection")
  @js.native
  open class SignatureReflection protected () extends Reflection {
    def this(name: String, kind: CallSignature, parent: DeclarationReflection) = this()
    def this(name: String, kind: ConstructorSignature, parent: DeclarationReflection) = this()
    def this(name: String, kind: GetSignature, parent: DeclarationReflection) = this()
    def this(name: String, kind: IndexSignature, parent: DeclarationReflection) = this()
    def this(name: String, kind: SetSignature, parent: DeclarationReflection) = this()
    
    /**
      * A type that points to the reflection this reflection is the implementation of.
      *
      * Applies to class members.
      */
    var implementationOf: js.UndefOr[ReferenceType] = js.native
    
    /**
      * A type that points to the reflection this reflection has been inherited from.
      *
      * Applies to interface and class members.
      */
    var inheritedFrom: js.UndefOr[ReferenceType] = js.native
    
    @JSName("kind")
    var kind_SignatureReflection: SetSignature | GetSignature | IndexSignature | CallSignature | ConstructorSignature = js.native
    
    /**
      * A type that points to the reflection that has been overwritten by this reflection.
      *
      * Applies to interface and class members.
      */
    var overwrites: js.UndefOr[ReferenceType] = js.native
    
    var parameters: js.UndefOr[js.Array[ParameterReflection]] = js.native
    
    @JSName("parent")
    var parent_SignatureReflection: DeclarationReflection = js.native
    
    var `type`: js.UndefOr[SomeType] = js.native
    
    var typeParameters: js.UndefOr[js.Array[TypeParameterReflection]] = js.native
  }
}
