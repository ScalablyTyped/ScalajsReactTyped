package typingsJapgolly.oauth2Server.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.oauth2Server.oauth2ServerBooleans.`false`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an incoming HTTP request.
  */
@JSImport("oauth2-server", "Request")
@js.native
/**
  * Instantiates Request using the supplied options.
  *
  */
open class Request () extends StObject {
  def this(options: StringDictionary[Any]) = this()
  def this(options: Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]) = this()
  
  var body: js.UndefOr[Any] = js.native
  
  /**
    * Returns the specified HTTP header field. The match is case-insensitive.
    *
    */
  def get(field: String): js.UndefOr[Any] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Checks if the request’s Content-Type HTTP header matches any of the given MIME types.
    *
    */
  def is(types: js.Array[String]): String | `false` = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var query: js.UndefOr[StringDictionary[String]] = js.native
}
