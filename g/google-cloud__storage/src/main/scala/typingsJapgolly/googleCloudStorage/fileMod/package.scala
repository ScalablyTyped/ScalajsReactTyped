package typingsJapgolly.googleCloudStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileMod {
  type CopyCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* file */ js.UndefOr[typingsJapgolly.googleCloudStorage.fileMod.File | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type CopyResponse = js.Tuple2[
    typingsJapgolly.googleCloudStorage.fileMod.File, 
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type CreateResumableUploadCallback = js.Function2[/* err */ js.Error | scala.Null, /* uri */ js.UndefOr[java.lang.String], scala.Unit]
  type CreateResumableUploadResponse = js.Array[java.lang.String]
  type DeleteFileCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type DeleteFileResponse = js.Array[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata]
  type DownloadCallback = js.Function2[
    /* err */ typingsJapgolly.googleCloudStorage.fileMod.RequestError | scala.Null, 
    /* contents */ typingsJapgolly.node.Buffer, 
    scala.Unit
  ]
  type DownloadResponse = js.Array[typingsJapgolly.node.Buffer]
  type FileExistsCallback = js.Function2[/* err */ js.Error | scala.Null, /* exists */ js.UndefOr[scala.Boolean], scala.Unit]
  type FileExistsResponse = js.Array[scala.Boolean]
  type GetExpirationDateCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* expirationDate */ js.UndefOr[js.Date | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetExpirationDateResponse = js.Array[js.Date]
  type GetFileCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* file */ js.UndefOr[typingsJapgolly.googleCloudStorage.fileMod.File], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetFileMetadataCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* metadata */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type GetFileMetadataResponse = js.Tuple2[
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata, 
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type GetFileResponse = js.Tuple2[
    typingsJapgolly.googleCloudStorage.fileMod.File, 
    typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata
  ]
  type GetSignedPolicyCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* policy */ js.UndefOr[typingsJapgolly.googleCloudStorage.fileMod.PolicyDocument], 
    scala.Unit
  ]
  type GetSignedPolicyResponse = js.Array[typingsJapgolly.googleCloudStorage.fileMod.PolicyDocument]
  type GetSignedUrlCallback = js.Function2[/* err */ js.Error | scala.Null, /* url */ js.UndefOr[java.lang.String], scala.Unit]
  type GetSignedUrlResponse = js.Array[java.lang.String]
  type IsPublicCallback = js.Function2[/* err */ js.Error | scala.Null, /* resp */ js.UndefOr[scala.Boolean], scala.Unit]
  type IsPublicResponse = js.Array[scala.Boolean]
  type MakeFilePrivateCallback = typingsJapgolly.googleCloudStorage.fileMod.SetFileMetadataCallback
  type MakeFilePrivateResponse = js.Array[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata]
  type MakeFilePublicCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type MakeFilePublicResponse = js.Array[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata]
  type MoveCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* destinationFile */ js.UndefOr[typingsJapgolly.googleCloudStorage.fileMod.File | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type MoveResponse = js.Array[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata]
  type RotateEncryptionKeyCallback = typingsJapgolly.googleCloudStorage.fileMod.CopyCallback
  type RotateEncryptionKeyOptions = java.lang.String | typingsJapgolly.node.Buffer | typingsJapgolly.googleCloudStorage.fileMod.EncryptionKeyOptions
  type RotateEncryptionKeyResponse = typingsJapgolly.googleCloudStorage.fileMod.CopyResponse
  type SaveCallback = js.Function1[/* err */ js.UndefOr[js.Error | scala.Null], scala.Unit]
  type SaveOptions = typingsJapgolly.googleCloudStorage.fileMod.CreateWriteStreamOptions
  type SetFileMetadataCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type SetFileMetadataResponse = js.Array[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata]
  type SetStorageClassCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata], 
    scala.Unit
  ]
  type SetStorageClassResponse = js.Array[typingsJapgolly.googleCloudCommon.serviceObjectMod.Metadata]
}
