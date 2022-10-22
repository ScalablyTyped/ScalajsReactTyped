package typingsJapgolly.materialUiIcons

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.svgIconSvgIconMod.SvgIconTypeMap
import typingsJapgolly.materialUiIcons.materialUiIconsStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adjustSharpMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Icons](https://mui.com/components/icons/)
    * - [Material Icons](https://mui.com/components/material-icons/)
    *
    * API:
    *
    * - [SvgIcon API](https://mui.com/api/svg-icon/)
    */
  @JSImport("@material-ui/icons/AdjustSharp", JSImport.Default)
  @js.native
  val default: OverridableComponent[SvgIconTypeMap[js.Object, svg]] = js.native
  
  type _To = OverridableComponent[SvgIconTypeMap[js.Object, svg]]
  
  /* This means you don't have to write `default`, but can instead just say `adjustSharpMod.foo` */
  override def _to: OverridableComponent[SvgIconTypeMap[js.Object, svg]] = default
}
