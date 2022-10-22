package typingsJapgolly.meteor.global

import typingsJapgolly.meteor.EJSONableCustomType
import typingsJapgolly.meteor.JSONable
import typingsJapgolly.meteor.anon.Canonical
import typingsJapgolly.meteor.anon.KeyOrderSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EJSON {
  
  @JSGlobal("EJSON")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addType(name: String, factory: js.Function1[/* val */ JSONable, EJSONableCustomType]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addType")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clone_[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def equals_(a: typingsJapgolly.meteor.EJSON, b: typingsJapgolly.meteor.EJSON): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(a: typingsJapgolly.meteor.EJSON, b: typingsJapgolly.meteor.EJSON, options: KeyOrderSensitive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fromJSONValue(`val`: JSONable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isBinary(x: js.Object): /* is std.Uint8Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Uint8Array */ Boolean]
  
  inline def newBinary(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("newBinary")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def parse(str: String): typingsJapgolly.meteor.EJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.meteor.EJSON]
  
  inline def stringify(`val`: typingsJapgolly.meteor.EJSON): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(`val`: typingsJapgolly.meteor.EJSON, options: Canonical): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toJSONValue(`val`: typingsJapgolly.meteor.EJSON): JSONable = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[JSONable]
}
