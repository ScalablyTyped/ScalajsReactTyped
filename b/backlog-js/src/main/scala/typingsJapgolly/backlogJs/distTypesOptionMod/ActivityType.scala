package typingsJapgolly.backlogJs.distTypesOptionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActivityType extends StObject
@JSImport("backlog-js/dist/types/option", "ActivityType")
@js.native
object ActivityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActivityType & Double] = js.native
  
  @js.native
  sealed trait FileAdded
    extends StObject
       with ActivityType
  /* 8 */ val FileAdded: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.FileAdded & Double = js.native
  
  @js.native
  sealed trait FileDeleted
    extends StObject
       with ActivityType
  /* 10 */ val FileDeleted: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.FileDeleted & Double = js.native
  
  @js.native
  sealed trait FileUpdated
    extends StObject
       with ActivityType
  /* 9 */ val FileUpdated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.FileUpdated & Double = js.native
  
  @js.native
  sealed trait GitPushed
    extends StObject
       with ActivityType
  /* 12 */ val GitPushed: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.GitPushed & Double = js.native
  
  @js.native
  sealed trait GitRepositoryCreated
    extends StObject
       with ActivityType
  /* 13 */ val GitRepositoryCreated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.GitRepositoryCreated & Double = js.native
  
  @js.native
  sealed trait IssueCommented
    extends StObject
       with ActivityType
  /* 3 */ val IssueCommented: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.IssueCommented & Double = js.native
  
  @js.native
  sealed trait IssueCreated
    extends StObject
       with ActivityType
  /* 1 */ val IssueCreated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.IssueCreated & Double = js.native
  
  @js.native
  sealed trait IssueDeleted
    extends StObject
       with ActivityType
  /* 4 */ val IssueDeleted: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.IssueDeleted & Double = js.native
  
  @js.native
  sealed trait IssueMultiUpdated
    extends StObject
       with ActivityType
  /* 14 */ val IssueMultiUpdated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.IssueMultiUpdated & Double = js.native
  
  @js.native
  sealed trait IssueUpdated
    extends StObject
       with ActivityType
  /* 2 */ val IssueUpdated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.IssueUpdated & Double = js.native
  
  @js.native
  sealed trait NotifyAdded
    extends StObject
       with ActivityType
  /* 17 */ val NotifyAdded: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.NotifyAdded & Double = js.native
  
  @js.native
  sealed trait ProjectUserAdded
    extends StObject
       with ActivityType
  /* 15 */ val ProjectUserAdded: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.ProjectUserAdded & Double = js.native
  
  @js.native
  sealed trait ProjectUserRemoved
    extends StObject
       with ActivityType
  /* 16 */ val ProjectUserRemoved: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.ProjectUserRemoved & Double = js.native
  
  @js.native
  sealed trait PullRequestAdded
    extends StObject
       with ActivityType
  /* 18 */ val PullRequestAdded: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.PullRequestAdded & Double = js.native
  
  @js.native
  sealed trait PullRequestCommented
    extends StObject
       with ActivityType
  /* 20 */ val PullRequestCommented: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.PullRequestCommented & Double = js.native
  
  @js.native
  sealed trait PullRequestMerged
    extends StObject
       with ActivityType
  /* 21 */ val PullRequestMerged: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.PullRequestMerged & Double = js.native
  
  @js.native
  sealed trait PullRequestUpdated
    extends StObject
       with ActivityType
  /* 19 */ val PullRequestUpdated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.PullRequestUpdated & Double = js.native
  
  @js.native
  sealed trait SvnCommitted
    extends StObject
       with ActivityType
  /* 11 */ val SvnCommitted: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.SvnCommitted & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with ActivityType
  /* -1 */ val Undefined: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.Undefined & Double = js.native
  
  @js.native
  sealed trait WikiCreated
    extends StObject
       with ActivityType
  /* 5 */ val WikiCreated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.WikiCreated & Double = js.native
  
  @js.native
  sealed trait WikiDeleted
    extends StObject
       with ActivityType
  /* 7 */ val WikiDeleted: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.WikiDeleted & Double = js.native
  
  @js.native
  sealed trait WikiUpdated
    extends StObject
       with ActivityType
  /* 6 */ val WikiUpdated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.WikiUpdated & Double = js.native
}
