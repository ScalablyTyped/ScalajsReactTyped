package typingsJapgolly.materialUiIcons

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.svgIconSvgIconMod.SvgIconTypeMap
import typingsJapgolly.materialUiIcons.materialUiIconsStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteSweepOutlinedMod extends Shortcut {
  
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
  @JSImport("@material-ui/icons/DeleteSweepOutlined", JSImport.Default)
  @js.native
  val default: OverridableComponent[SvgIconTypeMap[js.Object, svg]] = js.native
  
  type _To = OverridableComponent[SvgIconTypeMap[js.Object, svg]]
  
  /* This means you don't have to write `default`, but can instead just say `deleteSweepOutlinedMod.foo` */
  override def _to: OverridableComponent[SvgIconTypeMap[js.Object, svg]] = default
}
