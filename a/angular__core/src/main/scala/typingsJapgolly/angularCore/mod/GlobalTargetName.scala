package typingsJapgolly.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The goal here is to make sure that the browser DOM API is the Renderer.
  * We do this by defining a subset of DOM API to be the renderer and then
  * use that at runtime for rendering.
  *
  * At runtime we can then use the DOM api directly, in server or web-worker
  * it will be easy to implement such API.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCore.angularCoreStrings.document
  - typingsJapgolly.angularCore.angularCoreStrings.window
  - typingsJapgolly.angularCore.angularCoreStrings.body
*/
trait GlobalTargetName extends StObject
object GlobalTargetName {
  
  inline def body: typingsJapgolly.angularCore.angularCoreStrings.body = "body".asInstanceOf[typingsJapgolly.angularCore.angularCoreStrings.body]
  
  inline def document: typingsJapgolly.angularCore.angularCoreStrings.document = "document".asInstanceOf[typingsJapgolly.angularCore.angularCoreStrings.document]
  
  inline def window: typingsJapgolly.angularCore.angularCoreStrings.window = "window".asInstanceOf[typingsJapgolly.angularCore.angularCoreStrings.window]
}
