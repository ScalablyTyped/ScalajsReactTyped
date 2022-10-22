package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.anon.ExtractDeletedKeys
import typingsJapgolly.breeze.breeze.Entity
import typingsJapgolly.breeze.breeze.KeyMapping
import typingsJapgolly.breeze.breeze.MappingContext
import typingsJapgolly.breeze.breeze.NodeContext
import typingsJapgolly.breeze.breeze.VisitNodeResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "JsonResultsAdapter")
@js.native
open class JsonResultsAdapter protected ()
  extends StObject
     with typingsJapgolly.breeze.breeze.JsonResultsAdapter {
  def this(config: ExtractDeletedKeys) = this()
  
  /* CompleteClass */
  override def extractDeletedKeys(data: js.Object): js.Array[typingsJapgolly.breeze.breeze.DeletedEntityKey] = js.native
  
  /* CompleteClass */
  override def extractKeyMappings(data: js.Object): js.Array[KeyMapping] = js.native
  
  /* CompleteClass */
  override def extractResults(data: js.Object): js.Object = js.native
  
  /* CompleteClass */
  override def extractSaveResults(data: js.Object): js.Array[Entity] = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  /* CompleteClass */
  override def visitNode(node: js.Object, queryContext: MappingContext, nodeContext: NodeContext): VisitNodeResult = js.native
}
