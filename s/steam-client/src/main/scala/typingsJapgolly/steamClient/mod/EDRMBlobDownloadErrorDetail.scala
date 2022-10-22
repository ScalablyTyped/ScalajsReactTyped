package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDRMBlobDownloadErrorDetail extends StObject
@JSImport("steam-client", "EDRMBlobDownloadErrorDetail")
@js.native
object EDRMBlobDownloadErrorDetail extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadErrorDetail & Double] = js.native
  
  @js.native
  sealed trait AppIdMismatch
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 14 */ val AppIdMismatch: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.AppIdMismatch & Double = js.native
  
  @js.native
  sealed trait AppIdUnexpected
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 15 */ val AppIdUnexpected: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.AppIdUnexpected & Double = js.native
  
  @js.native
  sealed trait AppliedSignatureCorrupt
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 16 */ val AppliedSignatureCorrupt: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.AppliedSignatureCorrupt & Double = js.native
  
  @js.native
  sealed trait ApplyMergeGuid
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 12 */ val ApplyMergeGuid: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.ApplyMergeGuid & Double = js.native
  
  @js.native
  sealed trait ApplySignature
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 13 */ val ApplySignature: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.ApplySignature & Double = js.native
  
  @js.native
  sealed trait ApplyStrips
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 11 */ val ApplyStrips: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.ApplyStrips & Double = js.native
  
  @js.native
  sealed trait ApplyValveSignatureHeader
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 17 */ val ApplyValveSignatureHeader: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.ApplyValveSignatureHeader & Double = js.native
  
  @js.native
  sealed trait DownloadFailed
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 1 */ val DownloadFailed: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.DownloadFailed & Double = js.native
  
  @js.native
  sealed trait NextBase
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 131072 */ val NextBase: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.NextBase & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 0 */ val None: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.None & Double = js.native
  
  @js.native
  sealed trait OpenZip
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 3 */ val OpenZip: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.OpenZip & Double = js.native
  
  @js.native
  sealed trait PathManipulationError
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 19 */ val PathManipulationError: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.PathManipulationError & Double = js.native
  
  @js.native
  sealed trait ReadZipDirectory
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 4 */ val ReadZipDirectory: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.ReadZipDirectory & Double = js.native
  
  @js.native
  sealed trait TargetLocked
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 2 */ val TargetLocked: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.TargetLocked & Double = js.native
  
  @js.native
  sealed trait TargetLocked_Base
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 65536 */ val TargetLocked_Base: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.TargetLocked_Base & Double = js.native
  
  @js.native
  sealed trait TargetLocked_Max
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 131071 */ val TargetLocked_Max: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.TargetLocked_Max & Double = js.native
  
  @js.native
  sealed trait UnexpectedZipEntry
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 5 */ val UnexpectedZipEntry: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.UnexpectedZipEntry & Double = js.native
  
  @js.native
  sealed trait UnknownBlobType
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 7 */ val UnknownBlobType: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.UnknownBlobType & Double = js.native
  
  @js.native
  sealed trait UnzipFullFile
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 6 */ val UnzipFullFile: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipFullFile & Double = js.native
  
  @js.native
  sealed trait UnzipMergeGuid
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 9 */ val UnzipMergeGuid: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipMergeGuid & Double = js.native
  
  @js.native
  sealed trait UnzipSignature
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 10 */ val UnzipSignature: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipSignature & Double = js.native
  
  @js.native
  sealed trait UnzipStrips
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 8 */ val UnzipStrips: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipStrips & Double = js.native
  
  @js.native
  sealed trait UnzipValveSignatureHeader
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 18 */ val UnzipValveSignatureHeader: typingsJapgolly.steamClient.mod.EDRMBlobDownloadErrorDetail.UnzipValveSignatureHeader & Double = js.native
}
