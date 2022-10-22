package typingsJapgolly.asciify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(text: String, callback: AsciifyCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(text: String, options: String, callback: AsciifyCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(text: String, options: AsciifyOptions, callback: AsciifyCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("asciify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFonts(callback: js.Function2[/* err */ js.Error, /* fonts */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFonts")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
