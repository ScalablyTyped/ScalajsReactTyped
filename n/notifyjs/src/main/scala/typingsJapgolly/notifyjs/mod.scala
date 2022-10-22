package typingsJapgolly.notifyjs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("notifyjs", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Notify {
    def this(title: String) = this()
    def this(title: String, options: NotifyOption) = this()
    
    /**
      * Close the notification.
      */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Remove all event listener.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def handleEvent(e: Event): Unit = js.native
    
    /* CompleteClass */
    override def onClickNotification(): Unit = js.native
    
    /* CompleteClass */
    override def onCloseNotification(): Unit = js.native
    
    /* CompleteClass */
    override def onErrorNotification(): Unit = js.native
    
    /* CompleteClass */
    override def onShowNotification(e: Event): Unit = js.native
    
    /**
      * Show the notification.
      */
    /* CompleteClass */
    override def show(): Unit = js.native
  }
  @JSImport("notifyjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * return true if the browser supports HTML5 Notification
    * @param true : the browser supports HTML5 Notification, false ; the browser does not supports HTML5 Notification.
    */
  /* static member */
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
  
  /**
    * Check is permission is needed for the user to receive notifications.
    * @return true : needs permission, false : does not need
    */
  /* static member */
  @JSImport("notifyjs", "needsPermission")
  @js.native
  def needsPermission: Boolean = js.native
  inline def needsPermission_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("needsPermission")(x.asInstanceOf[js.Any])
  
  /**
    * shows the user's current permission level (granted, denied or default), returns null if notifications are not supported.
    * @return 'granted' : permission has been given, 'denied' : permission has been denied, 'default' : permission has not yet been set, null : notifications are not supported
    */
  /* static member */
  @JSImport("notifyjs", "permissionLevel")
  @js.native
  def permissionLevel: String = js.native
  inline def permissionLevel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("permissionLevel")(x.asInstanceOf[js.Any])
  
  /**
    * Asks the user for permission to display notifications
    * @param onPermissionGrantedCallback A callback for permission is granted.
    * @param onPermissionDeniedCallback  A callback for permission is denied.
    */
  /* static member */
  inline def requestPermission(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermission")().asInstanceOf[Unit]
  inline def requestPermission(onPermissionGrantedCallback: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestPermission")(onPermissionGrantedCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def requestPermission(onPermissionGrantedCallback: js.Function0[Any], onPermissionDeniedCallback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestPermission")(onPermissionGrantedCallback.asInstanceOf[js.Any], onPermissionDeniedCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def requestPermission(onPermissionGrantedCallback: Unit, onPermissionDeniedCallback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestPermission")(onPermissionGrantedCallback.asInstanceOf[js.Any], onPermissionDeniedCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Notify extends StObject {
    
    /**
      * Close the notification.
      */
    def close(): Unit
    
    /**
      * Remove all event listener.
      */
    def destroy(): Unit
    
    def handleEvent(e: Event): Unit
    
    def onClickNotification(): Unit
    
    def onCloseNotification(): Unit
    
    def onErrorNotification(): Unit
    
    def onShowNotification(e: Event): Unit
    
    /**
      * Show the notification.
      */
    def show(): Unit
  }
  object Notify {
    
    inline def apply(
      close: Callback,
      destroy: Callback,
      handleEvent: Event => Callback,
      onClickNotification: Callback,
      onCloseNotification: Callback,
      onErrorNotification: Callback,
      onShowNotification: Event => Callback,
      show: Callback
    ): Notify = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, destroy = destroy.toJsFn, handleEvent = js.Any.fromFunction1((t0: Event) => handleEvent(t0).runNow()), onClickNotification = onClickNotification.toJsFn, onCloseNotification = onCloseNotification.toJsFn, onErrorNotification = onErrorNotification.toJsFn, onShowNotification = js.Any.fromFunction1((t0: Event) => onShowNotification(t0).runNow()), show = show.toJsFn)
      __obj.asInstanceOf[Notify]
    }
    
    extension [Self <: Notify](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setHandleEvent(value: Event => Callback): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnClickNotification(value: Callback): Self = StObject.set(x, "onClickNotification", value.toJsFn)
      
      inline def setOnCloseNotification(value: Callback): Self = StObject.set(x, "onCloseNotification", value.toJsFn)
      
      inline def setOnErrorNotification(value: Callback): Self = StObject.set(x, "onErrorNotification", value.toJsFn)
      
      inline def setOnShowNotification(value: Event => Callback): Self = StObject.set(x, "onShowNotification", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
    }
  }
  
  /**
    * Interface for the Notify's optional parameter.
    */
  trait NotifyOption extends StObject {
    
    /**
      * notification message body
      */
    var body: js.UndefOr[String] = js.undefined
    
    /**
      * path for icon to display in notification
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * callback when notification is clicked
      */
    var notifyClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * callback when notification is closed
      */
    var notifyClose: js.UndefOr[js.Function] = js.undefined
    
    /**
      * callback when notification throws an error
      */
    var notifyError: js.UndefOr[js.Function] = js.undefined
    
    /**
      * callback when notification is shown
      */
    var notifyShow: js.UndefOr[js.Function1[/* e */ Event, Any]] = js.undefined
    
    /**
      * callback when user has denied permission
      */
    var permissionDenied: js.UndefOr[js.Function] = js.undefined
    
    /**
      *  callback when user has granted permission
      */
    var permissionGranted: js.UndefOr[js.Function] = js.undefined
    
    /**
      * whether we expect for user interaction or not
      * in case value is true the timeout for closing the notification won't be set
      */
    var requireInteraction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * whether this notification should be silent or not
      */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * unique identifier to stop duplicate notifications
      */
    var tag: js.UndefOr[String] = js.undefined
    
    /**
      * number of seconds to close the notification automatically
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object NotifyOption {
    
    inline def apply(): NotifyOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyOption]
    }
    
    extension [Self <: NotifyOption](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setNotifyClick(value: js.Function): Self = StObject.set(x, "notifyClick", value.asInstanceOf[js.Any])
      
      inline def setNotifyClickUndefined: Self = StObject.set(x, "notifyClick", js.undefined)
      
      inline def setNotifyClose(value: js.Function): Self = StObject.set(x, "notifyClose", value.asInstanceOf[js.Any])
      
      inline def setNotifyCloseUndefined: Self = StObject.set(x, "notifyClose", js.undefined)
      
      inline def setNotifyError(value: js.Function): Self = StObject.set(x, "notifyError", value.asInstanceOf[js.Any])
      
      inline def setNotifyErrorUndefined: Self = StObject.set(x, "notifyError", js.undefined)
      
      inline def setNotifyShow(value: /* e */ Event => Any): Self = StObject.set(x, "notifyShow", js.Any.fromFunction1(value))
      
      inline def setNotifyShowUndefined: Self = StObject.set(x, "notifyShow", js.undefined)
      
      inline def setPermissionDenied(value: js.Function): Self = StObject.set(x, "permissionDenied", value.asInstanceOf[js.Any])
      
      inline def setPermissionDeniedUndefined: Self = StObject.set(x, "permissionDenied", js.undefined)
      
      inline def setPermissionGranted(value: js.Function): Self = StObject.set(x, "permissionGranted", value.asInstanceOf[js.Any])
      
      inline def setPermissionGrantedUndefined: Self = StObject.set(x, "permissionGranted", js.undefined)
      
      inline def setRequireInteraction(value: Boolean): Self = StObject.set(x, "requireInteraction", value.asInstanceOf[js.Any])
      
      inline def setRequireInteractionUndefined: Self = StObject.set(x, "requireInteraction", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
