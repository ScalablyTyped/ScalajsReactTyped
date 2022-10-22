package typingsJapgolly.elasticElasticsearch.libHelpersMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libHelpersMod.IndexAction
  - typingsJapgolly.elasticElasticsearch.libHelpersMod.CreateAction
  - typingsJapgolly.elasticElasticsearch.libHelpersMod.UpdateAction
  - typingsJapgolly.elasticElasticsearch.libHelpersMod.DeleteAction
*/
type Action = _Action | UpdateAction

type UpdateAction = js.Tuple2[UpdateActionOperation, Record[String, Any]]
