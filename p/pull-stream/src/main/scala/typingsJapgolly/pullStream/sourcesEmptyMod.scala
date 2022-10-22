package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesEmptyMod {
  
  /**
    * Create a stream with no contents (it just ends immediately).
    */
  inline def apply(): Source[scala.Nothing] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Source[scala.Nothing]]
  
  @JSImport("pull-stream/sources/empty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
