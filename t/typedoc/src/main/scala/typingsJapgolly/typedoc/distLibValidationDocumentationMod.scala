package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibModelsMod.ProjectReflection
import typingsJapgolly.typedoc.distLibUtilsMod.Logger
import typingsJapgolly.typedoc.typedocStrings.All
import typingsJapgolly.typedoc.typedocStrings.ClassMember
import typingsJapgolly.typedoc.typedocStrings.ClassOrInterface
import typingsJapgolly.typedoc.typedocStrings.ContainsCallSignatures
import typingsJapgolly.typedoc.typedocStrings.ExportContainer
import typingsJapgolly.typedoc.typedocStrings.FunctionOrMethod
import typingsJapgolly.typedoc.typedocStrings.Inheritable
import typingsJapgolly.typedoc.typedocStrings.SignatureContainer
import typingsJapgolly.typedoc.typedocStrings.SomeExport
import typingsJapgolly.typedoc.typedocStrings.SomeMember
import typingsJapgolly.typedoc.typedocStrings.SomeModule
import typingsJapgolly.typedoc.typedocStrings.SomeSignature
import typingsJapgolly.typedoc.typedocStrings.SomeType
import typingsJapgolly.typedoc.typedocStrings.SomeValue
import typingsJapgolly.typedoc.typedocStrings.VariableOrProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibValidationDocumentationMod {
  
  @JSImport("typedoc/dist/lib/validation/documentation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateDocumentation(
    project: ProjectReflection,
    logger: Logger,
    requiredToBeDocumented: js.Array[
      /* keyof typedoc.anon.TypeofReflectionKind */ All | ClassOrInterface | VariableOrProperty | FunctionOrMethod | ClassMember | SomeSignature | SomeModule | SomeType | SomeValue | SomeMember | SomeExport | ExportContainer | Inheritable | ContainsCallSignatures | SignatureContainer
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateDocumentation")(project.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], requiredToBeDocumented.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
