package typingsJapgolly.downscale

import org.scalajs.dom.Blob
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.downscale.anon.DownscaleOptionsreturnBlo
import typingsJapgolly.downscale.anon.DownscaleOptionsreturnBloImageType
import typingsJapgolly.downscale.anon.DownscaleOptionsreturnCan
import typingsJapgolly.downscale.mod.ImageSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Overloads that automatically type the return value based on the selected options
    */
  inline def downscale(source: ImageSource, width: Double, height: Double): js.Promise[HTMLCanvasElement] = (js.Dynamic.global.applyDynamic("downscale")(source.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLCanvasElement]]
  inline def downscale(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnBlo): js.Promise[Blob] = (js.Dynamic.global.applyDynamic("downscale")(source.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Blob]]
  inline def downscale(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnBloImageType): js.Promise[String] = (js.Dynamic.global.applyDynamic("downscale")(source.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def downscale(source: ImageSource, width: Double, height: Double, options: DownscaleOptionsreturnCan): js.Promise[HTMLCanvasElement] = (js.Dynamic.global.applyDynamic("downscale")(source.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HTMLCanvasElement]]
}
