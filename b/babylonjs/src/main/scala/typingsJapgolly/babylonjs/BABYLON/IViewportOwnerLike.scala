package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the interface used by objects containing a viewport (like a camera)
  */
trait IViewportOwnerLike extends StObject {
  
  /**
    * Gets or sets the viewport
    */
  var viewport: IViewportLike
}
object IViewportOwnerLike {
  
  inline def apply(viewport: IViewportLike): IViewportOwnerLike = {
    val __obj = js.Dynamic.literal(viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewportOwnerLike]
  }
  
  extension [Self <: IViewportOwnerLike](x: Self) {
    
    inline def setViewport(value: IViewportLike): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
