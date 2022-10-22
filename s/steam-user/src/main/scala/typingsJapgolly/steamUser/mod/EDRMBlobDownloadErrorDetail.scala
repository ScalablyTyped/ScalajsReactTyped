package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDRMBlobDownloadErrorDetail extends StObject
@JSImport("steam-user", "EDRMBlobDownloadErrorDetail")
@js.native
object EDRMBlobDownloadErrorDetail extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDRMBlobDownloadErrorDetail & Double] = js.native
  
  @js.native
  sealed trait AppIdMismatch
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 14 */ val AppIdMismatch: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.AppIdMismatch & Double = js.native
  
  @js.native
  sealed trait AppIdUnexpected
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 15 */ val AppIdUnexpected: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.AppIdUnexpected & Double = js.native
  
  @js.native
  sealed trait AppliedSignatureCorrupt
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 16 */ val AppliedSignatureCorrupt: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.AppliedSignatureCorrupt & Double = js.native
  
  @js.native
  sealed trait ApplyMergeGuid
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 12 */ val ApplyMergeGuid: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.ApplyMergeGuid & Double = js.native
  
  @js.native
  sealed trait ApplySignature
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 13 */ val ApplySignature: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.ApplySignature & Double = js.native
  
  @js.native
  sealed trait ApplyStrips
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 11 */ val ApplyStrips: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.ApplyStrips & Double = js.native
  
  @js.native
  sealed trait ApplyValveSignatureHeader
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 17 */ val ApplyValveSignatureHeader: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.ApplyValveSignatureHeader & Double = js.native
  
  @js.native
  sealed trait DownloadFailed
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 1 */ val DownloadFailed: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.DownloadFailed & Double = js.native
  
  @js.native
  sealed trait NextBase
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 131072 */ val NextBase: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.NextBase & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 0 */ val None: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.None & Double = js.native
  
  @js.native
  sealed trait OpenZip
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 3 */ val OpenZip: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.OpenZip & Double = js.native
  
  @js.native
  sealed trait PathManipulationError
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 19 */ val PathManipulationError: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.PathManipulationError & Double = js.native
  
  @js.native
  sealed trait ReadZipDirectory
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 4 */ val ReadZipDirectory: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.ReadZipDirectory & Double = js.native
  
  @js.native
  sealed trait TargetLocked
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 2 */ val TargetLocked: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.TargetLocked & Double = js.native
  
  @js.native
  sealed trait TargetLocked_Base
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 65536 */ val TargetLocked_Base: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.TargetLocked_Base & Double = js.native
  
  @js.native
  sealed trait TargetLocked_Max
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 131071 */ val TargetLocked_Max: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.TargetLocked_Max & Double = js.native
  
  @js.native
  sealed trait UnexpectedZipEntry
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 5 */ val UnexpectedZipEntry: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.UnexpectedZipEntry & Double = js.native
  
  @js.native
  sealed trait UnknownBlobType
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 7 */ val UnknownBlobType: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.UnknownBlobType & Double = js.native
  
  @js.native
  sealed trait UnzipFullFile
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 6 */ val UnzipFullFile: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.UnzipFullFile & Double = js.native
  
  @js.native
  sealed trait UnzipMergeGuid
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 9 */ val UnzipMergeGuid: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.UnzipMergeGuid & Double = js.native
  
  @js.native
  sealed trait UnzipSignature
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 10 */ val UnzipSignature: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.UnzipSignature & Double = js.native
  
  @js.native
  sealed trait UnzipStrips
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 8 */ val UnzipStrips: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.UnzipStrips & Double = js.native
  
  @js.native
  sealed trait UnzipValveSignatureHeader
    extends StObject
       with EDRMBlobDownloadErrorDetail
  /* 18 */ val UnzipValveSignatureHeader: typingsJapgolly.steamUser.mod.EDRMBlobDownloadErrorDetail.UnzipValveSignatureHeader & Double = js.native
}
