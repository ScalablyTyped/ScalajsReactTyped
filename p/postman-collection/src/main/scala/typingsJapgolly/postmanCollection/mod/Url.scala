package typingsJapgolly.postmanCollection.mod

import typingsJapgolly.postmanCollection.anon.ForcePort
import typingsJapgolly.postmanCollection.anon.IgnoredDisabled
import typingsJapgolly.postmanCollection.anon.Password
import typingsJapgolly.postmanCollection.anon.Unresolved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typingsJapgolly.postmanCollection.mod.UrlDefinition because var conflicts: description. Inlined auth, hash, host, path, port, query, variable, protocol */ @JSImport("postman-collection", "Url")
@js.native
open class Url protected () extends PropertyBase[UrlDefinition] {
  def this(options: String) = this()
  def this(options: UrlDefinition) = this()
  
  def addQueryParams(params: String): Unit = js.native
  def addQueryParams(params: js.Array[QueryParamDefinition]): Unit = js.native
  
  var auth: js.UndefOr[Password] = js.native
  
  def getHost(): String = js.native
  
  def getOAuth1BaseUrl(): String = js.native
  
  def getPath(): String = js.native
  def getPath(options: Unresolved): String = js.native
  
  def getPathWithQuery(): String = js.native
  
  def getQueryString(): String = js.native
  def getQueryString(options: IgnoredDisabled): String = js.native
  
  def getRaw(): String = js.native
  
  def getRemote(): String = js.native
  def getRemote(options: ForcePort): String = js.native
  
  var hash: js.UndefOr[String] = js.native
  
  var host: js.UndefOr[js.Array[String] | String] = js.native
  
  var path: js.UndefOr[js.Array[String] | String] = js.native
  
  var port: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String] = js.native
  
  def removeQueryParams(params: String): Unit = js.native
  def removeQueryParams(params: js.Array[QueryParamDefinition | String]): Unit = js.native
  def removeQueryParams(params: QueryParamDefinition): Unit = js.native
  
  def toString(forceProtocol: Boolean): String = js.native
  
  def update(url: String): Unit = js.native
  def update(url: UrlDefinition): Unit = js.native
  
  var variable: js.UndefOr[js.Array[VariableDefinition]] = js.native
  
  var variables: VariableList = js.native
}
/* static members */
object Url {
  
  @JSImport("postman-collection", "Url")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUrl(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parse(url: String): UrlDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any]).asInstanceOf[UrlDefinition]
}
