package typingsJapgolly.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WXNS {
  type AnyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  type downloadFile = js.Function1[
    /* param */ typingsJapgolly.minappEnv.WXNS.IDownloadFileParam, 
    typingsJapgolly.minappEnv.WXNS.IDownloadFileTask
  ]
  type getFileInfo = js.Function1[/* param */ typingsJapgolly.minappEnv.WXNS.IGetFileInfoParam, scala.Unit]
  type operateWXData = js.Function1[/* param */ js.Any, scala.Unit]
  type request = js.Function1[
    /* param */ typingsJapgolly.minappEnv.WXNS.IRequestParam, 
    typingsJapgolly.minappEnv.WXNS.IRequestTask
  ]
  type uploadFile = js.Function1[
    /* param */ typingsJapgolly.minappEnv.WXNS.IUploadFileParam, 
    typingsJapgolly.minappEnv.WXNS.IUploadFileTask
  ]
}
