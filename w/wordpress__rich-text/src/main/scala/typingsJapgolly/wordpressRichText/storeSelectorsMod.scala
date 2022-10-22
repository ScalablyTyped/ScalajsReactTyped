package typingsJapgolly.wordpressRichText

import typingsJapgolly.wordpressRichText.mod.NamedFormatConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeSelectorsMod {
  
  @JSImport("@wordpress/rich-text/store/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFormatType(name: String): js.UndefOr[NamedFormatConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatType")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NamedFormatConfiguration]]
  
  inline def getFormatTypeForBareElement(
    bareElementTagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111, starting with typingsJapgolly.wordpressRichText.wordpressRichTextStrings.a, typingsJapgolly.wordpressRichText.wordpressRichTextStrings.abbr, typingsJapgolly.wordpressRichText.wordpressRichTextStrings.address */ Any
  ): js.UndefOr[NamedFormatConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatTypeForBareElement")(bareElementTagName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NamedFormatConfiguration]]
  
  inline def getFormatTypeForClassName(elementClassName: String): js.UndefOr[NamedFormatConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatTypeForClassName")(elementClassName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NamedFormatConfiguration]]
  
  inline def getFormatTypes(): js.Array[NamedFormatConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatTypes")().asInstanceOf[js.Array[NamedFormatConfiguration]]
}
