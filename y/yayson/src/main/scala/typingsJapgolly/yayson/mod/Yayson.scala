package typingsJapgolly.yayson.mod

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.yayson.TypeofPresenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Yayson extends js.Object {
  var Adapter: typingsJapgolly.yayson.mod.Adapter
  var Presenter: TypeofPresenter
  var Store: Instantiable0[typingsJapgolly.yayson.mod.Store]
}

object Yayson {
  @scala.inline
  def apply(Adapter: Adapter, Presenter: TypeofPresenter, Store: Instantiable0[Store]): Yayson = {
    val __obj = js.Dynamic.literal(Adapter = Adapter.asInstanceOf[js.Any], Presenter = Presenter.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Yayson]
  }
}

