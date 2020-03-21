package typingsJapgolly.multerGridfsStorage.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.Request
import typingsJapgolly.mongodb.mod.Db
import typingsJapgolly.mongodb.mod.MongoClient
import typingsJapgolly.mongoose.mod.Connection_
import typingsJapgolly.mongoose.mod.Mongoose
import typingsJapgolly.multerGridfsStorage.mod._Global_.Express.Multer.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbStorageOptions extends MulterGfsOptions {
  var client: js.UndefOr[MongoClient | js.Promise[MongoClient]] = js.undefined
  var db: Mongoose | Connection_ | Db | (js.Promise[Mongoose | Connection_ | Db])
}

object DbStorageOptions {
  @scala.inline
  def apply(
    db: Mongoose | Connection_ | Db | (js.Promise[Mongoose | Connection_ | Db]),
    client: MongoClient | js.Promise[MongoClient] = null,
    file: (/* req */ Request, /* file */ File) => CallbackTo[js.Any] = null
  ): DbStorageOptions = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(js.Any.fromFunction2((t0: /* req */ org.scalajs.dom.experimental.Request, t1: /* file */ typingsJapgolly.multerGridfsStorage.mod._Global_.Express.Multer.File) => file(t0, t1).runNow()))
    __obj.asInstanceOf[DbStorageOptions]
  }
}

