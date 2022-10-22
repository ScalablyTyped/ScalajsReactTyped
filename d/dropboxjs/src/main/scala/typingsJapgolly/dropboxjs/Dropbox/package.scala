package typingsJapgolly.dropboxjs.Dropbox

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dropboxjs.Dropbox.File.Stat
import typingsJapgolly.dropboxjs.Dropbox.Http.RangeInfo
import typingsJapgolly.dropboxjs.Dropbox.Http.UploadCursor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ClientFileReadCallback = js.Function4[
/* err */ ApiError, 
/* fileContents */ String, 
/* stat */ Stat, 
/* rangeInfo */ RangeInfo, 
Unit]

type ClientFileWriteCallback = js.Function2[/* err */ ApiError, /* stat */ Stat, Unit]

type FileStatCallback = js.Function2[/* err */ ApiError, /* stat */ Stat, Unit]

type QueryParams = StringDictionary[Any]

type QueryParamsCallback = js.Function1[/* queryParams */ QueryParams, Unit]

type ResumableUploadStepCallback = js.Function2[/* err */ ApiError, /* uploadCursor */ UploadCursor, Unit]
