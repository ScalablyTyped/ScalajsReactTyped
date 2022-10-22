package typingsJapgolly.nextSeo.libTypesMod

import typingsJapgolly.nextSeo.nextSeoStrings.`content-security-policy`
import typingsJapgolly.nextSeo.nextSeoStrings.`content-type`
import typingsJapgolly.nextSeo.nextSeoStrings.`default-style`
import typingsJapgolly.nextSeo.nextSeoStrings.`x-ua-compatible`
import typingsJapgolly.nextSeo.nextSeoStrings.refresh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nextSeo.libTypesMod.HTML5MetaTag
  - typingsJapgolly.nextSeo.libTypesMod.RDFaMetaTag
  - typingsJapgolly.nextSeo.libTypesMod.HTTPEquivMetaTag
*/
trait MetaTag extends StObject
object MetaTag {
  
  inline def HTML5MetaTag(content: String, httpEquiv: Unit, name: String, property: Unit): typingsJapgolly.nextSeo.libTypesMod.HTML5MetaTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], httpEquiv = httpEquiv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nextSeo.libTypesMod.HTML5MetaTag]
  }
  
  inline def HTTPEquivMetaTag(
    content: String,
    httpEquiv: `content-security-policy` | `content-type` | `default-style` | `x-ua-compatible` | refresh,
    name: Unit,
    property: Unit
  ): typingsJapgolly.nextSeo.libTypesMod.HTTPEquivMetaTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], httpEquiv = httpEquiv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nextSeo.libTypesMod.HTTPEquivMetaTag]
  }
  
  inline def RDFaMetaTag(content: String, httpEquiv: Unit, name: Unit, property: String): typingsJapgolly.nextSeo.libTypesMod.RDFaMetaTag = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], httpEquiv = httpEquiv.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.nextSeo.libTypesMod.RDFaMetaTag]
  }
}
