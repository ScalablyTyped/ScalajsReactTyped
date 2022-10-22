package typingsJapgolly.log4js.mod

import typingsJapgolly.log4js.log4jsStrings.colored
import typingsJapgolly.log4js.log4jsStrings.coloured
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.log4js.mod.BasicLayout
  - typingsJapgolly.log4js.mod.ColoredLayout
  - typingsJapgolly.log4js.mod.MessagePassThroughLayout
  - typingsJapgolly.log4js.mod.DummyLayout
  - typingsJapgolly.log4js.mod.PatternLayout
  - typingsJapgolly.log4js.mod.CustomLayout
*/
trait Layout extends StObject
object Layout {
  
  inline def BasicLayout(): typingsJapgolly.log4js.mod.BasicLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("basic")
    __obj.asInstanceOf[typingsJapgolly.log4js.mod.BasicLayout]
  }
  
  inline def ColoredLayout(`type`: colored | coloured): typingsJapgolly.log4js.mod.ColoredLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.log4js.mod.ColoredLayout]
  }
  
  inline def CustomLayout(`type`: String): typingsJapgolly.log4js.mod.CustomLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.log4js.mod.CustomLayout]
  }
  
  inline def DummyLayout(): typingsJapgolly.log4js.mod.DummyLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dummy")
    __obj.asInstanceOf[typingsJapgolly.log4js.mod.DummyLayout]
  }
  
  inline def MessagePassThroughLayout(): typingsJapgolly.log4js.mod.MessagePassThroughLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("messagePassThrough")
    __obj.asInstanceOf[typingsJapgolly.log4js.mod.MessagePassThroughLayout]
  }
  
  inline def PatternLayout(pattern: String): typingsJapgolly.log4js.mod.PatternLayout = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pattern")
    __obj.asInstanceOf[typingsJapgolly.log4js.mod.PatternLayout]
  }
}
