package typingsJapgolly.std.global

import org.scalajs.dom.GamepadMappingType
import typingsJapgolly.std.DOMHighResTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Gamepad")
@js.native
/* standard dom */
open class Gamepad ()
  extends StObject
     with typingsJapgolly.std.Gamepad {
  
  /* standard dom */
  /* CompleteClass */
  override val axes: js.Array[Double] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val buttons: js.Array[org.scalajs.dom.GamepadButton] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val connected: scala.Boolean = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val hapticActuators: js.Array[typingsJapgolly.std.GamepadHapticActuator] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val id: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val index: Double = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val mapping: GamepadMappingType = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val timestamp: DOMHighResTimeStamp = js.native
}
