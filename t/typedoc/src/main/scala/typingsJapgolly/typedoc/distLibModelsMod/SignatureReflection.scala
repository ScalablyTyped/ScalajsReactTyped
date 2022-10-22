package typingsJapgolly.typedoc.distLibModelsMod

import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.CallSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.ConstructorSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.GetSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.IndexSignature
import typingsJapgolly.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.SetSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models", "SignatureReflection")
@js.native
open class SignatureReflection protected ()
  extends typingsJapgolly.typedoc.distLibModelsReflectionsMod.SignatureReflection {
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
