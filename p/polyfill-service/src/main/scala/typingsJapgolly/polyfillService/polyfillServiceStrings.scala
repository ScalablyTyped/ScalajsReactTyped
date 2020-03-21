package typingsJapgolly.polyfillService

import typingsJapgolly.polyfillService.mod.PolyfillFlag
import typingsJapgolly.polyfillService.mod.Unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object polyfillServiceStrings {
  @js.native
  sealed trait always extends PolyfillFlag
  
  @js.native
  sealed trait gated extends PolyfillFlag
  
  @js.native
  sealed trait ignore extends Unknown
  
  @js.native
  sealed trait polyfill extends Unknown
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def gated: gated = "gated".asInstanceOf[gated]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def polyfill: polyfill = "polyfill".asInstanceOf[polyfill]
}

