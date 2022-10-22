package typingsJapgolly.micromarkUtilSubtokenize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-util-subtokenize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def subtokenize(events: js.Array[typingsJapgolly.micromarkUtilTypes.mod.Event]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("subtokenize")(events.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Chunk = typingsJapgolly.micromarkUtilTypes.mod.Chunk
  
  type Event = typingsJapgolly.micromarkUtilTypes.mod.Event
  
  type Token = typingsJapgolly.micromarkUtilTypes.mod.Token
}
