package typingsJapgolly.ganacheCore.mod

import typingsJapgolly.ganacheCore.mod.Ganache.IProviderOptions
import typingsJapgolly.ganacheCore.mod.Ganache.IServerOptions
import typingsJapgolly.ganacheCore.mod.Ganache.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ganache-core", JSImport.Default)
@js.native
object default extends js.Object {
  def provider(): Provider = js.native
  def provider(opts: IProviderOptions): Provider = js.native
  def server(): js.Any = js.native
  def server(opts: IServerOptions): js.Any = js.native
}

