package typingsJapgolly.grasp.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.fsMod.BufferEncodingOption
import typingsJapgolly.node.fsMod.EncodingOption
import typingsJapgolly.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofrealpathSync extends StObject {
  
  def apply(path: PathLike): String = js.native
  def apply(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  def apply(path: PathLike, options: EncodingOption): String = js.native
  
  def native(path: PathLike): String = js.native
  def native(path: PathLike, options: BufferEncodingOption): Buffer = js.native
  def native(path: PathLike, options: EncodingOption): String = js.native
  @JSName("native")
  def native_Union(path: PathLike): String | Buffer = js.native
  @JSName("native")
  def native_Union(path: PathLike, options: EncodingOption): String | Buffer = js.native
}
