package typingsJapgolly.nodeGettext

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodeGettext.anon.Debug
import typingsJapgolly.nodeGettext.nodeGettextStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-gettext", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GetText {
    def this(options: Debug) = this()
    
    /* CompleteClass */
    override def addTranslations(locale: String, domain: String, translations: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def dgettext(domain: String, msgid: String): String = js.native
    
    /* CompleteClass */
    override def dngettext(domain: String, msgid: String, msgidPlural: String, count: Double): String = js.native
    
    /* CompleteClass */
    override def dnpgettext(domain: String, msgctxt: String, msgid: String, msgidPlural: String, count: Double): String = js.native
    
    /* CompleteClass */
    override val domain: String = js.native
    
    /* CompleteClass */
    override def dpgettext(domain: String, msgctxt: String, msgid: String): String = js.native
    
    /* CompleteClass */
    override def emit(eventName: String, eventData: Any): Unit = js.native
    
    /* CompleteClass */
    override def getComment(domain: String, msgctxt: String, msgid: String): js.Object | Boolean = js.native
    
    /* CompleteClass */
    override def gettext(msgid: String): String = js.native
    
    /* CompleteClass */
    override val locale: String = js.native
    
    /* CompleteClass */
    override def ngettext(msgid: String, msgidPlural: String, count: Double): String = js.native
    
    /* CompleteClass */
    override def npgettext(msgctxt: String, msgid: String, msgidPlural: String, count: Double): String = js.native
    
    /* CompleteClass */
    @JSName("off")
    override def off_error(eventName: error, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /* CompleteClass */
    @JSName("on")
    override def on_error(eventName: error, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def pgettext(msgctxt: String, msgid: String): String = js.native
    
    /* CompleteClass */
    override def setLocale(locale: String): Unit = js.native
    
    /* CompleteClass */
    override def setTextDomain(domain: String): Unit = js.native
    
    /* CompleteClass */
    override def textdomain(domain: String): Unit = js.native
    
    /* CompleteClass */
    override def warn(message: String): Unit = js.native
  }
  @JSImport("node-gettext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getLanguageCode(locale: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguageCode")(locale.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait GetText extends StObject {
    
    def addTranslations(locale: String, domain: String, translations: js.Object): Unit
    
    def dgettext(domain: String, msgid: String): String
    
    def dngettext(domain: String, msgid: String, msgidPlural: String, count: Double): String
    
    def dnpgettext(domain: String, msgctxt: String, msgid: String, msgidPlural: String, count: Double): String
    
    val domain: String
    
    def dpgettext(domain: String, msgctxt: String, msgid: String): String
    
    def emit(eventName: String, eventData: Any): Unit
    
    def getComment(domain: String, msgctxt: String, msgid: String): js.Object | Boolean
    
    def gettext(msgid: String): String
    
    val locale: String
    
    def ngettext(msgid: String, msgidPlural: String, count: Double): String
    
    def npgettext(msgctxt: String, msgid: String, msgidPlural: String, count: Double): String
    
    @JSName("off")
    def off_error(eventName: error, callback: js.Function1[/* error */ js.Error, Unit]): Unit
    
    @JSName("on")
    def on_error(eventName: error, callback: js.Function1[/* error */ js.Error, Unit]): Unit
    
    def pgettext(msgctxt: String, msgid: String): String
    
    def setLocale(locale: String): Unit
    
    def setTextDomain(domain: String): Unit
    
    def textdomain(domain: String): Unit
    
    def warn(message: String): Unit
  }
  object GetText {
    
    inline def apply(
      addTranslations: (String, String, js.Object) => Callback,
      dgettext: (String, String) => String,
      dngettext: (String, String, String, Double) => String,
      dnpgettext: (String, String, String, String, Double) => String,
      domain: String,
      dpgettext: (String, String, String) => String,
      emit: (String, Any) => Callback,
      getComment: (String, String, String) => js.Object | Boolean,
      gettext: String => String,
      locale: String,
      ngettext: (String, String, Double) => String,
      npgettext: (String, String, String, Double) => String,
      off: (error, js.Function1[/* error */ js.Error, Unit]) => Callback,
      on: (error, js.Function1[/* error */ js.Error, Unit]) => Callback,
      pgettext: (String, String) => String,
      setLocale: String => Callback,
      setTextDomain: String => Callback,
      textdomain: String => Callback,
      warn: String => Callback
    ): GetText = {
      val __obj = js.Dynamic.literal(addTranslations = js.Any.fromFunction3((t0: String, t1: String, t2: js.Object) => (addTranslations(t0, t1, t2)).runNow()), dgettext = js.Any.fromFunction2(dgettext), dngettext = js.Any.fromFunction4(dngettext), dnpgettext = js.Any.fromFunction5(dnpgettext), domain = domain.asInstanceOf[js.Any], dpgettext = js.Any.fromFunction3(dpgettext), emit = js.Any.fromFunction2((t0: String, t1: Any) => (emit(t0, t1)).runNow()), getComment = js.Any.fromFunction3(getComment), gettext = js.Any.fromFunction1(gettext), locale = locale.asInstanceOf[js.Any], ngettext = js.Any.fromFunction3(ngettext), npgettext = js.Any.fromFunction4(npgettext), off = js.Any.fromFunction2((t0: error, t1: js.Function1[/* error */ js.Error, Unit]) => (off(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: error, t1: js.Function1[/* error */ js.Error, Unit]) => (on(t0, t1)).runNow()), pgettext = js.Any.fromFunction2(pgettext), setLocale = js.Any.fromFunction1((t0: String) => setLocale(t0).runNow()), setTextDomain = js.Any.fromFunction1((t0: String) => setTextDomain(t0).runNow()), textdomain = js.Any.fromFunction1((t0: String) => textdomain(t0).runNow()), warn = js.Any.fromFunction1((t0: String) => warn(t0).runNow()))
      __obj.asInstanceOf[GetText]
    }
    
    extension [Self <: GetText](x: Self) {
      
      inline def setAddTranslations(value: (String, String, js.Object) => Callback): Self = StObject.set(x, "addTranslations", js.Any.fromFunction3((t0: String, t1: String, t2: js.Object) => (value(t0, t1, t2)).runNow()))
      
      inline def setDgettext(value: (String, String) => String): Self = StObject.set(x, "dgettext", js.Any.fromFunction2(value))
      
      inline def setDngettext(value: (String, String, String, Double) => String): Self = StObject.set(x, "dngettext", js.Any.fromFunction4(value))
      
      inline def setDnpgettext(value: (String, String, String, String, Double) => String): Self = StObject.set(x, "dnpgettext", js.Any.fromFunction5(value))
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDpgettext(value: (String, String, String) => String): Self = StObject.set(x, "dpgettext", js.Any.fromFunction3(value))
      
      inline def setEmit(value: (String, Any) => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setGetComment(value: (String, String, String) => js.Object | Boolean): Self = StObject.set(x, "getComment", js.Any.fromFunction3(value))
      
      inline def setGettext(value: String => String): Self = StObject.set(x, "gettext", js.Any.fromFunction1(value))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setNgettext(value: (String, String, Double) => String): Self = StObject.set(x, "ngettext", js.Any.fromFunction3(value))
      
      inline def setNpgettext(value: (String, String, String, Double) => String): Self = StObject.set(x, "npgettext", js.Any.fromFunction4(value))
      
      inline def setOff(value: (error, js.Function1[/* error */ js.Error, Unit]) => Callback): Self = StObject.set(x, "off", js.Any.fromFunction2((t0: error, t1: js.Function1[/* error */ js.Error, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setOn(value: (error, js.Function1[/* error */ js.Error, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: error, t1: js.Function1[/* error */ js.Error, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setPgettext(value: (String, String) => String): Self = StObject.set(x, "pgettext", js.Any.fromFunction2(value))
      
      inline def setSetLocale(value: String => Callback): Self = StObject.set(x, "setLocale", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSetTextDomain(value: String => Callback): Self = StObject.set(x, "setTextDomain", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setTextdomain(value: String => Callback): Self = StObject.set(x, "textdomain", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setWarn(value: String => Callback): Self = StObject.set(x, "warn", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
