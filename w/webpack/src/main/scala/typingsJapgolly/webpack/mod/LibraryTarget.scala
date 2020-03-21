package typingsJapgolly.webpack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webpack.webpackStrings.`var`
  - typingsJapgolly.webpack.webpackStrings.assign
  - typingsJapgolly.webpack.webpackStrings.`this`
  - typingsJapgolly.webpack.webpackStrings.window
  - typingsJapgolly.webpack.webpackStrings.global
  - typingsJapgolly.webpack.webpackStrings.commonjs
  - typingsJapgolly.webpack.webpackStrings.commonjs2
  - typingsJapgolly.webpack.webpackStrings.amd
  - typingsJapgolly.webpack.webpackStrings.umd
  - typingsJapgolly.webpack.webpackStrings.jsonp
*/
trait LibraryTarget extends js.Object

object LibraryTarget {
  @scala.inline
  def amd: typingsJapgolly.webpack.webpackStrings.amd = this.cast("amd")
  @scala.inline
  def assign: typingsJapgolly.webpack.webpackStrings.assign = this.cast("assign")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def commonjs: typingsJapgolly.webpack.webpackStrings.commonjs = this.cast("commonjs")
  @scala.inline
  def commonjs2: typingsJapgolly.webpack.webpackStrings.commonjs2 = this.cast("commonjs2")
  @scala.inline
  def global: typingsJapgolly.webpack.webpackStrings.global = this.cast("global")
  @scala.inline
  def jsonp: typingsJapgolly.webpack.webpackStrings.jsonp = this.cast("jsonp")
  @scala.inline
  def `this`: typingsJapgolly.webpack.webpackStrings.`this` = this.cast("this")
  @scala.inline
  def umd: typingsJapgolly.webpack.webpackStrings.umd = this.cast("umd")
  @scala.inline
  def `var`: typingsJapgolly.webpack.webpackStrings.`var` = this.cast("var")
  @scala.inline
  def window: typingsJapgolly.webpack.webpackStrings.window = this.cast("window")
}

