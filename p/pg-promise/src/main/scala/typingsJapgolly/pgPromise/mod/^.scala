package typingsJapgolly.pgPromise.mod

import typingsJapgolly.pgPromise.pgSubsetMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-promise", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // Default library interface (before initialization)
  // API: http://vitaly-t.github.io/pg-promise/module-pg-promise.html
  def apply[Ext, C /* <: IClient */](): IMain[Ext, C] = js.native
  def apply[Ext, C /* <: IClient */](options: IInitOptions[Ext, C]): IMain[Ext, C] = js.native
}

