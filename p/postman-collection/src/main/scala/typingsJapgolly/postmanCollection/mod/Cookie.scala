package typingsJapgolly.postmanCollection.mod

import typingsJapgolly.postmanCollection.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped postman-collection.postman-collection.CookieDefinition extends 'key' ? never : postman-collection.postman-collection.CookieDefinition */ @JSImport("postman-collection", "Cookie")
@js.native
open class Cookie () extends PropertyBase[CookieDefinition] {
  def this(options: CookieDefinition) = this()
  
  var domain: String = js.native
  
  var expires: js.Date = js.native
  
  var extensions: js.UndefOr[js.Array[Key]] = js.native
  
  var hostOnly: js.UndefOr[Boolean] = js.native
  
  var httpOnly: js.UndefOr[Boolean] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var path: String = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
  
  var session: js.UndefOr[Boolean] = js.native
  
  def update(options: CookieDefinition): Unit = js.native
  
  var value: js.UndefOr[String] = js.native
}
/* static members */
object Cookie {
  
  @JSImport("postman-collection", "Cookie")
  @js.native
  val ^ : js.Any = js.native
  
  /** Check whether an object is an instance of PostmanCookie. */
  inline def isCookie(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCookie")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Cookie header parser */
  inline def parse(str: String): CookieDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[CookieDefinition]
  
  /**
    * Converts the Cookie to a single Set-Cookie header string.
    */
  inline def stringify(cookie: CookieDefinition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(cookie.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Stringifies an Array or {@link PropertyList} of Cookies into a single string. */
  inline def unparse(cookies: js.Array[CookieDefinition]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(cookies.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Unparses a single Cookie. */
  inline def unparseSingle(cookie: CookieDefinition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparseSingle")(cookie.asInstanceOf[js.Any]).asInstanceOf[String]
}
