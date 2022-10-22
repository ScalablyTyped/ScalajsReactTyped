package typingsJapgolly.storybookClientLogger

import typingsJapgolly.storybookClientLogger.storybookClientLoggerStrings.debug
import typingsJapgolly.storybookClientLogger.storybookClientLoggerStrings.error
import typingsJapgolly.storybookClientLogger.storybookClientLoggerStrings.info
import typingsJapgolly.storybookClientLogger.storybookClientLoggerStrings.log
import typingsJapgolly.storybookClientLogger.storybookClientLoggerStrings.trace
import typingsJapgolly.storybookClientLogger.storybookClientLoggerStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object logger {
    
    @JSImport("@storybook/client-logger", "logger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def error(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def info(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def log(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def trace(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def warn(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  object once {
    
    inline def apply(`type`: /* keyof @storybook/client-logger.anon.Debug */ trace | debug | info | warn | error | log): js.Function2[/* message */ Any, /* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* message */ Any, /* repeated */ Any, Unit]]
    
    @JSImport("@storybook/client-logger", "once")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    inline def debug(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def error(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def info(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def log(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def trace(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def warn(message: Any, rest: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(message.asInstanceOf[js.Any]).`++`(rest.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  object pretty {
    
    inline def apply(`type`: /* keyof @storybook/client-logger.anon.Debug */ trace | debug | info | warn | error | log): js.Function1[/* repeated */ String, Unit] = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ String, Unit]]
    
    @JSImport("@storybook/client-logger", "pretty")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def error(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def info(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def trace(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def warn(args: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  }
}
