package typingsJapgolly.reduxLittleRouter.components

import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reduxLittleRouter.anon.Payload
import typingsJapgolly.reduxLittleRouter.mod.Href
import typingsJapgolly.reduxLittleRouter.mod.Location
import typingsJapgolly.reduxLittleRouter.mod.LocationOptions
import typingsJapgolly.reduxLittleRouter.mod.ObjectLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_LinkProps1956631017[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def activeProps(value: ObjectLiteral[Any]): this.type = set("activeProps", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def location(value: Location): this.type = set("location", value.asInstanceOf[js.Any])
  
  inline def onClick(value: /* event */ Event => Any): this.type = set("onClick", js.Any.fromFunction1(value))
  
  inline def persistQuery(value: Boolean): this.type = set("persistQuery", value.asInstanceOf[js.Any])
  
  inline def push(value: (/* href */ Href, /* options */ LocationOptions) => Payload): this.type = set("push", js.Any.fromFunction2(value))
  
  inline def replace(value: (/* href */ Href, /* options */ LocationOptions) => Payload): this.type = set("replace", js.Any.fromFunction2(value))
  
  inline def replaceState(value: Boolean): this.type = set("replaceState", value.asInstanceOf[js.Any])
  
  inline def style(value: ObjectLiteral[Any]): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
}
