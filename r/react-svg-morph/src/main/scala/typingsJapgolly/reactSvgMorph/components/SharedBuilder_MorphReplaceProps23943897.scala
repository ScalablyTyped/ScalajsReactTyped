package typingsJapgolly.reactSvgMorph.components

import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_MorphReplaceProps23943897[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
  
  inline def easing(value: /* props */ Any => Double): this.type = set("easing", js.Any.fromFunction1(value))
  
  inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
  
  inline def preserveAspectRatio(value: String): this.type = set("preserveAspectRatio", value.asInstanceOf[js.Any])
  
  inline def rotation(value: String): this.type = set("rotation", value.asInstanceOf[js.Any])
  
  inline def viewBox(value: String): this.type = set("viewBox", value.asInstanceOf[js.Any])
  
  inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
}
