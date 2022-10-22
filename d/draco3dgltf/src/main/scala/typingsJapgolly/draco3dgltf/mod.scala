package typingsJapgolly.draco3dgltf

import typingsJapgolly.draco3d.mod.DecoderModule
import typingsJapgolly.draco3d.mod.EncoderModule
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("draco3dgltf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DataType(value: scala.Nothing): js.UndefOr[typingsJapgolly.draco3d.mod.DataType & scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("DataType")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.draco3d.mod.DataType & scala.Nothing]]
  
  inline def GeometryType(value: scala.Nothing): js.UndefOr[typingsJapgolly.draco3d.mod.GeometryType & scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("GeometryType")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typingsJapgolly.draco3d.mod.GeometryType & scala.Nothing]]
  
  inline def createDecoderModule(): js.Promise[DecoderModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoderModule")().asInstanceOf[js.Promise[DecoderModule]]
  inline def createDecoderModule(`object`: Record[String, Any]): js.Promise[DecoderModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecoderModule")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DecoderModule]]
  
  inline def createEncoderModule(): js.Promise[EncoderModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncoderModule")().asInstanceOf[js.Promise[EncoderModule]]
  inline def createEncoderModule(`object`: Record[String, Any]): js.Promise[EncoderModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncoderModule")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EncoderModule]]
}
