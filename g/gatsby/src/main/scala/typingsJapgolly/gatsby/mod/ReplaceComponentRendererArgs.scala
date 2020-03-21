package typingsJapgolly.gatsby.mod

import typingsJapgolly.gatsby.Anon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceComponentRendererArgs extends BrowserPluginArgs {
  var loader: js.Object
  var props: Anon
}

object ReplaceComponentRendererArgs {
  @scala.inline
  def apply(
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    loader: js.Object,
    props: Anon
  ): ReplaceComponentRendererArgs = {
    val __obj = js.Dynamic.literal(getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplaceComponentRendererArgs]
  }
}

