package typingsJapgolly.tensorflowTfjsConverter.anon

import typingsJapgolly.tensorflowTfjsCore.distEngineMod.ScopeFn
import typingsJapgolly.tensorflowTfjsCore.distTensorTypesMod.TensorContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply[T /* <: TensorContainer */](nameOrFn: String): T = js.native
  def apply[T /* <: TensorContainer */](nameOrFn: String, fn: ScopeFn[T]): T = js.native
  def apply[T /* <: TensorContainer */](nameOrFn: ScopeFn[T]): T = js.native
  def apply[T /* <: TensorContainer */](nameOrFn: ScopeFn[T], fn: ScopeFn[T]): T = js.native
}
