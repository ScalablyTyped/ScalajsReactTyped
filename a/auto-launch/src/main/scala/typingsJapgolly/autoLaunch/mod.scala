package typingsJapgolly.autoLaunch

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.autoLaunch.anon.UseLaunchAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("auto-launch", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AutoLaunch {
    def this(options: AutoLaunchOptions) = this()
    
    /**
      * Disables auto-launch at start up.
      */
    /* CompleteClass */
    override def disable(): js.Promise[Unit] = js.native
    
    /**
      * Enables auto-launch at start up.
      */
    /* CompleteClass */
    override def enable(): js.Promise[Unit] = js.native
    
    /**
      * Returns true if auto-launch is enabled.
      */
    /* CompleteClass */
    override def isEnabled(): js.Promise[Boolean] = js.native
  }
  
  trait AutoLaunch extends StObject {
    
    /**
      * Disables auto-launch at start up.
      */
    def disable(): js.Promise[Unit]
    
    /**
      * Enables auto-launch at start up.
      */
    def enable(): js.Promise[Unit]
    
    /**
      * Returns true if auto-launch is enabled.
      */
    def isEnabled(): js.Promise[Boolean]
  }
  object AutoLaunch {
    
    inline def apply(
      disable: CallbackTo[js.Promise[Unit]],
      enable: CallbackTo[js.Promise[Unit]],
      isEnabled: CallbackTo[js.Promise[Boolean]]
    ): AutoLaunch = {
      val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, isEnabled = isEnabled.toJsFn)
      __obj.asInstanceOf[AutoLaunch]
    }
    
    extension [Self <: AutoLaunch](x: Self) {
      
      inline def setDisable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setEnable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setIsEnabled(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isEnabled", value.toJsFn)
    }
  }
  
  trait AutoLaunchOptions extends StObject {
    
    /**
      * Hidden on launch. Default is `false`.
      */
    var isHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * For Mac-only options.
      */
    var mac: js.UndefOr[UseLaunchAgent] = js.undefined
    
    /**
      * Application name.
      */
    var name: String
    
    /**
      * Path to application. Default is `process.execPath`.
      */
    var path: js.UndefOr[String] = js.undefined
  }
  object AutoLaunchOptions {
    
    inline def apply(name: String): AutoLaunchOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoLaunchOptions]
    }
    
    extension [Self <: AutoLaunchOptions](x: Self) {
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      inline def setMac(value: UseLaunchAgent): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
