package typingsJapgolly.eventEmitter

import typingsJapgolly.eventEmitter.mod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hasListenersMod {
  
  inline def apply(emitter: Emitter): Boolean = ^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(emitter: Emitter, name: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(emitter.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("event-emitter/has-listeners", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
