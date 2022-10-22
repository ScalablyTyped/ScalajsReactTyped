package typingsJapgolly.linguiMacro.components

import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ChoiceProps_1610191505 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def few(value: String): this.type = set("few", value.asInstanceOf[js.Any])
  
  inline def many(value: String): this.type = set("many", value.asInstanceOf[js.Any])
  
  inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
  
  inline def one(value: String): this.type = set("one", value.asInstanceOf[js.Any])
  
  inline def other(value: String): this.type = set("other", value.asInstanceOf[js.Any])
  
  inline def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def zero(value: String): this.type = set("zero", value.asInstanceOf[js.Any])
}
