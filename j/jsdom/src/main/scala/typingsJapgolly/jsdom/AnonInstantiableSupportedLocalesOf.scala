package typingsJapgolly.jsdom

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.std.Intl.Collator
import typingsJapgolly.std.Intl.CollatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInstantiableSupportedLocalesOf
  extends Instantiable0[Collator]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), Collator]
     with Instantiable2[
      (/* locales */ js.Array[String]) | (/* locales */ String), 
      /* options */ CollatorOptions, 
      Collator
    ] {
  def apply(): Collator = js.native
  def apply(locales: String): Collator = js.native
  def apply(locales: String, options: CollatorOptions): Collator = js.native
  def apply(locales: js.Array[String]): Collator = js.native
  def apply(locales: js.Array[String], options: CollatorOptions): Collator = js.native
  def supportedLocalesOf(locales: String): js.Array[String] = js.native
  def supportedLocalesOf(locales: String, options: CollatorOptions): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
  def supportedLocalesOf(locales: js.Array[String], options: CollatorOptions): js.Array[String] = js.native
}

