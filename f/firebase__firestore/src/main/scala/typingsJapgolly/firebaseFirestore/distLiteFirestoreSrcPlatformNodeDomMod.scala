package typingsJapgolly.firebaseFirestore

import org.scalajs.dom.Document
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcPlatformNodeDomMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/platform/node/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDocument(): Document | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")().asInstanceOf[Document | Null]
  
  inline def getWindow(): Window | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")().asInstanceOf[Window | Null]
}
