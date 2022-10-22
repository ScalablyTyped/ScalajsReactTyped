package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.EndOrError
import typingsJapgolly.pullStream.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesErrorMod {
  
  /**
    * Create a stream with no contents (it just ends immediately).
    */
  inline def apply(err: EndOrError): Source[scala.Nothing] = ^.asInstanceOf[js.Dynamic].apply(err.asInstanceOf[js.Any]).asInstanceOf[Source[scala.Nothing]]
  
  @JSImport("pull-stream/sources/error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
