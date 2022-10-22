package typingsJapgolly.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "DeleteQuery")
@js.native
open class DeleteQuery[T] protected ()
  extends StObject
     with IQuery[T] {
  def this(_table: Table[T]) = this()
  
  def execute(criteriaOrID: String): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  def execute(criteriaOrID: String, callback: js.Function1[/* _result */ DeleteAnswer, Any]): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  def execute(criteriaOrID: Double): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  def execute(criteriaOrID: Double, callback: js.Function1[/* _result */ DeleteAnswer, Any]): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
}
