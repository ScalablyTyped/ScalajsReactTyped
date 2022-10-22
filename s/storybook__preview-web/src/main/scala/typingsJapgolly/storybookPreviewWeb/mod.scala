package typingsJapgolly.storybookPreviewWeb

import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.ModuleExports
import typingsJapgolly.storybookStore.distTs3Dot9TypesMod.WebProjectAnnotations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/preview-web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/preview-web", "Preview")
  @js.native
  open class Preview[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] ()
    extends typingsJapgolly.storybookPreviewWeb.distTs3Dot9PreviewMod.Preview[TFramework]
  
  @JSImport("@storybook/preview-web", "PreviewWeb")
  @js.native
  open class PreviewWeb[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] ()
    extends typingsJapgolly.storybookPreviewWeb.distTs3Dot9PreviewWebMod.PreviewWeb[TFramework]
  
  inline def composeConfigs[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](moduleExportList: js.Array[ModuleExports]): WebProjectAnnotations[TFramework] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeConfigs")(moduleExportList.asInstanceOf[js.Any]).asInstanceOf[WebProjectAnnotations[TFramework]]
  
  inline def simulateDOMContentLoaded(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("simulateDOMContentLoaded")().asInstanceOf[Unit]
  
  inline def simulatePageLoad($container: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("simulatePageLoad")($container.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
