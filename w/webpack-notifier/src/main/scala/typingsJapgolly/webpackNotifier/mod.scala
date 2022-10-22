package typingsJapgolly.webpackNotifier

import japgolly.scalajs.react.Callback
import typingsJapgolly.webpack.mod.Compiler
import typingsJapgolly.webpackNotifier.anon.Message
import typingsJapgolly.webpackNotifier.anon.keyinsuccesswarningerrors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-notifier", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with WebpackNotifierPlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
  }
  
  /** @deprecated use Options */
  type Config = Options
  
  trait Options extends StObject {
    
    var alwaysNotify: js.UndefOr[Boolean] = js.undefined
    
    var contentImage: js.UndefOr[keyinsuccesswarningerrors | String] = js.undefined
    
    /**
      * Use emoji in notifications
      */
    var emoji: js.UndefOr[Boolean] = js.undefined
    
    var excludeWarnings: js.UndefOr[Boolean] = js.undefined
    
    var onlyOnError: js.UndefOr[Boolean] = js.undefined
    
    var skipFirstNotification: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String | TitleGetter] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlwaysNotify(value: Boolean): Self = StObject.set(x, "alwaysNotify", value.asInstanceOf[js.Any])
      
      inline def setAlwaysNotifyUndefined: Self = StObject.set(x, "alwaysNotify", js.undefined)
      
      inline def setContentImage(value: keyinsuccesswarningerrors | String): Self = StObject.set(x, "contentImage", value.asInstanceOf[js.Any])
      
      inline def setContentImageUndefined: Self = StObject.set(x, "contentImage", js.undefined)
      
      inline def setEmoji(value: Boolean): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      inline def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
      
      inline def setExcludeWarnings(value: Boolean): Self = StObject.set(x, "excludeWarnings", value.asInstanceOf[js.Any])
      
      inline def setExcludeWarningsUndefined: Self = StObject.set(x, "excludeWarnings", js.undefined)
      
      inline def setOnlyOnError(value: Boolean): Self = StObject.set(x, "onlyOnError", value.asInstanceOf[js.Any])
      
      inline def setOnlyOnErrorUndefined: Self = StObject.set(x, "onlyOnError", js.undefined)
      
      inline def setSkipFirstNotification(value: Boolean): Self = StObject.set(x, "skipFirstNotification", value.asInstanceOf[js.Any])
      
      inline def setSkipFirstNotificationUndefined: Self = StObject.set(x, "skipFirstNotification", js.undefined)
      
      inline def setTitle(value: String | TitleGetter): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction1(value: /* data */ Message => String): Self = StObject.set(x, "title", js.Any.fromFunction1(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type TitleGetter = js.Function1[/* data */ Message, String]
  
  trait WebpackNotifierPlugin extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object WebpackNotifierPlugin {
    
    inline def apply(apply: Compiler => Callback): WebpackNotifierPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: Compiler) => apply(t0).runNow()))
      __obj.asInstanceOf[WebpackNotifierPlugin]
    }
    
    extension [Self <: WebpackNotifierPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: Compiler) => value(t0).runNow()))
    }
  }
}
