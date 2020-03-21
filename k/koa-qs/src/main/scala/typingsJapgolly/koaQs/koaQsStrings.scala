package typingsJapgolly.koaQs

import typingsJapgolly.koaQs.mod.ParseMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object koaQsStrings {
  @js.native
  sealed trait extended extends ParseMode
  
  @js.native
  sealed trait first extends ParseMode
  
  @js.native
  sealed trait strict extends ParseMode
  
  @scala.inline
  def extended: extended = "extended".asInstanceOf[extended]
  @scala.inline
  def first: first = "first".asInstanceOf[first]
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
}

