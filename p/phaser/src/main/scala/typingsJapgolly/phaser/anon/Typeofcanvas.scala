package typingsJapgolly.phaser.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.phaser.spine.canvas.AssetManager
import typingsJapgolly.phaser.spine.canvas.CanvasTexture
import typingsJapgolly.phaser.spine.canvas.SkeletonRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofcanvas extends StObject {
  
  var AssetManager: Instantiable1[
    /* pathPrefix */ js.UndefOr[String], 
    typingsJapgolly.phaser.spine.canvas.AssetManager
  ]
  
  var CanvasTexture: Instantiable1[/* image */ HTMLImageElement, typingsJapgolly.phaser.spine.canvas.CanvasTexture]
  
  var SkeletonRenderer: (Instantiable1[
    /* context */ CanvasRenderingContext2D, 
    typingsJapgolly.phaser.spine.canvas.SkeletonRenderer
  ]) & TypeofSkeletonRenderer
}
object Typeofcanvas {
  
  inline def apply(
    AssetManager: Instantiable1[/* pathPrefix */ js.UndefOr[String], AssetManager],
    CanvasTexture: Instantiable1[/* image */ HTMLImageElement, CanvasTexture],
    SkeletonRenderer: (Instantiable1[/* context */ CanvasRenderingContext2D, SkeletonRenderer]) & TypeofSkeletonRenderer
  ): Typeofcanvas = {
    val __obj = js.Dynamic.literal(AssetManager = AssetManager.asInstanceOf[js.Any], CanvasTexture = CanvasTexture.asInstanceOf[js.Any], SkeletonRenderer = SkeletonRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcanvas]
  }
  
  extension [Self <: Typeofcanvas](x: Self) {
    
    inline def setAssetManager(value: Instantiable1[/* pathPrefix */ js.UndefOr[String], AssetManager]): Self = StObject.set(x, "AssetManager", value.asInstanceOf[js.Any])
    
    inline def setCanvasTexture(value: Instantiable1[/* image */ HTMLImageElement, CanvasTexture]): Self = StObject.set(x, "CanvasTexture", value.asInstanceOf[js.Any])
    
    inline def setSkeletonRenderer(
      value: (Instantiable1[/* context */ CanvasRenderingContext2D, SkeletonRenderer]) & TypeofSkeletonRenderer
    ): Self = StObject.set(x, "SkeletonRenderer", value.asInstanceOf[js.Any])
  }
}
