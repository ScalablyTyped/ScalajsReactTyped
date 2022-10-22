package typingsJapgolly.popperjsCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.popperjsCore.libTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsGetDocumentRectMod {
  
  @JSImport("@popperjs/core/lib/dom-utils/getDocumentRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: HTMLElement): Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Rect]
}
