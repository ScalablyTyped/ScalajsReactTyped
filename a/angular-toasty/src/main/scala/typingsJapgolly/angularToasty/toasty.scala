package typingsJapgolly.angularToasty

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toasty {
  
  trait IGlobalConfig extends StObject {
    
    /**
      * Whether clicking the toast closes it.
      */
    var clickToClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether HTML is allowed in toast.
      */
    var html: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum number of toasts to show at once.
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      * The toast's message.
      */
    var msg: js.UndefOr[String] = js.undefined
    
    /**
      * The window position where the toast pops up.
      *
      */
    var position: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to shake the toast.
      */
    var shake: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the 'X' icon to close the toast.
      */
    var showClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to play a sound when a toast is added.
      */
    var sound: js.UndefOr[Boolean] = js.undefined
    
    /**
      * What theme to use.
      * - 'default'
      * - 'material'
      * - 'bootstrap'
      */
    var theme: js.UndefOr[String] = js.undefined
    
    /**
      * How long (in miliseconds) the toast shows before it's removed. Set to false to disable.
      */
    var timeout: js.UndefOr[Double | Boolean] = js.undefined
    
    /**
      * The toast's title.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object IGlobalConfig {
    
    inline def apply(): IGlobalConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGlobalConfig]
    }
    
    extension [Self <: IGlobalConfig](x: Self) {
      
      inline def setClickToClose(value: Boolean): Self = StObject.set(x, "clickToClose", value.asInstanceOf[js.Any])
      
      inline def setClickToCloseUndefined: Self = StObject.set(x, "clickToClose", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShake(value: Boolean): Self = StObject.set(x, "shake", value.asInstanceOf[js.Any])
      
      inline def setShakeUndefined: Self = StObject.set(x, "shake", js.undefined)
      
      inline def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
      
      inline def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
      
      inline def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTimeout(value: Double | Boolean): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait IToastyConfig extends StObject {
    
    /**
      * Whether clicking the toast closes it.
      */
    var clickToClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether HTML is allowed in toasts.
      */
    var html: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The toast's message.
      */
    var msg: js.UndefOr[String] = js.undefined
    
    /**
      * Add event handler.
      */
    var onAdd: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Click event handler.
      */
    var onClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Remove event handler.
      */
    var onRemove: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Whether to shake the toasts.
      */
    var shake: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show the 'X' icon to close the toast.
      */
    var showClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to play a sound when a toast is added.
      */
    var sound: js.UndefOr[Boolean] = js.undefined
    
    /**
      * What theme to use.
      * - 'default'
      * - 'material'
      * - 'bootstrap'
      */
    var theme: js.UndefOr[String] = js.undefined
    
    /**
      * How long (in milliseconds) the toast shows before it's removed. Set to false to disable.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The toast's title.
      */
    var title: String
    
    /**
      * The toast's type:
      * - 'default'
      * - 'info'
      * - 'success'
      * - 'wait'
      * - 'error'
      * - 'warning'
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IToastyConfig {
    
    inline def apply(title: String): IToastyConfig = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToastyConfig]
    }
    
    extension [Self <: IToastyConfig](x: Self) {
      
      inline def setClickToClose(value: Boolean): Self = StObject.set(x, "clickToClose", value.asInstanceOf[js.Any])
      
      inline def setClickToCloseUndefined: Self = StObject.set(x, "clickToClose", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setMsgUndefined: Self = StObject.set(x, "msg", js.undefined)
      
      inline def setOnAdd(value: js.Function): Self = StObject.set(x, "onAdd", value.asInstanceOf[js.Any])
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnRemove(value: js.Function): Self = StObject.set(x, "onRemove", value.asInstanceOf[js.Any])
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setShake(value: Boolean): Self = StObject.set(x, "shake", value.asInstanceOf[js.Any])
      
      inline def setShakeUndefined: Self = StObject.set(x, "shake", js.undefined)
      
      inline def setShowClose(value: Boolean): Self = StObject.set(x, "showClose", value.asInstanceOf[js.Any])
      
      inline def setShowCloseUndefined: Self = StObject.set(x, "showClose", js.undefined)
      
      inline def setSound(value: Boolean): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IToastyConfigProvider extends StObject {
    
    @JSName("$get")
    def $get(): IGlobalConfig
    
    def setConfig(`override`: IGlobalConfig): Unit
  }
  object IToastyConfigProvider {
    
    inline def apply($get: CallbackTo[IGlobalConfig], setConfig: IGlobalConfig => Callback): IToastyConfigProvider = {
      val __obj = js.Dynamic.literal($get = $get.toJsFn, setConfig = js.Any.fromFunction1((t0: IGlobalConfig) => setConfig(t0).runNow()))
      __obj.asInstanceOf[IToastyConfigProvider]
    }
    
    extension [Self <: IToastyConfigProvider](x: Self) {
      
      inline def set$get(value: CallbackTo[IGlobalConfig]): Self = StObject.set(x, "$get", value.toJsFn)
      
      inline def setSetConfig(value: IGlobalConfig => Callback): Self = StObject.set(x, "setConfig", js.Any.fromFunction1((t0: IGlobalConfig) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait IToastyService extends StObject {
    
    /**
      * Create a toast with the given options and type.
      * @param options
      * @param type
      */
    def apply(options: IToastyConfig): Unit = js.native
    def apply(options: IToastyConfig, `type`: String): Unit = js.native
    /**
      * Create a default "quick toast" with the given title.
      * @param title
      */
    def apply(title: String): Unit = js.native
    def apply(title: Double): Unit = js.native
    
    /**
      * Create a default toast with the given options.
      * @param options
      */
    def default(options: IToastyConfig): Unit = js.native
    /**
      * Create a default "quick toast" with the given title.
      * @param title
      */
    def default(title: String): Unit = js.native
    def default(title: Double): Unit = js.native
    
    /**
      * Clear toast(s).
      * @param id Optional ID to clear a specific toast.
      */
    def clear(): Unit = js.native
    def clear(id: Double): Unit = js.native
    
    /**
      * Create an error toast with the given options.
      * @param options
      */
    def error(options: IToastyConfig): Unit = js.native
    /**
      * Create an error "quick toast" with the given title.
      * @param title
      */
    def error(title: String): Unit = js.native
    def error(title: Double): Unit = js.native
    
    /**
      * Get the global config.
      */
    def getGlobalConfig(): IGlobalConfig = js.native
    
    /**
      * Create an info toast with the given options.
      * @param options
      */
    def info(options: IToastyConfig): Unit = js.native
    /**
      * Create an info "quick toast" with the given title.
      * @param title
      */
    def info(title: String): Unit = js.native
    def info(title: Double): Unit = js.native
    
    /**
      * Create a success toast with the given options.
      * @param options
      */
    def success(options: IToastyConfig): Unit = js.native
    /**
      * Create a success "quick toast" with the given title.
      * @param title
      */
    def success(title: String): Unit = js.native
    def success(title: Double): Unit = js.native
    
    /**
      * Create a wait toast with the given options.
      * @param options
      */
    def wait(options: IToastyConfig): Unit = js.native
    /**
      * Create a wait "quick toast" with the given title.
      * @param title
      */
    def wait(title: String): Unit = js.native
    def wait(title: Double): Unit = js.native
    
    /**
      * Create a warning toast with the given options.
      * @param options
      */
    def warning(options: IToastyConfig): Unit = js.native
    /**
      * Create a warning "quick toast" with the given title.
      * @param title
      */
    def warning(title: String): Unit = js.native
    def warning(title: Double): Unit = js.native
  }
}
