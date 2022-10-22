package typingsJapgolly.webdriver

import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRequestFactoryMod {
  
  @JSImport("webdriver/build/request/factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with RequestFactory
  /* static members */
  object default {
    
    @JSImport("webdriver/build/request/factory", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(method: String, endpoint: String): typingsJapgolly.webdriver.buildRequestMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(method.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.webdriver.buildRequestMod.default]
    inline def getInstance(method: String, endpoint: String, body: Unit, isHubCommand: Boolean): typingsJapgolly.webdriver.buildRequestMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(method.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], body.asInstanceOf[js.Any], isHubCommand.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.webdriver.buildRequestMod.default]
    inline def getInstance(method: String, endpoint: String, body: Record[String, Any]): typingsJapgolly.webdriver.buildRequestMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(method.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.webdriver.buildRequestMod.default]
    inline def getInstance(method: String, endpoint: String, body: Record[String, Any], isHubCommand: Boolean): typingsJapgolly.webdriver.buildRequestMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(method.asInstanceOf[js.Any], endpoint.asInstanceOf[js.Any], body.asInstanceOf[js.Any], isHubCommand.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.webdriver.buildRequestMod.default]
  }
  
  @JSImport("webdriver/build/request/factory", "URLFactory")
  @js.native
  open class URLFactory () extends StObject
  /* static members */
  object URLFactory {
    
    @JSImport("webdriver/build/request/factory", "URLFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInstance(uri: String): URL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(uri.asInstanceOf[js.Any]).asInstanceOf[URL_]
  }
  
  trait RequestFactory extends StObject
}
