package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.distFirestoreSrcModelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcLocalEncodedResourcePathMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/local/encoded_resource_path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeResourcePath(path: EncodedResourcePath): ResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeResourcePath")(path.asInstanceOf[js.Any]).asInstanceOf[ResourcePath]
  
  inline def encodeResourcePath(path: ResourcePath): EncodedResourcePath = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeResourcePath")(path.asInstanceOf[js.Any]).asInstanceOf[EncodedResourcePath]
  
  type EncodedResourcePath = String
}
