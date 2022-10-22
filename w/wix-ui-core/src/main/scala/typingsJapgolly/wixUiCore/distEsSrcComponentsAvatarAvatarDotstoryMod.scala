package typingsJapgolly.wixUiCore

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixUiCore.anon.Component
import typingsJapgolly.wixUiCore.anon.Datahook
import typingsJapgolly.wixUiCore.anon.ImgProps
import typingsJapgolly.wixUiCore.anon.TypeofAvatarComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsAvatarAvatarMod.AvatarComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsAvatarAvatarDotstoryMod {
  
  object default {
    
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar.story", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar.story", "default.category")
    @js.native
    def category: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Category */ Any = js.native
    inline def category_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.Category */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar.story", "default.component")
    @js.native
    open class component () extends AvatarComponent
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar.story", "default.component")
    @js.native
    def component: TypeofAvatarComponent = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar.story", "default.componentPath")
    @js.native
    def componentPath: String = js.native
    inline def componentPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentPath")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar.story", "default.componentProps")
    @js.native
    def componentProps: Datahook = js.native
    inline def componentProps_=(x: Datahook): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(x.asInstanceOf[js.Any])
    
    inline def componentWrapper(hasComponent: Component): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("componentWrapper")(hasComponent.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def component_=(x: TypeofAvatarComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar.story", "default.exampleProps")
    @js.native
    def exampleProps: ImgProps = js.native
    inline def exampleProps_=(x: ImgProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exampleProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/avatar/avatar.story", "default.storyName")
    @js.native
    def storyName: String = js.native
    inline def storyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyName")(x.asInstanceOf[js.Any])
  }
}
