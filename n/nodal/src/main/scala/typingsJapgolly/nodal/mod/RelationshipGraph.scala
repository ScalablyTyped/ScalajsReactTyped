package typingsJapgolly.nodal.mod

import typingsJapgolly.nodal.anon.TypeofModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "RelationshipGraph")
@js.native
open class RelationshipGraph () extends StObject {
  
  var edges: js.Array[RelationshipEdge] = js.native
  
  var nodes: js.Array[RelationshipNode] = js.native
  
  def of(mModel: TypeofModel): RelationshipNode = js.native
}
