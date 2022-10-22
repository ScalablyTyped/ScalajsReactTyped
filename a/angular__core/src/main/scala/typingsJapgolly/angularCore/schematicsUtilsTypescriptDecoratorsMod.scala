package typingsJapgolly.angularCore

import typingsJapgolly.angularCore.schematicsUtilsTypescriptImportsMod.Import
import typingsJapgolly.typescript.mod.Decorator
import typingsJapgolly.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsTypescriptDecoratorsMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCallDecoratorImport(typeChecker: TypeChecker, decorator: Decorator): Import | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getCallDecoratorImport")(typeChecker.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any])).asInstanceOf[Import | Null]
}
