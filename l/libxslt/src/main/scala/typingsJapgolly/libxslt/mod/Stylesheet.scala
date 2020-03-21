package typingsJapgolly.libxslt.mod

import typingsJapgolly.libxmljs.mod.Document
import typingsJapgolly.libxslt.internalTypesMod.ApplyCallback
import typingsJapgolly.libxslt.internalTypesMod.ApplyResult
import typingsJapgolly.libxslt.internalTypesMod.ApplyStringCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stylesheet extends js.Object {
  @JSName("apply")
  def apply(source: String): String = js.native
  @JSName("apply")
  def apply(source: String, callback: ApplyStringCallback): Unit = js.native
  @JSName("apply")
  def apply(source: String, params: js.Object): String = js.native
  @JSName("apply")
  def apply(source: String, params: js.Object, options: ApplyOptions): ApplyResult = js.native
  @JSName("apply")
  def apply(source: String, params: js.Object, options: ApplyOptions, callback: ApplyCallback): Unit = js.native
  @JSName("apply")
  def apply(source: Document): Document = js.native
  @JSName("apply")
  def apply(source: Document, callback: ApplyStringCallback): Unit = js.native
  @JSName("apply")
  def apply(source: Document, params: js.Object): Document = js.native
  @JSName("apply")
  def apply(source: Document, params: js.Object, options: ApplyOptions): ApplyResult = js.native
  @JSName("apply")
  def apply(source: Document, params: js.Object, options: ApplyOptions, callback: ApplyCallback): Unit = js.native
  def applyToFile(sourcePath: String, callback: ApplyStringCallback): Unit = js.native
  def applyToFile(sourcePath: String, params: js.Object, options: ApplyOptions, callback: ApplyStringCallback): Unit = js.native
}

