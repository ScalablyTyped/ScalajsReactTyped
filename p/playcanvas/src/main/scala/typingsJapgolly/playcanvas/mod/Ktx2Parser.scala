package typingsJapgolly.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Texture parser for ktx2 files.
  *
  * @implements {TextureParser}
  * @ignore
  */
@js.native
trait Ktx2Parser extends TextureParser {
  
  var device: Any = js.native
  
  def load(url: Any, callback: Any, asset: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any, device: Any): Texture = js.native
  
  def parse(arraybuffer: Any, url: Any, callback: Any, asset: Any): Any = js.native
}
