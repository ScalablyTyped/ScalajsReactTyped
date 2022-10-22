package typingsJapgolly.dxf

import typingsJapgolly.dxf.handlersEntitiesMod.Entity
import typingsJapgolly.dxf.handlersEntitiesMod.LayerGroupedEntities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupEntitiesByLayerMod {
  
  @JSImport("dxf/groupEntitiesByLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(entities: js.Array[Entity]): LayerGroupedEntities = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(entities.asInstanceOf[js.Any]).asInstanceOf[LayerGroupedEntities]
}
