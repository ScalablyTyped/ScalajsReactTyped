package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFExportContentFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IArchiveOldVersionsJob extends StObject {
  
  var AtLeastNDaysOlder: Double
  
  var AtLeastNVersionsOlder: Double
  
  var CheckedInBefore: ITimestamp
  
  def Clone(): IArchiveOldVersionsJob
  
  var Flags: MFExportContentFlag
  
  var Impersonation: IImpersonation
  
  var MarkedForArchiving: Boolean
  
  var NoVersionTag: Boolean
  
  var TargetLocation: String
  
  var UseAtLeastNDaysOlder: Boolean
  
  var UseAtLeastNVersionsOlder: Boolean
  
  var UseCheckedInBefore: Boolean
}
object IArchiveOldVersionsJob {
  
  inline def apply(
    AtLeastNDaysOlder: Double,
    AtLeastNVersionsOlder: Double,
    CheckedInBefore: ITimestamp,
    Clone: CallbackTo[IArchiveOldVersionsJob],
    Flags: MFExportContentFlag,
    Impersonation: IImpersonation,
    MarkedForArchiving: Boolean,
    NoVersionTag: Boolean,
    TargetLocation: String,
    UseAtLeastNDaysOlder: Boolean,
    UseAtLeastNVersionsOlder: Boolean,
    UseCheckedInBefore: Boolean
  ): IArchiveOldVersionsJob = {
    val __obj = js.Dynamic.literal(AtLeastNDaysOlder = AtLeastNDaysOlder.asInstanceOf[js.Any], AtLeastNVersionsOlder = AtLeastNVersionsOlder.asInstanceOf[js.Any], CheckedInBefore = CheckedInBefore.asInstanceOf[js.Any], Clone = Clone.toJsFn, Flags = Flags.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], MarkedForArchiving = MarkedForArchiving.asInstanceOf[js.Any], NoVersionTag = NoVersionTag.asInstanceOf[js.Any], TargetLocation = TargetLocation.asInstanceOf[js.Any], UseAtLeastNDaysOlder = UseAtLeastNDaysOlder.asInstanceOf[js.Any], UseAtLeastNVersionsOlder = UseAtLeastNVersionsOlder.asInstanceOf[js.Any], UseCheckedInBefore = UseCheckedInBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArchiveOldVersionsJob]
  }
  
  extension [Self <: IArchiveOldVersionsJob](x: Self) {
    
    inline def setAtLeastNDaysOlder(value: Double): Self = StObject.set(x, "AtLeastNDaysOlder", value.asInstanceOf[js.Any])
    
    inline def setAtLeastNVersionsOlder(value: Double): Self = StObject.set(x, "AtLeastNVersionsOlder", value.asInstanceOf[js.Any])
    
    inline def setCheckedInBefore(value: ITimestamp): Self = StObject.set(x, "CheckedInBefore", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IArchiveOldVersionsJob]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setFlags(value: MFExportContentFlag): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setImpersonation(value: IImpersonation): Self = StObject.set(x, "Impersonation", value.asInstanceOf[js.Any])
    
    inline def setMarkedForArchiving(value: Boolean): Self = StObject.set(x, "MarkedForArchiving", value.asInstanceOf[js.Any])
    
    inline def setNoVersionTag(value: Boolean): Self = StObject.set(x, "NoVersionTag", value.asInstanceOf[js.Any])
    
    inline def setTargetLocation(value: String): Self = StObject.set(x, "TargetLocation", value.asInstanceOf[js.Any])
    
    inline def setUseAtLeastNDaysOlder(value: Boolean): Self = StObject.set(x, "UseAtLeastNDaysOlder", value.asInstanceOf[js.Any])
    
    inline def setUseAtLeastNVersionsOlder(value: Boolean): Self = StObject.set(x, "UseAtLeastNVersionsOlder", value.asInstanceOf[js.Any])
    
    inline def setUseCheckedInBefore(value: Boolean): Self = StObject.set(x, "UseCheckedInBefore", value.asInstanceOf[js.Any])
  }
}
