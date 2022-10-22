package typingsJapgolly.mdarea

import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.mdarea.mod.EditorOptions
import typingsJapgolly.mdarea.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("MarkdownArea")
  @js.native
  open class MarkdownArea protected () extends default {
    def this(elem: HTMLTextAreaElement) = this()
    def this(elem: HTMLTextAreaElement, maybeOptions: EditorOptions) = this()
  }
  object MarkdownArea {
    
    @JSGlobal("MarkdownArea.version")
    @js.native
    val version: String = js.native
  }
}
