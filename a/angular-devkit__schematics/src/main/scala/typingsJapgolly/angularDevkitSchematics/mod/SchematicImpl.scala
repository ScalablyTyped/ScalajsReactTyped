package typingsJapgolly.angularDevkitSchematics.mod

import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.Collection
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.Engine
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.RuleFactory
import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.SchematicDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular-devkit/schematics", "SchematicImpl")
@js.native
open class SchematicImpl[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
  extends typingsJapgolly.angularDevkitSchematics.srcEngineMod.SchematicImpl[CollectionT, SchematicT] {
  def this(
    _description: SchematicDescription[CollectionT, SchematicT],
    _factory: RuleFactory[js.Object],
    _collection: Collection[CollectionT, SchematicT],
    _engine: Engine[CollectionT, SchematicT]
  ) = this()
}
