package typingsJapgolly.reactOverlays.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactOverlays.anon.Placement
import typingsJapgolly.reactOverlays.esmUsePopperMod.Offset
import typingsJapgolly.reactOverlays.esmUsePopperMod.OffsetValue
import typingsJapgolly.reactOverlays.esmUsePopperMod.UsePopperOptions
import typingsJapgolly.reactOverlays.esmUseRootCloseMod.MouseEvents
import typingsJapgolly.reactOverlays.reactOverlaysStrings.enabled
import typingsJapgolly.reactOverlays.reactOverlaysStrings.placement
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DropdownMenuProps_1918268347 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def alignEnd(value: Boolean): this.type = set("alignEnd", value.asInstanceOf[js.Any])
  
  inline def fixed(value: Boolean): this.type = set("fixed", value.asInstanceOf[js.Any])
  
  inline def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
  
  inline def offset(value: Offset): this.type = set("offset", value.asInstanceOf[js.Any])
  
  inline def offsetFunction1(value: /* details */ Placement => OffsetValue): this.type = set("offset", js.Any.fromFunction1(value))
  
  inline def popperConfig(value: Omit[UsePopperOptions, enabled | placement]): this.type = set("popperConfig", value.asInstanceOf[js.Any])
  
  inline def rootCloseEvent(value: MouseEvents): this.type = set("rootCloseEvent", value.asInstanceOf[js.Any])
  
  inline def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
  
  inline def usePopper(value: Boolean): this.type = set("usePopper", value.asInstanceOf[js.Any])
}
