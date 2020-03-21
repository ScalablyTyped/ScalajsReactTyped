package typingsJapgolly.expressSitemapXml.mod

import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-sitemap-xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(getUrls: js.Function0[js.Array[SitemapLeaf] | js.Promise[js.Array[SitemapLeaf]]], base: String): RequestHandler[ParamsDictionary] = js.native
}

