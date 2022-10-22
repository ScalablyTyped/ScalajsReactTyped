package typingsJapgolly.bcp47

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bcp-47", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(tag: String): typingsJapgolly.bcp47.libParseMod.Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tag.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bcp47.libParseMod.Schema]
  inline def parse(tag: String, options: typingsJapgolly.bcp47.libParseMod.Options): typingsJapgolly.bcp47.libParseMod.Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(tag.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bcp47.libParseMod.Schema]
  
  inline def stringify(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")().asInstanceOf[String]
  inline def stringify(schema: typingsJapgolly.bcp47.libStringifyMod.Schema): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(schema.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Extension = typingsJapgolly.bcp47.libParseMod.Extension
  
  type Options = typingsJapgolly.bcp47.libParseMod.Options
  
  type Schema = typingsJapgolly.bcp47.libParseMod.Schema
  
  type Warning = typingsJapgolly.bcp47.libParseMod.Warning
}
