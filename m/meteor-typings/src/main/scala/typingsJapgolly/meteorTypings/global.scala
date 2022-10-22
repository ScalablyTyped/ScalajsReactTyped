package typingsJapgolly.meteorTypings

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Console
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import typingsJapgolly.meteorTypings.Blaze.EventsMap
import typingsJapgolly.meteorTypings.Blaze.HelpersMap
import typingsJapgolly.meteorTypings.Blaze.TemplateInstance
import typingsJapgolly.meteorTypings.Blaze.TemplateInstanceStatic
import typingsJapgolly.meteorTypings.Blaze.View
import typingsJapgolly.meteorTypings.Blaze.ViewStatic
import typingsJapgolly.meteorTypings.DDP.DDPStatic
import typingsJapgolly.meteorTypings.DDP.DDPStatus
import typingsJapgolly.meteorTypings.DDPRateLimiter.Matcher
import typingsJapgolly.meteorTypings.HTTP.HTTPRequest
import typingsJapgolly.meteorTypings.HTTP.HTTPResponse
import typingsJapgolly.meteorTypings.Meteor.Connection
import typingsJapgolly.meteorTypings.Meteor.Error
import typingsJapgolly.meteorTypings.Meteor.ErrorStatic
import typingsJapgolly.meteorTypings.Meteor.LocalStorage
import typingsJapgolly.meteorTypings.Meteor.LoginWithExternalServiceOptions
import typingsJapgolly.meteorTypings.Meteor.Settings
import typingsJapgolly.meteorTypings.Meteor.SubscriptionHandle
import typingsJapgolly.meteorTypings.Meteor.User
import typingsJapgolly.meteorTypings.Mongo.Collection
import typingsJapgolly.meteorTypings.Mongo.CollectionStatic
import typingsJapgolly.meteorTypings.Mongo.Cursor
import typingsJapgolly.meteorTypings.Mongo.CursorStatic
import typingsJapgolly.meteorTypings.Mongo.ObjectID
import typingsJapgolly.meteorTypings.Mongo.ObjectIDStatic
import typingsJapgolly.meteorTypings.Tracker.Computation
import typingsJapgolly.meteorTypings.Tracker.Dependency
import typingsJapgolly.meteorTypings.Tracker.DependencyStatic
import typingsJapgolly.meteorTypings.anon.Auth
import typingsJapgolly.meteorTypings.anon.Author
import typingsJapgolly.meteorTypings.anon.Bcc
import typingsJapgolly.meteorTypings.anon.Canonical
import typingsJapgolly.meteorTypings.anon.Cwd
import typingsJapgolly.meteorTypings.anon.DebugOnly
import typingsJapgolly.meteorTypings.anon.Email
import typingsJapgolly.meteorTypings.anon.ForbidClientAccountCreation
import typingsJapgolly.meteorTypings.anon.ForceApprovalPrompt
import typingsJapgolly.meteorTypings.anon.KeyOrderSensitive
import typingsJapgolly.meteorTypings.anon.LaunchExternal
import typingsJapgolly.meteorTypings.anon.LoginStyle
import typingsJapgolly.meteorTypings.anon.Logout
import typingsJapgolly.meteorTypings.anon.Name
import typingsJapgolly.meteorTypings.anon.OnError
import typingsJapgolly.meteorTypings.anon.OnResultReceived
import typingsJapgolly.meteorTypings.anon.ReplaceLocalhost
import typingsJapgolly.meteorTypings.anon.Stop
import typingsJapgolly.meteorTypings.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Accounts {
    
    @JSGlobal("Accounts")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addEmail(userId: String, newEmail: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEmail")(userId.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def addEmail(userId: String, newEmail: String, verified: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEmail")(userId.asInstanceOf[js.Any], newEmail.asInstanceOf[js.Any], verified.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def changePassword(oldPassword: String, newPassword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changePassword")(oldPassword.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def changePassword(oldPassword: String, newPassword: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changePassword")(oldPassword.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def config(options: ForbidClientAccountCreation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def createUser(options: Email): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createUser")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def createUser(options: Email, callback: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createUser")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("Accounts.emailTemplates")
    @js.native
    def emailTemplates: EmailTemplates = js.native
    inline def emailTemplates_=(x: EmailTemplates): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emailTemplates")(x.asInstanceOf[js.Any])
    
    inline def findUserByEmail(email: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("findUserByEmail")(email.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def findUserByUsername(username: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("findUserByUsername")(username.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def forgotPassword(options: `0`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forgotPassword")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def forgotPassword(options: `0`, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forgotPassword")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loggingIn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loggingIn")().asInstanceOf[Boolean]
    
    inline def loginServicesConfigured(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loginServicesConfigured")().asInstanceOf[Boolean]
    
    inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
    inline def logout(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def logoutOtherClients(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")().asInstanceOf[Unit]
    inline def logoutOtherClients(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def makeClientLoggedOut(): Boolean | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClientLoggedOut")().asInstanceOf[Boolean | Unit]
    
    inline def onCreateUser(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCreateUser")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onEmailVerificationLink(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEmailVerificationLink")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onEnrollmentLink(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onEnrollmentLink")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onLogin(func: js.Function): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("onLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Stop]
    
    inline def onLoginFailure(func: js.Function): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("onLoginFailure")(func.asInstanceOf[js.Any]).asInstanceOf[Stop]
    
    inline def onLogout(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLogout")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def onLogout(func: js.Function2[/* user */ User, /* connection */ Connection, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onLogout")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onPageLoadLogin(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onPageLoadLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onResetPasswordLink(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onResetPasswordLink")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def removeEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def resetPassword(token: String, newPassword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetPassword")(token.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def resetPassword(token: String, newPassword: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetPassword")(token.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendEnrollmentEmail(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendEnrollmentEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEnrollmentEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendResetPasswordEmail(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendResetPasswordEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendResetPasswordEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sendVerificationEmail(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def sendVerificationEmail(userId: String, email: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendVerificationEmail")(userId.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setPassword(userId: String, newPassword: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")(userId.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setPassword(userId: String, newPassword: String, options: Logout): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPassword")(userId.asInstanceOf[js.Any], newPassword.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setUsername(userId: String, newUsername: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUsername")(userId.asInstanceOf[js.Any], newUsername.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object ui {
      
      @JSGlobal("Accounts.ui")
      @js.native
      val ^ : js.Any = js.native
      
      inline def config(options: ForceApprovalPrompt): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSGlobal("Accounts.urls")
    @js.native
    def urls: URLS = js.native
    inline def urls_=(x: URLS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urls")(x.asInstanceOf[js.Any])
    
    inline def user(): User = ^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[User]
    
    inline def userId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("userId")().asInstanceOf[String]
    
    inline def validateLoginAttempt(func: js.Function): Stop = ^.asInstanceOf[js.Dynamic].applyDynamic("validateLoginAttempt")(func.asInstanceOf[js.Any]).asInstanceOf[Stop]
    
    inline def validateNewUser(func: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateNewUser")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def verifyEmail(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyEmail")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def verifyEmail(token: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyEmail")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object App {
    
    @JSGlobal("App")
    @js.native
    val ^ : js.Any = js.native
    
    inline def accessRule(pattern: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accessRule")(pattern.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def accessRule(pattern: String, options: LaunchExternal): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("accessRule")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def configurePlugin(id: String, config: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configurePlugin")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def icons(icons: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("icons")(icons.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def info(options: Author): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def launchScreens(launchScreens: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("launchScreens")(launchScreens.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setPreference(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPreference")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setPreference(name: String, value: String, platform: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPreference")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object Assets {
    
    @JSGlobal("Assets")
    @js.native
    val ^ : js.Any = js.native
    
    inline def absoluteFilePath(assetPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteFilePath")(assetPath.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getBinary(assetPath: String): EJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("getBinary")(assetPath.asInstanceOf[js.Any]).asInstanceOf[EJSON]
    inline def getBinary(assetPath: String, asyncCallback: js.Function): EJSON = (^.asInstanceOf[js.Dynamic].applyDynamic("getBinary")(assetPath.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[EJSON]
    
    inline def getText(assetPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(assetPath.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getText(assetPath: String, asyncCallback: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getText")(assetPath.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object Blaze {
    
    @JSGlobal("Blaze")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Each(argFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Each")(argFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def Each(argFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Each")(argFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def If(conditionFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("If")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def If(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("If")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def Let(bindings: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Let")(bindings.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    @JSGlobal("Blaze.Template")
    @js.native
    def Template: typingsJapgolly.meteorTypings.Blaze.TemplateStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Blaze.Template")
    @js.native
    open class TemplateCls ()
      extends StObject
         with typingsJapgolly.meteorTypings.Blaze.Template {
      def this(viewName: String) = this()
      def this(viewName: String, renderFunction: js.Function) = this()
      def this(viewName: Unit, renderFunction: js.Function) = this()
      
      /* CompleteClass */
      @JSName("$")
      var $: Any = js.native
      
      /* CompleteClass */
      override def constructView(): View = js.native
      
      /* CompleteClass */
      var created: js.Function = js.native
      
      /* CompleteClass */
      var destroyed: js.Function = js.native
      
      /* CompleteClass */
      override def events(eventsMap: EventsMap): Unit = js.native
      
      /* CompleteClass */
      override def find(selector: String): HTMLElement = js.native
      
      /* CompleteClass */
      override def findAll(selector: String): js.Array[HTMLElement] = js.native
      
      /* CompleteClass */
      var head: typingsJapgolly.meteorTypings.Blaze.Template = js.native
      
      /* CompleteClass */
      override def helpers(helpersMap: HelpersMap): Unit = js.native
      
      /* CompleteClass */
      override def onCreated(cb: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def onDestroyed(cb: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def onRendered(cb: js.Function): Unit = js.native
      
      /* CompleteClass */
      var renderFunction: js.Function = js.native
      
      /* CompleteClass */
      var rendered: js.Function = js.native
      
      /* CompleteClass */
      var viewName: String = js.native
    }
    
    @JSGlobal("Blaze.TemplateInstance")
    @js.native
    def TemplateInstance: TemplateInstanceStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Blaze.TemplateInstance")
    @js.native
    open class TemplateInstanceCls protected ()
      extends StObject
         with TemplateInstance {
      def this(view: View) = this()
      
      /* CompleteClass */
      @JSName("$")
      override def $(selector: String): Any = js.native
      
      /* CompleteClass */
      override def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
      
      /* CompleteClass */
      var data: js.Object = js.native
      
      /* CompleteClass */
      override def find(selector: String): HTMLElement = js.native
      
      /* CompleteClass */
      override def findAll(selector: String): js.Array[HTMLElement] = js.native
      
      /* CompleteClass */
      var firstNode: js.Object = js.native
      
      /* CompleteClass */
      var lastNode: js.Object = js.native
      
      /* CompleteClass */
      override def subscribe(name: String, args: Any*): SubscriptionHandle = js.native
      
      /* CompleteClass */
      override def subscriptionsReady(): Boolean = js.native
      
      /* CompleteClass */
      var view: js.Object = js.native
    }
    
    inline def TemplateInstance_=(x: TemplateInstanceStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TemplateInstance")(x.asInstanceOf[js.Any])
    
    inline def Template_=(x: typingsJapgolly.meteorTypings.Blaze.TemplateStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Template")(x.asInstanceOf[js.Any])
    
    inline def Unless(conditionFunc: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Unless")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def Unless(conditionFunc: js.Function, contentFunc: js.Function, elseFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("Unless")(conditionFunc.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any], elseFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    @JSGlobal("Blaze.View")
    @js.native
    def View: ViewStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Blaze.View")
    @js.native
    open class ViewCls ()
      extends StObject
         with View {
      def this(name: String) = this()
      def this(name: String, renderFunction: js.Function) = this()
      def this(name: Unit, renderFunction: js.Function) = this()
      
      /* CompleteClass */
      override def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = js.native
      
      /* CompleteClass */
      override def firstNode(): Node = js.native
      
      /* CompleteClass */
      var isCreated: Boolean = js.native
      
      /* CompleteClass */
      var isDestroyed: Boolean = js.native
      
      /* CompleteClass */
      var isRendered: Boolean = js.native
      
      /* CompleteClass */
      override def lastNode(): Node = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override def onViewCreated(func: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def onViewDestroyed(func: js.Function): Unit = js.native
      
      /* CompleteClass */
      override def onViewReady(func: js.Function): Unit = js.native
      
      /* CompleteClass */
      var parentView: View = js.native
      
      /* CompleteClass */
      var renderCount: Double = js.native
      
      /* CompleteClass */
      var template: typingsJapgolly.meteorTypings.Blaze.Template = js.native
      
      /* CompleteClass */
      override def templateInstance(): TemplateInstance = js.native
    }
    
    inline def View_=(x: ViewStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    inline def With(data: js.Function, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("With")(data.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def With(data: js.Object, contentFunc: js.Function): View = (^.asInstanceOf[js.Dynamic].applyDynamic("With")(data.asInstanceOf[js.Any], contentFunc.asInstanceOf[js.Any])).asInstanceOf[View]
    
    @JSGlobal("Blaze.currentView")
    @js.native
    def currentView: View = js.native
    inline def currentView_=(x: View): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentView")(x.asInstanceOf[js.Any])
    
    inline def getData(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")().asInstanceOf[js.Object]
    inline def getData(elementOrView: HTMLElement): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(elementOrView.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    inline def getData(elementOrView: View): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(elementOrView.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def getView(): View = ^.asInstanceOf[js.Dynamic].applyDynamic("getView")().asInstanceOf[View]
    inline def getView(element: HTMLElement): View = ^.asInstanceOf[js.Dynamic].applyDynamic("getView")(element.asInstanceOf[js.Any]).asInstanceOf[View]
    
    inline def isTemplate(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def remove(renderedView: View): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(renderedView.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def render(templateOrView: typingsJapgolly.meteorTypings.Blaze.Template, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: typingsJapgolly.meteorTypings.Blaze.Template, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(
      templateOrView: typingsJapgolly.meteorTypings.Blaze.Template,
      parentNode: Node,
      nextNode: Node,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(
      templateOrView: typingsJapgolly.meteorTypings.Blaze.Template,
      parentNode: Node,
      nextNode: Unit,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def render(templateOrView: View, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(templateOrView.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def renderWithData(templateOrView: typingsJapgolly.meteorTypings.Blaze.Template, data: js.Function, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: typingsJapgolly.meteorTypings.Blaze.Template,
      data: js.Function,
      parentNode: Node,
      nextNode: Node
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: typingsJapgolly.meteorTypings.Blaze.Template,
      data: js.Function,
      parentNode: Node,
      nextNode: Node,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: typingsJapgolly.meteorTypings.Blaze.Template,
      data: js.Function,
      parentNode: Node,
      nextNode: Unit,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: typingsJapgolly.meteorTypings.Blaze.Template, data: js.Object, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: typingsJapgolly.meteorTypings.Blaze.Template,
      data: js.Object,
      parentNode: Node,
      nextNode: Node
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: typingsJapgolly.meteorTypings.Blaze.Template,
      data: js.Object,
      parentNode: Node,
      nextNode: Node,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(
      templateOrView: typingsJapgolly.meteorTypings.Blaze.Template,
      data: js.Object,
      parentNode: Node,
      nextNode: Unit,
      parentView: View
    ): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Function, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Node, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    inline def renderWithData(templateOrView: View, data: js.Object, parentNode: Node, nextNode: Unit, parentView: View): View = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any], parentNode.asInstanceOf[js.Any], nextNode.asInstanceOf[js.Any], parentView.asInstanceOf[js.Any])).asInstanceOf[View]
    
    inline def toHTML(templateOrView: typingsJapgolly.meteorTypings.Blaze.Template): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(templateOrView.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toHTML(templateOrView: View): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHTML")(templateOrView.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toHTMLWithData(templateOrView: typingsJapgolly.meteorTypings.Blaze.Template, data: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toHTMLWithData(templateOrView: typingsJapgolly.meteorTypings.Blaze.Template, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toHTMLWithData(templateOrView: View, data: js.Function): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toHTMLWithData(templateOrView: View, data: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHTMLWithData")(templateOrView.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  object BrowserPolicy {
    
    object content {
      
      @JSGlobal("BrowserPolicy.content")
      @js.native
      val ^ : js.Any = js.native
      
      inline def allowAllContentDataUrl(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAllContentDataUrl")().asInstanceOf[Unit]
      
      inline def allowAllContentOrigin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAllContentOrigin")().asInstanceOf[Unit]
      
      inline def allowAllContentSameOrigin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAllContentSameOrigin")().asInstanceOf[Unit]
      
      inline def allowContentTypeSniffing(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowContentTypeSniffing")().asInstanceOf[Unit]
      
      inline def allowDataUrlForAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowDataUrlForAll")().asInstanceOf[Unit]
      
      inline def allowEval(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowEval")().asInstanceOf[Unit]
      
      inline def allowFontOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowFontOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowFrameOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowFrameOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowImageOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowImageOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowInlineScripts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowInlineScripts")().asInstanceOf[Unit]
      
      inline def allowInlineStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowInlineStyles")().asInstanceOf[Unit]
      
      inline def allowMediaOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowMediaOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowOriginForAll(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowOriginForAll")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowSameOriginForAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowSameOriginForAll")().asInstanceOf[Unit]
      
      inline def allowScriptOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowScriptOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def allowStyleOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowStyleOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def disallowAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowAll")().asInstanceOf[Unit]
      
      inline def disallowAllContent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowAllContent")().asInstanceOf[Unit]
      
      inline def disallowEval(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowEval")().asInstanceOf[Unit]
      
      inline def disallowFont(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowFont")().asInstanceOf[Unit]
      
      inline def disallowInlineScripts(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowInlineScripts")().asInstanceOf[Unit]
      
      inline def disallowInlineStyles(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowInlineStyles")().asInstanceOf[Unit]
      
      inline def disallowObject(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallowObject")().asInstanceOf[Unit]
    }
    
    object framing {
      
      @JSGlobal("BrowserPolicy.framing")
      @js.native
      val ^ : js.Any = js.native
      
      inline def allowAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("allowAll")().asInstanceOf[Unit]
      
      inline def disallow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disallow")().asInstanceOf[Unit]
      
      inline def restrictToOrigin(origin: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictToOrigin")(origin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
  }
  
  object Cordova {
    
    @JSGlobal("Cordova")
    @js.native
    val ^ : js.Any = js.native
    
    inline def depends(dependencies: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("depends")(dependencies.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object DDP {
    
    @JSGlobal("DDP")
    @js.native
    val ^ : js.Any = js.native
    
    inline def allSubscriptionsReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_allSubscriptionsReady")().asInstanceOf[Boolean]
    
    inline def connect(url: String): DDPStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[DDPStatic]
  }
  
  object DDPRateLimiter {
    
    @JSGlobal("DDPRateLimiter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addRule(matcher: Matcher, numRequests: Double, timeInterval: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addRule")(matcher.asInstanceOf[js.Any], numRequests.asInstanceOf[js.Any], timeInterval.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def removeRule(ruleId: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("removeRule")(ruleId.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object EJSON {
    
    @JSGlobal("EJSON")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addType(name: String, factory: js.Function1[/* val */ JSONable, EJSONableCustomType]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addType")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def clone_[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
    
    inline def equals_(a: typingsJapgolly.meteorTypings.EJSON, b: typingsJapgolly.meteorTypings.EJSON): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals_(
      a: typingsJapgolly.meteorTypings.EJSON,
      b: typingsJapgolly.meteorTypings.EJSON,
      options: KeyOrderSensitive
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromJSONValue(`val`: JSONable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def isBinary(x: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("EJSON.newBinary")
    @js.native
    def newBinary: Any = js.native
    inline def newBinary_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newBinary")(x.asInstanceOf[js.Any])
    
    inline def parse(str: String): typingsJapgolly.meteorTypings.EJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.meteorTypings.EJSON]
    
    inline def stringify(`val`: typingsJapgolly.meteorTypings.EJSON): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(`val`: typingsJapgolly.meteorTypings.EJSON, options: Canonical): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toJSONValue(`val`: typingsJapgolly.meteorTypings.EJSON): JSONable = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[JSONable]
  }
  
  object Email {
    
    @JSGlobal("Email")
    @js.native
    val ^ : js.Any = js.native
    
    inline def send(options: Bcc): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object HTTP {
    
    @JSGlobal("HTTP")
    @js.native
    val ^ : js.Any = js.native
    
    inline def call(method: String, url: String): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: Unit, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: HTTPRequest, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: Auth): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def call(method: String, url: String, options: Auth, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    inline def del(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    inline def del(url: String, callOptions: Unit, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def del(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def del(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    inline def get(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    inline def get(url: String, callOptions: Unit, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def get(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def get(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    inline def post(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    inline def post(url: String, callOptions: Unit, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def post(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def post(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    
    inline def put(url: String): HTTPResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[HTTPResponse]
    inline def put(url: String, callOptions: Unit, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def put(url: String, callOptions: HTTPRequest): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
    inline def put(url: String, callOptions: HTTPRequest, asyncCallback: js.Function): HTTPResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], callOptions.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[HTTPResponse]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("MailComposer")
  @js.native
  open class MailComposer protected ()
    extends StObject
       with typingsJapgolly.meteorTypings.MailComposer {
    def this(options: MailComposerOptions) = this()
    
    /* CompleteClass */
    override def addHeader(name: String, value: String): Unit = js.native
    
    /* CompleteClass */
    override def pipe(stream: Any): Unit = js.native
    
    /* CompleteClass */
    override def setMessageOption(from: String, to: String, body: String, html: String): Unit = js.native
    
    /* CompleteClass */
    override def streamMessage(): Unit = js.native
  }
  @JSGlobal("MailComposer")
  @js.native
  def MailComposer: MailComposerStatic = js.native
  inline def MailComposer_=(x: MailComposerStatic): Unit = js.Dynamic.global.updateDynamic("MailComposer")(x.asInstanceOf[js.Any])
  
  object Match {
    
    @JSGlobal("Match")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Match.Any")
    @js.native
    def Any: scala.Any = js.native
    inline def Any_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Match.Boolean")
    @js.native
    def Boolean: Any = js.native
    inline def Boolean_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Boolean")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Match.Integer")
    @js.native
    def Integer: Any = js.native
    inline def Integer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    inline def Maybe(pattern: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("Match.Object")
    @js.native
    def Object: Any = js.native
    
    inline def ObjectIncluding(dico: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectIncluding")(dico.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def Object_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Object")(x.asInstanceOf[js.Any])
    
    inline def OneOf(patterns: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("OneOf")(patterns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
    
    inline def Optional(pattern: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("Match.String")
    @js.native
    def String: Any = js.native
    inline def String_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("String")(x.asInstanceOf[js.Any])
    
    inline def Where(condition: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Where")(condition.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def test(value: Any, pattern: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSGlobal("Match.undefined")
    @js.native
    def undefined: Any = js.native
    inline def undefined_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefined")(x.asInstanceOf[js.Any])
  }
  
  object Meteor {
    
    @JSGlobal("Meteor")
    @js.native
    val ^ : js.Any = js.native
    
    /** User **/
    /** Error **/
    @JSGlobal("Meteor.Error")
    @js.native
    def Error: ErrorStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Meteor.Error")
    @js.native
    open class ErrorCls protected ()
      extends StObject
         with Error {
      def this(error: String) = this()
      def this(error: Double) = this()
      def this(error: String, reason: String) = this()
      def this(error: Double, reason: String) = this()
      def this(error: String, reason: String, details: String) = this()
      def this(error: String, reason: Unit, details: String) = this()
      def this(error: Double, reason: String, details: String) = this()
      def this(error: Double, reason: Unit, details: String) = this()
      
      /* CompleteClass */
      var error: String | Double = js.native
    }
    
    inline def Error_=(x: ErrorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
    
    /** Method **/
    /** Url **/
    inline def absoluteUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUrl")().asInstanceOf[String]
    inline def absoluteUrl(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUrl")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def absoluteUrl(path: String, options: ReplaceLocalhost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUrl")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def absoluteUrl(path: Unit, options: ReplaceLocalhost): String = (^.asInstanceOf[js.Dynamic].applyDynamic("absoluteUrl")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def apply(name: String, args: js.Array[EJSONable]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(name: String, args: js.Array[EJSONable], options: Unit, asyncCallback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(name: String, args: js.Array[EJSONable], options: OnResultReceived): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    inline def apply(name: String, args: js.Array[EJSONable], options: OnResultReceived, asyncCallback: js.Function): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def bindEnvironment(func: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("bindEnvironment")(func.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def call(name: String, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("call")(scala.List(name.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    inline def clearInterval(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def clearTimeout(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def debug(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_debug")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def defer(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def disconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[Unit]
    
    /** Global props **/
    @JSGlobal("Meteor.isClient")
    @js.native
    def isClient: Boolean = js.native
    inline def isClient_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isClient")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.isCordova")
    @js.native
    def isCordova: Boolean = js.native
    inline def isCordova_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isCordova")(x.asInstanceOf[js.Any])
    
    /** Global props **/
    @JSGlobal("Meteor.isDevelopment")
    @js.native
    def isDevelopment: Boolean = js.native
    inline def isDevelopment_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDevelopment")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.isProduction")
    @js.native
    def isProduction: Boolean = js.native
    inline def isProduction_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isProduction")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.isServer")
    @js.native
    def isServer: Boolean = js.native
    inline def isServer_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isServer")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Meteor.isTest")
    @js.native
    def isTest: Boolean = js.native
    inline def isTest_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTest")(x.asInstanceOf[js.Any])
    
    /** Local storage **/
    @JSGlobal("Meteor._localStorage")
    @js.native
    def localStorage: LocalStorage = js.native
    
    inline def localStorage_=(x: LocalStorage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_localStorage")(x.asInstanceOf[js.Any])
    
    inline def loggingIn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loggingIn")().asInstanceOf[Boolean]
    
    inline def loginWith[ExternalService](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")().asInstanceOf[Unit]
    inline def loginWith[ExternalService](options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWith[ExternalService](options: LoginStyle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWith[ExternalService](options: LoginStyle, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithFacebook(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")().asInstanceOf[Unit]
    inline def loginWithFacebook(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithFacebook(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithFacebook(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithGithub(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")().asInstanceOf[Unit]
    inline def loginWithGithub(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithGithub(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithGithub(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithGoogle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")().asInstanceOf[Unit]
    inline def loginWithGoogle(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithGoogle(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithGoogle(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithMeetup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")().asInstanceOf[Unit]
    inline def loginWithMeetup(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithMeetup(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithMeetup(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithMeteorDeveloperAccount(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")().asInstanceOf[Unit]
    inline def loginWithMeteorDeveloperAccount(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithPassword(user: String, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPassword(user: String, password: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPassword(user: js.Object, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPassword(user: js.Object, password: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithToken(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithToken(token: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithTwitter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")().asInstanceOf[Unit]
    inline def loginWithTwitter(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithTwitter(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithTwitter(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def loginWithWeibo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")().asInstanceOf[Unit]
    inline def loginWithWeibo(options: Unit, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithWeibo(options: LoginWithExternalServiceOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loginWithWeibo(options: LoginWithExternalServiceOptions, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
    inline def logout(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def logoutOtherClients(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")().asInstanceOf[Unit]
    inline def logoutOtherClients(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Error **/
    /** Method **/
    inline def methods(methods: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("methods")(methods.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onConnection(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onConnection")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Connection **/
    inline def publish(name: String, func: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Event **/
    /** Connection **/
    inline def reconnect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reconnect")().asInstanceOf[Unit]
    
    @JSGlobal("Meteor.release")
    @js.native
    def release: String = js.native
    inline def release_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("release")(x.asInstanceOf[js.Any])
    
    /** Url **/
    /** Timeout **/
    inline def setInterval(func: js.Function, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def setTimeout(func: js.Function, delay: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSGlobal("Meteor.settings")
    @js.native
    def settings: Settings = js.native
    inline def settings_=(x: Settings): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])
    
    /** Timeout **/
    /** utils **/
    inline def startup(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startup")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Connection **/
    /** Status **/
    inline def status(): DDPStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("status")().asInstanceOf[DDPStatus]
    
    /** Status **/
    /** Pub/Sub **/
    inline def subscribe(name: String, args: Any*): SubscriptionHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(scala.List(name.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SubscriptionHandle]
    
    inline def user(): User = ^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[User]
    
    inline def userId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("userId")().asInstanceOf[String]
    
    @JSGlobal("Meteor.users")
    @js.native
    def users: Collection[User] = js.native
    inline def users_=(x: Collection[User]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("users")(x.asInstanceOf[js.Any])
    
    inline def wrapAsync(func: js.Function): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def wrapAsync(func: js.Function, context: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  object Mongo {
    
    @JSGlobal("Mongo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Mongo.Collection")
    @js.native
    def Collection: CollectionStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.Collection")
    @js.native
    open class CollectionCls[T] ()
      extends StObject
         with Collection[T] {
      def this(name: String) = this()
      def this(name: String, options: typingsJapgolly.meteorTypings.anon.Connection) = this()
      def this(name: Null, options: typingsJapgolly.meteorTypings.anon.Connection) = this()
    }
    
    inline def Collection_=(x: CollectionStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collection")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mongo.Cursor")
    @js.native
    def Cursor: CursorStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.Cursor")
    @js.native
    open class CursorCls[T] ()
      extends StObject
         with Cursor[T]
    
    inline def Cursor_=(x: CursorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Cursor")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Mongo.ObjectID")
    @js.native
    def ObjectID: ObjectIDStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Mongo.ObjectID")
    @js.native
    open class ObjectIDCls ()
      extends StObject
         with ObjectID {
      def this(hexString: String) = this()
    }
    
    inline def ObjectID_=(x: ObjectIDStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectID")(x.asInstanceOf[js.Any])
  }
  
  object Npm {
    
    @JSGlobal("Npm")
    @js.native
    val ^ : js.Any = js.native
    
    inline def depends(dependencies: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("depends")(dependencies.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def require(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(name.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  object Package {
    
    @JSGlobal("Package")
    @js.native
    val ^ : js.Any = js.native
    
    inline def describe(options: DebugOnly): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("describe")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onTest(func: js.Function1[/* api */ PackageAPI, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onTest")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onUse(func: js.Function1[/* api */ PackageAPI, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onUse")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def registerBuildPlugin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBuildPlugin")().asInstanceOf[Unit]
    inline def registerBuildPlugin(options: Name): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerBuildPlugin")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object Random {
    
    @JSGlobal("Random")
    @js.native
    val ^ : js.Any = js.native
    
    // @param array, @return a random element in array
    inline def choice(array: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("choice")(array.asInstanceOf[js.Any]).asInstanceOf[String]
    // @param str, @return a random char in str
    inline def choice(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("choice")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def fraction(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fraction")().asInstanceOf[Double]
    
    // @param numberOfDigits, @returns a random hex string of the given length
    inline def hexString(numberOfDigits: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexString")(numberOfDigits.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def id(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[String]
    inline def id(numberOfChars: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(numberOfChars.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def secret(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("secret")().asInstanceOf[String]
    inline def secret(numberOfChars: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("secret")(numberOfChars.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ReactiveVar")
  @js.native
  open class ReactiveVar[T] protected ()
    extends StObject
       with typingsJapgolly.meteorTypings.ReactiveVar[T] {
    def this(initialValue: T) = this()
    def this(initialValue: T, equalsFunc: js.Function) = this()
    
    /* CompleteClass */
    override def get(): T = js.native
    
    /* CompleteClass */
    override def set(newValue: T): Unit = js.native
  }
  @JSGlobal("ReactiveVar")
  @js.native
  def ReactiveVar: ReactiveVarStatic = js.native
  inline def ReactiveVar_=(x: ReactiveVarStatic): Unit = js.Dynamic.global.updateDynamic("ReactiveVar")(x.asInstanceOf[js.Any])
  
  object Session {
    
    @JSGlobal("Session")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals_(key: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals_(key: String, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals_(key: String, value: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals_(key: String, value: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def get(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def set(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def set(key: String, value: EJSONable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setDefault(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefault")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setDefault(key: String, value: EJSONable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefault")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Template")
  @js.native
  open class Template ()
    extends StObject
       with typingsJapgolly.meteorTypings.Blaze.Template {
    def this(viewName: String) = this()
    def this(viewName: String, renderFunction: js.Function) = this()
    def this(viewName: Unit, renderFunction: js.Function) = this()
    
    /* CompleteClass */
    @JSName("$")
    var $: Any = js.native
    
    /* CompleteClass */
    override def constructView(): View = js.native
    
    /* CompleteClass */
    var created: js.Function = js.native
    
    /* CompleteClass */
    var destroyed: js.Function = js.native
    
    /* CompleteClass */
    override def events(eventsMap: EventsMap): Unit = js.native
    
    /* CompleteClass */
    override def find(selector: String): HTMLElement = js.native
    
    /* CompleteClass */
    override def findAll(selector: String): js.Array[HTMLElement] = js.native
    
    /* CompleteClass */
    var head: typingsJapgolly.meteorTypings.Blaze.Template = js.native
    
    /* CompleteClass */
    override def helpers(helpersMap: HelpersMap): Unit = js.native
    
    /* CompleteClass */
    override def onCreated(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def onDestroyed(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def onRendered(cb: js.Function): Unit = js.native
    
    /* CompleteClass */
    var renderFunction: js.Function = js.native
    
    /* CompleteClass */
    var rendered: js.Function = js.native
    
    /* CompleteClass */
    var viewName: String = js.native
  }
  @JSGlobal("Template")
  @js.native
  def Template: TemplateStatic = js.native
  inline def Template_=(x: TemplateStatic): Unit = js.Dynamic.global.updateDynamic("Template")(x.asInstanceOf[js.Any])
  
  object Tinytest {
    
    @JSGlobal("Tinytest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(description: String, func: js.Function1[/* test */ ITinytestAssertions, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(description.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addAsync(description: String, func: js.Function1[/* test */ ITinytestAssertions, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAsync")(description.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object Tracker {
    
    @JSGlobal("Tracker")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Computation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Computation")().asInstanceOf[Unit]
    
    @JSGlobal("Tracker.Dependency")
    @js.native
    def Dependency: DependencyStatic = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Tracker.Dependency")
    @js.native
    open class DependencyCls ()
      extends StObject
         with Dependency
    
    inline def Dependency_=(x: DependencyStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dependency")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Tracker.active")
    @js.native
    def active: Boolean = js.native
    inline def active_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("active")(x.asInstanceOf[js.Any])
    
    inline def afterFlush(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterFlush")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def autorun(runFunc: js.Function1[/* computation */ Computation, Unit]): Computation = ^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(runFunc.asInstanceOf[js.Any]).asInstanceOf[Computation]
    inline def autorun(runFunc: js.Function1[/* computation */ Computation, Unit], options: OnError): Computation = (^.asInstanceOf[js.Dynamic].applyDynamic("autorun")(runFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Computation]
    
    @JSGlobal("Tracker.currentComputation")
    @js.native
    def currentComputation: Computation = js.native
    inline def currentComputation_=(x: Computation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentComputation")(x.asInstanceOf[js.Any])
    
    inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
    
    inline def nonreactive(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nonreactive")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def onInvalidate(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onInvalidate")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def check(value: Any, pattern: Any): Unit = (js.Dynamic.global.applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("console")
  @js.native
  def console: Console = js.native
  inline def console_=(x: Console): Unit = js.Dynamic.global.updateDynamic("console")(x.asInstanceOf[js.Any])
  
  inline def execFileAsync(command: String): Any = js.Dynamic.global.applyDynamic("execFileAsync")(command.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def execFileAsync(command: String, args: js.Array[Any]): Any = (js.Dynamic.global.applyDynamic("execFileAsync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def execFileAsync(command: String, args: js.Array[Any], options: Cwd): Any = (js.Dynamic.global.applyDynamic("execFileAsync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def execFileAsync(command: String, args: Unit, options: Cwd): Any = (js.Dynamic.global.applyDynamic("execFileAsync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def execFileSync(command: String): String = js.Dynamic.global.applyDynamic("execFileSync")(command.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def execFileSync(command: String, args: js.Array[Any]): String = (js.Dynamic.global.applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def execFileSync(command: String, args: js.Array[Any], options: Cwd): String = (js.Dynamic.global.applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def execFileSync(command: String, args: Unit, options: Cwd): String = (js.Dynamic.global.applyDynamic("execFileSync")(command.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
