package typingsJapgolly.octokitPluginRestEndpointMethods

import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.AnyResponse
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.MarkdownRenderParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.MarkdownRenderRawParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRenderRaw extends js.Object {
  /**
    * You must send Markdown as plain text (using a `Content-Type` header of `text/plain` or `text/x-markdown`) to this endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB or less.
    */
  @JSName("renderRaw")
  var renderRaw_Original: Anon185 = js.native
  @JSName("render")
  var render_Original: Anon184 = js.native
  def render(): js.Promise[AnyResponse] = js.native
  def render(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MarkdownRenderParams
  ): js.Promise[AnyResponse] = js.native
  /**
    * You must send Markdown as plain text (using a `Content-Type` header of `text/plain` or `text/x-markdown`) to this endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB or less.
    */
  def renderRaw(): js.Promise[AnyResponse] = js.native
  def renderRaw(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with MarkdownRenderRawParams
  ): js.Promise[AnyResponse] = js.native
}

