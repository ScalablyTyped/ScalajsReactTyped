package typingsJapgolly.enhancedResolve.commonTypesMod

import typingsJapgolly.enhancedResolve.AnonEncoding
import typingsJapgolly.enhancedResolve.AnonFlag
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractInputFileSystem extends js.Object {
  var purge: js.UndefOr[js.Function1[/* what */ js.UndefOr[String | js.Array[String]], Unit]] = js.native
  var readFileSync: js.UndefOr[js.Function1[/* filename */ String, Buffer]] = js.native
  var readJson: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException, /* data */ js.Any, Unit], 
      Unit
    ]
  ] = js.native
  var readJsonSync: js.UndefOr[js.Function1[/* path */ String, _]] = js.native
  var readdirSync: js.UndefOr[js.Function1[/* path */ String, js.Array[String]]] = js.native
  var readlinkSync: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
  var statSync: js.UndefOr[js.Function1[/* path */ String, Stats]] = js.native
  def readFile(filename: String, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
  def readFile(
    filename: String,
    encoding: String,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  def readFile(
    filename: String,
    options: AnonEncoding,
    callback: js.Function2[/* err */ ErrnoException, /* data */ String, Unit]
  ): Unit = js.native
  def readFile(
    filename: String,
    options: AnonFlag,
    callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]
  ): Unit = js.native
  def readdir(path: String, callback: js.Function2[/* err */ ErrnoException, /* files */ js.Array[String], Unit]): Unit = js.native
  def readlink(path: String, callback: js.Function2[/* err */ ErrnoException, /* linkString */ String, Unit]): Unit = js.native
  def stat(path: String, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, Unit]): Unit = js.native
}

