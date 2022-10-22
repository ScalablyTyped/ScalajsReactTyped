package typingsJapgolly.tabris.global.tabris

import typingsJapgolly.tabris.anon.OmitWidgetanysetAbsoluteBounds
import typingsJapgolly.tabris.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Widget")
@js.native
/**
  * Base class for all widgets
  * 
  * This constructor can be called as a factory, without "new". Doing so allows passing an attributes
  * object which may include (in addition to the properties) children, event listeners and layout
  * shorthands.
  */
/* protected */ open class Widget[TData /* <: js.Object */] ()
  extends typingsJapgolly.tabris.mod.Widget[TData] {
  /* protected */ def this(properties: Properties[typingsJapgolly.tabris.mod.Widget[Any], OmitWidgetanysetAbsoluteBounds[TData]]) = this()
}
