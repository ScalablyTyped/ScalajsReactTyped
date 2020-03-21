package typingsJapgolly.reactHelmetWithVisor.mod

import org.scalajs.dom.raw.HTMLLinkElement
import org.scalajs.dom.raw.HTMLMetaElement
import org.scalajs.dom.raw.HTMLScriptElement
import org.scalajs.dom.raw.HTMLStyleElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelmetTags extends js.Object {
  var baseTag: js.Array[_]
  var linkTags: js.Array[HTMLLinkElement]
  var metaTags: js.Array[HTMLMetaElement]
  var noscriptTags: js.Array[_]
  var openedVisorTags: js.Array[_]
  var scriptTags: js.Array[HTMLScriptElement]
  var styleTags: js.Array[HTMLStyleElement]
}

object HelmetTags {
  @scala.inline
  def apply(
    baseTag: js.Array[_],
    linkTags: js.Array[HTMLLinkElement],
    metaTags: js.Array[HTMLMetaElement],
    noscriptTags: js.Array[_],
    openedVisorTags: js.Array[_],
    scriptTags: js.Array[HTMLScriptElement],
    styleTags: js.Array[HTMLStyleElement]
  ): HelmetTags = {
    val __obj = js.Dynamic.literal(baseTag = baseTag.asInstanceOf[js.Any], linkTags = linkTags.asInstanceOf[js.Any], metaTags = metaTags.asInstanceOf[js.Any], noscriptTags = noscriptTags.asInstanceOf[js.Any], openedVisorTags = openedVisorTags.asInstanceOf[js.Any], scriptTags = scriptTags.asInstanceOf[js.Any], styleTags = styleTags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HelmetTags]
  }
}

