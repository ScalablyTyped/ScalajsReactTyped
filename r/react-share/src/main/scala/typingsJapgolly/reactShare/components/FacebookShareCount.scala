package typingsJapgolly.reactShare.components

import typingsJapgolly.reactShare.anon.OmitHTMLAttributesHTMLSpa
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FacebookShareCount {
  
  inline def apply(url: String): SharedBuilder_OmitHTMLAttributesHTMLSpa1262211358 = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_OmitHTMLAttributesHTMLSpa1262211358(js.Array(this.component, __props.asInstanceOf[OmitHTMLAttributesHTMLSpa]))
  }
  
  @JSImport("react-share", "FacebookShareCount")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OmitHTMLAttributesHTMLSpa): SharedBuilder_OmitHTMLAttributesHTMLSpa1262211358 = new SharedBuilder_OmitHTMLAttributesHTMLSpa1262211358(js.Array(this.component, p.asInstanceOf[js.Any]))
}
