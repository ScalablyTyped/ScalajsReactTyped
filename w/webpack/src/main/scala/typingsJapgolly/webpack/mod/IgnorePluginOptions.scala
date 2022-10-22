package typingsJapgolly.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.webpack.anon.ContextRegExp
  - typingsJapgolly.webpack.anon.CheckResource
*/
trait IgnorePluginOptions extends StObject
object IgnorePluginOptions {
  
  inline def CheckResource(checkResource: (String, String) => Boolean): typingsJapgolly.webpack.anon.CheckResource = {
    val __obj = js.Dynamic.literal(checkResource = js.Any.fromFunction2(checkResource))
    __obj.asInstanceOf[typingsJapgolly.webpack.anon.CheckResource]
  }
  
  inline def ContextRegExp(resourceRegExp: js.RegExp): typingsJapgolly.webpack.anon.ContextRegExp = {
    val __obj = js.Dynamic.literal(resourceRegExp = resourceRegExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.webpack.anon.ContextRegExp]
  }
}
