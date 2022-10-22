package typingsJapgolly.reactDndHtml5Backend

import org.scalajs.dom.DataTransfer
import typingsJapgolly.reactDndHtml5Backend.distNativeDragSourcesNativeDragSourceMod.NativeDragSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativeDragSourcesMod {
  
  @JSImport("react-dnd-html5-backend/dist/NativeDragSources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNativeDragSource(`type`: String): NativeDragSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createNativeDragSource")(`type`.asInstanceOf[js.Any]).asInstanceOf[NativeDragSource]
  inline def createNativeDragSource(`type`: String, dataTransfer: DataTransfer): NativeDragSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createNativeDragSource")(`type`.asInstanceOf[js.Any], dataTransfer.asInstanceOf[js.Any])).asInstanceOf[NativeDragSource]
  
  inline def matchNativeItemType(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("matchNativeItemType")().asInstanceOf[String | Null]
  inline def matchNativeItemType(dataTransfer: DataTransfer): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("matchNativeItemType")(dataTransfer.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
