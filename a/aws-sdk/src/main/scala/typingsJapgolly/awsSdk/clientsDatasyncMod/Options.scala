package typingsJapgolly.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written to). If you set Atime to BEST_EFFORT, DataSync attempts to preserve the original Atime attribute on all source files (that is, the version before the PREPARING phase). However, Atime's behavior is not fully standard across platforms, so DataSync can only do this on a best-effort basis.  Default value: BEST_EFFORT   BEST_EFFORT: Attempt to preserve the per-file Atime value (recommended).  NONE: Ignore Atime.  If Atime is set to BEST_EFFORT, Mtime must be set to PRESERVE.  If Atime is set to NONE, Mtime must also be NONE.  
    */
  var Atime: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.Atime] = js.undefined
  
  /**
    * A value that limits the bandwidth used by DataSync. For example, if you want DataSync to use a maximum of 1 MB, set this value to 1048576 (=1024*1024).
    */
  var BytesPerSecond: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.BytesPerSecond] = js.undefined
  
  /**
    * The POSIX group ID (GID) of the file's owners. For more information, see Metadata copied by DataSync. Default value: INT_VALUE. This preserves the integer value of the ID.  INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended).  NONE: Ignore UID and GID.
    */
  var Gid: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.Gid] = js.undefined
  
  /**
    * A value that determines the type of logs that DataSync publishes to a log stream in the Amazon CloudWatch log group that you provide. For more information about providing a log group for DataSync, see CloudWatchLogGroupArn. If set to OFF, no logs are published. BASIC publishes logs on errors for individual files transferred, and TRANSFER publishes logs for every file or object that is transferred and integrity checked.
    */
  var LogLevel: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.LogLevel] = js.undefined
  
  /**
    * A value that indicates the last time that a file was modified (that is, a file was written to) before the PREPARING phase. This option is required for cases when you need to run the same task more than one time.  Default Value: PRESERVE   PRESERVE: Preserve original Mtime (recommended)  NONE: Ignore Mtime.   If Mtime is set to PRESERVE, Atime must be set to BEST_EFFORT. If Mtime is set to NONE, Atime must also be set to NONE.  
    */
  var Mtime: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.Mtime] = js.undefined
  
  /**
    * Specifies whether object tags are maintained when transferring between object storage systems. If you want your DataSync task to ignore object tags, specify the NONE value. Default Value: PRESERVE 
    */
  var ObjectTags: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.ObjectTags] = js.undefined
  
  /**
    * A value that determines whether files at the destination should be overwritten or preserved when copying files. If set to NEVER a destination file will not be replaced by a source file, even if the destination file differs from the source file. If you modify files in the destination and you sync the files, you can use this value to protect against overwriting those changes.  Some storage classes have specific behaviors that can affect your S3 storage cost. For detailed information, see Considerations when working with Amazon S3 storage classes in DataSync  in the DataSync User Guide.
    */
  var OverwriteMode: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.OverwriteMode] = js.undefined
  
  /**
    * A value that determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file. For more information, see Metadata copied by DataSync. Default value: PRESERVE   PRESERVE: Preserve POSIX-style permissions (recommended).  NONE: Ignore permissions.   DataSync can preserve extant permissions of a source location. 
    */
  var PosixPermissions: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.PosixPermissions] = js.undefined
  
  /**
    * A value that specifies whether files in the destination that don't exist in the source file system should be preserved. This option can affect your storage cost. If your task deletes objects, you might incur minimum storage duration charges for certain storage classes. For detailed information, see Considerations when working with Amazon S3 storage classes in DataSync  in the DataSync User Guide. Default value: PRESERVE   PRESERVE: Ignore such destination files (recommended).   REMOVE: Delete destination files that aren’t present in the source.
    */
  var PreserveDeletedFiles: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.PreserveDeletedFiles] = js.undefined
  
  /**
    * A value that determines whether DataSync should preserve the metadata of block and character devices in the source file system, and re-create the files with that device name and metadata on the destination. DataSync does not copy the contents of such devices, only the name and metadata.   DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an end-of-file (EOF) marker.  Default value: NONE   NONE: Ignore special devices (recommended).   PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon EFS. 
    */
  var PreserveDevices: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.PreserveDevices] = js.undefined
  
  /**
    * A value that determines which components of the SMB security descriptor are copied from source to destination objects.  This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations, or between two Amazon FSx for Windows File Server locations. For more information about how DataSync handles metadata, see How DataSync Handles Metadata and Special Files.  Default value: OWNER_DACL   OWNER_DACL: For each copied object, DataSync copies the following metadata:   Object owner.   NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.   When choosing this option, DataSync does NOT copy the NTFS system access control lists (SACLs), which are used by administrators to log attempts to access a secured object.  OWNER_DACL_SACL: For each copied object, DataSync copies the following metadata:   Object owner.   NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.   NTFS system access control lists (SACLs), which are used by administrators to log attempts to access a secured object.   Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access your SMB location. For information about choosing a user that ensures sufficient permissions to files, folders, and metadata, see user.  NONE: None of the SMB security descriptor components are copied. Destination objects are owned by the user that was provided for accessing the destination location. DACLs and SACLs are set based on the destination server’s configuration. 
    */
  var SecurityDescriptorCopyFlags: js.UndefOr[SmbSecurityDescriptorCopyFlags] = js.undefined
  
  /**
    * A value that determines whether tasks should be queued before executing the tasks. If set to ENABLED, the tasks will be queued. The default is ENABLED. If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information, see Queueing task executions.
    */
  var TaskQueueing: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.TaskQueueing] = js.undefined
  
  /**
    * A value that determines whether DataSync transfers only the data and metadata that differ between the source and the destination location, or whether DataSync transfers all the content from the source, without comparing to the destination location.   CHANGED: DataSync copies only data or metadata that is new or different content from the source location to the destination location.  ALL: DataSync copies all source location content to the destination, without comparing to existing content on the destination.
    */
  var TransferMode: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.TransferMode] = js.undefined
  
  /**
    * The POSIX user ID (UID) of the file's owner. For more information, see Metadata copied by DataSync. Default value: INT_VALUE. This preserves the integer value of the ID.  INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended).  NONE: Ignore UID and GID. 
    */
  var Uid: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.Uid] = js.undefined
  
  /**
    * A value that determines whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred. For more information, see Configure task settings.  Default value: POINT_IN_TIME_CONSISTENT   ONLY_FILES_TRANSFERRED (recommended): Perform verification only on files that were transferred.   POINT_IN_TIME_CONSISTENT: Scan the entire source and entire destination at the end of the transfer to verify that source and destination are fully synchronized. This option isn't supported when transferring to S3 Glacier Flexible Retrieval or S3 Glacier Deep Archive storage classes.  NONE: No additional verification is done at the end of the transfer, but all data transmissions are integrity-checked with checksum verification during the transfer.
    */
  var VerifyMode: js.UndefOr[typingsJapgolly.awsSdk.clientsDatasyncMod.VerifyMode] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAtime(value: Atime): Self = StObject.set(x, "Atime", value.asInstanceOf[js.Any])
    
    inline def setAtimeUndefined: Self = StObject.set(x, "Atime", js.undefined)
    
    inline def setBytesPerSecond(value: BytesPerSecond): Self = StObject.set(x, "BytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setBytesPerSecondUndefined: Self = StObject.set(x, "BytesPerSecond", js.undefined)
    
    inline def setGid(value: Gid): Self = StObject.set(x, "Gid", value.asInstanceOf[js.Any])
    
    inline def setGidUndefined: Self = StObject.set(x, "Gid", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "LogLevel", js.undefined)
    
    inline def setMtime(value: Mtime): Self = StObject.set(x, "Mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeUndefined: Self = StObject.set(x, "Mtime", js.undefined)
    
    inline def setObjectTags(value: ObjectTags): Self = StObject.set(x, "ObjectTags", value.asInstanceOf[js.Any])
    
    inline def setObjectTagsUndefined: Self = StObject.set(x, "ObjectTags", js.undefined)
    
    inline def setOverwriteMode(value: OverwriteMode): Self = StObject.set(x, "OverwriteMode", value.asInstanceOf[js.Any])
    
    inline def setOverwriteModeUndefined: Self = StObject.set(x, "OverwriteMode", js.undefined)
    
    inline def setPosixPermissions(value: PosixPermissions): Self = StObject.set(x, "PosixPermissions", value.asInstanceOf[js.Any])
    
    inline def setPosixPermissionsUndefined: Self = StObject.set(x, "PosixPermissions", js.undefined)
    
    inline def setPreserveDeletedFiles(value: PreserveDeletedFiles): Self = StObject.set(x, "PreserveDeletedFiles", value.asInstanceOf[js.Any])
    
    inline def setPreserveDeletedFilesUndefined: Self = StObject.set(x, "PreserveDeletedFiles", js.undefined)
    
    inline def setPreserveDevices(value: PreserveDevices): Self = StObject.set(x, "PreserveDevices", value.asInstanceOf[js.Any])
    
    inline def setPreserveDevicesUndefined: Self = StObject.set(x, "PreserveDevices", js.undefined)
    
    inline def setSecurityDescriptorCopyFlags(value: SmbSecurityDescriptorCopyFlags): Self = StObject.set(x, "SecurityDescriptorCopyFlags", value.asInstanceOf[js.Any])
    
    inline def setSecurityDescriptorCopyFlagsUndefined: Self = StObject.set(x, "SecurityDescriptorCopyFlags", js.undefined)
    
    inline def setTaskQueueing(value: TaskQueueing): Self = StObject.set(x, "TaskQueueing", value.asInstanceOf[js.Any])
    
    inline def setTaskQueueingUndefined: Self = StObject.set(x, "TaskQueueing", js.undefined)
    
    inline def setTransferMode(value: TransferMode): Self = StObject.set(x, "TransferMode", value.asInstanceOf[js.Any])
    
    inline def setTransferModeUndefined: Self = StObject.set(x, "TransferMode", js.undefined)
    
    inline def setUid(value: Uid): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "Uid", js.undefined)
    
    inline def setVerifyMode(value: VerifyMode): Self = StObject.set(x, "VerifyMode", value.asInstanceOf[js.Any])
    
    inline def setVerifyModeUndefined: Self = StObject.set(x, "VerifyMode", js.undefined)
  }
}
