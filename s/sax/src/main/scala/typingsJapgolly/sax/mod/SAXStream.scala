package typingsJapgolly.sax.mod

import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.sax.AnonBody
import typingsJapgolly.sax.AnonName
import typingsJapgolly.sax.AnonPrefix
import typingsJapgolly.sax.saxStrings.attribute
import typingsJapgolly.sax.saxStrings.cdata
import typingsJapgolly.sax.saxStrings.close
import typingsJapgolly.sax.saxStrings.closecdata
import typingsJapgolly.sax.saxStrings.closenamespace
import typingsJapgolly.sax.saxStrings.closetag
import typingsJapgolly.sax.saxStrings.comment
import typingsJapgolly.sax.saxStrings.data
import typingsJapgolly.sax.saxStrings.doctype
import typingsJapgolly.sax.saxStrings.drain
import typingsJapgolly.sax.saxStrings.end
import typingsJapgolly.sax.saxStrings.error
import typingsJapgolly.sax.saxStrings.finish
import typingsJapgolly.sax.saxStrings.opencdata
import typingsJapgolly.sax.saxStrings.opennamespace
import typingsJapgolly.sax.saxStrings.opentag
import typingsJapgolly.sax.saxStrings.pipe
import typingsJapgolly.sax.saxStrings.processinginstruction
import typingsJapgolly.sax.saxStrings.readable
import typingsJapgolly.sax.saxStrings.ready
import typingsJapgolly.sax.saxStrings.script
import typingsJapgolly.sax.saxStrings.text
import typingsJapgolly.sax.saxStrings.unpipe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sax", "SAXStream")
@js.native
class SAXStream () extends Duplex {
  def this(strict: Boolean) = this()
  def this(strict: Boolean, opt: SAXOptions) = this()
  var _parser: SAXParser = js.native
  def on(event: String, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_attribute(event: attribute, listener: js.ThisFunction1[/* this */ this.type, /* attr */ AnonName, Unit]): this.type = js.native
  @JSName("on")
  def on_cdata(event: cdata, listener: js.ThisFunction1[/* this */ this.type, /* cdata */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_closecdata(event: closecdata, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_closenamespace(event: closenamespace, listener: js.ThisFunction1[/* this */ this.type, /* ns */ AnonPrefix, Unit]): this.type = js.native
  @JSName("on")
  def on_closetag(event: closetag, listener: js.ThisFunction1[/* this */ this.type, /* tagName */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_comment(event: comment, listener: js.ThisFunction1[/* this */ this.type, /* comment */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.ThisFunction1[/* this */ this.type, /* chunk */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_doctype(event: doctype, listener: js.ThisFunction1[/* this */ this.type, /* doctype */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.ThisFunction1[/* this */ this.type, /* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_opencdata(event: opencdata, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_opennamespace(event: opennamespace, listener: js.ThisFunction1[/* this */ this.type, /* ns */ AnonPrefix, Unit]): this.type = js.native
  @JSName("on")
  def on_opentag(
    event: opentag,
    listener: js.ThisFunction1[/* this */ this.type, /* tag */ Tag | QualifiedTag, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.ThisFunction1[/* this */ this.type, /* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_processinginstruction(
    event: processinginstruction,
    listener: js.ThisFunction1[/* this */ this.type, /* node */ AnonBody, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.ThisFunction0[/* this */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_script(event: script, listener: js.ThisFunction1[/* this */ this.type, /* script */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_text(event: text, listener: js.ThisFunction1[/* this */ this.type, /* text */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.ThisFunction1[/* this */ this.type, /* src */ Readable, Unit]): this.type = js.native
}

