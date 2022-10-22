package typingsJapgolly.marked.mod.marked

import typingsJapgolly.marked.anon.Align
import typingsJapgolly.marked.markedInts.`1`
import typingsJapgolly.marked.markedInts.`2`
import typingsJapgolly.marked.markedInts.`3`
import typingsJapgolly.marked.markedInts.`4`
import typingsJapgolly.marked.markedInts.`5`
import typingsJapgolly.marked.markedInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marked", "marked.Renderer")
@js.native
open class Renderer[T] () extends StObject {
  def this(options: MarkedOptions) = this()
  
  def blockquote(quote: String): String | T = js.native
  
  def br(): String | T = js.native
  
  def checkbox(checked: Boolean): String | T = js.native
  
  def code(code: String, language: String, isEscaped: Boolean): String | T = js.native
  def code(code: String, language: Unit, isEscaped: Boolean): String | T = js.native
  
  def codespan(code: String): String | T = js.native
  
  def del(text: String): String | T = js.native
  
  def em(text: String): String | T = js.native
  
  def heading(text: String, level: `1` | `2` | `3` | `4` | `5` | `6`, raw: String, slugger: Slugger): String | T = js.native
  
  def hr(): String | T = js.native
  
  def html(html: String): String | T = js.native
  
  def image(href: String, title: String, text: String): String | T = js.native
  def image(href: String, title: Null, text: String): String | T = js.native
  def image(href: Null, title: String, text: String): String | T = js.native
  def image(href: Null, title: Null, text: String): String | T = js.native
  
  def link(href: String, title: String, text: String): String | T = js.native
  def link(href: String, title: Null, text: String): String | T = js.native
  def link(href: Null, title: String, text: String): String | T = js.native
  def link(href: Null, title: Null, text: String): String | T = js.native
  
  def list(body: String, ordered: Boolean, start: Double): String | T = js.native
  
  def listitem(text: String, task: Boolean, checked: Boolean): String | T = js.native
  
  var options: MarkedOptions = js.native
  
  def paragraph(text: String): String | T = js.native
  
  def strong(text: String): String | T = js.native
  
  def table(header: String, body: String): String | T = js.native
  
  def tablecell(content: String, flags: Align): String | T = js.native
  
  def tablerow(content: String): String | T = js.native
  
  def text(text: String): String | T = js.native
}
