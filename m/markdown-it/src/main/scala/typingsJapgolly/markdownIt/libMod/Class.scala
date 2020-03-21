package typingsJapgolly.markdownIt.libMod

import typingsJapgolly.markdownIt.markdownItStrings.commonmark
import typingsJapgolly.markdownIt.markdownItStrings.default
import typingsJapgolly.markdownIt.markdownItStrings.zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("markdown-it/lib", JSImport.Namespace)
@js.native
class Class () extends MarkdownIt {
  def this(options: Options) = this()
  def this(presetName: commonmark) = this()
  def this(presetName: default) = this()
  def this(presetName: zero) = this()
  def this(presetName: commonmark, options: Options) = this()
  def this(presetName: default, options: Options) = this()
  def this(presetName: zero, options: Options) = this()
}

