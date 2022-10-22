package typingsJapgolly.angularDevkitSchematics.mod

import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.EngineHost
import typingsJapgolly.angularDevkitSchematics.srcWorkflowInterfaceMod.Workflow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular-devkit/schematics", "SchematicEngine")
@js.native
open class SchematicEngine[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
  extends typingsJapgolly.angularDevkitSchematics.srcEngineMod.SchematicEngine[CollectionT, SchematicT] {
  def this(_host: EngineHost[CollectionT, SchematicT]) = this()
  def this(_host: EngineHost[CollectionT, SchematicT], _workflow: Workflow) = this()
}
