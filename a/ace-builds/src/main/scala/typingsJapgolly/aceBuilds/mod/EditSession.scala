package typingsJapgolly.aceBuilds.mod

import org.scalajs.dom.Document
import typingsJapgolly.aceBuilds.mod.Ace.SyntaxMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("ace-builds", "EditSession")
@js.native
open class EditSession protected ()
  extends StObject
     with typingsJapgolly.aceBuilds.mod.Ace.EditSession {
  def this(text: String) = this()
  def this(text: Document) = this()
  def this(text: String, mode: SyntaxMode) = this()
  def this(text: Document, mode: SyntaxMode) = this()
}
