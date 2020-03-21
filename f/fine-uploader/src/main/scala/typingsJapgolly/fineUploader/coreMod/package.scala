package typingsJapgolly.fineUploader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreMod {
  type CustomResizerCallBack = js.Function1[
    /* resizeInfo */ typingsJapgolly.fineUploader.coreMod.ResizeInfo, 
    typingsJapgolly.fineUploader.coreMod.PromiseOptions
  ]
  type FormatFileNameFuncton = js.Function1[/* fileOrBlobName */ java.lang.String, java.lang.String]
  type OnAllComplete = js.Function2[
    /* succeeded */ js.Array[scala.Double], 
    /* failed */ js.Array[scala.Double], 
    scala.Unit
  ]
  type OnAutoRetry = js.Function3[
    /* id */ scala.Double, 
    /* name */ java.lang.String, 
    /* attemptNumber */ scala.Double, 
    scala.Unit
  ]
  type OnCancel = js.Function2[
    /* id */ scala.Double, 
    /* name */ java.lang.String, 
    scala.Boolean | typingsJapgolly.fineUploader.coreMod.PromiseOptions | scala.Unit
  ]
  type OnComplete = js.Function4[
    /* id */ scala.Double, 
    /* name */ java.lang.String, 
    /* responseJSON */ js.Any, 
    /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, 
    scala.Unit
  ]
  type OnDelete = js.Function1[/* id */ scala.Double, scala.Unit]
  type OnDeleteComplete = js.Function3[
    /* id */ scala.Double, 
    /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, 
    /* isError */ scala.Boolean, 
    scala.Unit
  ]
  type OnError = js.Function4[
    /* id */ scala.Double, 
    /* name */ java.lang.String, 
    /* errorReason */ java.lang.String, 
    /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, 
    scala.Unit
  ]
  type OnManualRetry = js.Function2[/* id */ scala.Double, /* name */ java.lang.String, scala.Boolean | scala.Unit]
  type OnPasteReceived = js.Function1[
    /* blob */ org.scalajs.dom.raw.Blob, 
    typingsJapgolly.fineUploader.coreMod.PromiseOptions | scala.Unit
  ]
  type OnProgress = js.Function4[
    /* id */ scala.Double, 
    /* name */ java.lang.String, 
    /* uploadedBytes */ scala.Double, 
    /* totalBytes */ scala.Double, 
    scala.Unit
  ]
  type OnResume = js.Function4[
    /* id */ scala.Double, 
    /* name */ java.lang.String, 
    /* chunkData */ js.Any, 
    /* customResumeData */ js.Any, 
    scala.Unit | js.Promise[js.Any]
  ]
  type OnSessionRequestComplete = js.Function3[
    /* response */ js.Array[js.Any], 
    /* success */ scala.Boolean, 
    /* xhrOrXdr */ org.scalajs.dom.raw.XMLHttpRequest, 
    scala.Unit
  ]
  type OnStatusChange = js.Function3[
    /* id */ scala.Double, 
    /* oldStatus */ java.lang.String, 
    /* newStatus */ java.lang.String, 
    scala.Unit
  ]
  type OnSubmit = js.Function2[
    /* id */ scala.Double, 
    /* name */ java.lang.String, 
    scala.Boolean | typingsJapgolly.fineUploader.coreMod.PromiseOptions | scala.Unit
  ]
  type OnSubmitDelete = js.Function1[
    /* id */ scala.Double, 
    typingsJapgolly.fineUploader.coreMod.PromiseOptions | scala.Unit
  ]
  type OnSubmitted = js.Function2[/* id */ scala.Double, /* name */ java.lang.String, scala.Unit]
  type OnTotalProgress = js.Function2[/* totalUploadedBytes */ scala.Double, /* totalBytes */ scala.Double, scala.Unit]
  type OnUpload = js.Function2[/* id */ scala.Double, /* name */ java.lang.String, scala.Unit]
  type OnUploadChunk = js.Function3[
    /* id */ scala.Double, 
    /* name */ java.lang.String, 
    /* chunkData */ typingsJapgolly.fineUploader.coreMod.ChunkData, 
    scala.Unit | js.Promise[js.Any]
  ]
  type OnUploadChunkSuccess = js.Function4[
    /* id */ scala.Double, 
    /* chunkData */ typingsJapgolly.fineUploader.coreMod.ChunkData, 
    /* responseJSON */ js.Any, 
    /* xhr */ org.scalajs.dom.raw.XMLHttpRequest, 
    scala.Unit
  ]
  type OnValidate = js.Function2[
    /* data */ typingsJapgolly.fineUploader.coreMod.BlobDataObject, 
    /* buttonContainer */ js.UndefOr[org.scalajs.dom.raw.HTMLElement], 
    typingsJapgolly.fineUploader.coreMod.PromiseOptions | scala.Unit
  ]
  type OnValidateBatch = js.Function2[
    /* fileOrBlobDataArray */ js.Array[typingsJapgolly.fineUploader.coreMod.BlobDataObject], 
    /* buttonContainer */ org.scalajs.dom.raw.HTMLElement, 
    typingsJapgolly.fineUploader.coreMod.PromiseOptions | scala.Unit
  ]
}
