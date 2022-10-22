package typingsJapgolly.reduxLittleRouter.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reduxLittleRouter.mod.Location
import typingsJapgolly.reduxLittleRouter.mod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FragmentProps_1131544973[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def forNoMatch(value: Boolean): this.type = set("forNoMatch", value.asInstanceOf[js.Any])
  
  inline def forRoute(value: String): this.type = set("forRoute", value.asInstanceOf[js.Any])
  
  inline def location(value: Location): this.type = set("location", value.asInstanceOf[js.Any])
  
  inline def matchRoute(value: js.Function): this.type = set("matchRoute", value.asInstanceOf[js.Any])
  
  inline def matchWildcardRoute(value: js.Function): this.type = set("matchWildcardRoute", value.asInstanceOf[js.Any])
  
  inline def parentId(value: String): this.type = set("parentId", value.asInstanceOf[js.Any])
  
  inline def parentRoute(value: String): this.type = set("parentRoute", value.asInstanceOf[js.Any])
  
  inline def style(value: ObjectLiteral[Any]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def withConditions(value: /* location */ Location => Boolean): this.type = set("withConditions", js.Any.fromFunction1(value))
}
