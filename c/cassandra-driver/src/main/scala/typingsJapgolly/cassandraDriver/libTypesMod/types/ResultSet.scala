package typingsJapgolly.cassandraDriver.libTypesMod.types

import typingsJapgolly.cassandraDriver.anon.AchievedConsistency
import typingsJapgolly.cassandraDriver.anon.Type
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSet
  extends StObject
     with Iterable[Row]
     with AsyncIterable[Row] {
  
  var columns: js.Array[Type] = js.native
  
  def first(): Row = js.native
  
  var info: AchievedConsistency = js.native
  
  var nextPage: js.Function0[Unit] | Null = js.native
  
  var pageState: String = js.native
  
  var rowLength: Double = js.native
  
  var rows: js.Array[Row] = js.native
  
  def wasApplied(): Boolean = js.native
}
