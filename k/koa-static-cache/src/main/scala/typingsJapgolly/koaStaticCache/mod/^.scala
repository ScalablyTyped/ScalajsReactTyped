package typingsJapgolly.koaStaticCache.mod

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-static-cache", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(dir: String): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String, options: Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String, options: Files, files: Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String, options: Options): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: String, options: Options, files: Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: Options): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: Options, options: Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: Options, options: Files, files: Files): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: Options, options: Options): Middleware[DefaultState, DefaultContext] = js.native
  def apply(dir: Options, options: Options, files: Files): Middleware[DefaultState, DefaultContext] = js.native
}

