package typingsJapgolly.reactThreeFiber.anon

import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typingsJapgolly.webxr.XRFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Advance extends StObject {
  
  def advance(timestamp: Double): Unit = js.native
  def advance(timestamp: Double, runGlobalEffects: Boolean): Unit = js.native
  def advance(timestamp: Double, runGlobalEffects: Boolean, state: Unit, frame: XRFrame): Unit = js.native
  def advance(timestamp: Double, runGlobalEffects: Boolean, state: RootState): Unit = js.native
  def advance(timestamp: Double, runGlobalEffects: Boolean, state: RootState, frame: XRFrame): Unit = js.native
  def advance(timestamp: Double, runGlobalEffects: Unit, state: Unit, frame: XRFrame): Unit = js.native
  def advance(timestamp: Double, runGlobalEffects: Unit, state: RootState): Unit = js.native
  def advance(timestamp: Double, runGlobalEffects: Unit, state: RootState, frame: XRFrame): Unit = js.native
  
  def invalidate(): Unit = js.native
  def invalidate(state: Unit, frames: Double): Unit = js.native
  def invalidate(state: RootState): Unit = js.native
  def invalidate(state: RootState, frames: Double): Unit = js.native
  
  def loop(timestamp: Double): Unit = js.native
}
