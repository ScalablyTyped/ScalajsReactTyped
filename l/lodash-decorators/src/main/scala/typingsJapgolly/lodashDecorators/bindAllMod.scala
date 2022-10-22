package typingsJapgolly.lodashDecorators

import typingsJapgolly.std.ClassDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindAllMod {
  
  @JSImport("lodash-decorators/bindAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[ClassDecorator]
  inline def default(methods: js.Array[String]): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(methods.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  inline def BindAll_(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("BindAll")().asInstanceOf[ClassDecorator]
  inline def BindAll_(methods: js.Array[String]): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("BindAll")(methods.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  
  inline def bindAll(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")().asInstanceOf[ClassDecorator]
  inline def bindAll(methods: js.Array[String]): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("bindAll")(methods.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
}
