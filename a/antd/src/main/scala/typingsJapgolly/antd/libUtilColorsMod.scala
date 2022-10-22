package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.blue
import typingsJapgolly.antd.antdStrings.cyan
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.error
import typingsJapgolly.antd.antdStrings.geekblue
import typingsJapgolly.antd.antdStrings.gold
import typingsJapgolly.antd.antdStrings.green
import typingsJapgolly.antd.antdStrings.lime
import typingsJapgolly.antd.antdStrings.magenta
import typingsJapgolly.antd.antdStrings.orange
import typingsJapgolly.antd.antdStrings.pink
import typingsJapgolly.antd.antdStrings.processing
import typingsJapgolly.antd.antdStrings.purple
import typingsJapgolly.antd.antdStrings.red
import typingsJapgolly.antd.antdStrings.success
import typingsJapgolly.antd.antdStrings.volcano
import typingsJapgolly.antd.antdStrings.warning
import typingsJapgolly.antd.antdStrings.yellow
import typingsJapgolly.antd.libUtilTypeMod.ElementOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilColorsMod {
  
  @JSImport("antd/lib/_util/colors", "PresetColorTypes")
  @js.native
  val PresetColorTypes: js.Tuple13[pink, red, yellow, orange, cyan, green, blue, purple, geekblue, magenta, volcano, gold, lime] = js.native
  
  @JSImport("antd/lib/_util/colors", "PresetStatusColorTypes")
  @js.native
  val PresetStatusColorTypes: js.Tuple5[success, processing, error, default, warning] = js.native
  
  type PresetColorType = ElementOf[
    js.Tuple13[pink, red, yellow, orange, cyan, green, blue, purple, geekblue, magenta, volcano, gold, lime]
  ]
  
  type PresetStatusColorType = ElementOf[js.Tuple5[success, processing, error, default, warning]]
}
