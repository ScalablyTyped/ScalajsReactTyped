package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plupload {
  type pluploadEvent = js.Function1[/* uploader */ typingsJapgolly.plupload.plupload.Uploader, js.Any]
  type pluploadEventChunkUploaded = js.Function3[
    /* uploader */ typingsJapgolly.plupload.plupload.Uploader, 
    /* file */ js.Any, 
    /* response */ typingsJapgolly.plupload.pluploadChunkResponse, 
    js.Any
  ]
  type pluploadEventError = js.Function2[
    /* uploader */ typingsJapgolly.plupload.plupload.Uploader, 
    /* error */ typingsJapgolly.plupload.pluploadError, 
    js.Any
  ]
  type pluploadEventFile = js.Function2[/* uploader */ typingsJapgolly.plupload.plupload.Uploader, /* file */ js.Any, js.Any]
  type pluploadEventFileUploaded = js.Function3[
    /* uploader */ typingsJapgolly.plupload.plupload.Uploader, 
    /* file */ js.Any, 
    /* response */ typingsJapgolly.plupload.pluploadResponse, 
    js.Any
  ]
  type pluploadEventFiles = js.Function2[
    /* uploader */ typingsJapgolly.plupload.plupload.Uploader, 
    /* files */ js.Array[js.Any], 
    js.Any
  ]
  type pluploadEventOptionChanged = js.Function4[
    /* uploader */ typingsJapgolly.plupload.plupload.Uploader, 
    /* name */ java.lang.String, 
    /* value */ js.Any, 
    /* oldValue */ js.Any, 
    js.Any
  ]
}
