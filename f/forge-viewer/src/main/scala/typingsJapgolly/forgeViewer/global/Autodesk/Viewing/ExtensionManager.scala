package typingsJapgolly.forgeViewer.global.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.forgeViewer.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Autodesk.Viewing.ExtensionManager")
@js.native
open class ExtensionManager ()
  extends StObject
     with typingsJapgolly.forgeViewer.Autodesk.Viewing.ExtensionManager {
  
  /* CompleteClass */
  var extensions: StringDictionary[typingsJapgolly.forgeViewer.Autodesk.Viewing.Extension] = js.native
  
  /* CompleteClass */
  var extensionsAsync: StringDictionary[typingsJapgolly.forgeViewer.Autodesk.Viewing.Extension] = js.native
  
  /* CompleteClass */
  override def getExtension(extensionId: String): typingsJapgolly.forgeViewer.Autodesk.Viewing.Extension | Null = js.native
  
  /* CompleteClass */
  override def getExternalPath(extensionId: String): String | Null = js.native
  
  /* CompleteClass */
  override def getRegisteredExtensions(): js.Array[Id] = js.native
  
  /* CompleteClass */
  override def popuplateOptions(options: Any): Unit = js.native
  
  /* CompleteClass */
  override def registerExtension(extensionId: String, `extension`: js.Object): Boolean = js.native
  
  /* CompleteClass */
  override def registerExternalExtension(extensionId: String, urlPath: String): Boolean = js.native
  
  /* CompleteClass */
  override def unregisterExtension(extensionId: String): Boolean = js.native
  
  /* CompleteClass */
  override def unregisterExternalExtension(extensionId: String): Boolean = js.native
}
