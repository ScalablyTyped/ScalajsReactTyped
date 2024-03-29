package typingsJapgolly.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheAdaptor
  extends StObject
     with UrlAdaptor {
  
  def generateKey(url: String, query: Query): String = js.native
  
  def init(adaptor: Any, timeStamp: Double, pageSize: Double): Unit = js.native
}
