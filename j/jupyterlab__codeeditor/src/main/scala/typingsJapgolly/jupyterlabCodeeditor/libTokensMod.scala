package typingsJapgolly.jupyterlabCodeeditor

import typingsJapgolly.jupyterlabCodeeditor.libFactoryMod.IEditorFactoryService
import typingsJapgolly.jupyterlabCodeeditor.libMimetypeMod.IEditorMimeTypeService
import typingsJapgolly.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  trait IEditorServices extends StObject {
    
    /**
      * The code editor factory.
      */
    val factoryService: IEditorFactoryService
    
    /**
      * The editor mime type service.
      */
    val mimeTypeService: IEditorMimeTypeService
  }
  object IEditorServices {
    
    @JSImport("@jupyterlab/codeeditor/lib/tokens", "IEditorServices")
    @js.native
    val ^ : Token[IEditorServices] = js.native
    
    extension [Self <: IEditorServices](x: Self) {
      
      inline def setFactoryService(value: IEditorFactoryService): Self = StObject.set(x, "factoryService", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeService(value: IEditorMimeTypeService): Self = StObject.set(x, "mimeTypeService", value.asInstanceOf[js.Any])
    }
  }
}
