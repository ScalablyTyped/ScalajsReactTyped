package typingsJapgolly.pgPromise

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.pgPromise.pgSubsetMod.IClient
import typingsJapgolly.pgPromise.pgSubsetMod.IConnectionParameters
import typingsJapgolly.pgPromise.pgSubsetMod.IDefaults
import typingsJapgolly.pgPromise.pgSubsetMod.ITypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpg extends js.Object {
  val Client: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient]
  val defaults: IDefaults
  val types: ITypes
}

object Typeofpg {
  @scala.inline
  def apply(
    Client: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient],
    defaults: IDefaults,
    types: ITypes
  ): Typeofpg = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofpg]
  }
}

