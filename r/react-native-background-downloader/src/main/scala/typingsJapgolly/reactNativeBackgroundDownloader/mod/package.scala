package typingsJapgolly.reactNativeBackgroundDownloader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BeginHandler = js.Function1[/* expectedBytes */ scala.Double, js.Any]
  type CheckForExistingDownloads_ = js.Function0[
    js.Promise[js.Array[typingsJapgolly.reactNativeBackgroundDownloader.mod.DownloadTask]]
  ]
  type DoneHandler = js.Function0[js.Any]
  type DownloadHeaders = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]
  type Download_ = js.Function1[
    /* options */ typingsJapgolly.reactNativeBackgroundDownloader.mod.DownloadOption, 
    typingsJapgolly.reactNativeBackgroundDownloader.mod.DownloadTask
  ]
  type ErrorHandler = js.Function2[/* error */ js.Any, /* errorCode */ js.Any, js.Any]
  type ProgressHandler = js.Function3[
    /* percent */ scala.Double, 
    /* bytesWritten */ scala.Double, 
    /* totalBytes */ scala.Double, 
    js.Any
  ]
  type SetHeaders_ = js.Function1[
    /* h */ typingsJapgolly.reactNativeBackgroundDownloader.mod.DownloadHeaders, 
    scala.Unit
  ]
  type TaskInfo = java.lang.String | typingsJapgolly.reactNativeBackgroundDownloader.mod.TaskInfoObject
}
