package typingsJapgolly.elasticElasticsearch.libHelpersMod

import typingsJapgolly.elasticElasticsearch.libApiTypesMod.BulkCreateOperation
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.BulkDeleteOperation
import typingsJapgolly.elasticElasticsearch.libApiTypesMod.BulkIndexOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Action extends StObject
object _Action {
  
  inline def CreateAction(create: BulkCreateOperation): typingsJapgolly.elasticElasticsearch.libHelpersMod.CreateAction = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libHelpersMod.CreateAction]
  }
  
  inline def DeleteAction(delete: BulkDeleteOperation): typingsJapgolly.elasticElasticsearch.libHelpersMod.DeleteAction = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libHelpersMod.DeleteAction]
  }
  
  inline def IndexAction(index: BulkIndexOperation): typingsJapgolly.elasticElasticsearch.libHelpersMod.IndexAction = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libHelpersMod.IndexAction]
  }
}
