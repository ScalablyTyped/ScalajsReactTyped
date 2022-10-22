package typingsJapgolly.reactGravatar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactGravatar.mod.DefaultImage
import typingsJapgolly.reactGravatar.mod.Rating
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_Props_1615333234[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def default(value: DefaultImage): this.type = set("default", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def email(value: String): this.type = set("email", value.asInstanceOf[js.Any])
  
  inline def md5(value: String): this.type = set("md5", value.asInstanceOf[js.Any])
  
  inline def protocol(value: String): this.type = set("protocol", value.asInstanceOf[js.Any])
  
  inline def rating(value: Rating): this.type = set("rating", value.asInstanceOf[js.Any])
  
  inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  
  inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}
