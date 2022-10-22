package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesKeysMod {
  
  inline def apply(obj: js.Array[Any]): Source[String] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Source[String]]
  /**
    * Stream the key names from an object (or array).
    */
  inline def apply(obj: js.Object): Source[String] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Source[String]]
  
  @JSImport("pull-stream/sources/keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
