package typingsJapgolly.googleVisualization.global.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.visualization.QueryResponse")
@js.native
open class QueryResponse protected ()
  extends StObject
     with typingsJapgolly.googleVisualization.google.visualization.QueryResponse {
  def this(responseObject: js.Object) = this()
  
  /* CompleteClass */
  override def getDataTable(): typingsJapgolly.googleVisualization.google.visualization.DataTable = js.native
  
  /* CompleteClass */
  override def getDetailedMessage(): String = js.native
  
  /* CompleteClass */
  override def getMessage(): String = js.native
  
  /* CompleteClass */
  override def getReasons(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def hasWarning(): Boolean = js.native
  
  /* CompleteClass */
  override def isError(): Boolean = js.native
}
