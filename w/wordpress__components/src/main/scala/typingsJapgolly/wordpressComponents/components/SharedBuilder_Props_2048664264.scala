package typingsJapgolly.wordpressComponents.components

import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_Props_2048664264 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def currentDate(value: String): this.type = set("currentDate", value.asInstanceOf[js.Any])
  
  inline def is12Hour(value: Boolean): this.type = set("is12Hour", value.asInstanceOf[js.Any])
  
  inline def isInvalidDate(value: /* date */ js.Date => Boolean): this.type = set("isInvalidDate", js.Any.fromFunction1(value))
}
