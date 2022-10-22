package typingsJapgolly.cesium

import org.scalajs.dom.HTMLImageElement
import typingsJapgolly.cesium.mod.DiscardEmptyTileImagePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneDiscardEmptyTileImagePolicyMod {
  
  @JSImport("cesium/Source/Scene/DiscardEmptyTileImagePolicy", JSImport.Default)
  @js.native
  open class default () extends DiscardEmptyTileImagePolicy
  /* static members */
  object default {
    
    /**
      * Default value for representing an empty image.
      */
    @JSImport("cesium/Source/Scene/DiscardEmptyTileImagePolicy", "default.EMPTY_IMAGE")
    @js.native
    val EMPTY_IMAGE: HTMLImageElement = js.native
  }
}
