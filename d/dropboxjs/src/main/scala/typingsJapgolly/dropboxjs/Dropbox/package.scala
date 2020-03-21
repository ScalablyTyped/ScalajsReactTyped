package typingsJapgolly.dropboxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Dropbox {
  type ClientFileReadCallback = js.Function4[
    /* err */ typingsJapgolly.dropboxjs.Dropbox.ApiError, 
    /* fileContents */ java.lang.String, 
    /* stat */ typingsJapgolly.dropboxjs.Dropbox.File.Stat, 
    /* rangeInfo */ typingsJapgolly.dropboxjs.Dropbox.Http.RangeInfo, 
    scala.Unit
  ]
  type ClientFileWriteCallback = js.Function2[
    /* err */ typingsJapgolly.dropboxjs.Dropbox.ApiError, 
    /* stat */ typingsJapgolly.dropboxjs.Dropbox.File.Stat, 
    scala.Unit
  ]
  type FileStatCallback = js.Function2[
    /* err */ typingsJapgolly.dropboxjs.Dropbox.ApiError, 
    /* stat */ typingsJapgolly.dropboxjs.Dropbox.File.Stat, 
    scala.Unit
  ]
  type QueryParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  type QueryParamsCallback = js.Function1[/* queryParams */ typingsJapgolly.dropboxjs.Dropbox.QueryParams, scala.Unit]
  type ResumableUploadStepCallback = js.Function2[
    /* err */ typingsJapgolly.dropboxjs.Dropbox.ApiError, 
    /* uploadCursor */ typingsJapgolly.dropboxjs.Dropbox.Http.UploadCursor, 
    scala.Unit
  ]
}
