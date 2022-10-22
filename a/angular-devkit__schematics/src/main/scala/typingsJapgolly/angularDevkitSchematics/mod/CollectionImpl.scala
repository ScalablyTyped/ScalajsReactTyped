package typingsJapgolly.angularDevkitSchematics.mod

import typingsJapgolly.angularDevkitSchematics.srcEngineInterfaceMod.CollectionDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular-devkit/schematics", "CollectionImpl")
@js.native
open class CollectionImpl[CollectionT /* <: js.Object */, SchematicT /* <: js.Object */] protected ()
  extends typingsJapgolly.angularDevkitSchematics.srcEngineMod.CollectionImpl[CollectionT, SchematicT] {
  def this(
    _description: CollectionDescription[CollectionT],
    _engine: typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.SchematicEngine[CollectionT, SchematicT]
  ) = this()
  def this(
    _description: CollectionDescription[CollectionT],
    _engine: typingsJapgolly.angularDevkitSchematics.srcEngineEngineMod.SchematicEngine[CollectionT, SchematicT],
    baseDescriptions: js.Array[CollectionDescription[CollectionT]]
  ) = this()
}
