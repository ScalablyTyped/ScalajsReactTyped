package typingsJapgolly.reactUid.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactUid.distEs5ContextMod.IdSourceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_UIDProps1019690087[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def idSource(value: IdSourceType): this.type = set("idSource", value.asInstanceOf[js.Any])
  
  inline def name(value: /* n */ String | Double => String): this.type = set("name", js.Any.fromFunction1(value))
}
