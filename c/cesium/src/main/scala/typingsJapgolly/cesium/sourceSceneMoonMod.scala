package typingsJapgolly.cesium

import typingsJapgolly.cesium.anon.OnlySunLighting
import typingsJapgolly.cesium.mod.Moon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneMoonMod {
  
  @JSImport("cesium/Source/Scene/Moon", JSImport.Default)
  @js.native
  open class default () extends Moon {
    def this(options: OnlySunLighting) = this()
  }
}
