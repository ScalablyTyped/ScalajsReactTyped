package typingsJapgolly.strongGlobalize

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.strongGlobalize.libConfigMod.AnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBrowserMod {
  
  @JSImport("strong-globalize/lib/browser", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with StrongGlobalize {
    
    /* CompleteClass */
    override def Error(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def alert(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def c(value: Any, currencySymbol: String, options: AnyObject[Any]): String = js.native
    
    /* CompleteClass */
    override def critical(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def d(value: js.Date, options: AnyObject[Any]): String = js.native
    
    /* CompleteClass */
    override def data(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def debug(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def emergency(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def error(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def ewrite(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def f(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def format(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def formatCurrency(value: Any, currencySymbol: String, options: AnyObject[Any]): String = js.native
    
    /* CompleteClass */
    override def formatDate(value: js.Date, options: AnyObject[Any]): String = js.native
    
    /* CompleteClass */
    override def formatMessage(path: String, variables: Any): Any = js.native
    
    /* CompleteClass */
    override def formatNumber(value: Double, options: AnyObject[Any]): String = js.native
    
    /* CompleteClass */
    override def getLanguage(): String = js.native
    
    /* CompleteClass */
    override def help(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def info(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def informational(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def input(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def log(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def m(path: String, variables: Any): Any = js.native
    
    /* CompleteClass */
    override def n(value: Double, options: AnyObject[Any]): String = js.native
    
    /* CompleteClass */
    override def notice(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def owrite(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def prompt(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def rfc5424(`type`: String, args: js.Array[Any], fn: js.Function1[/* repeated */ Any, Unit]): Any = js.native
    
    /* CompleteClass */
    override def setLanguage(): Unit = js.native
    /* CompleteClass */
    @JSName("setLanguage")
    var setLanguage_Original: js.Function0[Unit] = js.native
    
    /* CompleteClass */
    override def silly(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def t(path: String, variables: Any): Any = js.native
    
    /* CompleteClass */
    override def verbose(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def warn(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def warning(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def write(args: Any*): Unit = js.native
  }
  @JSImport("strong-globalize/lib/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("strong-globalize/lib/browser", "SetDefaultLanguage")
  @js.native
  def SetDefaultLanguage: js.Function0[Unit] = js.native
  inline def SetDefaultLanguage_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetDefaultLanguage")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("strong-globalize/lib/browser", "SetPersistentLogging")
  @js.native
  def SetPersistentLogging: js.Function0[Unit] = js.native
  inline def SetPersistentLogging_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetPersistentLogging")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("strong-globalize/lib/browser", "SetRootDir")
  @js.native
  def SetRootDir: js.Function0[Unit] = js.native
  inline def SetRootDir_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetRootDir")(x.asInstanceOf[js.Any])
  
  trait StrongGlobalize extends StObject {
    
    def Error(args: Any*): Any
    
    def alert(args: Any*): Any
    
    def c(value: Any, currencySymbol: String, options: AnyObject[Any]): String
    
    def critical(args: Any*): Any
    
    def d(value: js.Date, options: AnyObject[Any]): String
    
    def data(args: Any*): Any
    
    def debug(args: Any*): Any
    
    def emergency(args: Any*): Any
    
    def error(args: Any*): Any
    
    def ewrite(args: Any*): Unit
    
    def f(args: Any*): Any
    
    def format(args: Any*): Any
    
    def formatCurrency(value: Any, currencySymbol: String, options: AnyObject[Any]): String
    
    def formatDate(value: js.Date, options: AnyObject[Any]): String
    
    def formatMessage(path: String, variables: Any): Any
    
    def formatNumber(value: Double, options: AnyObject[Any]): String
    
    def getLanguage(): String
    
    def help(args: Any*): Any
    
    def info(args: Any*): Any
    
    def informational(args: Any*): Any
    
    def input(args: Any*): Any
    
    def log(args: Any*): Any
    
    def m(path: String, variables: Any): Any
    
    def n(value: Double, options: AnyObject[Any]): String
    
    def notice(args: Any*): Any
    
    def owrite(args: Any*): Unit
    
    def prompt(args: Any*): Any
    
    def rfc5424(`type`: String, args: js.Array[Any], fn: js.Function1[/* repeated */ Any, Unit]): Any
    
    def setLanguage(): Unit
    @JSName("setLanguage")
    var setLanguage_Original: js.Function0[Unit]
    
    def silly(args: Any*): Any
    
    def t(path: String, variables: Any): Any
    
    def verbose(args: Any*): Any
    
    def warn(args: Any*): Any
    
    def warning(args: Any*): Any
    
    def write(args: Any*): Unit
  }
  object StrongGlobalize {
    
    inline def apply(
      Error: /* repeated */ Any => Any,
      alert: /* repeated */ Any => Any,
      c: (Any, String, AnyObject[Any]) => String,
      critical: /* repeated */ Any => Any,
      d: (js.Date, AnyObject[Any]) => String,
      data: /* repeated */ Any => Any,
      debug: /* repeated */ Any => Any,
      emergency: /* repeated */ Any => Any,
      error: /* repeated */ Any => Any,
      ewrite: /* repeated */ Any => Callback,
      f: /* repeated */ Any => Any,
      format: /* repeated */ Any => Any,
      formatCurrency: (Any, String, AnyObject[Any]) => String,
      formatDate: (js.Date, AnyObject[Any]) => String,
      formatMessage: (String, Any) => Any,
      formatNumber: (Double, AnyObject[Any]) => String,
      getLanguage: CallbackTo[String],
      help: /* repeated */ Any => Any,
      info: /* repeated */ Any => Any,
      informational: /* repeated */ Any => Any,
      input: /* repeated */ Any => Any,
      log: /* repeated */ Any => Any,
      m: (String, Any) => Any,
      n: (Double, AnyObject[Any]) => String,
      notice: /* repeated */ Any => Any,
      owrite: /* repeated */ Any => Callback,
      prompt: /* repeated */ Any => Any,
      rfc5424: (String, js.Array[Any], js.Function1[/* repeated */ Any, Unit]) => Any,
      setLanguage: Callback,
      silly: /* repeated */ Any => Any,
      t: (String, Any) => Any,
      verbose: /* repeated */ Any => Any,
      warn: /* repeated */ Any => Any,
      warning: /* repeated */ Any => Any,
      write: /* repeated */ Any => Callback
    ): StrongGlobalize = {
      val __obj = js.Dynamic.literal(Error = js.Any.fromFunction1(Error), alert = js.Any.fromFunction1(alert), c = js.Any.fromFunction3(c), critical = js.Any.fromFunction1(critical), d = js.Any.fromFunction2(d), data = js.Any.fromFunction1(data), debug = js.Any.fromFunction1(debug), emergency = js.Any.fromFunction1(emergency), error = js.Any.fromFunction1(error), ewrite = js.Any.fromFunction1((t0: /* repeated */ Any) => ewrite(t0).runNow()), f = js.Any.fromFunction1(f), format = js.Any.fromFunction1(format), formatCurrency = js.Any.fromFunction3(formatCurrency), formatDate = js.Any.fromFunction2(formatDate), formatMessage = js.Any.fromFunction2(formatMessage), formatNumber = js.Any.fromFunction2(formatNumber), getLanguage = getLanguage.toJsFn, help = js.Any.fromFunction1(help), info = js.Any.fromFunction1(info), informational = js.Any.fromFunction1(informational), input = js.Any.fromFunction1(input), log = js.Any.fromFunction1(log), m = js.Any.fromFunction2(m), n = js.Any.fromFunction2(n), notice = js.Any.fromFunction1(notice), owrite = js.Any.fromFunction1((t0: /* repeated */ Any) => owrite(t0).runNow()), prompt = js.Any.fromFunction1(prompt), rfc5424 = js.Any.fromFunction3(rfc5424), setLanguage = setLanguage.toJsFn, silly = js.Any.fromFunction1(silly), t = js.Any.fromFunction2(t), verbose = js.Any.fromFunction1(verbose), warn = js.Any.fromFunction1(warn), warning = js.Any.fromFunction1(warning), write = js.Any.fromFunction1((t0: /* repeated */ Any) => write(t0).runNow()))
      __obj.asInstanceOf[StrongGlobalize]
    }
    
    extension [Self <: StrongGlobalize](x: Self) {
      
      inline def setAlert(value: /* repeated */ Any => Any): Self = StObject.set(x, "alert", js.Any.fromFunction1(value))
      
      inline def setC(value: (Any, String, AnyObject[Any]) => String): Self = StObject.set(x, "c", js.Any.fromFunction3(value))
      
      inline def setCritical(value: /* repeated */ Any => Any): Self = StObject.set(x, "critical", js.Any.fromFunction1(value))
      
      inline def setD(value: (js.Date, AnyObject[Any]) => String): Self = StObject.set(x, "d", js.Any.fromFunction2(value))
      
      inline def setData(value: /* repeated */ Any => Any): Self = StObject.set(x, "data", js.Any.fromFunction1(value))
      
      inline def setDebug(value: /* repeated */ Any => Any): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setEmergency(value: /* repeated */ Any => Any): Self = StObject.set(x, "emergency", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ Any => Any): Self = StObject.set(x, "Error", js.Any.fromFunction1(value))
      
      inline def setEwrite(value: /* repeated */ Any => Callback): Self = StObject.set(x, "ewrite", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setF(value: /* repeated */ Any => Any): Self = StObject.set(x, "f", js.Any.fromFunction1(value))
      
      inline def setFormat(value: /* repeated */ Any => Any): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatCurrency(value: (Any, String, AnyObject[Any]) => String): Self = StObject.set(x, "formatCurrency", js.Any.fromFunction3(value))
      
      inline def setFormatDate(value: (js.Date, AnyObject[Any]) => String): Self = StObject.set(x, "formatDate", js.Any.fromFunction2(value))
      
      inline def setFormatMessage(value: (String, Any) => Any): Self = StObject.set(x, "formatMessage", js.Any.fromFunction2(value))
      
      inline def setFormatNumber(value: (Double, AnyObject[Any]) => String): Self = StObject.set(x, "formatNumber", js.Any.fromFunction2(value))
      
      inline def setGetLanguage(value: CallbackTo[String]): Self = StObject.set(x, "getLanguage", value.toJsFn)
      
      inline def setHelp(value: /* repeated */ Any => Any): Self = StObject.set(x, "help", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ Any => Any): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setInformational(value: /* repeated */ Any => Any): Self = StObject.set(x, "informational", js.Any.fromFunction1(value))
      
      inline def setInput(value: /* repeated */ Any => Any): Self = StObject.set(x, "input", js.Any.fromFunction1(value))
      
      inline def setLog(value: /* repeated */ Any => Any): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setM(value: (String, Any) => Any): Self = StObject.set(x, "m", js.Any.fromFunction2(value))
      
      inline def setN(value: (Double, AnyObject[Any]) => String): Self = StObject.set(x, "n", js.Any.fromFunction2(value))
      
      inline def setNotice(value: /* repeated */ Any => Any): Self = StObject.set(x, "notice", js.Any.fromFunction1(value))
      
      inline def setOwrite(value: /* repeated */ Any => Callback): Self = StObject.set(x, "owrite", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setPrompt(value: /* repeated */ Any => Any): Self = StObject.set(x, "prompt", js.Any.fromFunction1(value))
      
      inline def setRfc5424(value: (String, js.Array[Any], js.Function1[/* repeated */ Any, Unit]) => Any): Self = StObject.set(x, "rfc5424", js.Any.fromFunction3(value))
      
      inline def setSetLanguage(value: Callback): Self = StObject.set(x, "setLanguage", value.toJsFn)
      
      inline def setSilly(value: /* repeated */ Any => Any): Self = StObject.set(x, "silly", js.Any.fromFunction1(value))
      
      inline def setT(value: (String, Any) => Any): Self = StObject.set(x, "t", js.Any.fromFunction2(value))
      
      inline def setVerbose(value: /* repeated */ Any => Any): Self = StObject.set(x, "verbose", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Any): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      inline def setWarning(value: /* repeated */ Any => Any): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
      
      inline def setWrite(value: /* repeated */ Any => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
}
