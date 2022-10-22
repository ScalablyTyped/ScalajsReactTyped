package typingsJapgolly.reapop

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reapop.anon.PartialNotification
import typingsJapgolly.reapop.anon.PartialNotificationConfig
import typingsJapgolly.reapop.distComponentsNotificationsSystemMod.Props
import typingsJapgolly.reapop.distContextsReapopNotificationsContextMod.NotificationsContext
import typingsJapgolly.reapop.distReducersNotificationsActionsMod.DismissNotificationAction
import typingsJapgolly.reapop.distReducersNotificationsActionsMod.DismissNotificationsAction
import typingsJapgolly.reapop.distReducersNotificationsActionsMod.NotificationActions
import typingsJapgolly.reapop.distReducersNotificationsActionsMod.UpsertNotificationAction
import typingsJapgolly.reapop.distReducersNotificationsReducerMod.InitReduxAction
import typingsJapgolly.reapop.distReducersNotificationsTypesMod.Notification
import typingsJapgolly.reapop.distReducersNotificationsTypesMod.Position
import typingsJapgolly.reapop.distReducersNotificationsTypesMod.Status
import typingsJapgolly.reapop.distThemesTypesMod.Theme
import typingsJapgolly.reapop.reapopStrings.`bottom-center`
import typingsJapgolly.reapop.reapopStrings.`bottom-left`
import typingsJapgolly.reapop.reapopStrings.`bottom-right`
import typingsJapgolly.reapop.reapopStrings.`top-center`
import typingsJapgolly.reapop.reapopStrings.`top-left`
import typingsJapgolly.reapop.reapopStrings.`top-right`
import typingsJapgolly.reapop.reapopStrings.error
import typingsJapgolly.reapop.reapopStrings.info
import typingsJapgolly.reapop.reapopStrings.loading
import typingsJapgolly.reapop.reapopStrings.none
import typingsJapgolly.reapop.reapopStrings.success
import typingsJapgolly.reapop.reapopStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reapop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FadeTransition(props: typingsJapgolly.reapop.distComponentsFadeTransitionMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FadeTransition")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def GrowTransition(props: typingsJapgolly.reapop.distComponentsGrowTransitionMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("GrowTransition")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def NotificationsProvider(props: typingsJapgolly.reapop.distComponentsNotificationsProviderMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NotificationsProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object POSITIONS {
    
    @JSImport("reapop", "POSITIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("reapop", "POSITIONS.bottomCenter")
    @js.native
    def bottomCenter: `bottom-center` = js.native
    inline def bottomCenter_=(x: `bottom-center`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomCenter")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "POSITIONS.bottomLeft")
    @js.native
    def bottomLeft: `bottom-left` = js.native
    inline def bottomLeft_=(x: `bottom-left`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "POSITIONS.bottomRight")
    @js.native
    def bottomRight: `bottom-right` = js.native
    inline def bottomRight_=(x: `bottom-right`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "POSITIONS.topCenter")
    @js.native
    def topCenter: `top-center` = js.native
    inline def topCenter_=(x: `top-center`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topCenter")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "POSITIONS.topLeft")
    @js.native
    def topLeft: `top-left` = js.native
    inline def topLeft_=(x: `top-left`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "POSITIONS.topRight")
    @js.native
    def topRight: `top-right` = js.native
    inline def topRight_=(x: `top-right`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topRight")(x.asInstanceOf[js.Any])
  }
  
  object STATUSES {
    
    @JSImport("reapop", "STATUSES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("reapop", "STATUSES.error")
    @js.native
    def error: typingsJapgolly.reapop.reapopStrings.error = js.native
    inline def error_=(x: error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "STATUSES.info")
    @js.native
    def info: typingsJapgolly.reapop.reapopStrings.info = js.native
    inline def info_=(x: info): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "STATUSES.loading")
    @js.native
    def loading: typingsJapgolly.reapop.reapopStrings.loading = js.native
    inline def loading_=(x: loading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loading")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "STATUSES.none")
    @js.native
    def none: typingsJapgolly.reapop.reapopStrings.none = js.native
    inline def none_=(x: none): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "STATUSES.success")
    @js.native
    def success: typingsJapgolly.reapop.reapopStrings.success = js.native
    inline def success_=(x: success): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("reapop", "STATUSES.warning")
    @js.native
    def warning: typingsJapgolly.reapop.reapopStrings.warning = js.native
    inline def warning_=(x: warning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  inline def SlideTransition(props: typingsJapgolly.reapop.distComponentsSlideTransitionMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SlideTransition")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("reapop", "atalhoTheme")
  @js.native
  val atalhoTheme: Theme = js.native
  
  object baseTheme {
    
    @JSImport("reapop", "baseTheme")
    @js.native
    val ^ : js.Any = js.native
    
    inline def container(position: Position): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("container")(position.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  }
  
  @JSImport("reapop", "bootstrapTheme")
  @js.native
  val bootstrapTheme: Theme = js.native
  
  inline def dismissNotification(notificationId: String): DismissNotificationAction = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissNotification")(notificationId.asInstanceOf[js.Any]).asInstanceOf[DismissNotificationAction]
  
  inline def dismissNotifications(): DismissNotificationsAction = ^.asInstanceOf[js.Dynamic].applyDynamic("dismissNotifications")().asInstanceOf[DismissNotificationsAction]
  
  inline def notify_(message: String): UpsertNotificationAction = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any]).asInstanceOf[UpsertNotificationAction]
  inline def notify_(message: String, options: PartialNotification): UpsertNotificationAction = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UpsertNotificationAction]
  inline def notify_(message: String, status: Status): UpsertNotificationAction = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[UpsertNotificationAction]
  inline def notify_(message: String, status: Status, options: PartialNotification): UpsertNotificationAction = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(message.asInstanceOf[js.Any], status.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UpsertNotificationAction]
  inline def notify_(notification: PartialNotification): UpsertNotificationAction = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(notification.asInstanceOf[js.Any]).asInstanceOf[UpsertNotificationAction]
  
  inline def reducer(): js.Function2[
    /* state */ js.UndefOr[js.Array[Notification]], 
    /* action */ NotificationActions | InitReduxAction, 
    js.Array[Notification]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reducer")().asInstanceOf[js.Function2[
    /* state */ js.UndefOr[js.Array[Notification]], 
    /* action */ NotificationActions | InitReduxAction, 
    js.Array[Notification]
  ]]
  
  inline def setUpNotifications(props: PartialNotificationConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUpNotifications")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useNotifications(): NotificationsContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useNotifications")().asInstanceOf[NotificationsContext]
  
  @JSImport("reapop", "wyboTheme")
  @js.native
  val wyboTheme: Theme = js.native
}
