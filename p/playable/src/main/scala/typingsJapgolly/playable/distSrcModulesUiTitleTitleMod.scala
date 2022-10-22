package typingsJapgolly.playable

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.playable.anon.ConfigTheme
import typingsJapgolly.playable.distSrcModulesUiTitleTypesMod.ITitle
import typingsJapgolly.playable.distSrcModulesUiTitleTypesMod.ITitleViewConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiTitleTitleMod {
  
  @JSImport("playable/dist/src/modules/ui/title/title", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Title {
    def this(hasThemeConfig: ConfigTheme) = this()
  }
  object default {
    
    @JSImport("playable/dist/src/modules/ui/title/title", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("playable/dist/src/modules/ui/title/title", "default.View")
    @js.native
    open class View protected ()
      extends typingsJapgolly.playable.distSrcModulesUiTitleTitleDotviewMod.default {
      def this(config: ITitleViewConfig) = this()
    }
    /* static member */
    /* was `typeof View` */
    @JSImport("playable/dist/src/modules/ui/title/title", "default.View")
    @js.native
    def View: Instantiable1[
        /* config */ ITitleViewConfig, 
        typingsJapgolly.playable.distSrcModulesUiTitleTitleDotviewMod.default
      ] = js.native
    inline def View_=(
      x: Instantiable1[
          /* config */ ITitleViewConfig, 
          typingsJapgolly.playable.distSrcModulesUiTitleTitleDotviewMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("View")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/title/title", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    inline def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("playable/dist/src/modules/ui/title/title", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    inline def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Title
    extends StObject
       with ITitle {
    
    /* private */ var _bindCallbacks: Any = js.native
    
    /* private */ var _callback: Any = js.native
    
    /* private */ var _initUI: Any = js.native
    
    /* private */ var _theme: Any = js.native
    
    /* private */ var _triggerCallback: Any = js.native
    
    var isHidden: Boolean = js.native
    
    var view: typingsJapgolly.playable.distSrcModulesUiTitleTitleDotviewMod.default = js.native
  }
}
