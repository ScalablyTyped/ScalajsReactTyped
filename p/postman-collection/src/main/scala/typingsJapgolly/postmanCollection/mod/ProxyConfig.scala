package typingsJapgolly.postmanCollection.mod

import typingsJapgolly.postmanCollection.anon.Pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typingsJapgolly.postmanCollection.mod.PropertyDefinition because Already inherited
- typingsJapgolly.postmanCollection.mod.ProxyConfigDefinition because var conflicts: description, disabled, id, name. Inlined `match`, host, port, tunnel */ @JSImport("postman-collection", "ProxyConfig")
@js.native
open class ProxyConfig () extends Property[ProxyConfigDefinition] {
  def this(options: ProxyConfigDefinition) = this()
  
  def getProtocols(): js.Array[String] = js.native
  
  def getProxyUrl(): String = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var `match`: js.UndefOr[Pattern | String | UrlMatchPattern] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  def test(): Boolean = js.native
  def test(urlStr: String): Boolean = js.native
  
  var tunnel: js.UndefOr[Boolean] = js.native
  
  def update(options: ProxyConfigDefinition): Unit = js.native
  
  def updateProtocols(protocols: js.Array[String]): Unit = js.native
}
/* static members */
object ProxyConfig {
  
  @JSImport("postman-collection", "ProxyConfig")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isProxyConfig(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProxyConfig")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
