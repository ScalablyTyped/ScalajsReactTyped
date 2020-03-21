package typingsJapgolly.multerS3.mod

import typingsJapgolly.expressServeStaticCore.mod._Global_.Express.Request
import typingsJapgolly.multer.mod.StorageEngine
import typingsJapgolly.multer.mod._Global_.Express.Multer.File
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Storage extends js.Object {
  def apply(): StorageEngine = js.native
  def apply(options: Options): StorageEngine = js.native
  def AUTO_CONTENT_TYPE(
    req: Request,
    file: File,
    callback: js.Function3[
      /* error */ js.Any, 
      /* mime */ js.UndefOr[String], 
      /* stream */ js.UndefOr[ReadableStream], 
      Unit
    ]
  ): Unit = js.native
  def DEFAULT_CONTENT_TYPE(
    req: Request,
    file: File,
    callback: js.Function2[/* error */ js.Any, /* mime */ js.UndefOr[String], Unit]
  ): Unit = js.native
}

