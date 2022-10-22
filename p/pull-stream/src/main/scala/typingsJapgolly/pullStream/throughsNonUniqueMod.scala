package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.Through_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object throughsNonUniqueMod {
  
  /**
    * Filter unique items -- get the duplicates. The inverse of `unique`.
    */
  inline def apply[InOut](): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Through_[InOut, InOut]]
  inline def apply[InOut](prop: /* keyof InOut */ String): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].apply(prop.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  inline def apply[InOut](prop: js.Function1[/* data */ InOut, Any]): Through_[InOut, InOut] = ^.asInstanceOf[js.Dynamic].apply(prop.asInstanceOf[js.Any]).asInstanceOf[Through_[InOut, InOut]]
  
  @JSImport("pull-stream/throughs/non-unique", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
