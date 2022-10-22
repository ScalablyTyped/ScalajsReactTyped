package typingsJapgolly.blueprintjsCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsToastToasterMod.ToasterPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IToasterProps1582994925[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def canEscapeKeyClear(value: Boolean): this.type = set("canEscapeKeyClear", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def maxToasts(value: Double): this.type = set("maxToasts", value.asInstanceOf[js.Any])
  
  inline def position(value: ToasterPosition): this.type = set("position", value.asInstanceOf[js.Any])
  
  inline def usePortal(value: Boolean): this.type = set("usePortal", value.asInstanceOf[js.Any])
}
