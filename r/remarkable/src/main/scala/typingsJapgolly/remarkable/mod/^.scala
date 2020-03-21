package typingsJapgolly.remarkable.mod

import typingsJapgolly.remarkable.TypeofUtils
import typingsJapgolly.remarkable.libMod.Options
import typingsJapgolly.remarkable.remarkableStrings.commonmark
import typingsJapgolly.remarkable.remarkableStrings.full
import typingsJapgolly.remarkable.remarkableStrings.remarkable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("remarkable", JSImport.Namespace)
@js.native
/**
  * Markdown parser, done right.
  */
class ^ ()
  extends typingsJapgolly.remarkable.libMod.^ {
  def this(options: Options) = this()
  /**
    * Remarkable offers some "presets" as a convenience to quickly enable/disable
    * active syntax rules and options for common use cases.
    */
  def this(preset: commonmark) = this()
  def this(preset: full) = this()
  def this(preset: remarkable) = this()
  def this(preset: commonmark, options: Options) = this()
  def this(preset: full, options: Options) = this()
  def this(preset: remarkable, options: Options) = this()
}

@JSImport("remarkable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Useful helper functions for custom rendering.
    */
  var utils: TypeofUtils = js.native
}

