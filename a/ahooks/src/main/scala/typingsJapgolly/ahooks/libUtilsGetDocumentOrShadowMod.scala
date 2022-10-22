package typingsJapgolly.ahooks

import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.ahooks.libUtilsDomTargetMod.BasicTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsGetDocumentOrShadowMod {
  
  @JSImport("ahooks/lib/utils/getDocumentOrShadow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: js.Array[BasicTarget[Element]]): Document | Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[Document | Node]
  inline def default(target: BasicTarget[Element]): Document | Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[Document | Node]
}
