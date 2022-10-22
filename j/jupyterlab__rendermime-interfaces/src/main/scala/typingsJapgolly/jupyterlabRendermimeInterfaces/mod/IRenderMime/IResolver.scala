package typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that resolves relative URLs.
  */
trait IResolver extends StObject {
  
  /**
    * Get the download url for a given absolute url path.
    *
    * #### Notes
    * This URL may include a query parameter.
    */
  def getDownloadUrl(url: String): js.Promise[String]
  
  /**
    * Whether the URL should be handled by the resolver
    * or not.
    *
    * #### Notes
    * This is similar to the `isLocal` check in `URLExt`,
    * but can also perform additional checks on whether the
    * resolver should handle a given URL.
    */
  var isLocal: js.UndefOr[js.Function1[/* url */ String, Boolean]] = js.undefined
  
  /**
    * Resolve a relative url to an absolute url path.
    */
  def resolveUrl(url: String): js.Promise[String]
}
object IResolver {
  
  inline def apply(getDownloadUrl: String => js.Promise[String], resolveUrl: String => js.Promise[String]): IResolver = {
    val __obj = js.Dynamic.literal(getDownloadUrl = js.Any.fromFunction1(getDownloadUrl), resolveUrl = js.Any.fromFunction1(resolveUrl))
    __obj.asInstanceOf[IResolver]
  }
  
  extension [Self <: IResolver](x: Self) {
    
    inline def setGetDownloadUrl(value: String => js.Promise[String]): Self = StObject.set(x, "getDownloadUrl", js.Any.fromFunction1(value))
    
    inline def setIsLocal(value: /* url */ String => Boolean): Self = StObject.set(x, "isLocal", js.Any.fromFunction1(value))
    
    inline def setIsLocalUndefined: Self = StObject.set(x, "isLocal", js.undefined)
    
    inline def setResolveUrl(value: String => js.Promise[String]): Self = StObject.set(x, "resolveUrl", js.Any.fromFunction1(value))
  }
}
