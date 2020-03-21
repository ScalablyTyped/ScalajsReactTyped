package typingsJapgolly.loaderRunner.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunLoaderOption extends js.Object {
  var context: js.Any
  var loaders: js.Array[_]
  var resource: String
  def readResource(
    filename: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer | Null, Unit]
  ): Unit
}

object RunLoaderOption {
  @scala.inline
  def apply(
    context: js.Any,
    loaders: js.Array[_],
    readResource: (String, js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer | Null, Unit]) => Callback,
    resource: String
  ): RunLoaderOption = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("readResource")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, 
  /* data */ typingsJapgolly.node.Buffer | scala.Null, 
  scala.Unit]) => readResource(t0, t1).runNow()))
    __obj.asInstanceOf[RunLoaderOption]
  }
}

