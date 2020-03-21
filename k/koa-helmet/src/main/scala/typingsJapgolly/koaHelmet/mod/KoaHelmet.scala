package typingsJapgolly.koaHelmet.mod

import typingsJapgolly.helmet.mod.IHelmetConfiguration
import typingsJapgolly.helmet.mod.IHelmetDnsPrefetchControlConfiguration
import typingsJapgolly.helmet.mod.IHelmetFrameguardConfiguration
import typingsJapgolly.helmet.mod.IHelmetHpkpConfiguration
import typingsJapgolly.helmet.mod.IHelmetHstsConfiguration
import typingsJapgolly.helmet.mod.IHelmetReferrerPolicyConfiguration
import typingsJapgolly.helmet.mod.IHelmetXssFilterConfiguration
import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoaHelmet extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: IHelmetConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def contentSecurityPolicy(): Middleware[DefaultState, DefaultContext] = js.native
  def contentSecurityPolicy(options: KoaHelmetContentSecurityPolicyConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def dnsPrefetchControl(): Middleware[DefaultState, DefaultContext] = js.native
  def dnsPrefetchControl(options: IHelmetDnsPrefetchControlConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def frameguard(): Middleware[DefaultState, DefaultContext] = js.native
  def frameguard(options: IHelmetFrameguardConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def hpkp(): Middleware[DefaultState, DefaultContext] = js.native
  def hpkp(options: IHelmetHpkpConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def hsts(): Middleware[DefaultState, DefaultContext] = js.native
  def hsts(options: IHelmetHstsConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def ieNoOpen(): Middleware[DefaultState, DefaultContext] = js.native
  def noCache(): Middleware[DefaultState, DefaultContext] = js.native
  def noCache(options: js.Any): Middleware[DefaultState, DefaultContext] = js.native
  def noSniff(): Middleware[DefaultState, DefaultContext] = js.native
  def referrerPolicy(): Middleware[DefaultState, DefaultContext] = js.native
  def referrerPolicy(options: IHelmetReferrerPolicyConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def xssFilter(): Middleware[DefaultState, DefaultContext] = js.native
  def xssFilter(options: IHelmetXssFilterConfiguration): Middleware[DefaultState, DefaultContext] = js.native
}

