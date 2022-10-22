package typingsJapgolly.materialUi.components

import typingsJapgolly.materialUi.MaterialUI.SvgIconProps
import typingsJapgolly.materialUi.svgIconsEditorAttachFileMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AttachFile {
  
  @JSImport("material-ui/svg-icons/editor/attach-file", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: AttachFile.type): SharedBuilder_SvgIconProps_115160895[default] = new SharedBuilder_SvgIconProps_115160895[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SvgIconProps): SharedBuilder_SvgIconProps_115160895[default] = new SharedBuilder_SvgIconProps_115160895[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
