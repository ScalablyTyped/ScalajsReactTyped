package typingsJapgolly.insertTextAtCursor

import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: HTMLInputElement, text: String): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(input: HTMLTextAreaElement, text: String): Unit = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("insert-text-at-cursor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
