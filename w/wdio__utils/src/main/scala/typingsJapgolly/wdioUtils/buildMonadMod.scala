package typingsJapgolly.wdioUtils

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import typingsJapgolly.wdioUtils.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMonadMod {
  
  @JSImport("@wdio/utils/build/monad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Record[String, Any]): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Call]
  inline def default(options: Record[String, Any], modifier: js.Function): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def default(options: Record[String, Any], modifier: js.Function, propertiesObject: PropertiesObject): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], propertiesObject.asInstanceOf[js.Any])).asInstanceOf[Call]
  inline def default(options: Record[String, Any], modifier: Unit, propertiesObject: PropertiesObject): Call = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], propertiesObject.asInstanceOf[js.Any])).asInstanceOf[Call]
  
  type PropertiesObject = StringDictionary[js.PropertyDescriptor]
}
