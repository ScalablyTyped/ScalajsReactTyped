package typingsJapgolly.wixStyleReact

import typingsJapgolly.wixStyleReact.anon.Base
import typingsJapgolly.wixStyleReact.anon.BeginDrag
import typingsJapgolly.wixStyleReact.anon.DepthLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsDragAndDropDragAndDropDriverFactoryMod {
  
  @JSImport("wix-style-react/dist/types/utils/DragAndDrop/dragAndDropDriverFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def changeItemDepth(hasDragAndDropDriverDepthLevelThresholdDataHook: DepthLevel): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("changeItemDepth")(hasDragAndDropDriverDepthLevelThresholdDataHook.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def dragAndDropDriverFactory(hasBaseElement: Base): BeginDrag = ^.asInstanceOf[js.Dynamic].applyDynamic("dragAndDropDriverFactory")(hasBaseElement.asInstanceOf[js.Any]).asInstanceOf[BeginDrag]
}
