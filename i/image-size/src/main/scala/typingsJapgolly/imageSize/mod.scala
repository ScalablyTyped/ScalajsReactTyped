package typingsJapgolly.imageSize

import typingsJapgolly.imageSize.distTypesInterfaceMod.ISizeCalculationResult
import typingsJapgolly.imageSize.distTypesMod.imageType
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("image-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): ISizeCalculationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[ISizeCalculationResult]
  inline def default(input: String, callback: CallbackFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(input: Buffer): ISizeCalculationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[ISizeCalculationResult]
  
  inline def disableFS(v: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableFS")(v.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def disableTypes(types: js.Array[imageType]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableTypes")(types.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def imageSize(input: String): ISizeCalculationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("imageSize")(input.asInstanceOf[js.Any]).asInstanceOf[ISizeCalculationResult]
  inline def imageSize(input: String, callback: CallbackFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("imageSize")(input.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def imageSize(input: Buffer): ISizeCalculationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("imageSize")(input.asInstanceOf[js.Any]).asInstanceOf[ISizeCalculationResult]
  
  inline def setConcurrency(c: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConcurrency")(c.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("image-size", "types")
  @js.native
  val types: js.Array[String] = js.native
  
  type CallbackFn = js.Function2[/* e */ js.Error | Null, /* r */ js.UndefOr[ISizeCalculationResult], Unit]
}
