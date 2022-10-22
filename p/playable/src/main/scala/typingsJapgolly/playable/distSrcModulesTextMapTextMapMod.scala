package typingsJapgolly.playable

import typingsJapgolly.playable.anon.ConfigIPlayerConfig
import typingsJapgolly.playable.distSrcModulesTextMapTypesMod.ITextMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesTextMapTextMapMod {
  
  @JSImport("playable/dist/src/modules/text-map/text-map", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TextMap {
    def this(hasConfig: ConfigIPlayerConfig) = this()
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/text-map/text-map", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/text-map/text-map", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/text-map/text-map", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait TextMap
    extends StObject
       with ITextMap {
    
    /* private */ var _textMap: Any = js.native
  }
}
