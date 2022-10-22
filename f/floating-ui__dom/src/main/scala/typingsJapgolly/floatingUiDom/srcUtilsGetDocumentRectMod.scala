package typingsJapgolly.floatingUiDom

import org.scalajs.dom.HTMLElement
import typingsJapgolly.floatingUiCore.srcTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsGetDocumentRectMod {
  
  @JSImport("@floating-ui/dom/src/utils/getDocumentRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocumentRect(element: HTMLElement): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentRect")(element.asInstanceOf[js.Any]).asInstanceOf[Rect]
}
