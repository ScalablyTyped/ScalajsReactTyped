package typingsJapgolly.fluxible

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  /**
    * POST request to the server
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param body json request body
    * @param callback
    */
  def create(
    resource: String,
    params: js.Any,
    body: js.Any,
    callback: js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]
  ): Unit
  /**
    *
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param callback
    */
  def delete(
    resource: String,
    params: js.Any,
    callback: js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]
  ): Unit
  /**
    * GET request to the server
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param callback
    */
  def read(
    resource: String,
    params: js.Any,
    callback: js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]
  ): Unit
  /**
    *
    * @param resource name of resourse
    * @param params query string parameters as key-value object
    * @param body json request body
    * @param callback
    */
  def update(
    resource: String,
    params: js.Any,
    body: js.Any,
    callback: js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]
  ): Unit
}

object AnonCreate {
  @scala.inline
  def apply(
    create: (String, js.Any, js.Any, js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]) => Callback,
    delete: (String, js.Any, js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]) => Callback,
    read: (String, js.Any, js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]) => Callback,
    update: (String, js.Any, js.Any, js.Function2[/* error */ js.Error, /* data */ js.Any, Unit]) => Callback
  ): AnonCreate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Any, t2: js.Any, t3: js.Function2[/* error */ js.Error, /* data */ js.Any, scala.Unit]) => create(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function2[/* error */ js.Error, /* data */ js.Any, scala.Unit]) => delete(t0, t1, t2).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function2[/* error */ js.Error, /* data */ js.Any, scala.Unit]) => read(t0, t1, t2).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Any, t2: js.Any, t3: js.Function2[/* error */ js.Error, /* data */ js.Any, scala.Unit]) => update(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[AnonCreate]
  }
}

