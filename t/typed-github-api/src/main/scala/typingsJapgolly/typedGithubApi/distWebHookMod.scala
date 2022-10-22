package typingsJapgolly.typedGithubApi

import typingsJapgolly.express.mod.Router
import typingsJapgolly.typedGithubApi.distGithubRefMod.GitHubRef
import typingsJapgolly.typedGithubApi.distGithubRefMod.OptionsOrRef
import typingsJapgolly.typedGithubApi.distInterfacesIssueMod.Issue
import typingsJapgolly.typedGithubApi.distInterfacesUserMod.UserSummary
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.assigned
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.closed
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.demilestoned
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.edited
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.labeled
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.milestoned
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.opened
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.reopened
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.unassigned
import typingsJapgolly.typedGithubApi.typedGithubApiStrings.unlabeled
import typingsJapgolly.typescriptEventHandler.distFuncMod.Action
import typingsJapgolly.typescriptEventHandler.distFuncMod.AsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebHookMod {
  
  @JSImport("typed-github-api/dist/web-hook", "IssueWebHook")
  @js.native
  open class IssueWebHook protected ()
    extends WebHook[
          IssueWebHookData, 
          typingsJapgolly.typedGithubApi.distApiInterfacesWebHooksMod.IssueWebHookData
        ] {
    def this(options: OptionsOrRef) = this()
    def this(secret: String, options: OptionsOrRef) = this()
    def this(secret: Unit, options: OptionsOrRef) = this()
  }
  
  /* note: abstract class */ @JSImport("typed-github-api/dist/web-hook", "WebHook")
  @js.native
  open class WebHook[TData /* <: WebHookData */, TApiData /* <: typingsJapgolly.typedGithubApi.distApiInterfacesWebHooksMod.WebHookData */] protected () extends GitHubRef {
    def this(options: OptionsOrRef) = this()
    def this(secret: String, options: OptionsOrRef) = this()
    def this(secret: Unit, options: OptionsOrRef) = this()
    
    /* protected */ def convertData(request: WebHookData, data: TApiData): TData = js.native
    
    /* private */ val handlers: Any = js.native
    
    def registerAsyncHandler(handler: AsyncAction[TData]): Unit = js.native
    
    def registerHandler(handler: Action[TData]): Unit = js.native
    
    /* private */ def requestHandler(req: Any, res: Any): Any = js.native
    
    val router: Router = js.native
    
    /* private */ var secret: Any = js.native
  }
  
  trait IssueWebHookData
    extends StObject
       with WebHookData {
    
    @JSName("action")
    var action_IssueWebHookData: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
    
    var issue: Issue
  }
  object IssueWebHookData {
    
    inline def apply(
      action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
      event: String,
      id: String,
      issue: Issue,
      sender: UserSummary
    ): IssueWebHookData = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueWebHookData]
    }
    
    extension [Self <: IssueWebHookData](x: Self) {
      
      inline def setAction(
        value: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setIssue(value: Issue): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebHookData extends StObject {
    
    var action: String
    
    var event: String
    
    var id: String
    
    var sender: UserSummary
  }
  object WebHookData {
    
    inline def apply(action: String, event: String, id: String, sender: UserSummary): WebHookData = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebHookData]
    }
    
    extension [Self <: WebHookData](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSender(value: UserSummary): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    }
  }
}
