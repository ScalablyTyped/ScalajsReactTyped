package typingsJapgolly.reactNativeReanimated.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.EntryExitAnimationFunction
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderCommonTypesMod.LayoutAnimationFunction
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderMod.BaseAnimationBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofBaseAnimationBuildeInstantiable
  extends StObject
     with Instantiable0[BaseAnimationBuilder] {
  
  def build(): EntryExitAnimationFunction | LayoutAnimationFunction = js.native
  
  def createInstance(): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = js.native
  
  def delay(delayMs: Double): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = js.native
  
  def duration(durationMs: Double): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = js.native
  
  def getDuration(): Double = js.native
  
  def randomDelay(): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = js.native
  
  def withCallback(callback: js.Function1[/* finished */ Boolean, Unit]): typingsJapgolly.reactNativeReanimated.libTypesReanimated2LayoutReanimationAnimationBuilderBaseAnimationBuilderMod.BaseAnimationBuilder = js.native
}
