package typingsJapgolly.backlogJs

import org.scalajs.dom.Response
import typingsJapgolly.backlogJs.anon.AccessToken
import typingsJapgolly.backlogJs.anon.Errors
import typingsJapgolly.backlogJs.distTypesBacklogMod.default
import typingsJapgolly.backlogJs.distTypesErrorMod.BacklogErrorNameType
import typingsJapgolly.backlogJs.distTypesOptionMod.OAuth2.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("backlog-js", "Backlog")
  @js.native
  open class Backlog protected () extends default {
    def this(configure: AccessToken) = this()
  }
  
  object Error {
    
    @JSImport("backlog-js", "Error.BacklogApiError")
    @js.native
    open class BacklogApiError protected ()
      extends typingsJapgolly.backlogJs.distTypesErrorMod.BacklogApiError {
      def this(response: Response) = this()
      def this(response: Response, body: Errors) = this()
    }
    
    @JSImport("backlog-js", "Error.BacklogAuthError")
    @js.native
    open class BacklogAuthError protected ()
      extends typingsJapgolly.backlogJs.distTypesErrorMod.BacklogAuthError {
      def this(response: Response) = this()
      def this(response: Response, body: Errors) = this()
    }
    
    @JSImport("backlog-js", "Error.BacklogError")
    @js.native
    open class BacklogError protected ()
      extends typingsJapgolly.backlogJs.distTypesErrorMod.BacklogError {
      def this(name: BacklogErrorNameType, response: Response) = this()
      def this(name: BacklogErrorNameType, response: Response, body: Errors) = this()
    }
    
    @JSImport("backlog-js", "Error.UnexpectedError")
    @js.native
    open class UnexpectedError protected ()
      extends typingsJapgolly.backlogJs.distTypesErrorMod.UnexpectedError {
      def this(response: Response) = this()
    }
  }
  
  @JSImport("backlog-js", "OAuth2")
  @js.native
  open class OAuth2 protected ()
    extends typingsJapgolly.backlogJs.distTypesOauth2Mod.default {
    def this(credentials: Credentials) = this()
    def this(credentials: Credentials, timeout: Double) = this()
  }
  
  object Option {
    
    @JSImport("backlog-js", "Option.ActivityType")
    @js.native
    object ActivityType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType & Double] = js.native
      
      /* 8 */ val FileAdded: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.FileAdded & Double = js.native
      
      /* 10 */ val FileDeleted: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.FileDeleted & Double = js.native
      
      /* 9 */ val FileUpdated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.FileUpdated & Double = js.native
      
      /* 12 */ val GitPushed: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.GitPushed & Double = js.native
      
      /* 13 */ val GitRepositoryCreated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.GitRepositoryCreated & Double = js.native
      
      /* 3 */ val IssueCommented: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.IssueCommented & Double = js.native
      
      /* 1 */ val IssueCreated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.IssueCreated & Double = js.native
      
      /* 4 */ val IssueDeleted: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.IssueDeleted & Double = js.native
      
      /* 14 */ val IssueMultiUpdated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.IssueMultiUpdated & Double = js.native
      
      /* 2 */ val IssueUpdated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.IssueUpdated & Double = js.native
      
      /* 17 */ val NotifyAdded: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.NotifyAdded & Double = js.native
      
      /* 15 */ val ProjectUserAdded: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.ProjectUserAdded & Double = js.native
      
      /* 16 */ val ProjectUserRemoved: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.ProjectUserRemoved & Double = js.native
      
      /* 18 */ val PullRequestAdded: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.PullRequestAdded & Double = js.native
      
      /* 20 */ val PullRequestCommented: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.PullRequestCommented & Double = js.native
      
      /* 21 */ val PullRequestMerged: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.PullRequestMerged & Double = js.native
      
      /* 19 */ val PullRequestUpdated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.PullRequestUpdated & Double = js.native
      
      /* 11 */ val SvnCommitted: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.SvnCommitted & Double = js.native
      
      /* -1 */ val Undefined: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.Undefined & Double = js.native
      
      /* 5 */ val WikiCreated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.WikiCreated & Double = js.native
      
      /* 7 */ val WikiDeleted: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.WikiDeleted & Double = js.native
      
      /* 6 */ val WikiUpdated: typingsJapgolly.backlogJs.distTypesOptionMod.ActivityType.WikiUpdated & Double = js.native
    }
    
    object Issue {
      
      @JSImport("backlog-js", "Option.Issue.ParentChildType")
      @js.native
      object ParentChildType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.backlogJs.distTypesOptionMod.Issue.ParentChildType & Double] = js.native
        
        /* 0 */ val All: typingsJapgolly.backlogJs.distTypesOptionMod.Issue.ParentChildType.All & Double = js.native
        
        /* 2 */ val Child: typingsJapgolly.backlogJs.distTypesOptionMod.Issue.ParentChildType.Child & Double = js.native
        
        /* 1 */ val NotChild: typingsJapgolly.backlogJs.distTypesOptionMod.Issue.ParentChildType.NotChild & Double = js.native
        
        /* 3 */ val NotChildNotParent: typingsJapgolly.backlogJs.distTypesOptionMod.Issue.ParentChildType.NotChildNotParent & Double = js.native
        
        /* 4 */ val Parent: typingsJapgolly.backlogJs.distTypesOptionMod.Issue.ParentChildType.Parent & Double = js.native
      }
    }
    
    object Project {
      
      @JSImport("backlog-js", "Option.Project.FieldType")
      @js.native
      object FieldType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.backlogJs.distTypesOptionMod.Project.FieldType & Double] = js.native
        
        /* 7 */ val CheckBox: typingsJapgolly.backlogJs.distTypesOptionMod.Project.FieldType.CheckBox & Double = js.native
        
        /* 4 */ val Date: typingsJapgolly.backlogJs.distTypesOptionMod.Project.FieldType.Date & Double = js.native
        
        /* 6 */ val MultipleList: typingsJapgolly.backlogJs.distTypesOptionMod.Project.FieldType.MultipleList & Double = js.native
        
        /* 3 */ val Numeric: typingsJapgolly.backlogJs.distTypesOptionMod.Project.FieldType.Numeric & Double = js.native
        
        /* 8 */ val Radio: typingsJapgolly.backlogJs.distTypesOptionMod.Project.FieldType.Radio & Double = js.native
        
        /* 5 */ val SingleList: typingsJapgolly.backlogJs.distTypesOptionMod.Project.FieldType.SingleList & Double = js.native
        
        /* 1 */ val Text: typingsJapgolly.backlogJs.distTypesOptionMod.Project.FieldType.Text & Double = js.native
        
        /* 2 */ val TextArea: typingsJapgolly.backlogJs.distTypesOptionMod.Project.FieldType.TextArea & Double = js.native
      }
    }
    
    object User {
      
      @JSImport("backlog-js", "Option.User.RoleType")
      @js.native
      object RoleType extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typingsJapgolly.backlogJs.distTypesOptionMod.User.RoleType & Double] = js.native
        
        /* 1 */ val Admin: typingsJapgolly.backlogJs.distTypesOptionMod.User.RoleType.Admin & Double = js.native
        
        /* 5 */ val GuestReporter: typingsJapgolly.backlogJs.distTypesOptionMod.User.RoleType.GuestReporter & Double = js.native
        
        /* 6 */ val GuestViewer: typingsJapgolly.backlogJs.distTypesOptionMod.User.RoleType.GuestViewer & Double = js.native
        
        /* 3 */ val Reporter: typingsJapgolly.backlogJs.distTypesOptionMod.User.RoleType.Reporter & Double = js.native
        
        /* 2 */ val User: typingsJapgolly.backlogJs.distTypesOptionMod.User.RoleType.User & Double = js.native
        
        /* 4 */ val Viewer: typingsJapgolly.backlogJs.distTypesOptionMod.User.RoleType.Viewer & Double = js.native
      }
    }
  }
}
