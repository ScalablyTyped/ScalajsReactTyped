package typingsJapgolly.jupyterlabRendermimeInterfaces.mod.IRenderMime

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object that resolves relative URLs.
  */
trait IResolver extends js.Object {
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
    * Get the download url for a given absolute url path.
    *
    * #### Notes
    * This URL may include a query parameter.
    */
  def getDownloadUrl(url: String): js.Promise[String]
  /**
    * Resolve a relative url to an absolute url path.
    */
  def resolveUrl(url: String): js.Promise[String]
}

object IResolver {
  @scala.inline
  def apply(
    getDownloadUrl: String => CallbackTo[js.Promise[String]],
    resolveUrl: String => CallbackTo[js.Promise[String]],
    isLocal: /* url */ String => CallbackTo[Boolean] = null
  ): IResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDownloadUrl")(js.Any.fromFunction1((t0: java.lang.String) => getDownloadUrl(t0).runNow()))
    __obj.updateDynamic("resolveUrl")(js.Any.fromFunction1((t0: java.lang.String) => resolveUrl(t0).runNow()))
    if (isLocal != null) __obj.updateDynamic("isLocal")(js.Any.fromFunction1((t0: /* url */ java.lang.String) => isLocal(t0).runNow()))
    __obj.asInstanceOf[IResolver]
  }
}

