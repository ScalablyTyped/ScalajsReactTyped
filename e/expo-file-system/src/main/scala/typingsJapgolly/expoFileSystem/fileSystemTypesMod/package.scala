package typingsJapgolly.expoFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileSystemTypesMod {
  type DownloadProgressCallback = js.Function1[
    /* data */ typingsJapgolly.expoFileSystem.fileSystemTypesMod.DownloadProgressData, 
    scala.Unit
  ]
  type PlatformMethod = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
}
