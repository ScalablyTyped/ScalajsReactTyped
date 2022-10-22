package typingsJapgolly.tabris.mod

import typingsJapgolly.tabris.anon.Width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "SizeMeasurement")
@js.native
/**
  * Allows to measure Text.
  */
/* private */ open class SizeMeasurement_ () extends NativeObject {
  
  /**
    * Measures the given text. The method returns a `Promise` which resolves to an array of `{width:
    * number, height: number}`.
    * @param configs The text configurations to measure. A text configuration has to provide at least a `text` and `fontSize` property.
    * @provisional
    */
  def measureTexts(configs: js.Array[typingsJapgolly.tabris.anon.Font]): js.Promise[Width] = js.native
  
  /**
    * Measures the given text. The method returns an array of `{width: number, height: number}`.
    * @param configs The text configurations to measure. A text configuration has to provide at least a `text` and `fontSize` property.
    * @provisional
    */
  def measureTextsSync(configs: js.Array[typingsJapgolly.tabris.anon.Font]): js.Array[Width] = js.native
}
